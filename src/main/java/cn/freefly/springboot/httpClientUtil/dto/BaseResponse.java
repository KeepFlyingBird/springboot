package cn.freefly.springboot.httpClientUtil.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNmae BaseResponse
 * @Author xiao.yunfei
 * @Date 2020/3/5 21:32
 * @Desc
 */
@Data
@NoArgsConstructor
public class BaseResponse {
    private boolean resFlag;
    private String resCode;
    private String resMsg;
    private Object resData;

    public BaseResponse(boolean resFlag, String resCode, String resMsg) {
        this.resFlag = resFlag;
        this.resCode = resCode;
        this.resMsg = resMsg;
    }

    public BaseResponse(boolean resFlag, String resCode, String resMsg, Object resData) {
        this.resFlag = resFlag;
        this.resCode = resCode;
        this.resMsg = resMsg;
        this.resData = resData;
    }

    public BaseResponse(boolean resFlag, Object resData){
        this.resFlag = resFlag;
        this.resData = resData;
    }

    public static BaseResponse createBaseResponse(boolean resFlag,String resCode,String resMsg){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResFlag(resFlag);
        baseResponse.setResCode(resCode);
        baseResponse.setResMsg(resMsg);
        return baseResponse;
    }
    public static BaseResponse createBaseResponse(boolean resFlag,String resCode,String resMsg,Object resData){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResFlag(resFlag);
        baseResponse.setResCode(resCode);
        baseResponse.setResMsg(resMsg);
        baseResponse.setResData(resData);
        return baseResponse;
    }
    public static BaseResponse createBaseResponse(boolean resFlag,Object resData){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResFlag(resFlag);
        baseResponse.setResData(resData);
        return baseResponse;
    }
}
