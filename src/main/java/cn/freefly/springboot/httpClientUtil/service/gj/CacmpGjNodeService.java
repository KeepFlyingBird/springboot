package cn.freefly.springboot.httpClientUtil.service.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjNode;

public interface CacmpGjNodeService {
    /**
     * @return com.jianyuan.fund.domain.gj.CacmpGjNode
     * @Author houjianhui
     * @Description 获取当前节点
     * @Date 17:42 2020/2/28
     * @Param [orderId]
     **/
    CacmpGjNode findCurrentNode(String orderId);

    /**
     * @Author houjianhui
     * @Description 新增订单流程节点
     * @Date 18:31 2020/2/28
     * @Param [orderId, instNo, nodeNo]
     * @return void
     **/
    void saveNodeInfo(String orderId, String instNo, String nodeNo);
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/3 14:23
     * @MethodParameters
     * @Description  查询订单节点数据：instNo和nodeNo
    */
    CacmpGjNode findCacmpGjNodeByInstNoAndnodeNo(String instNo, String nodeNo);
    /**
     * @Author xiao.yunfei
     * @Date 2020/3/3 14:20
     * @MethodParameters
     * @Description 更新订单流程节点状态
    */
    void updateNodeInfo(CacmpGjNode cacmpGjNode);
    /**
     * @Author xiao.yunfei
     * @Description 查询订单节点数据：orderId和nodeNo
     * @Date 2020/3/31 17:33
     * @Param [orderId, nodeNo]
     * @Return com.jianyuan.fund.domain.gj.CacmpGjNode
     */ 
    CacmpGjNode findCacmpGjNodeByOrderIdAndnodeNo(String orderId, String nodeNo);
    /**
     * @Author xiao.yunfei
     * @Description 保存订单节点表数据
     * @Date 2020/4/2 9:40
     * @Param [orderId, instNo, nodeNo]
     * @Return void
     */ 
    void saveCacmpGjNodeInfo(String orderId, String instNo, String nodeNo);
}
