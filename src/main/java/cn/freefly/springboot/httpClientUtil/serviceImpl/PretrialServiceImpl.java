package cn.freefly.springboot.httpClientUtil.serviceImpl;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.pretrial.PretrialApplyRequest;
import cn.freefly.springboot.httpClientUtil.dto.pretrial.channel.ChannelPretrialApplyRequest;
import cn.freefly.springboot.httpClientUtil.service.PretrialService;
import org.springframework.stereotype.Service;

/**
 * @ClassNmae HttpClientServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/5 21:29
 * @Desc
 */
@Service
public class PretrialServiceImpl implements PretrialService {

    @Override
    public BaseResponse pretrialApply(ChannelPretrialApplyRequest channelPretrialApplyRequest) {
        // 1条件校验:检查是否满足请求条件
        BaseResponse baseResponse = checkWhetherMeetRequestCondition(channelPretrialApplyRequest);
        // 2构建请求对象

        // 3调接口

        // 4响应处理

        return null;
    }

    private BaseResponse checkWhetherMeetRequestCondition(ChannelPretrialApplyRequest channelPretrialApplyRequest) {
        BaseResponse baseResponse = new BaseResponse();

        return baseResponse;
    }

    /**
     * @Author xiao.yunfei
     * @Date 2020/3/5 23:04
     * @MethodParameters
     * @Description 构建请求对象
    */
    public PretrialApplyRequest buildPretrialApplyRequestModel(){
        PretrialApplyRequest pretrialApplyRequest = new PretrialApplyRequest();

        return pretrialApplyRequest;
    }
}
