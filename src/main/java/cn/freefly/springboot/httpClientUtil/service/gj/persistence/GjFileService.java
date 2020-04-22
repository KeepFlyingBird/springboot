package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjFile;

import java.util.List;

public interface GjFileService {
    /**
     * @return java.utils.List<com.jianyuan.fund.domain.gj.CacmpGjFile>
     * @Author houjianhui
     * @Description 通过阶段获取当前阶段文件列表
     * @Date 15:17 2020/3/23
     * @Param [stage]
     **/
    List<CacmpGjFile> listGjFileByStage(String orderId, String stage);

    /**
     * @return com.jianyuan.fund.domain.gj.CacmpGjFile
     * @Author houjianhui
     * @Description 通过订单ID、阶段、文件名称查询文件地址
     * @Date 16:06 2020/3/23
     * @Param [orderId, stage, fileName]
     **/
    CacmpGjFile findGjFileByOrderIdAndStageAndFileName(String orderId, String stage, String fileName);

}
