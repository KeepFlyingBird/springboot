package cn.freefly.springboot.httpClientUtil.entity.gj;



import lombok.*;

import java.io.Serializable;
import java.util.Date;


/**
* Created by Mybatis Generator on 2020/04/03
*/
public class CacmpGjNode implements Serializable {

    public CacmpGjNode() {
    }

    public String id;

    public String orderId;

    public String instNo;

    public String nodeNo;

    public String nodeStatus;

    public String nodeNumber;

    public String remark;

    public String channelResult;

    public Date createTime;

    public Date modifyTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInstNo() {
        return instNo;
    }

    public void setInstNo(String instNo) {
        this.instNo = instNo;
    }

    public String getNodeNo() {
        return nodeNo;
    }

    public void setNodeNo(String nodeNo) {
        this.nodeNo = nodeNo;
    }

    public String getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public String getNodeNumber() {
        return nodeNumber;
    }

    public void setNodeNumber(String nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getChannelResult() {
        return channelResult;
    }

    public void setChannelResult(String channelResult) {
        this.channelResult = channelResult;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}