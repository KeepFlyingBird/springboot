package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjSubjectGuaranteeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjSubjectGuaranteeCriteria() {
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(String value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(String value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(String value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(String value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLike(String value) {
            addCriterion("business_id like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotLike(String value) {
            addCriterion("business_id not like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<String> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<String> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(String value1, String value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(String value1, String value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
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

        public Criteria andCodeSignIsNull() {
            addCriterion("code_sign is null");
            return (Criteria) this;
        }

        public Criteria andCodeSignIsNotNull() {
            addCriterion("code_sign is not null");
            return (Criteria) this;
        }

        public Criteria andCodeSignEqualTo(String value) {
            addCriterion("code_sign =", value, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignNotEqualTo(String value) {
            addCriterion("code_sign <>", value, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignGreaterThan(String value) {
            addCriterion("code_sign >", value, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignGreaterThanOrEqualTo(String value) {
            addCriterion("code_sign >=", value, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignLessThan(String value) {
            addCriterion("code_sign <", value, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignLessThanOrEqualTo(String value) {
            addCriterion("code_sign <=", value, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignLike(String value) {
            addCriterion("code_sign like", value, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignNotLike(String value) {
            addCriterion("code_sign not like", value, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignIn(List<String> values) {
            addCriterion("code_sign in", values, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignNotIn(List<String> values) {
            addCriterion("code_sign not in", values, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignBetween(String value1, String value2) {
            addCriterion("code_sign between", value1, value2, "codeSign");
            return (Criteria) this;
        }

        public Criteria andCodeSignNotBetween(String value1, String value2) {
            addCriterion("code_sign not between", value1, value2, "codeSign");
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

        public Criteria andRbzxsqshuFicIsNull() {
            addCriterion("rbzxsqshu_fic is null");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicIsNotNull() {
            addCriterion("rbzxsqshu_fic is not null");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicEqualTo(String value) {
            addCriterion("rbzxsqshu_fic =", value, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicNotEqualTo(String value) {
            addCriterion("rbzxsqshu_fic <>", value, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicGreaterThan(String value) {
            addCriterion("rbzxsqshu_fic >", value, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicGreaterThanOrEqualTo(String value) {
            addCriterion("rbzxsqshu_fic >=", value, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicLessThan(String value) {
            addCriterion("rbzxsqshu_fic <", value, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicLessThanOrEqualTo(String value) {
            addCriterion("rbzxsqshu_fic <=", value, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicLike(String value) {
            addCriterion("rbzxsqshu_fic like", value, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicNotLike(String value) {
            addCriterion("rbzxsqshu_fic not like", value, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicIn(List<String> values) {
            addCriterion("rbzxsqshu_fic in", values, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicNotIn(List<String> values) {
            addCriterion("rbzxsqshu_fic not in", values, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicBetween(String value1, String value2) {
            addCriterion("rbzxsqshu_fic between", value1, value2, "rbzxsqshuFic");
            return (Criteria) this;
        }

        public Criteria andRbzxsqshuFicNotBetween(String value1, String value2) {
            addCriterion("rbzxsqshu_fic not between", value1, value2, "rbzxsqshuFic");
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

        public Criteria andHunyinFicIsNull() {
            addCriterion("hunyin_fic is null");
            return (Criteria) this;
        }

        public Criteria andHunyinFicIsNotNull() {
            addCriterion("hunyin_fic is not null");
            return (Criteria) this;
        }

        public Criteria andHunyinFicEqualTo(String value) {
            addCriterion("hunyin_fic =", value, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicNotEqualTo(String value) {
            addCriterion("hunyin_fic <>", value, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicGreaterThan(String value) {
            addCriterion("hunyin_fic >", value, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicGreaterThanOrEqualTo(String value) {
            addCriterion("hunyin_fic >=", value, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicLessThan(String value) {
            addCriterion("hunyin_fic <", value, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicLessThanOrEqualTo(String value) {
            addCriterion("hunyin_fic <=", value, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicLike(String value) {
            addCriterion("hunyin_fic like", value, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicNotLike(String value) {
            addCriterion("hunyin_fic not like", value, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicIn(List<String> values) {
            addCriterion("hunyin_fic in", values, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicNotIn(List<String> values) {
            addCriterion("hunyin_fic not in", values, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicBetween(String value1, String value2) {
            addCriterion("hunyin_fic between", value1, value2, "hunyinFic");
            return (Criteria) this;
        }

        public Criteria andHunyinFicNotBetween(String value1, String value2) {
            addCriterion("hunyin_fic not between", value1, value2, "hunyinFic");
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

        public Criteria andYinhangliushuiFicIsNull() {
            addCriterion("yinhangliushui_fic is null");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicIsNotNull() {
            addCriterion("yinhangliushui_fic is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicEqualTo(String value) {
            addCriterion("yinhangliushui_fic =", value, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicNotEqualTo(String value) {
            addCriterion("yinhangliushui_fic <>", value, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicGreaterThan(String value) {
            addCriterion("yinhangliushui_fic >", value, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicGreaterThanOrEqualTo(String value) {
            addCriterion("yinhangliushui_fic >=", value, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicLessThan(String value) {
            addCriterion("yinhangliushui_fic <", value, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicLessThanOrEqualTo(String value) {
            addCriterion("yinhangliushui_fic <=", value, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicLike(String value) {
            addCriterion("yinhangliushui_fic like", value, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicNotLike(String value) {
            addCriterion("yinhangliushui_fic not like", value, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicIn(List<String> values) {
            addCriterion("yinhangliushui_fic in", values, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicNotIn(List<String> values) {
            addCriterion("yinhangliushui_fic not in", values, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicBetween(String value1, String value2) {
            addCriterion("yinhangliushui_fic between", value1, value2, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andYinhangliushuiFicNotBetween(String value1, String value2) {
            addCriterion("yinhangliushui_fic not between", value1, value2, "yinhangliushuiFic");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneIsNull() {
            addCriterion("guarantee_phone is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneIsNotNull() {
            addCriterion("guarantee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneEqualTo(String value) {
            addCriterion("guarantee_phone =", value, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneNotEqualTo(String value) {
            addCriterion("guarantee_phone <>", value, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneGreaterThan(String value) {
            addCriterion("guarantee_phone >", value, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_phone >=", value, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneLessThan(String value) {
            addCriterion("guarantee_phone <", value, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneLessThanOrEqualTo(String value) {
            addCriterion("guarantee_phone <=", value, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneLike(String value) {
            addCriterion("guarantee_phone like", value, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneNotLike(String value) {
            addCriterion("guarantee_phone not like", value, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneIn(List<String> values) {
            addCriterion("guarantee_phone in", values, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneNotIn(List<String> values) {
            addCriterion("guarantee_phone not in", values, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneBetween(String value1, String value2) {
            addCriterion("guarantee_phone between", value1, value2, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andGuaranteePhoneNotBetween(String value1, String value2) {
            addCriterion("guarantee_phone not between", value1, value2, "guaranteePhone");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
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

        public Criteria andGuaranteeRelationIsNull() {
            addCriterion("guarantee_relation is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationIsNotNull() {
            addCriterion("guarantee_relation is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationEqualTo(String value) {
            addCriterion("guarantee_relation =", value, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationNotEqualTo(String value) {
            addCriterion("guarantee_relation <>", value, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationGreaterThan(String value) {
            addCriterion("guarantee_relation >", value, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_relation >=", value, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationLessThan(String value) {
            addCriterion("guarantee_relation <", value, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationLessThanOrEqualTo(String value) {
            addCriterion("guarantee_relation <=", value, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationLike(String value) {
            addCriterion("guarantee_relation like", value, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationNotLike(String value) {
            addCriterion("guarantee_relation not like", value, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationIn(List<String> values) {
            addCriterion("guarantee_relation in", values, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationNotIn(List<String> values) {
            addCriterion("guarantee_relation not in", values, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationBetween(String value1, String value2) {
            addCriterion("guarantee_relation between", value1, value2, "guaranteeRelation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRelationNotBetween(String value1, String value2) {
            addCriterion("guarantee_relation not between", value1, value2, "guaranteeRelation");
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

        public Criteria andCompanyNatureIsNull() {
            addCriterion("company_nature is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIsNotNull() {
            addCriterion("company_nature is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureEqualTo(String value) {
            addCriterion("company_nature =", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotEqualTo(String value) {
            addCriterion("company_nature <>", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureGreaterThan(String value) {
            addCriterion("company_nature >", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureGreaterThanOrEqualTo(String value) {
            addCriterion("company_nature >=", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLessThan(String value) {
            addCriterion("company_nature <", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLessThanOrEqualTo(String value) {
            addCriterion("company_nature <=", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLike(String value) {
            addCriterion("company_nature like", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotLike(String value) {
            addCriterion("company_nature not like", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIn(List<String> values) {
            addCriterion("company_nature in", values, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotIn(List<String> values) {
            addCriterion("company_nature not in", values, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureBetween(String value1, String value2) {
            addCriterion("company_nature between", value1, value2, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotBetween(String value1, String value2) {
            addCriterion("company_nature not between", value1, value2, "companyNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureIsNull() {
            addCriterion("job_nature is null");
            return (Criteria) this;
        }

        public Criteria andJobNatureIsNotNull() {
            addCriterion("job_nature is not null");
            return (Criteria) this;
        }

        public Criteria andJobNatureEqualTo(String value) {
            addCriterion("job_nature =", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureNotEqualTo(String value) {
            addCriterion("job_nature <>", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureGreaterThan(String value) {
            addCriterion("job_nature >", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureGreaterThanOrEqualTo(String value) {
            addCriterion("job_nature >=", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureLessThan(String value) {
            addCriterion("job_nature <", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureLessThanOrEqualTo(String value) {
            addCriterion("job_nature <=", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureLike(String value) {
            addCriterion("job_nature like", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureNotLike(String value) {
            addCriterion("job_nature not like", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureIn(List<String> values) {
            addCriterion("job_nature in", values, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureNotIn(List<String> values) {
            addCriterion("job_nature not in", values, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureBetween(String value1, String value2) {
            addCriterion("job_nature between", value1, value2, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureNotBetween(String value1, String value2) {
            addCriterion("job_nature not between", value1, value2, "jobNature");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNull() {
            addCriterion("company_tel is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNotNull() {
            addCriterion("company_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelEqualTo(String value) {
            addCriterion("company_tel =", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotEqualTo(String value) {
            addCriterion("company_tel <>", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThan(String value) {
            addCriterion("company_tel >", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThanOrEqualTo(String value) {
            addCriterion("company_tel >=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThan(String value) {
            addCriterion("company_tel <", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThanOrEqualTo(String value) {
            addCriterion("company_tel <=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLike(String value) {
            addCriterion("company_tel like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotLike(String value) {
            addCriterion("company_tel not like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIn(List<String> values) {
            addCriterion("company_tel in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotIn(List<String> values) {
            addCriterion("company_tel not in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelBetween(String value1, String value2) {
            addCriterion("company_tel between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotBetween(String value1, String value2) {
            addCriterion("company_tel not between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentIsNull() {
            addCriterion("work_department is null");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentIsNotNull() {
            addCriterion("work_department is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentEqualTo(String value) {
            addCriterion("work_department =", value, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentNotEqualTo(String value) {
            addCriterion("work_department <>", value, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentGreaterThan(String value) {
            addCriterion("work_department >", value, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("work_department >=", value, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentLessThan(String value) {
            addCriterion("work_department <", value, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentLessThanOrEqualTo(String value) {
            addCriterion("work_department <=", value, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentLike(String value) {
            addCriterion("work_department like", value, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentNotLike(String value) {
            addCriterion("work_department not like", value, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentIn(List<String> values) {
            addCriterion("work_department in", values, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentNotIn(List<String> values) {
            addCriterion("work_department not in", values, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentBetween(String value1, String value2) {
            addCriterion("work_department between", value1, value2, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkDepartmentNotBetween(String value1, String value2) {
            addCriterion("work_department not between", value1, value2, "workDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkPositionIsNull() {
            addCriterion("work_position is null");
            return (Criteria) this;
        }

        public Criteria andWorkPositionIsNotNull() {
            addCriterion("work_position is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPositionEqualTo(String value) {
            addCriterion("work_position =", value, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionNotEqualTo(String value) {
            addCriterion("work_position <>", value, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionGreaterThan(String value) {
            addCriterion("work_position >", value, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionGreaterThanOrEqualTo(String value) {
            addCriterion("work_position >=", value, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionLessThan(String value) {
            addCriterion("work_position <", value, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionLessThanOrEqualTo(String value) {
            addCriterion("work_position <=", value, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionLike(String value) {
            addCriterion("work_position like", value, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionNotLike(String value) {
            addCriterion("work_position not like", value, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionIn(List<String> values) {
            addCriterion("work_position in", values, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionNotIn(List<String> values) {
            addCriterion("work_position not in", values, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionBetween(String value1, String value2) {
            addCriterion("work_position between", value1, value2, "workPosition");
            return (Criteria) this;
        }

        public Criteria andWorkPositionNotBetween(String value1, String value2) {
            addCriterion("work_position not between", value1, value2, "workPosition");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeIsNull() {
            addCriterion("working_age is null");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeIsNotNull() {
            addCriterion("working_age is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeEqualTo(String value) {
            addCriterion("working_age =", value, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeNotEqualTo(String value) {
            addCriterion("working_age <>", value, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeGreaterThan(String value) {
            addCriterion("working_age >", value, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeGreaterThanOrEqualTo(String value) {
            addCriterion("working_age >=", value, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeLessThan(String value) {
            addCriterion("working_age <", value, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeLessThanOrEqualTo(String value) {
            addCriterion("working_age <=", value, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeLike(String value) {
            addCriterion("working_age like", value, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeNotLike(String value) {
            addCriterion("working_age not like", value, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeIn(List<String> values) {
            addCriterion("working_age in", values, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeNotIn(List<String> values) {
            addCriterion("working_age not in", values, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeBetween(String value1, String value2) {
            addCriterion("working_age between", value1, value2, "workingAge");
            return (Criteria) this;
        }

        public Criteria andWorkingAgeNotBetween(String value1, String value2) {
            addCriterion("working_age not between", value1, value2, "workingAge");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNull() {
            addCriterion("month_income is null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNotNull() {
            addCriterion("month_income is not null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeEqualTo(String value) {
            addCriterion("month_income =", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotEqualTo(String value) {
            addCriterion("month_income <>", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThan(String value) {
            addCriterion("month_income >", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("month_income >=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThan(String value) {
            addCriterion("month_income <", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThanOrEqualTo(String value) {
            addCriterion("month_income <=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLike(String value) {
            addCriterion("month_income like", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotLike(String value) {
            addCriterion("month_income not like", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIn(List<String> values) {
            addCriterion("month_income in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotIn(List<String> values) {
            addCriterion("month_income not in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeBetween(String value1, String value2) {
            addCriterion("month_income between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotBetween(String value1, String value2) {
            addCriterion("month_income not between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceIsNull() {
            addCriterion("repayment_source is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceIsNotNull() {
            addCriterion("repayment_source is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceEqualTo(String value) {
            addCriterion("repayment_source =", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotEqualTo(String value) {
            addCriterion("repayment_source <>", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceGreaterThan(String value) {
            addCriterion("repayment_source >", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_source >=", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceLessThan(String value) {
            addCriterion("repayment_source <", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceLessThanOrEqualTo(String value) {
            addCriterion("repayment_source <=", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceLike(String value) {
            addCriterion("repayment_source like", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotLike(String value) {
            addCriterion("repayment_source not like", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceIn(List<String> values) {
            addCriterion("repayment_source in", values, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotIn(List<String> values) {
            addCriterion("repayment_source not in", values, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceBetween(String value1, String value2) {
            addCriterion("repayment_source between", value1, value2, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotBetween(String value1, String value2) {
            addCriterion("repayment_source not between", value1, value2, "repaymentSource");
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