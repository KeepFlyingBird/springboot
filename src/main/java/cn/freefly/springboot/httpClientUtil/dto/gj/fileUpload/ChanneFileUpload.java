package cn.freefly.springboot.httpClientUtil.dto.gj.fileUpload;

import cn.freefly.springboot.httpClientUtil.dto.BaseRequest;
import lombok.Data;

/**
 * @ClassNmae ChannelGPS
 * @Author shi.zhihui
 * @Date 2020/3/03
 * @Desc
 */
@Data
public class ChanneFileUpload extends BaseRequest {
    private Integer stage;
    private String  orderId;

}
