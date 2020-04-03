package cn.freefly.springboot.httpClientUtil.service.gj.async.impl;

import cn.freefly.springboot.devUtils.DateUtil;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.channel.ChannelPersonBank;
import cn.freefly.springboot.httpClientUtil.dto.gj.bankCard.channel.ChannelPersonBankRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.CustomerAssetCarExtend;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.CustomerBusiExtend;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.CustomerRegisterRequest;
import cn.freefly.springboot.httpClientUtil.dto.gj.customer.CustomerSubjectPerson;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.EnumProcessNode;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.GjOrderStatusE;
import cn.freefly.springboot.httpClientUtil.dto.gj.financeInfo.channel.*;
import cn.freefly.springboot.httpClientUtil.entity.gj.*;
import cn.freefly.springboot.httpClientUtil.service.gj.CacmpGjNodeService;
import cn.freefly.springboot.httpClientUtil.service.gj.OrderService;
import cn.freefly.springboot.httpClientUtil.service.gj.async.GjPlatformAsyncService;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.*;
import cn.freefly.springboot.httpClientUtil.util.UniquenessFlagUnits;
import cn.freefly.springboot.httpClientUtil.util.gj.GjCallBackRequest;
import com.github.dozermapper.core.Mapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * @ClassNmae GjPlatformAsyncServiceImpl
 * @Description 国金平台异步业务处理类
 * @Author houjianhui
 * @Date 2020/3/27 15:41
 * @Version 1.0
 **/
@Service
@Slf4j
public class GjPlatformAsyncServiceImpl implements GjPlatformAsyncService {

    @Autowired
    private GjSubjectPersonService subjectPersonService;
    @Autowired
    private GjAssetCarExtendService assetCarExtendService;
    @Autowired
    private GjBusinessExtendService businessExtendService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private GjAssetCarService gjAssetCarService;
    @Autowired
    private GjAssetCarAssessmentService gjAssetCarAssessmentService;
    @Autowired
    private GjAssetRealEstatesService gjAssetRealEstatesService;
    @Autowired
    private GjBusinessService gjBusinessService;
    @Autowired
    private GjBusinessFinaceService gjBusinessFinaceService;
    @Autowired
    private GjSubjectContactsService gjSubjectContactsService;
    @Autowired
    private GjSubjectGuaranteeService gjSubjectGuaranteeService;
    @Autowired
    private GjSubjectSpouseService gjSubjectSpouseService;
    @Autowired
    private GjBusinessMortgageService gjBusinessMortgageService;
    @Autowired
    private GjPersonBankService gjPersonBankService;
    @Autowired
    private CacmpGjNodeService cacmpGjNodeService;

    @Autowired
    private Mapper dozerMapper;

