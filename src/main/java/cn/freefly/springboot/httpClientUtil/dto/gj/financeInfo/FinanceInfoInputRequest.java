package cn.freefly.springboot.httpClientUtil.dto.gj.financeInfo;

/**
 * @ClassNmae FinanceInfoInputRequest
 * @Author xiao.yunfei
 * @Date 2020/2/27 10:16
 * @Desc
 */
public class FinanceInfoInputRequest {
    private String instNo;
    private String nodeNo;
    private FinanceInfoAssetCar fAssetCar;
    private FinanceInfoAssetCarAssessment fAssetCarAssessment;
    private FinanceInfoAssetCarExtend fAssetCarExtend;
    private FinanceInfoAssetRealEstates fAssetRealEstate;
    private FinanceInfoBusinessInfo fBusi;
    private FinanceInfoBusinessInfoExtend fBusiExtend;
    private FinanceInfoBusinessFinance fBusiFinance;
    private FinanceInfoSubjectContacts fSubjectContacts;
    private FinanceInfoSubjectGuarantees fSubjectGuarantee;
    private FinanceInfoSubjectPerson fSubjectPerson;
    private FinanceInfoSubjectSpouse fSubjectSpouse;

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

    public FinanceInfoAssetCar getfAssetCar() {
        return fAssetCar;
    }

    public void setfAssetCar(FinanceInfoAssetCar fAssetCar) {
        this.fAssetCar = fAssetCar;
    }

    public FinanceInfoAssetCarAssessment getfAssetCarAssessment() {
        return fAssetCarAssessment;
    }

    public void setfAssetCarAssessment(FinanceInfoAssetCarAssessment fAssetCarAssessment) {
        this.fAssetCarAssessment = fAssetCarAssessment;
    }

    public FinanceInfoAssetCarExtend getfAssetCarExtend() {
        return fAssetCarExtend;
    }

    public void setfAssetCarExtend(FinanceInfoAssetCarExtend fAssetCarExtend) {
        this.fAssetCarExtend = fAssetCarExtend;
    }

    public FinanceInfoAssetRealEstates getfAssetRealEstate() {
        return fAssetRealEstate;
    }

    public void setfAssetRealEstate(FinanceInfoAssetRealEstates fAssetRealEstate) {
        this.fAssetRealEstate = fAssetRealEstate;
    }

    public FinanceInfoBusinessInfo getfBusi() {
        return fBusi;
    }

    public void setfBusi(FinanceInfoBusinessInfo fBusi) {
        this.fBusi = fBusi;
    }

    public FinanceInfoBusinessInfoExtend getfBusiExtend() {
        return fBusiExtend;
    }

    public void setfBusiExtend(FinanceInfoBusinessInfoExtend fBusiExtend) {
        this.fBusiExtend = fBusiExtend;
    }

    public FinanceInfoBusinessFinance getfBusiFinance() {
        return fBusiFinance;
    }

    public void setfBusiFinance(FinanceInfoBusinessFinance fBusiFinance) {
        this.fBusiFinance = fBusiFinance;
    }

    public FinanceInfoSubjectContacts getfSubjectContacts() {
        return fSubjectContacts;
    }

    public void setfSubjectContacts(FinanceInfoSubjectContacts fSubjectContacts) {
        this.fSubjectContacts = fSubjectContacts;
    }

    public FinanceInfoSubjectGuarantees getfSubjectGuarantee() {
        return fSubjectGuarantee;
    }

    public void setfSubjectGuarantee(FinanceInfoSubjectGuarantees fSubjectGuarantee) {
        this.fSubjectGuarantee = fSubjectGuarantee;
    }

    public FinanceInfoSubjectPerson getfSubjectPerson() {
        return fSubjectPerson;
    }

    public void setfSubjectPerson(FinanceInfoSubjectPerson fSubjectPerson) {
        this.fSubjectPerson = fSubjectPerson;
    }

    public FinanceInfoSubjectSpouse getfSubjectSpouse() {
        return fSubjectSpouse;
    }

    public void setfSubjectSpouse(FinanceInfoSubjectSpouse fSubjectSpouse) {
        this.fSubjectSpouse = fSubjectSpouse;
    }
}
