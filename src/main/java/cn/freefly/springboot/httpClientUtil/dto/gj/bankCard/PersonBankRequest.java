package cn.freefly.springboot.httpClientUtil.dto.gj.bankCard;

import java.util.List;

/**
 * @ClassNmae PersonBankRequest
 * @Author xiao.yunfei
 * @Date 2020/2/27 17:49
 * @Desc
 */
public class PersonBankRequest {
    private String instNo;
    private String nodeNo;
    private List<PersonBank> fSubjectPerson;

    public PersonBankRequest() {
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

    public List<PersonBank> getfSubjectPerson() {
        return fSubjectPerson;
    }

    public void setfSubjectPerson(List<PersonBank> fSubjectPerson) {
        this.fSubjectPerson = fSubjectPerson;
    }
}