    @Override
    @Async
    @Transactional
    public void saveCustomerRegister(String orderId, CustomerRegisterRequest registerRequest) {
        CustomerSubjectPerson subjectPerson = registerRequest.getfSubjectPerson();
        CacmpGjSubjectPerson gjSubjectPerson = subjectPersonService.getCacmpGjSubjectPersonByOrderId(orderId);
        if (Objects.isNull(gjSubjectPerson)) {
            gjSubjectPerson = new CacmpGjSubjectPerson();
            dozerMapper.map(subjectPerson, gjSubjectPerson);
            gjSubjectPerson.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            gjSubjectPerson.setOrderId(orderId);
            subjectPersonService.insertGjSubjectPerson(gjSubjectPerson);
        } else {
            dozerMapper.map(subjectPerson, gjSubjectPerson);
            subjectPersonService.modifyGjSubjectPerson(gjSubjectPerson);
        }

        CustomerAssetCarExtend assetCarExtend = registerRequest.getfAssetCarExtend();
        CacmpGjAssetCarExtend gjAssetCarExtend = assetCarExtendService.getAssetCarExtendByOrderId(orderId);
        if (Objects.isNull(gjAssetCarExtend)) {
            gjAssetCarExtend = new CacmpGjAssetCarExtend();
            dozerMapper.map(assetCarExtend, gjAssetCarExtend);
            gjAssetCarExtend.setId(UniquenessFlagUnits.generateUniquenessFlag("AE"));
            gjAssetCarExtend.setOrderId(orderId);
            assetCarExtendService.insertGjAssetCarExtend(gjAssetCarExtend);
        } else {
            dozerMapper.map(assetCarExtend, gjAssetCarExtend);
            assetCarExtendService.modifyAssetCarExtend(gjAssetCarExtend);
        }

        CustomerBusiExtend busiExtend = registerRequest.getfBusiExtend();
        CacmpGjBusinessInfoExtend businessInfoExtend = businessExtendService.getBusinessInfoExtendByOrderId(orderId);
        if (Objects.isNull(businessInfoExtend)) {
            businessInfoExtend = new CacmpGjBusinessInfoExtend();
            dozerMapper.map(busiExtend, businessInfoExtend);
            businessInfoExtend.setId(UniquenessFlagUnits.generateUniquenessFlag("BE"));
            businessInfoExtend.setOrderId(orderId);
            businessExtendService.insertBusiExtend(businessInfoExtend);
        } else {
            dozerMapper.map(busiExtend, businessInfoExtend);
            businessExtendService.modifyBusiExtend(businessInfoExtend);
        }

        // 保存流程节点
        cacmpGjNodeService.saveCacmpGjNodeInfo(orderId, registerRequest.getInstNo(), registerRequest.getNodeNo());

        // 修改订单状态
        orderService.modifyOrderStatus(orderId, GjOrderStatusE.客户登记受理成功);
    }

