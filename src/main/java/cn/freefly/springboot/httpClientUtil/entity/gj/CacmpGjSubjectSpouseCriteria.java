package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjSubjectSpouseCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjSubjectSpouseCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPersionIdIsNull() {
            addCriterion("persion_id is null");
            return (Criteria) this;
        }

        public Criteria andPersionIdIsNotNull() {
            addCriterion("persion_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersionIdEqualTo(String value) {
            addCriterion("persion_id =", value, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdNotEqualTo(String value) {
            addCriterion("persion_id <>", value, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdGreaterThan(String value) {
            addCriterion("persion_id >", value, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdGreaterThanOrEqualTo(String value) {
            addCriterion("persion_id >=", value, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdLessThan(String value) {
            addCriterion("persion_id <", value, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdLessThanOrEqualTo(String value) {
            addCriterion("persion_id <=", value, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdLike(String value) {
            addCriterion("persion_id like", value, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdNotLike(String value) {
            addCriterion("persion_id not like", value, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdIn(List<String> values) {
            addCriterion("persion_id in", values, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdNotIn(List<String> values) {
            addCriterion("persion_id not in", values, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdBetween(String value1, String value2) {
            addCriterion("persion_id between", value1, value2, "persionId");
            return (Criteria) this;
        }

        public Criteria andPersionIdNotBetween(String value1, String value2) {
            addCriterion("persion_id not between", value1, value2, "persionId");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsIsNull() {
            addCriterion("is_joint_tenants is null");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsIsNotNull() {
            addCriterion("is_joint_tenants is not null");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsEqualTo(String value) {
            addCriterion("is_joint_tenants =", value, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsNotEqualTo(String value) {
            addCriterion("is_joint_tenants <>", value, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsGreaterThan(String value) {
            addCriterion("is_joint_tenants >", value, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsGreaterThanOrEqualTo(String value) {
            addCriterion("is_joint_tenants >=", value, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsLessThan(String value) {
            addCriterion("is_joint_tenants <", value, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsLessThanOrEqualTo(String value) {
            addCriterion("is_joint_tenants <=", value, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsLike(String value) {
            addCriterion("is_joint_tenants like", value, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsNotLike(String value) {
            addCriterion("is_joint_tenants not like", value, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsIn(List<String> values) {
            addCriterion("is_joint_tenants in", values, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsNotIn(List<String> values) {
            addCriterion("is_joint_tenants not in", values, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsBetween(String value1, String value2) {
            addCriterion("is_joint_tenants between", value1, value2, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIsJointTenantsNotBetween(String value1, String value2) {
            addCriterion("is_joint_tenants not between", value1, value2, "isJointTenants");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicIsNull() {
            addCriterion("id_card_front_fic is null");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicIsNotNull() {
            addCriterion("id_card_front_fic is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicEqualTo(String value) {
            addCriterion("id_card_front_fic =", value, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicNotEqualTo(String value) {
            addCriterion("id_card_front_fic <>", value, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicGreaterThan(String value) {
            addCriterion("id_card_front_fic >", value, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_front_fic >=", value, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicLessThan(String value) {
            addCriterion("id_card_front_fic <", value, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicLessThanOrEqualTo(String value) {
            addCriterion("id_card_front_fic <=", value, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicLike(String value) {
            addCriterion("id_card_front_fic like", value, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicNotLike(String value) {
            addCriterion("id_card_front_fic not like", value, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicIn(List<String> values) {
            addCriterion("id_card_front_fic in", values, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicNotIn(List<String> values) {
            addCriterion("id_card_front_fic not in", values, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicBetween(String value1, String value2) {
            addCriterion("id_card_front_fic between", value1, value2, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontFicNotBetween(String value1, String value2) {
            addCriterion("id_card_front_fic not between", value1, value2, "idCardFrontFic");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoIsNull() {
            addCriterion("id_card_head_photo is null");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoIsNotNull() {
            addCriterion("id_card_head_photo is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoEqualTo(String value) {
            addCriterion("id_card_head_photo =", value, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoNotEqualTo(String value) {
            addCriterion("id_card_head_photo <>", value, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoGreaterThan(String value) {
            addCriterion("id_card_head_photo >", value, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_head_photo >=", value, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoLessThan(String value) {
            addCriterion("id_card_head_photo <", value, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoLessThanOrEqualTo(String value) {
            addCriterion("id_card_head_photo <=", value, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoLike(String value) {
            addCriterion("id_card_head_photo like", value, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoNotLike(String value) {
            addCriterion("id_card_head_photo not like", value, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoIn(List<String> values) {
            addCriterion("id_card_head_photo in", values, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoNotIn(List<String> values) {
            addCriterion("id_card_head_photo not in", values, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoBetween(String value1, String value2) {
            addCriterion("id_card_head_photo between", value1, value2, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardHeadPhotoNotBetween(String value1, String value2) {
            addCriterion("id_card_head_photo not between", value1, value2, "idCardHeadPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicIsNull() {
            addCriterion("id_card_reverse_fic is null");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicIsNotNull() {
            addCriterion("id_card_reverse_fic is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicEqualTo(String value) {
            addCriterion("id_card_reverse_fic =", value, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicNotEqualTo(String value) {
            addCriterion("id_card_reverse_fic <>", value, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicGreaterThan(String value) {
            addCriterion("id_card_reverse_fic >", value, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_reverse_fic >=", value, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicLessThan(String value) {
            addCriterion("id_card_reverse_fic <", value, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicLessThanOrEqualTo(String value) {
            addCriterion("id_card_reverse_fic <=", value, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicLike(String value) {
            addCriterion("id_card_reverse_fic like", value, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicNotLike(String value) {
            addCriterion("id_card_reverse_fic not like", value, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicIn(List<String> values) {
            addCriterion("id_card_reverse_fic in", values, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicNotIn(List<String> values) {
            addCriterion("id_card_reverse_fic not in", values, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicBetween(String value1, String value2) {
            addCriterion("id_card_reverse_fic between", value1, value2, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andIdCardReverseFicNotBetween(String value1, String value2) {
            addCriterion("id_card_reverse_fic not between", value1, value2, "idCardReverseFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicIsNull() {
            addCriterion("jiashiben_fic is null");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicIsNotNull() {
            addCriterion("jiashiben_fic is not null");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicEqualTo(String value) {
            addCriterion("jiashiben_fic =", value, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicNotEqualTo(String value) {
            addCriterion("jiashiben_fic <>", value, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicGreaterThan(String value) {
            addCriterion("jiashiben_fic >", value, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicGreaterThanOrEqualTo(String value) {
            addCriterion("jiashiben_fic >=", value, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicLessThan(String value) {
            addCriterion("jiashiben_fic <", value, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicLessThanOrEqualTo(String value) {
            addCriterion("jiashiben_fic <=", value, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicLike(String value) {
            addCriterion("jiashiben_fic like", value, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicNotLike(String value) {
            addCriterion("jiashiben_fic not like", value, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicIn(List<String> values) {
            addCriterion("jiashiben_fic in", values, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicNotIn(List<String> values) {
            addCriterion("jiashiben_fic not in", values, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicBetween(String value1, String value2) {
            addCriterion("jiashiben_fic between", value1, value2, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenFicNotBetween(String value1, String value2) {
            addCriterion("jiashiben_fic not between", value1, value2, "jiashibenFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicIsNull() {
            addCriterion("jiashiben_back_fic is null");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicIsNotNull() {
            addCriterion("jiashiben_back_fic is not null");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicEqualTo(String value) {
            addCriterion("jiashiben_back_fic =", value, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicNotEqualTo(String value) {
            addCriterion("jiashiben_back_fic <>", value, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicGreaterThan(String value) {
            addCriterion("jiashiben_back_fic >", value, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicGreaterThanOrEqualTo(String value) {
            addCriterion("jiashiben_back_fic >=", value, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicLessThan(String value) {
            addCriterion("jiashiben_back_fic <", value, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicLessThanOrEqualTo(String value) {
            addCriterion("jiashiben_back_fic <=", value, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicLike(String value) {
            addCriterion("jiashiben_back_fic like", value, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicNotLike(String value) {
            addCriterion("jiashiben_back_fic not like", value, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicIn(List<String> values) {
            addCriterion("jiashiben_back_fic in", values, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicNotIn(List<String> values) {
            addCriterion("jiashiben_back_fic not in", values, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicBetween(String value1, String value2) {
            addCriterion("jiashiben_back_fic between", value1, value2, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andJiashibenBackFicNotBetween(String value1, String value2) {
            addCriterion("jiashiben_back_fic not between", value1, value2, "jiashibenBackFic");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneIsNull() {
            addCriterion("spouse_phone is null");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneIsNotNull() {
            addCriterion("spouse_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneEqualTo(String value) {
            addCriterion("spouse_phone =", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneNotEqualTo(String value) {
            addCriterion("spouse_phone <>", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneGreaterThan(String value) {
            addCriterion("spouse_phone >", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_phone >=", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneLessThan(String value) {
            addCriterion("spouse_phone <", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneLessThanOrEqualTo(String value) {
            addCriterion("spouse_phone <=", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneLike(String value) {
            addCriterion("spouse_phone like", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneNotLike(String value) {
            addCriterion("spouse_phone not like", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneIn(List<String> values) {
            addCriterion("spouse_phone in", values, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneNotIn(List<String> values) {
            addCriterion("spouse_phone not in", values, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneBetween(String value1, String value2) {
            addCriterion("spouse_phone between", value1, value2, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneNotBetween(String value1, String value2) {
            addCriterion("spouse_phone not between", value1, value2, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountIsNull() {
            addCriterion("spouse_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountIsNotNull() {
            addCriterion("spouse_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountEqualTo(String value) {
            addCriterion("spouse_bank_account =", value, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountNotEqualTo(String value) {
            addCriterion("spouse_bank_account <>", value, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountGreaterThan(String value) {
            addCriterion("spouse_bank_account >", value, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_bank_account >=", value, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountLessThan(String value) {
            addCriterion("spouse_bank_account <", value, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountLessThanOrEqualTo(String value) {
            addCriterion("spouse_bank_account <=", value, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountLike(String value) {
            addCriterion("spouse_bank_account like", value, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountNotLike(String value) {
            addCriterion("spouse_bank_account not like", value, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountIn(List<String> values) {
            addCriterion("spouse_bank_account in", values, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountNotIn(List<String> values) {
            addCriterion("spouse_bank_account not in", values, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountBetween(String value1, String value2) {
            addCriterion("spouse_bank_account between", value1, value2, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpouseBankAccountNotBetween(String value1, String value2) {
            addCriterion("spouse_bank_account not between", value1, value2, "spouseBankAccount");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeIsNull() {
            addCriterion("spouse_phone_code is null");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeIsNotNull() {
            addCriterion("spouse_phone_code is not null");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeEqualTo(String value) {
            addCriterion("spouse_phone_code =", value, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeNotEqualTo(String value) {
            addCriterion("spouse_phone_code <>", value, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeGreaterThan(String value) {
            addCriterion("spouse_phone_code >", value, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_phone_code >=", value, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeLessThan(String value) {
            addCriterion("spouse_phone_code <", value, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeLessThanOrEqualTo(String value) {
            addCriterion("spouse_phone_code <=", value, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeLike(String value) {
            addCriterion("spouse_phone_code like", value, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeNotLike(String value) {
            addCriterion("spouse_phone_code not like", value, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeIn(List<String> values) {
            addCriterion("spouse_phone_code in", values, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeNotIn(List<String> values) {
            addCriterion("spouse_phone_code not in", values, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeBetween(String value1, String value2) {
            addCriterion("spouse_phone_code between", value1, value2, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneCodeNotBetween(String value1, String value2) {
            addCriterion("spouse_phone_code not between", value1, value2, "spousePhoneCode");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicIsNull() {
            addCriterion("rbzxsq_fic is null");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicIsNotNull() {
            addCriterion("rbzxsq_fic is not null");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicEqualTo(String value) {
            addCriterion("rbzxsq_fic =", value, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicNotEqualTo(String value) {
            addCriterion("rbzxsq_fic <>", value, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicGreaterThan(String value) {
            addCriterion("rbzxsq_fic >", value, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicGreaterThanOrEqualTo(String value) {
            addCriterion("rbzxsq_fic >=", value, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicLessThan(String value) {
            addCriterion("rbzxsq_fic <", value, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicLessThanOrEqualTo(String value) {
            addCriterion("rbzxsq_fic <=", value, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicLike(String value) {
            addCriterion("rbzxsq_fic like", value, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicNotLike(String value) {
            addCriterion("rbzxsq_fic not like", value, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicIn(List<String> values) {
            addCriterion("rbzxsq_fic in", values, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicNotIn(List<String> values) {
            addCriterion("rbzxsq_fic not in", values, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicBetween(String value1, String value2) {
            addCriterion("rbzxsq_fic between", value1, value2, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqFicNotBetween(String value1, String value2) {
            addCriterion("rbzxsq_fic not between", value1, value2, "rbzxsqFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicIsNull() {
            addCriterion("rbzxcx_fic is null");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicIsNotNull() {
            addCriterion("rbzxcx_fic is not null");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicEqualTo(String value) {
            addCriterion("rbzxcx_fic =", value, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicNotEqualTo(String value) {
            addCriterion("rbzxcx_fic <>", value, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicGreaterThan(String value) {
            addCriterion("rbzxcx_fic >", value, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicGreaterThanOrEqualTo(String value) {
            addCriterion("rbzxcx_fic >=", value, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicLessThan(String value) {
            addCriterion("rbzxcx_fic <", value, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicLessThanOrEqualTo(String value) {
            addCriterion("rbzxcx_fic <=", value, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicLike(String value) {
            addCriterion("rbzxcx_fic like", value, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicNotLike(String value) {
            addCriterion("rbzxcx_fic not like", value, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicIn(List<String> values) {
            addCriterion("rbzxcx_fic in", values, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicNotIn(List<String> values) {
            addCriterion("rbzxcx_fic not in", values, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicBetween(String value1, String value2) {
            addCriterion("rbzxcx_fic between", value1, value2, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andRbzxcxFicNotBetween(String value1, String value2) {
            addCriterion("rbzxcx_fic not between", value1, value2, "rbzxcxFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicIsNull() {
            addCriterion("zhengmian_fic is null");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicIsNotNull() {
            addCriterion("zhengmian_fic is not null");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicEqualTo(String value) {
            addCriterion("zhengmian_fic =", value, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicNotEqualTo(String value) {
            addCriterion("zhengmian_fic <>", value, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicGreaterThan(String value) {
            addCriterion("zhengmian_fic >", value, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicGreaterThanOrEqualTo(String value) {
            addCriterion("zhengmian_fic >=", value, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicLessThan(String value) {
            addCriterion("zhengmian_fic <", value, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicLessThanOrEqualTo(String value) {
            addCriterion("zhengmian_fic <=", value, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicLike(String value) {
            addCriterion("zhengmian_fic like", value, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicNotLike(String value) {
            addCriterion("zhengmian_fic not like", value, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicIn(List<String> values) {
            addCriterion("zhengmian_fic in", values, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicNotIn(List<String> values) {
            addCriterion("zhengmian_fic not in", values, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicBetween(String value1, String value2) {
            addCriterion("zhengmian_fic between", value1, value2, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andZhengmianFicNotBetween(String value1, String value2) {
            addCriterion("zhengmian_fic not between", value1, value2, "zhengmianFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicIsNull() {
            addCriterion("gongtonghuankuanchengnuoshu_fic is null");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicIsNotNull() {
            addCriterion("gongtonghuankuanchengnuoshu_fic is not null");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicEqualTo(String value) {
            addCriterion("gongtonghuankuanchengnuoshu_fic =", value, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicNotEqualTo(String value) {
            addCriterion("gongtonghuankuanchengnuoshu_fic <>", value, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicGreaterThan(String value) {
            addCriterion("gongtonghuankuanchengnuoshu_fic >", value, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicGreaterThanOrEqualTo(String value) {
            addCriterion("gongtonghuankuanchengnuoshu_fic >=", value, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicLessThan(String value) {
            addCriterion("gongtonghuankuanchengnuoshu_fic <", value, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicLessThanOrEqualTo(String value) {
            addCriterion("gongtonghuankuanchengnuoshu_fic <=", value, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicLike(String value) {
            addCriterion("gongtonghuankuanchengnuoshu_fic like", value, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicNotLike(String value) {
            addCriterion("gongtonghuankuanchengnuoshu_fic not like", value, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicIn(List<String> values) {
            addCriterion("gongtonghuankuanchengnuoshu_fic in", values, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicNotIn(List<String> values) {
            addCriterion("gongtonghuankuanchengnuoshu_fic not in", values, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicBetween(String value1, String value2) {
            addCriterion("gongtonghuankuanchengnuoshu_fic between", value1, value2, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuFicNotBetween(String value1, String value2) {
            addCriterion("gongtonghuankuanchengnuoshu_fic not between", value1, value2, "gongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicIsNull() {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic is null");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicIsNotNull() {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic is not null");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicEqualTo(String value) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic =", value, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicNotEqualTo(String value) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic <>", value, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicGreaterThan(String value) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic >", value, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicGreaterThanOrEqualTo(String value) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic >=", value, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicLessThan(String value) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic <", value, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicLessThanOrEqualTo(String value) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic <=", value, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicLike(String value) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic like", value, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicNotLike(String value) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic not like", value, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicIn(List<String> values) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic in", values, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicNotIn(List<String> values) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic not in", values, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicBetween(String value1, String value2) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic between", value1, value2, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andGongtonghuankuanchengnuoshuqianziFicNotBetween(String value1, String value2) {
            addCriterion("gongtonghuankuanchengnuoshuqianzi_fic not between", value1, value2, "gongtonghuankuanchengnuoshuqianziFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicIsNull() {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic is null");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicIsNotNull() {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic is not null");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicEqualTo(String value) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic =", value, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicNotEqualTo(String value) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic <>", value, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicGreaterThan(String value) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic >", value, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicGreaterThanOrEqualTo(String value) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic >=", value, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicLessThan(String value) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic <", value, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicLessThanOrEqualTo(String value) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic <=", value, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicLike(String value) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic like", value, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicNotLike(String value) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic not like", value, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicIn(List<String> values) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic in", values, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicNotIn(List<String> values) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic not in", values, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicBetween(String value1, String value2) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic between", value1, value2, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouchigongtonghuankuanchengnuoshuFicNotBetween(String value1, String value2) {
            addCriterion("shouchigongtonghuankuanchengnuoshu_fic not between", value1, value2, "shouchigongtonghuankuanchengnuoshuFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicIsNull() {
            addCriterion("shouruzhengm_fic is null");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicIsNotNull() {
            addCriterion("shouruzhengm_fic is not null");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicEqualTo(String value) {
            addCriterion("shouruzhengm_fic =", value, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicNotEqualTo(String value) {
            addCriterion("shouruzhengm_fic <>", value, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicGreaterThan(String value) {
            addCriterion("shouruzhengm_fic >", value, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicGreaterThanOrEqualTo(String value) {
            addCriterion("shouruzhengm_fic >=", value, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicLessThan(String value) {
            addCriterion("shouruzhengm_fic <", value, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicLessThanOrEqualTo(String value) {
            addCriterion("shouruzhengm_fic <=", value, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicLike(String value) {
            addCriterion("shouruzhengm_fic like", value, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicNotLike(String value) {
            addCriterion("shouruzhengm_fic not like", value, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicIn(List<String> values) {
            addCriterion("shouruzhengm_fic in", values, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicNotIn(List<String> values) {
            addCriterion("shouruzhengm_fic not in", values, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicBetween(String value1, String value2) {
            addCriterion("shouruzhengm_fic between", value1, value2, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andShouruzhengmFicNotBetween(String value1, String value2) {
            addCriterion("shouruzhengm_fic not between", value1, value2, "shouruzhengmFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicIsNull() {
            addCriterion("yhliushuitu_fic is null");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicIsNotNull() {
            addCriterion("yhliushuitu_fic is not null");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicEqualTo(String value) {
            addCriterion("yhliushuitu_fic =", value, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicNotEqualTo(String value) {
            addCriterion("yhliushuitu_fic <>", value, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicGreaterThan(String value) {
            addCriterion("yhliushuitu_fic >", value, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicGreaterThanOrEqualTo(String value) {
            addCriterion("yhliushuitu_fic >=", value, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicLessThan(String value) {
            addCriterion("yhliushuitu_fic <", value, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicLessThanOrEqualTo(String value) {
            addCriterion("yhliushuitu_fic <=", value, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicLike(String value) {
            addCriterion("yhliushuitu_fic like", value, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicNotLike(String value) {
            addCriterion("yhliushuitu_fic not like", value, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicIn(List<String> values) {
            addCriterion("yhliushuitu_fic in", values, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicNotIn(List<String> values) {
            addCriterion("yhliushuitu_fic not in", values, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicBetween(String value1, String value2) {
            addCriterion("yhliushuitu_fic between", value1, value2, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andYhliushuituFicNotBetween(String value1, String value2) {
            addCriterion("yhliushuitu_fic not between", value1, value2, "yhliushuituFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicIsNull() {
            addCriterion("hunyinxinxi_fic is null");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicIsNotNull() {
            addCriterion("hunyinxinxi_fic is not null");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicEqualTo(String value) {
            addCriterion("hunyinxinxi_fic =", value, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicNotEqualTo(String value) {
            addCriterion("hunyinxinxi_fic <>", value, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicGreaterThan(String value) {
            addCriterion("hunyinxinxi_fic >", value, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicGreaterThanOrEqualTo(String value) {
            addCriterion("hunyinxinxi_fic >=", value, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicLessThan(String value) {
            addCriterion("hunyinxinxi_fic <", value, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicLessThanOrEqualTo(String value) {
            addCriterion("hunyinxinxi_fic <=", value, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicLike(String value) {
            addCriterion("hunyinxinxi_fic like", value, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicNotLike(String value) {
            addCriterion("hunyinxinxi_fic not like", value, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicIn(List<String> values) {
            addCriterion("hunyinxinxi_fic in", values, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicNotIn(List<String> values) {
            addCriterion("hunyinxinxi_fic not in", values, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicBetween(String value1, String value2) {
            addCriterion("hunyinxinxi_fic between", value1, value2, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andHunyinxinxiFicNotBetween(String value1, String value2) {
            addCriterion("hunyinxinxi_fic not between", value1, value2, "hunyinxinxiFic");
            return (Criteria) this;
        }

        public Criteria andMarriageStateIsNull() {
            addCriterion("marriage_state is null");
            return (Criteria) this;
        }

        public Criteria andMarriageStateIsNotNull() {
            addCriterion("marriage_state is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageStateEqualTo(String value) {
            addCriterion("marriage_state =", value, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateNotEqualTo(String value) {
            addCriterion("marriage_state <>", value, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateGreaterThan(String value) {
            addCriterion("marriage_state >", value, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateGreaterThanOrEqualTo(String value) {
            addCriterion("marriage_state >=", value, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateLessThan(String value) {
            addCriterion("marriage_state <", value, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateLessThanOrEqualTo(String value) {
            addCriterion("marriage_state <=", value, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateLike(String value) {
            addCriterion("marriage_state like", value, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateNotLike(String value) {
            addCriterion("marriage_state not like", value, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateIn(List<String> values) {
            addCriterion("marriage_state in", values, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateNotIn(List<String> values) {
            addCriterion("marriage_state not in", values, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateBetween(String value1, String value2) {
            addCriterion("marriage_state between", value1, value2, "marriageState");
            return (Criteria) this;
        }

        public Criteria andMarriageStateNotBetween(String value1, String value2) {
            addCriterion("marriage_state not between", value1, value2, "marriageState");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNull() {
            addCriterion("contact_email is null");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNotNull() {
            addCriterion("contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactEmailEqualTo(String value) {
            addCriterion("contact_email =", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotEqualTo(String value) {
            addCriterion("contact_email <>", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThan(String value) {
            addCriterion("contact_email >", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_email >=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThan(String value) {
            addCriterion("contact_email <", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThanOrEqualTo(String value) {
            addCriterion("contact_email <=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLike(String value) {
            addCriterion("contact_email like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotLike(String value) {
            addCriterion("contact_email not like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailIn(List<String> values) {
            addCriterion("contact_email in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotIn(List<String> values) {
            addCriterion("contact_email not in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailBetween(String value1, String value2) {
            addCriterion("contact_email between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotBetween(String value1, String value2) {
            addCriterion("contact_email not between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNull() {
            addCriterion("sub_name is null");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNotNull() {
            addCriterion("sub_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubNameEqualTo(String value) {
            addCriterion("sub_name =", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotEqualTo(String value) {
            addCriterion("sub_name <>", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThan(String value) {
            addCriterion("sub_name >", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_name >=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThan(String value) {
            addCriterion("sub_name <", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanOrEqualTo(String value) {
            addCriterion("sub_name <=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLike(String value) {
            addCriterion("sub_name like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotLike(String value) {
            addCriterion("sub_name not like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameIn(List<String> values) {
            addCriterion("sub_name in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotIn(List<String> values) {
            addCriterion("sub_name not in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameBetween(String value1, String value2) {
            addCriterion("sub_name between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotBetween(String value1, String value2) {
            addCriterion("sub_name not between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIsNull() {
            addCriterion("id_card_number is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIsNotNull() {
            addCriterion("id_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberEqualTo(String value) {
            addCriterion("id_card_number =", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotEqualTo(String value) {
            addCriterion("id_card_number <>", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberGreaterThan(String value) {
            addCriterion("id_card_number >", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_number >=", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLessThan(String value) {
            addCriterion("id_card_number <", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLessThanOrEqualTo(String value) {
            addCriterion("id_card_number <=", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLike(String value) {
            addCriterion("id_card_number like", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotLike(String value) {
            addCriterion("id_card_number not like", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIn(List<String> values) {
            addCriterion("id_card_number in", values, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotIn(List<String> values) {
            addCriterion("id_card_number not in", values, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberBetween(String value1, String value2) {
            addCriterion("id_card_number between", value1, value2, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotBetween(String value1, String value2) {
            addCriterion("id_card_number not between", value1, value2, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andSubPhoneIsNull() {
            addCriterion("sub_phone is null");
            return (Criteria) this;
        }

        public Criteria andSubPhoneIsNotNull() {
            addCriterion("sub_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSubPhoneEqualTo(String value) {
            addCriterion("sub_phone =", value, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneNotEqualTo(String value) {
            addCriterion("sub_phone <>", value, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneGreaterThan(String value) {
            addCriterion("sub_phone >", value, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sub_phone >=", value, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneLessThan(String value) {
            addCriterion("sub_phone <", value, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneLessThanOrEqualTo(String value) {
            addCriterion("sub_phone <=", value, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneLike(String value) {
            addCriterion("sub_phone like", value, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneNotLike(String value) {
            addCriterion("sub_phone not like", value, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneIn(List<String> values) {
            addCriterion("sub_phone in", values, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneNotIn(List<String> values) {
            addCriterion("sub_phone not in", values, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneBetween(String value1, String value2) {
            addCriterion("sub_phone between", value1, value2, "subPhone");
            return (Criteria) this;
        }

        public Criteria andSubPhoneNotBetween(String value1, String value2) {
            addCriterion("sub_phone not between", value1, value2, "subPhone");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeIsNull() {
            addCriterion("phone_code is null");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeIsNotNull() {
            addCriterion("phone_code is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeEqualTo(String value) {
            addCriterion("phone_code =", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeNotEqualTo(String value) {
            addCriterion("phone_code <>", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeGreaterThan(String value) {
            addCriterion("phone_code >", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("phone_code >=", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeLessThan(String value) {
            addCriterion("phone_code <", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeLessThanOrEqualTo(String value) {
            addCriterion("phone_code <=", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeLike(String value) {
            addCriterion("phone_code like", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeNotLike(String value) {
            addCriterion("phone_code not like", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeIn(List<String> values) {
            addCriterion("phone_code in", values, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeNotIn(List<String> values) {
            addCriterion("phone_code not in", values, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeBetween(String value1, String value2) {
            addCriterion("phone_code between", value1, value2, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeNotBetween(String value1, String value2) {
            addCriterion("phone_code not between", value1, value2, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoIsNull() {
            addCriterion("bank_card_photo is null");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoIsNotNull() {
            addCriterion("bank_card_photo is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoEqualTo(String value) {
            addCriterion("bank_card_photo =", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoNotEqualTo(String value) {
            addCriterion("bank_card_photo <>", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoGreaterThan(String value) {
            addCriterion("bank_card_photo >", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_photo >=", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoLessThan(String value) {
            addCriterion("bank_card_photo <", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_photo <=", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoLike(String value) {
            addCriterion("bank_card_photo like", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoNotLike(String value) {
            addCriterion("bank_card_photo not like", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoIn(List<String> values) {
            addCriterion("bank_card_photo in", values, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoNotIn(List<String> values) {
            addCriterion("bank_card_photo not in", values, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoBetween(String value1, String value2) {
            addCriterion("bank_card_photo between", value1, value2, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoNotBetween(String value1, String value2) {
            addCriterion("bank_card_photo not between", value1, value2, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicIsNull() {
            addCriterion("hukoubo_juzhuzhengming_fic is null");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicIsNotNull() {
            addCriterion("hukoubo_juzhuzhengming_fic is not null");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicEqualTo(String value) {
            addCriterion("hukoubo_juzhuzhengming_fic =", value, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicNotEqualTo(String value) {
            addCriterion("hukoubo_juzhuzhengming_fic <>", value, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicGreaterThan(String value) {
            addCriterion("hukoubo_juzhuzhengming_fic >", value, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicGreaterThanOrEqualTo(String value) {
            addCriterion("hukoubo_juzhuzhengming_fic >=", value, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicLessThan(String value) {
            addCriterion("hukoubo_juzhuzhengming_fic <", value, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicLessThanOrEqualTo(String value) {
            addCriterion("hukoubo_juzhuzhengming_fic <=", value, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicLike(String value) {
            addCriterion("hukoubo_juzhuzhengming_fic like", value, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicNotLike(String value) {
            addCriterion("hukoubo_juzhuzhengming_fic not like", value, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicIn(List<String> values) {
            addCriterion("hukoubo_juzhuzhengming_fic in", values, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicNotIn(List<String> values) {
            addCriterion("hukoubo_juzhuzhengming_fic not in", values, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicBetween(String value1, String value2) {
            addCriterion("hukoubo_juzhuzhengming_fic between", value1, value2, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andHukouboJuzhuzhengmingFicNotBetween(String value1, String value2) {
            addCriterion("hukoubo_juzhuzhengming_fic not between", value1, value2, "hukouboJuzhuzhengmingFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicIsNull() {
            addCriterion("tfbankxinyongka_fic is null");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicIsNotNull() {
            addCriterion("tfbankxinyongka_fic is not null");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicEqualTo(String value) {
            addCriterion("tfbankxinyongka_fic =", value, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicNotEqualTo(String value) {
            addCriterion("tfbankxinyongka_fic <>", value, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicGreaterThan(String value) {
            addCriterion("tfbankxinyongka_fic >", value, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicGreaterThanOrEqualTo(String value) {
            addCriterion("tfbankxinyongka_fic >=", value, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicLessThan(String value) {
            addCriterion("tfbankxinyongka_fic <", value, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicLessThanOrEqualTo(String value) {
            addCriterion("tfbankxinyongka_fic <=", value, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicLike(String value) {
            addCriterion("tfbankxinyongka_fic like", value, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicNotLike(String value) {
            addCriterion("tfbankxinyongka_fic not like", value, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicIn(List<String> values) {
            addCriterion("tfbankxinyongka_fic in", values, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicNotIn(List<String> values) {
            addCriterion("tfbankxinyongka_fic not in", values, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicBetween(String value1, String value2) {
            addCriterion("tfbankxinyongka_fic between", value1, value2, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andTfbankxinyongkaFicNotBetween(String value1, String value2) {
            addCriterion("tfbankxinyongka_fic not between", value1, value2, "tfbankxinyongkaFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicIsNull() {
            addCriterion("chaorongqingdan_fic is null");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicIsNotNull() {
            addCriterion("chaorongqingdan_fic is not null");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicEqualTo(String value) {
            addCriterion("chaorongqingdan_fic =", value, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicNotEqualTo(String value) {
            addCriterion("chaorongqingdan_fic <>", value, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicGreaterThan(String value) {
            addCriterion("chaorongqingdan_fic >", value, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicGreaterThanOrEqualTo(String value) {
            addCriterion("chaorongqingdan_fic >=", value, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicLessThan(String value) {
            addCriterion("chaorongqingdan_fic <", value, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicLessThanOrEqualTo(String value) {
            addCriterion("chaorongqingdan_fic <=", value, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicLike(String value) {
            addCriterion("chaorongqingdan_fic like", value, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicNotLike(String value) {
            addCriterion("chaorongqingdan_fic not like", value, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicIn(List<String> values) {
            addCriterion("chaorongqingdan_fic in", values, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicNotIn(List<String> values) {
            addCriterion("chaorongqingdan_fic not in", values, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicBetween(String value1, String value2) {
            addCriterion("chaorongqingdan_fic between", value1, value2, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andChaorongqingdanFicNotBetween(String value1, String value2) {
            addCriterion("chaorongqingdan_fic not between", value1, value2, "chaorongqingdanFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicIsNull() {
            addCriterion("otherdocument_fic is null");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicIsNotNull() {
            addCriterion("otherdocument_fic is not null");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicEqualTo(String value) {
            addCriterion("otherdocument_fic =", value, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicNotEqualTo(String value) {
            addCriterion("otherdocument_fic <>", value, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicGreaterThan(String value) {
            addCriterion("otherdocument_fic >", value, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicGreaterThanOrEqualTo(String value) {
            addCriterion("otherdocument_fic >=", value, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicLessThan(String value) {
            addCriterion("otherdocument_fic <", value, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicLessThanOrEqualTo(String value) {
            addCriterion("otherdocument_fic <=", value, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicLike(String value) {
            addCriterion("otherdocument_fic like", value, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicNotLike(String value) {
            addCriterion("otherdocument_fic not like", value, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicIn(List<String> values) {
            addCriterion("otherdocument_fic in", values, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicNotIn(List<String> values) {
            addCriterion("otherdocument_fic not in", values, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicBetween(String value1, String value2) {
            addCriterion("otherdocument_fic between", value1, value2, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andOtherdocumentFicNotBetween(String value1, String value2) {
            addCriterion("otherdocument_fic not between", value1, value2, "otherdocumentFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicIsNull() {
            addCriterion("qianyuegaozhihan_fic is null");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicIsNotNull() {
            addCriterion("qianyuegaozhihan_fic is not null");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicEqualTo(String value) {
            addCriterion("qianyuegaozhihan_fic =", value, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicNotEqualTo(String value) {
            addCriterion("qianyuegaozhihan_fic <>", value, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicGreaterThan(String value) {
            addCriterion("qianyuegaozhihan_fic >", value, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicGreaterThanOrEqualTo(String value) {
            addCriterion("qianyuegaozhihan_fic >=", value, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicLessThan(String value) {
            addCriterion("qianyuegaozhihan_fic <", value, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicLessThanOrEqualTo(String value) {
            addCriterion("qianyuegaozhihan_fic <=", value, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicLike(String value) {
            addCriterion("qianyuegaozhihan_fic like", value, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicNotLike(String value) {
            addCriterion("qianyuegaozhihan_fic not like", value, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicIn(List<String> values) {
            addCriterion("qianyuegaozhihan_fic in", values, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicNotIn(List<String> values) {
            addCriterion("qianyuegaozhihan_fic not in", values, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicBetween(String value1, String value2) {
            addCriterion("qianyuegaozhihan_fic between", value1, value2, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andQianyuegaozhihanFicNotBetween(String value1, String value2) {
            addCriterion("qianyuegaozhihan_fic not between", value1, value2, "qianyuegaozhihanFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicIsNull() {
            addCriterion("wangyuechezheng_fic is null");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicIsNotNull() {
            addCriterion("wangyuechezheng_fic is not null");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicEqualTo(String value) {
            addCriterion("wangyuechezheng_fic =", value, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicNotEqualTo(String value) {
            addCriterion("wangyuechezheng_fic <>", value, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicGreaterThan(String value) {
            addCriterion("wangyuechezheng_fic >", value, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicGreaterThanOrEqualTo(String value) {
            addCriterion("wangyuechezheng_fic >=", value, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicLessThan(String value) {
            addCriterion("wangyuechezheng_fic <", value, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicLessThanOrEqualTo(String value) {
            addCriterion("wangyuechezheng_fic <=", value, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicLike(String value) {
            addCriterion("wangyuechezheng_fic like", value, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicNotLike(String value) {
            addCriterion("wangyuechezheng_fic not like", value, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicIn(List<String> values) {
            addCriterion("wangyuechezheng_fic in", values, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicNotIn(List<String> values) {
            addCriterion("wangyuechezheng_fic not in", values, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicBetween(String value1, String value2) {
            addCriterion("wangyuechezheng_fic between", value1, value2, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andWangyuechezhengFicNotBetween(String value1, String value2) {
            addCriterion("wangyuechezheng_fic not between", value1, value2, "wangyuechezhengFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicIsNull() {
            addCriterion("guakaozhengming_fic is null");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicIsNotNull() {
            addCriterion("guakaozhengming_fic is not null");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicEqualTo(String value) {
            addCriterion("guakaozhengming_fic =", value, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicNotEqualTo(String value) {
            addCriterion("guakaozhengming_fic <>", value, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicGreaterThan(String value) {
            addCriterion("guakaozhengming_fic >", value, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicGreaterThanOrEqualTo(String value) {
            addCriterion("guakaozhengming_fic >=", value, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicLessThan(String value) {
            addCriterion("guakaozhengming_fic <", value, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicLessThanOrEqualTo(String value) {
            addCriterion("guakaozhengming_fic <=", value, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicLike(String value) {
            addCriterion("guakaozhengming_fic like", value, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicNotLike(String value) {
            addCriterion("guakaozhengming_fic not like", value, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicIn(List<String> values) {
            addCriterion("guakaozhengming_fic in", values, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicNotIn(List<String> values) {
            addCriterion("guakaozhengming_fic not in", values, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicBetween(String value1, String value2) {
            addCriterion("guakaozhengming_fic between", value1, value2, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andGuakaozhengmingFicNotBetween(String value1, String value2) {
            addCriterion("guakaozhengming_fic not between", value1, value2, "guakaozhengmingFic");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNull() {
            addCriterion("spouse_name is null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNotNull() {
            addCriterion("spouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameEqualTo(String value) {
            addCriterion("spouse_name =", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotEqualTo(String value) {
            addCriterion("spouse_name <>", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThan(String value) {
            addCriterion("spouse_name >", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_name >=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThan(String value) {
            addCriterion("spouse_name <", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThanOrEqualTo(String value) {
            addCriterion("spouse_name <=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLike(String value) {
            addCriterion("spouse_name like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotLike(String value) {
            addCriterion("spouse_name not like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIn(List<String> values) {
            addCriterion("spouse_name in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotIn(List<String> values) {
            addCriterion("spouse_name not in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameBetween(String value1, String value2) {
            addCriterion("spouse_name between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotBetween(String value1, String value2) {
            addCriterion("spouse_name not between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardIsNull() {
            addCriterion("spouse_idcard is null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardIsNotNull() {
            addCriterion("spouse_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardEqualTo(String value) {
            addCriterion("spouse_idcard =", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardNotEqualTo(String value) {
            addCriterion("spouse_idcard <>", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardGreaterThan(String value) {
            addCriterion("spouse_idcard >", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_idcard >=", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardLessThan(String value) {
            addCriterion("spouse_idcard <", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardLessThanOrEqualTo(String value) {
            addCriterion("spouse_idcard <=", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardLike(String value) {
            addCriterion("spouse_idcard like", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardNotLike(String value) {
            addCriterion("spouse_idcard not like", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardIn(List<String> values) {
            addCriterion("spouse_idcard in", values, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardNotIn(List<String> values) {
            addCriterion("spouse_idcard not in", values, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBetween(String value1, String value2) {
            addCriterion("spouse_idcard between", value1, value2, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardNotBetween(String value1, String value2) {
            addCriterion("spouse_idcard not between", value1, value2, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}