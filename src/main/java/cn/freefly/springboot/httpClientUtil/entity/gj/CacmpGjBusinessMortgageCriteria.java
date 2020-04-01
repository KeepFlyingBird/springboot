package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjBusinessMortgageCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjBusinessMortgageCriteria() {
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

        public Criteria andDiyahetongFicIsNull() {
            addCriterion("diyahetong_fic is null");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicIsNotNull() {
            addCriterion("diyahetong_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicEqualTo(String value) {
            addCriterion("diyahetong_fic =", value, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicNotEqualTo(String value) {
            addCriterion("diyahetong_fic <>", value, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicGreaterThan(String value) {
            addCriterion("diyahetong_fic >", value, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicGreaterThanOrEqualTo(String value) {
            addCriterion("diyahetong_fic >=", value, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicLessThan(String value) {
            addCriterion("diyahetong_fic <", value, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicLessThanOrEqualTo(String value) {
            addCriterion("diyahetong_fic <=", value, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicLike(String value) {
            addCriterion("diyahetong_fic like", value, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicNotLike(String value) {
            addCriterion("diyahetong_fic not like", value, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicIn(List<String> values) {
            addCriterion("diyahetong_fic in", values, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicNotIn(List<String> values) {
            addCriterion("diyahetong_fic not in", values, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicBetween(String value1, String value2) {
            addCriterion("diyahetong_fic between", value1, value2, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyahetongFicNotBetween(String value1, String value2) {
            addCriterion("diyahetong_fic not between", value1, value2, "diyahetongFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicIsNull() {
            addCriterion("diyadengji_fic is null");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicIsNotNull() {
            addCriterion("diyadengji_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicEqualTo(String value) {
            addCriterion("diyadengji_fic =", value, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicNotEqualTo(String value) {
            addCriterion("diyadengji_fic <>", value, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicGreaterThan(String value) {
            addCriterion("diyadengji_fic >", value, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicGreaterThanOrEqualTo(String value) {
            addCriterion("diyadengji_fic >=", value, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicLessThan(String value) {
            addCriterion("diyadengji_fic <", value, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicLessThanOrEqualTo(String value) {
            addCriterion("diyadengji_fic <=", value, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicLike(String value) {
            addCriterion("diyadengji_fic like", value, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicNotLike(String value) {
            addCriterion("diyadengji_fic not like", value, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicIn(List<String> values) {
            addCriterion("diyadengji_fic in", values, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicNotIn(List<String> values) {
            addCriterion("diyadengji_fic not in", values, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicBetween(String value1, String value2) {
            addCriterion("diyadengji_fic between", value1, value2, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFicNotBetween(String value1, String value2) {
            addCriterion("diyadengji_fic not between", value1, value2, "diyadengjiFic");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2IsNull() {
            addCriterion("diyadengji_fic2 is null");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2IsNotNull() {
            addCriterion("diyadengji_fic2 is not null");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2EqualTo(String value) {
            addCriterion("diyadengji_fic2 =", value, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2NotEqualTo(String value) {
            addCriterion("diyadengji_fic2 <>", value, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2GreaterThan(String value) {
            addCriterion("diyadengji_fic2 >", value, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2GreaterThanOrEqualTo(String value) {
            addCriterion("diyadengji_fic2 >=", value, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2LessThan(String value) {
            addCriterion("diyadengji_fic2 <", value, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2LessThanOrEqualTo(String value) {
            addCriterion("diyadengji_fic2 <=", value, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2Like(String value) {
            addCriterion("diyadengji_fic2 like", value, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2NotLike(String value) {
            addCriterion("diyadengji_fic2 not like", value, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2In(List<String> values) {
            addCriterion("diyadengji_fic2 in", values, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2NotIn(List<String> values) {
            addCriterion("diyadengji_fic2 not in", values, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2Between(String value1, String value2) {
            addCriterion("diyadengji_fic2 between", value1, value2, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andDiyadengjiFic2NotBetween(String value1, String value2) {
            addCriterion("diyadengji_fic2 not between", value1, value2, "diyadengjiFic2");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicIsNull() {
            addCriterion("huizhizhao_fic is null");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicIsNotNull() {
            addCriterion("huizhizhao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicEqualTo(String value) {
            addCriterion("huizhizhao_fic =", value, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicNotEqualTo(String value) {
            addCriterion("huizhizhao_fic <>", value, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicGreaterThan(String value) {
            addCriterion("huizhizhao_fic >", value, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("huizhizhao_fic >=", value, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicLessThan(String value) {
            addCriterion("huizhizhao_fic <", value, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicLessThanOrEqualTo(String value) {
            addCriterion("huizhizhao_fic <=", value, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicLike(String value) {
            addCriterion("huizhizhao_fic like", value, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicNotLike(String value) {
            addCriterion("huizhizhao_fic not like", value, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicIn(List<String> values) {
            addCriterion("huizhizhao_fic in", values, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicNotIn(List<String> values) {
            addCriterion("huizhizhao_fic not in", values, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicBetween(String value1, String value2) {
            addCriterion("huizhizhao_fic between", value1, value2, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuizhizhaoFicNotBetween(String value1, String value2) {
            addCriterion("huizhizhao_fic not between", value1, value2, "huizhizhaoFic");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeIsNull() {
            addCriterion("mortgage_right_type is null");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeIsNotNull() {
            addCriterion("mortgage_right_type is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeEqualTo(String value) {
            addCriterion("mortgage_right_type =", value, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeNotEqualTo(String value) {
            addCriterion("mortgage_right_type <>", value, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeGreaterThan(String value) {
            addCriterion("mortgage_right_type >", value, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_right_type >=", value, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeLessThan(String value) {
            addCriterion("mortgage_right_type <", value, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeLessThanOrEqualTo(String value) {
            addCriterion("mortgage_right_type <=", value, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeLike(String value) {
            addCriterion("mortgage_right_type like", value, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeNotLike(String value) {
            addCriterion("mortgage_right_type not like", value, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeIn(List<String> values) {
            addCriterion("mortgage_right_type in", values, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeNotIn(List<String> values) {
            addCriterion("mortgage_right_type not in", values, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeBetween(String value1, String value2) {
            addCriterion("mortgage_right_type between", value1, value2, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightTypeNotBetween(String value1, String value2) {
            addCriterion("mortgage_right_type not between", value1, value2, "mortgageRightType");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonIsNull() {
            addCriterion("mortgage_right_person is null");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonIsNotNull() {
            addCriterion("mortgage_right_person is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonEqualTo(String value) {
            addCriterion("mortgage_right_person =", value, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonNotEqualTo(String value) {
            addCriterion("mortgage_right_person <>", value, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonGreaterThan(String value) {
            addCriterion("mortgage_right_person >", value, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_right_person >=", value, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonLessThan(String value) {
            addCriterion("mortgage_right_person <", value, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonLessThanOrEqualTo(String value) {
            addCriterion("mortgage_right_person <=", value, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonLike(String value) {
            addCriterion("mortgage_right_person like", value, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonNotLike(String value) {
            addCriterion("mortgage_right_person not like", value, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonIn(List<String> values) {
            addCriterion("mortgage_right_person in", values, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonNotIn(List<String> values) {
            addCriterion("mortgage_right_person not in", values, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonBetween(String value1, String value2) {
            addCriterion("mortgage_right_person between", value1, value2, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageRightPersonNotBetween(String value1, String value2) {
            addCriterion("mortgage_right_person not between", value1, value2, "mortgageRightPerson");
            return (Criteria) this;
        }

        public Criteria andMortgageDateIsNull() {
            addCriterion("mortgage_date is null");
            return (Criteria) this;
        }

        public Criteria andMortgageDateIsNotNull() {
            addCriterion("mortgage_date is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageDateEqualTo(Date value) {
            addCriterion("mortgage_date =", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateNotEqualTo(Date value) {
            addCriterion("mortgage_date <>", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateGreaterThan(Date value) {
            addCriterion("mortgage_date >", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mortgage_date >=", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateLessThan(Date value) {
            addCriterion("mortgage_date <", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateLessThanOrEqualTo(Date value) {
            addCriterion("mortgage_date <=", value, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateIn(List<Date> values) {
            addCriterion("mortgage_date in", values, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateNotIn(List<Date> values) {
            addCriterion("mortgage_date not in", values, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateBetween(Date value1, Date value2) {
            addCriterion("mortgage_date between", value1, value2, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andMortgageDateNotBetween(Date value1, Date value2) {
            addCriterion("mortgage_date not between", value1, value2, "mortgageDate");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeIsNull() {
            addCriterion("realmortgage_right_type is null");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeIsNotNull() {
            addCriterion("realmortgage_right_type is not null");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeEqualTo(String value) {
            addCriterion("realmortgage_right_type =", value, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeNotEqualTo(String value) {
            addCriterion("realmortgage_right_type <>", value, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeGreaterThan(String value) {
            addCriterion("realmortgage_right_type >", value, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeGreaterThanOrEqualTo(String value) {
            addCriterion("realmortgage_right_type >=", value, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeLessThan(String value) {
            addCriterion("realmortgage_right_type <", value, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeLessThanOrEqualTo(String value) {
            addCriterion("realmortgage_right_type <=", value, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeLike(String value) {
            addCriterion("realmortgage_right_type like", value, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeNotLike(String value) {
            addCriterion("realmortgage_right_type not like", value, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeIn(List<String> values) {
            addCriterion("realmortgage_right_type in", values, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeNotIn(List<String> values) {
            addCriterion("realmortgage_right_type not in", values, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeBetween(String value1, String value2) {
            addCriterion("realmortgage_right_type between", value1, value2, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightTypeNotBetween(String value1, String value2) {
            addCriterion("realmortgage_right_type not between", value1, value2, "realmortgageRightType");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleIsNull() {
            addCriterion("realmortgage_right_people is null");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleIsNotNull() {
            addCriterion("realmortgage_right_people is not null");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleEqualTo(String value) {
            addCriterion("realmortgage_right_people =", value, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleNotEqualTo(String value) {
            addCriterion("realmortgage_right_people <>", value, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleGreaterThan(String value) {
            addCriterion("realmortgage_right_people >", value, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("realmortgage_right_people >=", value, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleLessThan(String value) {
            addCriterion("realmortgage_right_people <", value, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleLessThanOrEqualTo(String value) {
            addCriterion("realmortgage_right_people <=", value, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleLike(String value) {
            addCriterion("realmortgage_right_people like", value, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleNotLike(String value) {
            addCriterion("realmortgage_right_people not like", value, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleIn(List<String> values) {
            addCriterion("realmortgage_right_people in", values, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleNotIn(List<String> values) {
            addCriterion("realmortgage_right_people not in", values, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleBetween(String value1, String value2) {
            addCriterion("realmortgage_right_people between", value1, value2, "realmortgageRightPeople");
            return (Criteria) this;
        }

        public Criteria andRealmortgageRightPeopleNotBetween(String value1, String value2) {
            addCriterion("realmortgage_right_people not between", value1, value2, "realmortgageRightPeople");
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