    @Override
    @Async
    @Transactional
    public void saveFinanceInfoInput(ChannelFinanceInfoInputRequest financeInfoInputRequest) {
        String orderId = financeInfoInputRequest.getOrderId();
        // 资产汽车表-信息修改
        ChannelFinanceInfoAssetCar assetCar = financeInfoInputRequest.getAssetCar();
        CacmpGjAssetCar cacmpGjAssetCar = gjAssetCarService.getAssetCarInfoByOrderId(orderId);
        if (Objects.isNull(cacmpGjAssetCar)) {
            cacmpGjAssetCar = new CacmpGjAssetCar();
            dozerMapper.map(assetCar, cacmpGjAssetCar);
            cacmpGjAssetCar.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjAssetCar.setOrderId(orderId);
            cacmpGjAssetCar.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            gjAssetCarService.insertGjAssetCar(cacmpGjAssetCar);
        } else {
            dozerMapper.map(assetCar, cacmpGjAssetCar);
            cacmpGjAssetCar.setModifyTime(DateUtil.getCurTimeSlashYmdHms());
            gjAssetCarService.modifyAssetCar(cacmpGjAssetCar);
        }

        // 资产汽车评估表-插入/修改
        ChannelFinanceInfoAssetCarAssessment assetCarAssessment = financeInfoInputRequest.getAssetCarAssessment();
        CacmpGjAssetCarAssessment cacmpGjAssetCarAssessment = gjAssetCarAssessmentService.getCacmpGjAssetCarAssessmentByOrderId(orderId);
        if (Objects.isNull(cacmpGjAssetCarAssessment)) {
            cacmpGjAssetCarAssessment = new CacmpGjAssetCarAssessment();
            dozerMapper.map(assetCarAssessment, cacmpGjAssetCarAssessment);
            cacmpGjAssetCarAssessment.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjAssetCarAssessment.setOrderId(orderId);
            cacmpGjAssetCarAssessment.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            gjAssetCarAssessmentService.insertGjAssetCarAssessment(cacmpGjAssetCarAssessment);
        } else {
            dozerMapper.map(assetCarAssessment, cacmpGjAssetCarAssessment);
            cacmpGjAssetCarAssessment.setModifyTime(DateUtil.getCurTimeSlashYmdHms());
            gjAssetCarAssessmentService.modifyGjAssetCarAssessment(cacmpGjAssetCarAssessment);
        }

        // 资产汽车扩展表-修改 客户登记阶段已插入
        ChannelFinanceInfoAssetCarExtend assetCarExtend = financeInfoInputRequest.getAssetCarExtend();
        CacmpGjAssetCarExtend cacmpGjAssetCarExtend = assetCarExtendService.getAssetCarExtendByOrderId(orderId);
        if (Objects.isNull(cacmpGjAssetCarExtend)) {
            cacmpGjAssetCarExtend = new CacmpGjAssetCarExtend();
            dozerMapper.map(assetCarExtend, cacmpGjAssetCarExtend);
            cacmpGjAssetCarExtend.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjAssetCarExtend.setOrderId(orderId);
            cacmpGjAssetCarExtend.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            assetCarExtendService.insertGjAssetCarExtend(cacmpGjAssetCarExtend);
        } else {
            dozerMapper.map(assetCarExtend, cacmpGjAssetCarExtend);
            cacmpGjAssetCarExtend.setModifyTime(DateUtil.getCurTimeSlashYmdHms());
            assetCarExtendService.modifyAssetCarExtend(cacmpGjAssetCarExtend);
        }

        // 资产不动产扩展表-插入/修改
        ChannelFinanceInfoAssetRealEstates assetRealEstates = financeInfoInputRequest.getAssetRealEstates();
        List<ChannelFinanceInfoAssetRealEstate> addrealFicList = assetRealEstates.getAddrealFic();
        List<CacmpGjAssetRealEstate> cacmpGjAssetRealEstateList = gjAssetRealEstatesService.getCacmpGjAssetRealEstateByOrderId(orderId);
        if (CollectionUtils.isNotEmpty(cacmpGjAssetRealEstateList)) {
            gjAssetRealEstatesService.deleteGjAssetRealEstatesByOrderId(orderId);
        }
        for (ChannelFinanceInfoAssetRealEstate assetRealEstate : addrealFicList) {
            CacmpGjAssetRealEstate cacmpGjAssetRealEstate = new CacmpGjAssetRealEstate();
            dozerMapper.map(assetRealEstate, cacmpGjAssetRealEstate);
            cacmpGjAssetRealEstate.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjAssetRealEstate.setOrderId(orderId);
            cacmpGjAssetRealEstate.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            gjAssetRealEstatesService.insertGjAssetRealEstate(cacmpGjAssetRealEstate);
        }

        // 业务信息表-插入/修改
        ChannelFinanceInfoBusinessInfo busiInfo = financeInfoInputRequest.getBusi();
        CacmpGjBusinessInfo cacmpGjBusinessInfo = gjBusinessService.getCacmpGjBusinessInfoByOrderId(orderId);
        if (Objects.isNull(cacmpGjBusinessInfo)) {
            cacmpGjBusinessInfo = new CacmpGjBusinessInfo();
            dozerMapper.map(busiInfo, cacmpGjBusinessInfo);
            cacmpGjBusinessInfo.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjBusinessInfo.setOrderId(orderId);
            cacmpGjBusinessInfo.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            gjBusinessService.insertGjBusinessInfo(cacmpGjBusinessInfo);
        } else {
            dozerMapper.map(busiInfo, cacmpGjBusinessInfo);
            cacmpGjBusinessInfo.setModifyTime(DateUtil.getCurTimeSlashYmdHms());
            gjBusinessService.modifyGjBusinessInfo(cacmpGjBusinessInfo);
        }

        // 业务信息扩展表-修改 客户登记阶段已插入
        ChannelFinanceInfoBusinessInfoExtend busiExtend = financeInfoInputRequest.getBusiExtend();
        CacmpGjBusinessInfoExtend cacmpGjBusinessInfoExtend = businessExtendService.getBusinessInfoExtendByOrderId(orderId);
        if (Objects.isNull(cacmpGjBusinessInfoExtend)) {
            cacmpGjBusinessInfoExtend = new CacmpGjBusinessInfoExtend();
            dozerMapper.map(busiExtend, cacmpGjBusinessInfoExtend);
            cacmpGjBusinessInfoExtend.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjBusinessInfoExtend.setOrderId(orderId);
            cacmpGjBusinessInfoExtend.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            businessExtendService.insertBusiExtend(cacmpGjBusinessInfoExtend);
        } else {
            dozerMapper.map(busiExtend, cacmpGjBusinessInfoExtend);
            cacmpGjBusinessInfoExtend.setModifyTime(DateUtil.getCurTimeSlashYmdHms());
            businessExtendService.modifyBusiExtend(cacmpGjBusinessInfoExtend);
        }

        // 融租信息-插入/修改
        ChannelFinanceInfoBusinessFinance busiFinance = financeInfoInputRequest.getBusiFinance();
        CacmpGjBusinessFinance cacmpGjBusinessFinance = gjBusinessFinaceService.getCacmpGjBusinessFinanceByOrderId(orderId);
        if (Objects.isNull(cacmpGjBusinessFinance)) {
            cacmpGjBusinessFinance = new CacmpGjBusinessFinance();
            dozerMapper.map(busiFinance, cacmpGjBusinessFinance);
            cacmpGjBusinessFinance.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjBusinessFinance.setOrderId(orderId);
            cacmpGjBusinessFinance.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            gjBusinessFinaceService.insertGjBusinessFinance(cacmpGjBusinessFinance);
        } else {
            dozerMapper.map(busiFinance, cacmpGjBusinessFinance);
            cacmpGjBusinessFinance.setModifyTime(DateUtil.getCurTimeSlashYmdHms());
            gjBusinessFinaceService.modifyGjBusinessFinance(cacmpGjBusinessFinance);
        }

        // 主体联系人表-插入/修改
        ChannelFinanceInfoSubjectContacts subjectContacts = financeInfoInputRequest.getSubjectContacts();
        List<ChannelFinanceInfoSubjectContact> subjectContactList = subjectContacts.getAddlxrFic();
        List<CacmpGjSubjectContacts> cacmpGjSubjectContactsList = gjSubjectContactsService.getCacmpGjSubjectContactsByOrderId(orderId);
        if (CollectionUtils.isNotEmpty(cacmpGjSubjectContactsList)) {
            gjSubjectContactsService.deleteGjSubjectContacts(orderId);
        }
        for (ChannelFinanceInfoSubjectContact subjectContact : subjectContactList) {
            CacmpGjSubjectContacts cacmpGjSubjectContacts = new CacmpGjSubjectContacts();
            dozerMapper.map(subjectContact, cacmpGjSubjectContacts);
            cacmpGjSubjectContacts.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjSubjectContacts.setOrderId(orderId);
            cacmpGjSubjectContacts.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            gjSubjectContactsService.insertGjSubjectContacts(cacmpGjSubjectContacts);
        }

        // 主体担保人表-插入/修改
        ChannelFinanceInfoSubjectGuarantees subjectGuarantees = financeInfoInputRequest.getSubjectGuarantees();
        List<ChannelFinanceInfoSubjectGuarantee> subjectGuaranteeList = subjectGuarantees.getAdddbrFic();
        List<CacmpGjSubjectGuarantee> cacmpGjSubjectGuaranteeList = gjSubjectGuaranteeService.getCacmpGjSubjectGuaranteeByOrderId(orderId);
        if (CollectionUtils.isNotEmpty(cacmpGjSubjectGuaranteeList)) {
            gjSubjectGuaranteeService.deleteGjSubjectGuarantee(orderId);
        }
        for (ChannelFinanceInfoSubjectGuarantee subjectGuarantee : subjectGuaranteeList) {
            CacmpGjSubjectGuarantee cacmpGjSubjectGuarantee = new CacmpGjSubjectGuarantee();
            dozerMapper.map(subjectGuarantee, cacmpGjSubjectGuarantee);
            cacmpGjSubjectGuarantee.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjSubjectGuarantee.setOrderId(orderId);
            cacmpGjSubjectGuarantee.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            gjSubjectGuaranteeService.insertGjSubjectGuarantee(cacmpGjSubjectGuarantee);
        }

        // 主体自然人表-修改 客户登记阶段已插入
        ChannelFinanceInfoSubjectPerson subjectPerson = financeInfoInputRequest.getSubjectPerson();
        CacmpGjSubjectPerson cacmpGjSubjectPerson = subjectPersonService.getCacmpGjSubjectPersonByOrderId(orderId);
        dozerMapper.map(subjectPerson, cacmpGjSubjectPerson);
        cacmpGjSubjectPerson.setModifyTime(DateUtil.getCurTimeSlashYmdHms());
        subjectPersonService.modifyGjSubjectPerson(cacmpGjSubjectPerson);

        // 主体配偶表-插入/修改
        ChannelFinanceInfoSubjectSpouse subjectSpouse = financeInfoInputRequest.getSubjectSpouse();
        CacmpGjSubjectSpouse cacmpGjSubjectSpouse = gjSubjectSpouseService.getCacmpGjSubjectSpouseByOrderId(orderId);
        if (Objects.isNull(cacmpGjSubjectSpouse)) {
            cacmpGjSubjectSpouse = new CacmpGjSubjectSpouse();
            dozerMapper.map(subjectSpouse, cacmpGjSubjectSpouse);
            cacmpGjSubjectSpouse.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
            cacmpGjSubjectSpouse.setOrderId(orderId);
            cacmpGjSubjectSpouse.setCreateTime(DateUtil.getCurTimeSlashYmdHms());
            gjSubjectSpouseService.insertGjSubjectSpouse(cacmpGjSubjectSpouse);
        } else {
            dozerMapper.map(subjectSpouse, cacmpGjSubjectSpouse);
            cacmpGjSubjectSpouse.setModifyTime(DateUtil.getCurTimeSlashYmdHms());
            gjSubjectSpouseService.modifyGjSubjectSpouse(cacmpGjSubjectSpouse);
        }

        // 修改订单状态
        orderService.modifyOrderStatus(orderId, GjOrderStatusE.融资信息录入受理成功);
        CacmpGjOrder cacmpGjOrder = orderService.findOrderInfoById(orderId);
        // 插入表：cacmp_gj_node
        CacmpGjNode cacmpGjNode = cacmpGjNodeService.findCacmpGjNodeByOrderIdAndnodeNo(orderId, EnumProcessNode.FINANACE_INFO_INPUT.getCode());
        if (Objects.isNull(cacmpGjNode)) {
            cacmpGjNodeService.saveCacmpGjNodeInfo(orderId, cacmpGjOrder.getInstNo(), EnumProcessNode.FINANACE_INFO_INPUT.getCode());
        }
    }

