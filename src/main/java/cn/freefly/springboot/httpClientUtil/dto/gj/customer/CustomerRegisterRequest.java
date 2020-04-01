package cn.freefly.springboot.httpClientUtil.dto.gj.customer;

/**
 * @ClassNmae CustomerRegisterRequest
 * @Description 客户登记请求类
 * @Author houjianhui
 * @Date 2020/2/26 13:01
 * @Version 1.0
 **/
public class CustomerRegisterRequest {
    private String instNo;
    private String nodeNo;
    private CustomerAssetCarExtend fAssetCarExtend;
    private CustomerBusiExtend fBusiExtend;
    private CustomerSubjectPerson fSubjectPerson;

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

    public CustomerAssetCarExtend getfAssetCarExtend() {
        return fAssetCarExtend;
    }

    public void setfAssetCarExtend(CustomerAssetCarExtend fAssetCarExtend) {
        this.fAssetCarExtend = fAssetCarExtend;
    }

    public CustomerBusiExtend getfBusiExtend() {
        return fBusiExtend;
    }

    public void setfBusiExtend(CustomerBusiExtend fBusiExtend) {
        this.fBusiExtend = fBusiExtend;
    }

    public CustomerSubjectPerson getfSubjectPerson() {
        return fSubjectPerson;
    }

    public void setfSubjectPerson(CustomerSubjectPerson fSubjectPerson) {
        this.fSubjectPerson = fSubjectPerson;
    }
}
