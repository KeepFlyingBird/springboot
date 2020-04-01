package cn.freefly.springboot.httpClientUtil.service.gj.async.impl;

import cn.freefly.springboot.httpClientUtil.service.gj.async.GjPlatformAsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
//import com.github.dozermapper.core.Mapper;
//import com.jianyuan.fund.domain.enums.gj.GjOrderStatusE;
//import com.jianyuan.fund.domain.gj.*;
//import com.jianyuan.fund.service.gj.*;
//import com.jianyuan.fund.service.gj.dto.*;
//import com.jianyuan.fund.util.UniquenessFlagUnits;
//import com.jianyuan.fund.web.dto.channel.gj.financeInfo.*;
//import com.jianyuan.fund.web.dto.channel.gj.personBank.ChannelPersonBank;
//import com.jianyuan.fund.web.dto.channel.gj.personBank.ChannelPersonBankRequest;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Service;

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
//
//    @Autowired
//    private GjSubjectPersonService subjectPersonService;
//    @Autowired
//    private GjAssetCarExtendService assetCarExtendService;
//    @Autowired
//    private GjBusinessExtendService businessExtendService;
//    @Autowired
//    private OrderService orderService;
//    @Autowired
//    private GjAssetCarService gjAssetCarService;
//    @Autowired
//    private GjAssetCarAssessmentService gjAssetCarAssessmentService;
//    @Autowired
//    private GjAssetRealEstatesService gjAssetRealEstatesService;
//    @Autowired
//    private GjBusinessService gjBusinessService;
//    @Autowired
//    private GjBusinessFinaceService gjBusinessFinaceService;
//    @Autowired
//    private GjSubjectContactsService gjSubjectContactsService;
//    @Autowired
//    private GjSubjectGuaranteeService gjSubjectGuaranteeService;
//    @Autowired
//    private GjSubjectSpouseService gjSubjectSpouseService;
//    @Autowired
//    private GjBusinessMortgageService gjBusinessMortgageService;
//    @Autowired
//    private GjPersonBankService gjPersonBankService;
//
//    @Autowired
//    private Mapper dozerMapper;
//
//    @Override
//    @Async
//    public void saveCustomerRegister(String orderId, CustomerRegisterRequest registerRequest) {
//        CustomerSubjectPerson subjectPerson = registerRequest.getfSubjectPerson();
//        CacmpGjSubjectPerson gjSubjectPerson = subjectPersonService.getCacmpGjSubjectPersonByOrderId(orderId);
//        if (Objects.isNull(gjSubjectPerson)) {
//            gjSubjectPerson = new CacmpGjSubjectPerson();
//            dozerMapper.map(subjectPerson, gjSubjectPerson);
//            gjSubjectPerson.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
//            gjSubjectPerson.setOrderId(orderId);
//            subjectPersonService.insertGjSubjectPerson(gjSubjectPerson);
//        } else {
//            dozerMapper.map(subjectPerson, gjSubjectPerson);
//            subjectPersonService.modifyGjSubjectPerson(gjSubjectPerson);
//        }
//
//        CustomerAssetCarExtend assetCarExtend = registerRequest.getfAssetCarExtend();
//        CacmpGjAssetCarExtend gjAssetCarExtend = assetCarExtendService.getAssetCarExtendByOrderId(orderId);
//        if (Objects.isNull(gjAssetCarExtend)) {
//            gjAssetCarExtend = new CacmpGjAssetCarExtend();
//            dozerMapper.map(assetCarExtend, gjAssetCarExtend);
//            gjAssetCarExtend.setId(UniquenessFlagUnits.generateUniquenessFlag("AE"));
//            gjAssetCarExtend.setOrderId(orderId);
//            assetCarExtendService.insertGjAssetCarExtend(gjAssetCarExtend);
//        } else {
//            dozerMapper.map(assetCarExtend, gjAssetCarExtend);
//            assetCarExtendService.modifyAssetCarExtend(gjAssetCarExtend);
//        }
//
//        CustomerBusiExtend busiExtend = registerRequest.getfBusiExtend();
//        CacmpGjBusinessInfoExtend businessInfoExtend = businessExtendService.getBusinessInfoExtendByOrderId(orderId);
//        if (Objects.isNull(businessInfoExtend)) {
//            businessInfoExtend = new CacmpGjBusinessInfoExtend();
//            dozerMapper.map(busiExtend, businessInfoExtend);
//            businessInfoExtend.setId(UniquenessFlagUnits.generateUniquenessFlag("BE"));
//            businessInfoExtend.setOrderId(orderId);
//            businessExtendService.insertBusiExtend(businessInfoExtend);
//        } else {
//            dozerMapper.map(busiExtend, businessInfoExtend);
//            businessExtendService.modifyBusiExtend(businessInfoExtend);
//        }
//
//        // 修改订单状态
//        orderService.modifyOrderStatus(orderId, GjOrderStatusE.客户登记受理成功);
//    }
//
//    @Override
//    @Async
//    public void saveLoanInfo(LoanRequest loanRequest, String orderId) {
//        LoanAssetCar loanAssetCar = loanRequest.getfAssetCar();
//
//        // 通过订单ID查询资产信息
//        CacmpGjAssetCar assetCar = gjAssetCarService.getAssetCarInfoByOrderId(orderId);
//        dozerMapper.map(loanAssetCar, assetCar);
//        // 修改资产汽车信息
//        gjAssetCarService.modifyAssetCar(assetCar);
//
//        LoanAssetCarExtend loanAssetCarExtend = loanRequest.getfAssetCarExtend();
//        // 通过资产ID查询资产汽车扩展信息
//        CacmpGjAssetCarExtend assetCarExtend = assetCarExtendService.getAssetCarExtendByOrderId(orderId);
//        dozerMapper.map(loanAssetCarExtend, assetCarExtend);
//        // 修改资产汽车扩展信息
//        assetCarExtendService.modifyAssetCarExtend(assetCarExtend);
//
//        LoanBusiMortgage loanBusiMortgage = loanRequest.getfBusiMortgage();
//        // 查询抵押办理信息
//        CacmpGjBusinessMortgage businessMortgage = gjBusinessMortgageService.getCacmpGjBusinessMortgageByOrderId(orderId);
//        dozerMapper.map(loanBusiMortgage, businessMortgage);
//        // 修改抵押办理信息
//        gjBusinessMortgageService.modifyBusinessMortgage(businessMortgage);
//
//        // 修改订单状态
//        orderService.modifyOrderStatus(orderId, GjOrderStatusE.放款申请受理成功);
//    }
//
//    @Override
//    @Async
//    public void saveFinanceInfoInput(ChannelFinanceInfoInputRequest financeInfoInputRequest) {
//        String orderId = financeInfoInputRequest.getOrderId();
//        // 资产汽车表-信息修改
//        ChannelFinanceInfoAssetCar assetCar = financeInfoInputRequest.getAssetCar();
//        CacmpGjAssetCar cacmpGjAssetCar = gjAssetCarService.getAssetCarInfoByOrderId(orderId);
//        dozerMapper.map(assetCar, assetCar);
//        gjAssetCarService.modifyAssetCar(cacmpGjAssetCar);
//
//        // 资产汽车评估表-插入/修改
//        ChannelFinanceInfoAssetCarAssessment assetCarAssessment = financeInfoInputRequest.getAssetCarAssessment();
//        CacmpGjAssetCarAssessment cacmpGjAssetCarAssessment = gjAssetCarAssessmentService.getCacmpGjAssetCarAssessmentByOrderId(orderId);
//        if (Objects.isNull(cacmpGjAssetCarAssessment)) {
//            cacmpGjAssetCarAssessment = new CacmpGjAssetCarAssessment();
//            dozerMapper.map(assetCarAssessment, cacmpGjAssetCarAssessment);
//            cacmpGjAssetCarAssessment.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
//            cacmpGjAssetCarAssessment.setOrderId(orderId);
//            gjAssetCarAssessmentService.insertGjAssetCarAssessment(cacmpGjAssetCarAssessment);
//        } else {
//            dozerMapper.map(assetCarAssessment, cacmpGjAssetCarAssessment);
//            gjAssetCarAssessmentService.modifyGjAssetCarAssessment(cacmpGjAssetCarAssessment);
//        }
//
//        // 资产汽车扩展表-修改 客户登记阶段已插入
//        ChannelFinanceInfoAssetCarExtend assetCarExtend = financeInfoInputRequest.getAssetCarExtend();
//        CacmpGjAssetCarExtend cacmpGjAssetCarExtend = assetCarExtendService.getAssetCarExtendByOrderId(orderId);
//        dozerMapper.map(assetCarExtend,cacmpGjAssetCarExtend);
//        assetCarExtendService.modifyAssetCarExtend(cacmpGjAssetCarExtend);
//
//        // 资产不动产扩展表-插入/修改
//        ChannelFinanceInfoAssetRealEstates assetRealEstates = financeInfoInputRequest.getAssetRealEstates();
//        CacmpGjAssetRealEstate cacmpGjAssetRealEstate = gjAssetRealEstatesService.getCacmpGjAssetRealEstateByOrderId(orderId);
//        if(Objects.isNull(cacmpGjAssetRealEstate)){
//            cacmpGjAssetRealEstate = new CacmpGjAssetRealEstate();
//            dozerMapper.map(assetRealEstates,cacmpGjAssetRealEstate);
//            cacmpGjAssetRealEstate.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
//            cacmpGjAssetRealEstate.setOrderId(orderId);
//            gjAssetRealEstatesService.insertGjAssetRealEstates(cacmpGjAssetRealEstate);
//        }else{
//            dozerMapper.map(assetRealEstates,cacmpGjAssetRealEstate);
//            gjAssetRealEstatesService.modifyGjAssetRealEstates(cacmpGjAssetRealEstate);
//        }
//
//        // 业务信息表-插入/修改
//        ChannelFinanceInfoBusinessInfo busiInfo = financeInfoInputRequest.getBusi();
//        CacmpGjBusinessInfo cacmpGjBusinessInfo = gjBusinessService.getCacmpGjBusinessInfoByOrderId(orderId);
//        if(Objects.isNull(cacmpGjBusinessInfo)){
//            cacmpGjBusinessInfo = new CacmpGjBusinessInfo();
//            dozerMapper.map(busiInfo,cacmpGjBusinessInfo);
//            cacmpGjBusinessInfo.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
//            cacmpGjBusinessInfo.setOrderId(orderId);
//            gjBusinessService.insertGjBusinessInfo(cacmpGjBusinessInfo);
//        }else{
//            dozerMapper.map(assetRealEstates,cacmpGjBusinessInfo);
//            gjBusinessService.modifyGjBusinessInfo(cacmpGjBusinessInfo);
//        }
//
//        // 业务信息扩展表-修改 客户登记阶段已插入
//        ChannelFinanceInfoBusinessInfoExtend busiExtend = financeInfoInputRequest.getBusiExtend();
//        CacmpGjBusinessInfoExtend cacmpGjBusinessInfoExtend = businessExtendService.getBusinessInfoExtendByOrderId(orderId);
//        dozerMapper.map(busiExtend,cacmpGjBusinessInfoExtend);
//        businessExtendService.modifyBusiExtend(cacmpGjBusinessInfoExtend);
//
//        // 融租信息-插入/修改
//        ChannelFinanceInfoBusinessFinance busiFinance = financeInfoInputRequest.getBusiFinance();
//        CacmpGjBusinessFinance cacmpGjBusinessFinance = gjBusinessFinaceService.getCacmpGjBusinessFinanceByOrderId(orderId);
//        if(Objects.isNull(cacmpGjBusinessFinance)){
//            cacmpGjBusinessFinance = new CacmpGjBusinessFinance();
//            dozerMapper.map(busiFinance,cacmpGjBusinessFinance);
//            cacmpGjBusinessFinance.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
//            cacmpGjBusinessFinance.setOrderId(orderId);
//            gjBusinessFinaceService.insertGjBusinessFinance(cacmpGjBusinessFinance);
//        }else{
//            dozerMapper.map(busiFinance,cacmpGjBusinessFinance);
//            gjBusinessFinaceService.insertGjBusinessFinance(cacmpGjBusinessFinance);
//        }
//
//        // 主体联系人表-插入/修改
//        ChannelFinanceInfoSubjectContacts subjectContacts = financeInfoInputRequest.getSubjectContacts();
//        CacmpGjSubjectContacts cacmpGjSubjectContacts = gjSubjectContactsService.getCacmpGjSubjectContactsByOrderId(orderId);
//        if(Objects.isNull(cacmpGjSubjectContacts)){
//            cacmpGjSubjectContacts = new CacmpGjSubjectContacts();
//            dozerMapper.map(subjectContacts,cacmpGjSubjectContacts);
//            cacmpGjSubjectContacts.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
//            cacmpGjSubjectContacts.setOrderId(orderId);
//            gjSubjectContactsService.insertGjSubjectContacts(cacmpGjSubjectContacts);
//        }else{
//            dozerMapper.map(subjectContacts,cacmpGjSubjectContacts);
//            gjSubjectContactsService.modifyGjSubjectContacts(cacmpGjSubjectContacts);
//        }
//
//        // 主体担保人表-插入/修改
//        ChannelFinanceInfoSubjectGuarantees subjectGuarantees = financeInfoInputRequest.getSubjectGuarantees();
//        CacmpGjSubjectGuarantee cacmpGjSubjectGuarantee = gjSubjectGuaranteeService.getCacmpGjSubjectGuaranteeByOrderId(orderId);
//        if(Objects.isNull(cacmpGjSubjectGuarantee)){
//            cacmpGjSubjectGuarantee = new CacmpGjSubjectGuarantee();
//            dozerMapper.map(subjectGuarantees,cacmpGjSubjectGuarantee);
//            cacmpGjSubjectGuarantee.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
//            cacmpGjSubjectGuarantee.setOrderId(orderId);
//            gjSubjectGuaranteeService.insertGjSubjectGuarantee(cacmpGjSubjectGuarantee);
//        }else {
//            dozerMapper.map(subjectGuarantees,cacmpGjSubjectGuarantee);
//            gjSubjectGuaranteeService.modifyGjSubjectGuarantee(cacmpGjSubjectGuarantee);
//        }
//
//        // 主体自然人表-修改 客户登记阶段已插入
//        ChannelFinanceInfoSubjectPerson subjectPerson = financeInfoInputRequest.getSubjectPerson();
//        CacmpGjSubjectPerson cacmpGjSubjectPerson = subjectPersonService.getCacmpGjSubjectPersonByOrderId(orderId);
//        dozerMapper.map(subjectPerson,cacmpGjSubjectPerson);
//        subjectPersonService.modifyGjSubjectPerson(cacmpGjSubjectPerson);
//
//        // 主体配偶表-插入/修改
//        ChannelFinanceInfoSubjectSpouse subjectSpouse = financeInfoInputRequest.getSubjectSpouse();
//        CacmpGjSubjectSpouse cacmpGjSubjectSpouse = gjSubjectSpouseService.getCacmpGjSubjectSpouseByOrderId(orderId);
//        if(Objects.isNull(cacmpGjSubjectSpouse)){
//            cacmpGjSubjectSpouse = new CacmpGjSubjectSpouse();
//            dozerMapper.map(subjectSpouse,cacmpGjSubjectSpouse);
//            cacmpGjSubjectSpouse.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
//            cacmpGjSubjectSpouse.setOrderId(orderId);
//            gjSubjectSpouseService.insertGjSubjectSpouse(cacmpGjSubjectSpouse);
//        }else{
//            dozerMapper.map(subjectSpouse,cacmpGjSubjectSpouse);
//            gjSubjectSpouseService.modifyGjSubjectSpouse(cacmpGjSubjectSpouse);
//        }
//
//        // 修改订单状态
//        orderService.modifyOrderStatus(orderId, GjOrderStatusE.融资信息录入受理成功);
//    }
//
//    @Override
//    @Async
//    public void bindBankCardHandle(ChannelPersonBankRequest personBankRequest) {
//        String orderId = personBankRequest.getOrderId();
//        List<ChannelPersonBank> personBankList = personBankRequest.getfSubjectPerson();
//        for (ChannelPersonBank channelPersonBank : personBankList) {
//            String bankAccount = channelPersonBank.getBankAccount();
//            CacmpGjPersonBank cacmpGjPersonBank = gjPersonBankService.getCacmpGjPersonBankByOrderId(orderId, bankAccount);
//            if(Objects.isNull(cacmpGjPersonBank)){
//                cacmpGjPersonBank = new CacmpGjPersonBank();
//                dozerMapper.map(channelPersonBank,cacmpGjPersonBank);
//                cacmpGjPersonBank.setId(UniquenessFlagUnits.generateUniquenessFlag("SP"));
//                cacmpGjPersonBank.setOrderId(orderId);
//                gjPersonBankService.insertGjPersonBank(cacmpGjPersonBank);
//            }else{
//                dozerMapper.map(channelPersonBank,cacmpGjPersonBank);
//                gjPersonBankService.insertGjPersonBank(cacmpGjPersonBank);
//            }
//        }
//        orderService.modifyOrderStatus(orderId,GjOrderStatusE.银行卡绑卡成功);
//    }

}
