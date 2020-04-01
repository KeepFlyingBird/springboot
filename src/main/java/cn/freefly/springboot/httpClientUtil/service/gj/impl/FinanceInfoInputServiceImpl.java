package cn.freefly.springboot.httpClientUtil.service.gj.impl;

import cn.freefly.springboot.httpClientUtil.service.gj.FinanceInfoInputService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassNmae FinanceInfoInputServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/2/27 10:07
 * @Desc 国金-融资信息录入实现
 */
@Service
@Slf4j
public class FinanceInfoInputServiceImpl implements FinanceInfoInputService {
//    @Autowired
//    private GjHttpClients gjHttpClients;
//    @Autowired
//    private PathConfigService pathConfigService;
//    @Autowired
//    private CacmpGjNodeService cacmpGjNodeService;
//    @Autowired
//    private ProvinceCityMapper provinceCityMapper;
//    @Autowired
//    private CacmpGjUpload cacmpGjUpload;
//    @Autowired
//    private GjFileService gjFileService;
//    @Autowired
//    private OrderService orderService;
//    @Autowired
//    private GjPlatformAsyncService gjPlatformAsyncService;
//
//    @Override
//    public BaseResponse saveFinanceInfo(ChannelFinanceInfoInputRequest infoInputRequest) {
//        //1、数据校验
//        log.info("融资信息录入参数：{}", JsonUtil.toJson(infoInputRequest));
//        String applicationName = infoInputRequest.getHeader().getApplicationName();
//        String orderId = infoInputRequest.getOrderId();
//        if (Objects.isNull(orderId)) {
//            log.info("融资信息录入接口请求报文：订单唯一标识为空");
//            return BaseResponse.createBaseResponse(ResponseCode.ARGUMENT_CHECK_FAILED);
//        }
//        GjChannelsConfig channelConfig = pathConfigService.findGjChannelConfig(applicationName);
//        if (Objects.isNull(channelConfig)) {
//            log.info("融资信息录入接口：渠道{}配置在平台不存在或者未启动", applicationName);
//            return BaseResponse.createBaseResponse(ResponseCode.CHANNEL_NOT_EXISTED);
//        }
//        CacmpGjOrder order = orderService.findOrderInfoById(orderId);
//        if (Objects.isNull(order)) {
//            log.info("融资信息录入接口：订单号[{}]信息在平台不存在", orderId);
//            return BaseResponse.createBaseResponse(ResponseCode.CHANNEL_ORDER_NOT_EXIST);
//        }
//        List<String> statusCodeList = Arrays.asList(GjOrderStatusE.银行卡绑卡成功.getCode()
//        , GjOrderStatusE.银行卡绑卡验证码回填成功.getCode(), GjOrderStatusE.融资信息录入受理失败.getCode());
//        if(!statusCodeList.contains(order.getStatusCode())){
//            log.info("订单号[{}]不可发起融资信息录入", orderId);
//            return BaseResponse.createBaseResponse(ResponseCode.CHANNEL_FINANACE_INFO_INPUT_NOT_APPLY);
//        }
//        CacmpGjNode cacmpGjNode = cacmpGjNodeService.findCurrentNode(orderId);
//        log.info(EnumProcessNode.Finanace_Info_Input.getCode()+"----nodeStatus"+cacmpGjNode.getNodeNo());
//        if (Objects.isNull(cacmpGjNode.getNodeNo())
//        || !Objects.equals(cacmpGjNode.getNodeNo(), EnumProcessNode.Finanace_Info_Input.getCode())) {
//            return BaseResponse.createBaseResponse(ResponseCode.NODE_NO_MATCH);
//        }
//        // 查询资方配置信息
//        GjFundServerConfig fundService = pathConfigService.findGjFundService(applicationName);
//        if (Objects.isNull(fundService)) {
//            log.info("资金方配置在平台不存在或者未启动");
//            return BaseResponse.createBaseResponse(ResponseCode.FUND_NOT_EXISTED);
//        }
//
//        //2、组装请求资方参数
//        FinanceInfoInputRequest financeInfoInputRequest = buildFinanceInfoInputRequestModel(infoInputRequest);
//        if (Objects.isNull(financeInfoInputRequest)) {
//            log.info("融资信息录入接口申请缺少影像资料");
//            return BaseResponse.createBaseResponse(ResponseCode.CHANNEL_FINANACE_INFO_INPUT_ATTACH_NOT_EXIST);
//        }
//
//        //3、资方接口调用
//        BaseResponse response = gjHttpClients.post(fundService.getSaveApiUrl(), financeInfoInputRequest, applicationName, fundService);
//        if (Objects.equals(ResponseCode.SUCCESS.getCode(), response.getCode())) {
//            Object data = response.getData();
//            GjResponse<Object> gjResponse = JSON.parseObject(data.toString(), new TypeReference<GjResponse<Object>>() {
//            });
//            if (gjResponse.isSuccess()) {
//                //4、平台业务逻辑处理-保存融资信息录入信息
//                gjPlatformAsyncService.saveFinanceInfoInput(infoInputRequest);
//                response = BaseResponse.createBaseResponse(ResponseCode.SUCCESS);
//            } else {
//                response = BaseResponse.createBaseResponse(ResponseCode.RESPONSE_ERROR, gjResponse.getMessage());
//                // 修改订单状态
//                orderService.modifyOrderStatus(orderId, GjOrderStatusE.融资信息录入受理失败);
//            }
//        } else {
//            // 修改订单状态
//            orderService.modifyOrderStatus(orderId, GjOrderStatusE.融资信息录入受理失败);
//        }
//        return response;
//    }
//
//    private FinanceInfoInputRequest buildFinanceInfoInputRequestModel(ChannelFinanceInfoInputRequest infoInputRequest) {
//        FinanceInfoInputRequest financeInfoInputRequest = new FinanceInfoInputRequest();
//        String orderId = infoInputRequest.getOrderId();
//        // 查询文件信息
//        List<CacmpGjFile> cacmpGjFiles = gjFileService.listGjFileByStage(orderId, UploadFieldEnum.FINALJUDGMENT.getCode() + "");
//        if (CollectionUtils.isEmpty(cacmpGjFiles)) {
//            log.error("请先上传影像资料再发起融资信息录入");
//            return null;
//        }
//        // 查询订单当前节点
//        CacmpGjNode currentNode = cacmpGjNodeService.findCurrentNode(orderId);
//        financeInfoInputRequest.setInstNo(currentNode.getInstNo());
//        financeInfoInputRequest.setNodeNo(currentNode.getNodeNo());
//        //资产汽车表
//        FinanceInfoAssetCar financeInfoAssetCar = new FinanceInfoAssetCar();
//        ChannelFinanceInfoAssetCar channelFinanceInfoAssetCar = infoInputRequest.getAssetCar();
//        financeInfoAssetCar.setCarProductionType(channelFinanceInfoAssetCar.getCarProductionType());
//        financeInfoAssetCar.setCarClassify(channelFinanceInfoAssetCar.getCarClassify());
//        financeInfoAssetCar.setVehicleUsage(channelFinanceInfoAssetCar.getVehicleUsage());
//        financeInfoAssetCar.setBrand(channelFinanceInfoAssetCar.getBrand());// 品牌
//        financeInfoAssetCar.setCarSeries(channelFinanceInfoAssetCar.getCarSeries());//车型系列
//        financeInfoAssetCar.setCarColor(channelFinanceInfoAssetCar.getCarColor());
//        financeInfoAssetCar.setFuelType(channelFinanceInfoAssetCar.getFuelType());
//        financeInfoAssetCar.setCarModel(channelFinanceInfoAssetCar.getCarModel());//车系代码
//        financeInfoAssetCar.setVinCode(channelFinanceInfoAssetCar.getVinCode());//车架号
//        financeInfoAssetCar.setEngineNo(channelFinanceInfoAssetCar.getEngineNo());// 发动机号
//        financeInfoAssetCar.setRegistrationDate(channelFinanceInfoAssetCar.getRegistrationDate());// 初登日期
//        financeInfoAssetCar.setProductionDate(channelFinanceInfoAssetCar.getProductionDate());
//        financeInfoAssetCar.setMileage(channelFinanceInfoAssetCar.getMileage());
//        Optional<CacmpGjFile> cardCheqianzhaoFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.车前照.name())).findFirst();
//        if (cardCheqianzhaoFic.isPresent()) {
//            financeInfoAssetCar.setCheqianzhaoFic(cardCheqianzhaoFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardPinggushiFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.车评估师.name())).findFirst();
//        if (cardPinggushiFic.isPresent()) {
//            financeInfoAssetCar.setPinggushiFic(cardPinggushiFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardAbzhuFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.左前门含AB柱.name())).findFirst();
//        if (cardAbzhuFic.isPresent()) {
//            financeInfoAssetCar.setAbzhuFic(cardAbzhuFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardYibaioFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.仪表盘照.name())).findFirst();
//        if (cardYibaioFic.isPresent()) {
//            financeInfoAssetCar.setYibaioFic(cardYibaioFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardYaoshiFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.车钥匙照.name())).findFirst();
//        if (cardYaoshiFic.isPresent()) {
//            financeInfoAssetCar.setYaoshiFic(cardYaoshiFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardZhongkongFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.中控台.name())).findFirst();
//        if (cardZhongkongFic.isPresent()) {
//            financeInfoAssetCar.setZhongkongFic(cardZhongkongFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardZuohoumenFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.左后门含C柱.name())).findFirst();
//        if (cardZuohoumenFic.isPresent()) {
//            financeInfoAssetCar.setZuohoumenFic(cardZuohoumenFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardBeitaiFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.备胎槽.name())).findFirst();
//        if (cardBeitaiFic.isPresent()) {
//            financeInfoAssetCar.setBeitaiFic(cardBeitaiFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardChehouzhaoFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.车后照.name())).findFirst();
//        if (cardChehouzhaoFic.isPresent()) {
//            financeInfoAssetCar.setChehouzhaoFic(cardChehouzhaoFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardYouqianFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.左前45度.name())).findFirst();
//        if (cardYouqianFic.isPresent()) {
//            financeInfoAssetCar.setYouqianFic(cardYouqianFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardVinFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.vin码.name())).findFirst();
//        if (cardVinFic.isPresent()) {
//            financeInfoAssetCar.setVinFic(cardVinFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardChuchangFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.出厂牌.name())).findFirst();
//        if (cardChuchangFic.isPresent()) {
//            financeInfoAssetCar.setChuchangFic(cardChuchangFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardYinqingFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.引擎舱.name())).findFirst();
//        if (cardYinqingFic.isPresent()) {
//            financeInfoAssetCar.setYinqingFic(cardYinqingFic.get().getFastdfsUrl());
//        }
//        financeInfoInputRequest.setfAssetCar(financeInfoAssetCar);
//
//        // 资产汽车评估表
//        FinanceInfoAssetCarAssessment financeInfoAssetCarAssessment = new FinanceInfoAssetCarAssessment();
//        financeInfoAssetCarAssessment.setTransferCount(infoInputRequest.getAssetCarAssessment().getTransferCount());
//        financeInfoInputRequest.setfAssetCarAssessment(financeInfoAssetCarAssessment);
//        // 资产汽车扩展表
//        FinanceInfoAssetCarExtend financeInfoAssetCarExtend = new FinanceInfoAssetCarExtend();
//        ChannelFinanceInfoAssetCarExtend channelFinanceInfoAssetCarExtend = infoInputRequest.getAssetCarExtend();
//        financeInfoAssetCarExtend.setCarDisplacement(channelFinanceInfoAssetCarExtend.getCarDisplacement());
//        financeInfoAssetCarExtend.setPassengerNum(channelFinanceInfoAssetCarExtend.getPassengerNum());
//        financeInfoAssetCarExtend.setVariableSpeed(channelFinanceInfoAssetCarExtend.getVariableSpeed());
//        Optional<CacmpGjFile> cardXingshizhengFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.行驶证照行驶证主页.name())).findFirst();
//        if (cardXingshizhengFic.isPresent()) {
//            financeInfoAssetCarExtend.setXingshizhengFic(cardXingshizhengFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardXingshizhengBackFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.行驶证照行驶证副页.name())).findFirst();
//        if (cardXingshizhengBackFic.isPresent()) {
//            financeInfoAssetCarExtend.setXingshizhengBackFic(cardXingshizhengBackFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardDengjizFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.登记证首页.name())).findFirst();
//        if (cardDengjizFic.isPresent()) {
//            financeInfoAssetCarExtend.setDengjizFic(cardDengjizFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardDengjizFic2 = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.登记证其他页.name())).findFirst();
//        if (cardDengjizFic2.isPresent()) {
//            financeInfoAssetCarExtend.setDengjizFic2(cardDengjizFic2.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardJiaoqiangxianzhaoFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.交强险保单照.name())).findFirst();
//        if (cardJiaoqiangxianzhaoFic.isPresent()) {
//            financeInfoAssetCarExtend.setJiaoqiangxianzhaoFic(cardJiaoqiangxianzhaoFic.get().getFastdfsUrl());
//        }
//        Optional<CacmpGjFile> cardShangyebaodanFic = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.商业险保单照.name())).findFirst();
//        if (cardShangyebaodanFic.isPresent()) {
//            financeInfoAssetCarExtend.setShangyebaodanFic(cardShangyebaodanFic.get().getFastdfsUrl());
//        }
//        financeInfoInputRequest.setfAssetCarExtend(financeInfoAssetCarExtend);
//        // 资产不动产扩展表
//        FinanceInfoAssetRealEstates financeInfoAssetRealEstates = new FinanceInfoAssetRealEstates();
//        List<FinanceInfoAssetRealEstate> financeInfoAssetRealEstateList = new ArrayList<FinanceInfoAssetRealEstate>();
//        ChannelFinanceInfoAssetRealEstates channelFinanceInfoAssetRealEstates = infoInputRequest.getAssetRealEstates();
//        List<ChannelFinanceInfoAssetRealEstate> channelFinanceInfoAssetRealEstateList = channelFinanceInfoAssetRealEstates.getAddrealFic();
//        if(channelFinanceInfoAssetRealEstateList.size() > 0){
//            for(ChannelFinanceInfoAssetRealEstate channelFinanceInfoAssetRealEstate:channelFinanceInfoAssetRealEstateList){
//                FinanceInfoAssetRealEstate financeInfoAssetRealEstate = new FinanceInfoAssetRealEstate();
//                financeInfoAssetRealEstate.setCondition(channelFinanceInfoAssetRealEstate.getCondition());
//                financeInfoAssetRealEstate.setProperty(channelFinanceInfoAssetRealEstate.getProperty());
//                financeInfoAssetRealEstate.setPropertyType(channelFinanceInfoAssetRealEstate.getPropertyType());
//                financeInfoAssetRealEstate.setSource(channelFinanceInfoAssetRealEstate.getSource());
//                financeInfoAssetRealEstateList.add(financeInfoAssetRealEstate);
//            }
//            financeInfoAssetRealEstates.setAddrealFic(financeInfoAssetRealEstateList);
//            financeInfoInputRequest.setfAssetRealEstate(financeInfoAssetRealEstates);
//        }
//        // 业务信息表
//        FinanceInfoBusinessInfo financeInfoBusinessInfo = new FinanceInfoBusinessInfo();
//        ChannelFinanceInfoBusinessInfo channelFinanceInfoBusinessInfo = infoInputRequest.getBusi();
//        financeInfoBusinessInfo.setBusiPeriods(channelFinanceInfoBusinessInfo.getBusiPeriods());
//        financeInfoInputRequest.setfBusi(financeInfoBusinessInfo);
//        // 业务信息扩展表
//        FinanceInfoBusinessInfoExtend financeInfoBusinessInfoExtend = new FinanceInfoBusinessInfoExtend();
//        ChannelFinanceInfoBusinessInfoExtend channelFinanceInfoBusinessInfoExtend = infoInputRequest.getBusiExtend();
//        financeInfoBusinessInfoExtend.setBusiContractDate(channelFinanceInfoBusinessInfoExtend.getBusiContractDate());
//        financeInfoInputRequest.setfBusiExtend(financeInfoBusinessInfoExtend);
//        // 融租信息
//        FinanceInfoBusinessFinance financeInfoBusinessFinance = new FinanceInfoBusinessFinance();
//        ChannelFinanceInfoBusinessFinance channelFinanceInfoBusinessFinance = infoInputRequest.getBusiFinance();
//        financeInfoBusinessFinance.setApproveSum(channelFinanceInfoBusinessFinance.getApproveSum());
//        financeInfoInputRequest.setfBusiFinance(financeInfoBusinessFinance);
//        // 主体联系人表
//        FinanceInfoSubjectContacts financeInfoSubjectContacts = new FinanceInfoSubjectContacts();
//        List<FinanceInfoSubjectContact> financeInfoSubjectContactList = new ArrayList<FinanceInfoSubjectContact>();
//        ChannelFinanceInfoSubjectContacts channelFinanceInfoSubjectContacts =  infoInputRequest.getSubjectContacts();
//        List<ChannelFinanceInfoSubjectContact> channelFinanceInfoSubjectContactList = channelFinanceInfoSubjectContacts.getAddlxrFic();
//        if(channelFinanceInfoSubjectContactList.size()>0){
//            for (int i=0;i<channelFinanceInfoSubjectContactList.size();i++){
//                FinanceInfoSubjectContact financeInfoSubjectContact = new FinanceInfoSubjectContact();
//                financeInfoSubjectContact.setContactsName(channelFinanceInfoSubjectContactList.get(i).getContactsName());
//                financeInfoSubjectContact.setContactsPhone(channelFinanceInfoSubjectContactList.get(i).getContactsPhone());
//                financeInfoSubjectContact.setContactsRelation(channelFinanceInfoSubjectContactList.get(i).getContactsRelation());
//                financeInfoSubjectContactList.add(financeInfoSubjectContact);
//            }
//            financeInfoSubjectContacts.setAddlxrFic(financeInfoSubjectContactList);
//            financeInfoInputRequest.setfSubjectContacts(financeInfoSubjectContacts);
//        }
//        // 主体担保人表
//        FinanceInfoSubjectGuarantees financeInfoSubjectGuarantees = new FinanceInfoSubjectGuarantees();
//        List<FinanceInfoSubjectGuarantee> financeInfoSubjectGuaranteeList = new ArrayList<FinanceInfoSubjectGuarantee>();
//        ChannelFinanceInfoSubjectGuarantees channelFinanceInfoSubjectGuarantees = infoInputRequest.getSubjectGuarantees();
//        List<ChannelFinanceInfoSubjectGuarantee> channelFinanceInfoSubjectGuaranteeList = channelFinanceInfoSubjectGuarantees.getAdddbrFic();
//        if(channelFinanceInfoSubjectGuaranteeList.size() > 0){
//            for(ChannelFinanceInfoSubjectGuarantee channelFinanceInfoSubjectGuarantee:channelFinanceInfoSubjectGuaranteeList){
//                FinanceInfoSubjectGuarantee financeInfoSubjectGuarantee = new FinanceInfoSubjectGuarantee();
//                financeInfoSubjectGuarantee.setGuaranteeRelation(channelFinanceInfoSubjectGuarantee.getGuaranteeRelation());
//                financeInfoSubjectGuarantee.setGuaranteePhone(channelFinanceInfoSubjectGuarantee.getGuaranteePhone());
//                financeInfoSubjectGuaranteeList.add(financeInfoSubjectGuarantee);
//            }
//            financeInfoSubjectGuarantees.setAdddbrFic(financeInfoSubjectGuaranteeList);
//            financeInfoInputRequest.setfSubjectGuarantee(financeInfoSubjectGuarantees);
//        }
//        // 主体自然人
//        FinanceInfoSubjectPerson financeInfoSubjectPerson = new FinanceInfoSubjectPerson();
//        ChannelFinanceInfoSubjectPerson channelFinanceInfoSubjectPerson = infoInputRequest.getSubjectPerson();
//        financeInfoSubjectPerson.setSubName("");
//        financeInfoSubjectPerson.setIdCardNumber("");
//        financeInfoSubjectPerson.setBankAccount("");
//        financeInfoSubjectPerson.setPhoneCode("");
//        financeInfoSubjectPerson.setMarriageState(channelFinanceInfoSubjectPerson.getMarriageState());
//        financeInfoSubjectPerson.setSubPhone(channelFinanceInfoSubjectPerson.getSubPhone());
//        Optional<CacmpGjFile> cardBankCardPhoto = cacmpGjFiles.stream().filter(v -> Objects.equals(v.getFileName(), GJFieldEnum.收款方银行卡账号.name())).findFirst();
//        if (cardBankCardPhoto.isPresent()) {
//            financeInfoSubjectPerson.setBankCardPhoto(cardBankCardPhoto.get().getFastdfsUrl());
//        }
//        financeInfoInputRequest.setfSubjectPerson(financeInfoSubjectPerson);
//
//        // 主体配偶表
//        FinanceInfoSubjectSpouse financeInfoSubjectSpouse = new FinanceInfoSubjectSpouse();
//        ChannelFinanceInfoSubjectSpouse channelFinanceInfoSubjectSpouse = infoInputRequest.getSubjectSpouse();
//        financeInfoSubjectSpouse.setSpousePhone(channelFinanceInfoSubjectSpouse.getSpousePhone());
//        financeInfoSubjectSpouse.setIsJointTenants(channelFinanceInfoSubjectSpouse.getIsJointTenants());
//        financeInfoInputRequest.setfSubjectSpouse(financeInfoSubjectSpouse);
//        System.out.println("-----------financeInfoInputRequest="+JsonUtil.toJson(financeInfoInputRequest));
//        return financeInfoInputRequest;
//    }
}
