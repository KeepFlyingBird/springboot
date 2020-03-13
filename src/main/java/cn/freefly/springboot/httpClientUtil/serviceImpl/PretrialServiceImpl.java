package cn.freefly.springboot.httpClientUtil.serviceImpl;

import cn.freefly.springboot.httpClientUtil.config.fund.FundConstant;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.RequestParams;
import cn.freefly.springboot.httpClientUtil.dto.enums.StageE;
import cn.freefly.springboot.httpClientUtil.dto.pretrial.PretrialApplyRequest;
import cn.freefly.springboot.httpClientUtil.dto.pretrial.channel.ChannelPretrialApplyRequest;
import cn.freefly.springboot.httpClientUtil.service.PretrialService;
import cn.freefly.springboot.httpClientUtil.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassNmae HttpClientServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/5 21:29
 * @Desc
 */
@Service
public class PretrialServiceImpl implements PretrialService {
    @Autowired
    public HttpClient httpClient;

    @Override
    public BaseResponse pretrialApply(ChannelPretrialApplyRequest channelPretrialApplyRequest) {
        //1、条件校验:检查是否满足请求条件
        BaseResponse baseResponse = checkWhetherMeetRequestCondition(channelPretrialApplyRequest);
        if(!baseResponse.isResFlag()){
            return baseResponse;
        }
        //2、 保存请求数据 TODO

        //3、构建请求对象
        RequestParams requestParams = buildPretrialApplyRequestModel(channelPretrialApplyRequest);
        //4、调接口
        BaseResponse baseResponse1 = httpClient.post(FundConstant.Host+FundConstant.PretrialUrl,requestParams);
        //5、响应处理
        if(baseResponse1.isResFlag()){
            return handlePretrial(baseResponse1);
        }else{
            return null;
        }
    }

    private BaseResponse handlePretrial(BaseResponse baseResponse1) {

        return null;
    }

    private BaseResponse checkWhetherMeetRequestCondition(ChannelPretrialApplyRequest channelPretrialApplyRequest) {
        BaseResponse baseResponse = new BaseResponse();
        boolean flag = true;
        //1、核实订单号在平台是否存在
        if(flag){
            BaseResponse.createBaseResponse(flag,"");
        }else{
            BaseResponse.createBaseResponse(false,"");
        }
        return baseResponse;
    }

    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 23:04
     * @MethodParameters
     * @Description 构建请求对象
    */
    public RequestParams buildPretrialApplyRequestModel(ChannelPretrialApplyRequest channelPretrialApplyRequest){
        RequestParams requestParams = RequestParams.builder().build();
        requestParams.setInterfaceId(StageE.预审申请.getCode());

        PretrialApplyRequest pretrialApplyRequest = new PretrialApplyRequest();
        pretrialApplyRequest.setProjectNo(FundConstant.ProjectNo);// 项目编号
        pretrialApplyRequest.setApplNo("");// 授信申请单号
        pretrialApplyRequest.setLoanlNo("");// 渠道申请单号
        pretrialApplyRequest.setQudLay(FundConstant.QudLay);// 合作渠道
        pretrialApplyRequest.setCustName(channelPretrialApplyRequest.getCustName());// 姓名
        pretrialApplyRequest.setIdType(channelPretrialApplyRequest.getIdType());// 证件类型-取值人保预审阶段（投保人证件类型(固定传值01，身份证)）
        pretrialApplyRequest.setIdNo(channelPretrialApplyRequest.getIdNo());// 证件号
        pretrialApplyRequest.setPhoneNo(channelPretrialApplyRequest.getPhoneNo());// 手机号码
        pretrialApplyRequest.setCooprBussType(channelPretrialApplyRequest.getCooprBussType());// 合作商业务类型
        requestParams.setInfoContent(pretrialApplyRequest);
        return requestParams;
    }
}