    @Override
    @Async
    @Transactional
    public void bindBankCardHandle(ChannelPersonBankRequest personBankRequest) {
        String orderId = personBankRequest.getOrderId();
        List<ChannelPersonBank> personBankList = personBankRequest.getfSubjectPerson();
        for (ChannelPersonBank channelPersonBank : personBankList) {
            String bankAccount = channelPersonBank.getBankAccount();
            CacmpGjPersonBank cacmpGjPersonBank = gjPersonBankService.getCacmpGjPersonBankByOrderId(orderId, bankAccount);
            if (Objects.isNull(cacmpGjPersonBank)) {
                cacmpGjPersonBank = new CacmpGjPersonBank();
                dozerMapper.map(channelPersonBank, cacmpGjPersonBank);
                cacmpGjPersonBank.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
                cacmpGjPersonBank.setOrderId(orderId);
                gjPersonBankService.insertGjPersonBank(cacmpGjPersonBank);
            } else {
                dozerMapper.map(channelPersonBank, cacmpGjPersonBank);
                gjPersonBankService.modifyGjPersonBank(cacmpGjPersonBank);
            }
        }
    }

    @Override
    @Async
    @Transactional
    public void callbackHandle(GjCallBackRequest gjCallBackRequest) {
        //1、查询平台订单信息
        CacmpGjNode cacmpGjNode = cacmpGjNodeService.findCacmpGjNodeByInstNoAndnodeNo(gjCallBackRequest.getInstNo(), gjCallBackRequest.getNodeNo());
        String orderId = cacmpGjNode.getOrderId();
        CacmpGjOrder cacmpGjOrder = orderService.findOrderInfoById(orderId);

        //2、组装回调渠道报文
        BaseResponse baseResponse = new BaseResponse();
        //3、调回调渠道接口
//        BaseResponse baseResponse1 = pushResultToChannel(baseResponse,cacmpGjOrder.getChannelKey());
        //4、回调渠道日志记录
        //5、回调结果cacmp_gj_node表记录
//        if(baseResponse1.getCode().equals(ResponseCode.SUCCESS.getCode())){
//            cacmpGjNode.setChannelResult("1");
//        }else{
//            cacmpGjNode.setChannelResult("2");
//        }
        cacmpGjNode.setNodeStatus(gjCallBackRequest.getNodeStatus());
        if (!gjCallBackRequest.getRemark().equals("null")) {
            cacmpGjNode.setRemark(gjCallBackRequest.getRemark());
        }
        cacmpGjNode.setModifyTime(DateUtil.getCurTimeSlashYmdHms());
        cacmpGjNodeService.updateNodeInfo(cacmpGjNode);
        //6、实时订单状态
        modifyOrderStatus(orderId, gjCallBackRequest.getNodeNo(), gjCallBackRequest.getNodeStatus());
    }

