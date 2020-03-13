package cn.freefly.springboot.controller;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.pretrial.channel.ChannelPretrialApplyRequest;
import cn.freefly.springboot.httpClientUtil.service.PretrialService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNmae HttpClientController
 * @Author xiao.yunfei
 * @Date 2020/3/5 21:27
 * @Desc
 */
@RestController
@Api(description = "HttpClient接口", tags = {"接口"})
public class HttpClientController {
    @Autowired
    public PretrialService pretrialService;

    @ApiOperation(
            value = "预审接口"
            ,notes="步骤1"
            ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,response = BaseResponse.class)
    @PostMapping("/channel/fund/pretrial")
    public BaseResponse pretrial(@RequestBody@ApiParam(value = "预审参数") ChannelPretrialApplyRequest channelPretrialApplyRequest){
        return pretrialService.pretrialApply(channelPretrialApplyRequest);
    }

    @ApiOperation(
            value = "预审接口"
            ,notes="步骤1"
            ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,response = BaseResponse.class)
    @PostMapping("/channel/fund/pretrial")
    public BaseResponse loanCre(@RequestBody@ApiParam(value = "预审参数") ChannelPretrialApplyRequest channelloanCreApplyRequest){
        return pretrialService.pretrialApply(channelloanCreApplyRequest);
    }
}
