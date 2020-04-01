package cn.freefly.springboot.httpClientUtil.service.gj.impl;


import cn.freefly.springboot.httpClientUtil.service.gj.CacmpGjNodeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @ClassNmae CacmpGjNodeServiceImpl
 * @Description 订单状态业务类
 * @Author houjianhui
 * @Date 2020/2/28 17:42
 * @Version 1.0
 **/
@Service
@Slf4j
public class CacmpGjNodeServiceImpl implements CacmpGjNodeService {

//    private static String ENABLED = "1";
//
//    @Autowired
//    private CacmpGjNodeMapper cacmpGjNodeMapper;
//
//    @Override
//    public CacmpGjNode findCurrentNode(String orderId) {
//        log.info("查询订单当前节点参数：{}", orderId);
//        if (Objects.isNull(orderId)) {
//            return null;
//        }
//        CacmpGjNodeCriteria example = new CacmpGjNodeCriteria();
//        CacmpGjNodeCriteria.Criteria criteria = example.createCriteria();
//        criteria.andOrderIdEqualTo(orderId);
////        criteria.andNodeStatusEqualTo(ENABLED);
//        List<CacmpGjNode> cacmpGjNodes = cacmpGjNodeMapper.selectByExample(example);
//        if (CollectionUtils.isNotEmpty(cacmpGjNodes)) {
//            if (cacmpGjNodes.size() > 1) {
//                log.info("当前订单{}节点流程异常", orderId);
//                return null;
//            }
//            return cacmpGjNodes.get(0);
//        }
//        return null;
//    }
//
//    @Override
//    public void saveNodeInfo(String orderId, String instNo, String nodeNo) {
//        log.info("保存订单流程节点参数：{},{},{}", orderId, instNo, nodeNo);
//        List<CacmpGjNode> cacmpGjNodes = listCacmpGjNode(orderId);
//        if (CollectionUtils.isNotEmpty(cacmpGjNodes)) {
//            log.info("创建订单流程节点异常");
//            return;
//        }
//        CacmpGjNode node = new CacmpGjNode();
//        node.setId(UniquenessFlagUnits.generateUniquenessFlag("NO"));
//        node.setCreateTime(DateUtil.getCurTime());
//        node.setNodeNo(nodeNo);
//        node.setInstNo(instNo);
//        node.setNodeNumber("1");
//        node.setOrderId(orderId);
//        cacmpGjNodeMapper.insertSelective(node);
//    }
//
//    /**
//     * @return java.util.List<com.jianyuan.fund.domain.gj.CacmpGjNode>
//     * @Author houjianhui
//     * @Description 根据订单ID查询所有节点
//     * @Date 18:34 2020/2/28
//     * @Param [orderId]
//     **/
//    private List<CacmpGjNode> listCacmpGjNode(String orderId) {
//        CacmpGjNodeCriteria example = new CacmpGjNodeCriteria();
//        CacmpGjNodeCriteria.Criteria criteria = example.createCriteria();
//        criteria.andOrderIdEqualTo(orderId);
//        return cacmpGjNodeMapper.selectByExample(example);
//    }
//    @Override
//    public CacmpGjNode findNodeByInstNo(String instNo) {
//        log.info("查询订单当前节点参数：{}", instNo);
//        if (Objects.isNull(instNo)) {
//            return null;
//        }
//        CacmpGjNodeCriteria example = new CacmpGjNodeCriteria();
//        CacmpGjNodeCriteria.Criteria criteria = example.createCriteria();
//        criteria.andInstNoEqualTo(instNo);
//        List<CacmpGjNode> cacmpGjNodes = cacmpGjNodeMapper.selectByExample(example);
//        if (CollectionUtils.isNotEmpty(cacmpGjNodes)) {
//            return cacmpGjNodes.get(0);
//        }
//        return null;
//    }
//
//    @Override
//    public void updateNodeInfo(String id, String nodeNo, String nodeStatus, String remark) {
//        log.info("更新订单流程节点参数：{},{},{},{}", id, nodeNo, nodeStatus, remark);
//        CacmpGjNode node = new CacmpGjNode();
//        node.setId(id);
//        node.setModifyTime(DateUtil.getCurTime());
//        node.setNodeNo(nodeNo);
//        node.setNodeStatus(nodeStatus);
//        node.setRemark(remark);
//        cacmpGjNodeMapper.updateByPrimaryKeySelective(node);
//    }
}