    private void modifyOrderStatus(String orderId, String nodeNo, String nodeStatus) {
        GjOrderStatusE gjOrderStatusE = null;
        if (nodeNo.equals(EnumProcessNode.CUSTOMER_REGISTRATION.getCode())) {
            if (nodeStatus.equals("Y")) {
                gjOrderStatusE = GjOrderStatusE.客户登记回调成功;
            } else {
                gjOrderStatusE = GjOrderStatusE.客户登记回调失败;
            }
        } else if (nodeNo.equals(EnumProcessNode.FINANACE_INFO_INPUT.getCode())) {
            if (nodeStatus.equals("Y")) {
                gjOrderStatusE = GjOrderStatusE.融资信息录入回调成功;
            } else {
                gjOrderStatusE = GjOrderStatusE.融资信息录入回调失败;
            }
        } else if (nodeNo.equals(EnumProcessNode.LOAN_INFO_INPUT.getCode())) {
            if (nodeStatus.equals("Y")) {
                gjOrderStatusE = GjOrderStatusE.放款申请回调成功;
            } else {
                gjOrderStatusE = GjOrderStatusE.放款申请回调失败;
            }
        } else if (nodeNo.equals(EnumProcessNode.AMENDS_INFO_INPUT.getCode())) {
            if (nodeStatus.equals("Y")) {
                gjOrderStatusE = GjOrderStatusE.后补信息录入回调成功;
            } else {
                gjOrderStatusE = GjOrderStatusE.后补信息录入回调失败;
            }
        }
        log.info("国金回调订单状态更新:{},{}", gjOrderStatusE.getCode(), gjOrderStatusE.getMessage());
        orderService.modifyOrderStatus(orderId, gjOrderStatusE);
    }
}
