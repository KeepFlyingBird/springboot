package cn.freefly.springboot.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class TDataZnjcHuanKuanCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDataZnjcHuanKuanCriteria() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeIsNull() {
            addCriterion("paylist_code is null");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeIsNotNull() {
            addCriterion("paylist_code is not null");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeEqualTo(String value) {
            addCriterion("paylist_code =", value, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeNotEqualTo(String value) {
            addCriterion("paylist_code <>", value, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeGreaterThan(String value) {
            addCriterion("paylist_code >", value, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeGreaterThanOrEqualTo(String value) {
            addCriterion("paylist_code >=", value, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeLessThan(String value) {
            addCriterion("paylist_code <", value, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeLessThanOrEqualTo(String value) {
            addCriterion("paylist_code <=", value, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeLike(String value) {
            addCriterion("paylist_code like", value, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeNotLike(String value) {
            addCriterion("paylist_code not like", value, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeIn(List<String> values) {
            addCriterion("paylist_code in", values, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeNotIn(List<String> values) {
            addCriterion("paylist_code not in", values, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeBetween(String value1, String value2) {
            addCriterion("paylist_code between", value1, value2, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andPaylistCodeNotBetween(String value1, String value2) {
            addCriterion("paylist_code not between", value1, value2, "paylistCode");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataIsNull() {
            addCriterion("beginning_receive_data is null");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataIsNotNull() {
            addCriterion("beginning_receive_data is not null");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataEqualTo(String value) {
            addCriterion("beginning_receive_data =", value, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataNotEqualTo(String value) {
            addCriterion("beginning_receive_data <>", value, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataGreaterThan(String value) {
            addCriterion("beginning_receive_data >", value, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataGreaterThanOrEqualTo(String value) {
            addCriterion("beginning_receive_data >=", value, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataLessThan(String value) {
            addCriterion("beginning_receive_data <", value, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataLessThanOrEqualTo(String value) {
            addCriterion("beginning_receive_data <=", value, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataLike(String value) {
            addCriterion("beginning_receive_data like", value, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataNotLike(String value) {
            addCriterion("beginning_receive_data not like", value, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataIn(List<String> values) {
            addCriterion("beginning_receive_data in", values, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataNotIn(List<String> values) {
            addCriterion("beginning_receive_data not in", values, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataBetween(String value1, String value2) {
            addCriterion("beginning_receive_data between", value1, value2, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andBeginningReceiveDataNotBetween(String value1, String value2) {
            addCriterion("beginning_receive_data not between", value1, value2, "beginningReceiveData");
            return (Criteria) this;
        }

        public Criteria andRealityTimeIsNull() {
            addCriterion("reality_time is null");
            return (Criteria) this;
        }

        public Criteria andRealityTimeIsNotNull() {
            addCriterion("reality_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealityTimeEqualTo(String value) {
            addCriterion("reality_time =", value, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeNotEqualTo(String value) {
            addCriterion("reality_time <>", value, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeGreaterThan(String value) {
            addCriterion("reality_time >", value, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeGreaterThanOrEqualTo(String value) {
            addCriterion("reality_time >=", value, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeLessThan(String value) {
            addCriterion("reality_time <", value, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeLessThanOrEqualTo(String value) {
            addCriterion("reality_time <=", value, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeLike(String value) {
            addCriterion("reality_time like", value, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeNotLike(String value) {
            addCriterion("reality_time not like", value, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeIn(List<String> values) {
            addCriterion("reality_time in", values, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeNotIn(List<String> values) {
            addCriterion("reality_time not in", values, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeBetween(String value1, String value2) {
            addCriterion("reality_time between", value1, value2, "realityTime");
            return (Criteria) this;
        }

        public Criteria andRealityTimeNotBetween(String value1, String value2) {
            addCriterion("reality_time not between", value1, value2, "realityTime");
            return (Criteria) this;
        }

        public Criteria andBeginningNumIsNull() {
            addCriterion("beginning_num is null");
            return (Criteria) this;
        }

        public Criteria andBeginningNumIsNotNull() {
            addCriterion("beginning_num is not null");
            return (Criteria) this;
        }

        public Criteria andBeginningNumEqualTo(Integer value) {
            addCriterion("beginning_num =", value, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andBeginningNumNotEqualTo(Integer value) {
            addCriterion("beginning_num <>", value, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andBeginningNumGreaterThan(Integer value) {
            addCriterion("beginning_num >", value, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andBeginningNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("beginning_num >=", value, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andBeginningNumLessThan(Integer value) {
            addCriterion("beginning_num <", value, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andBeginningNumLessThanOrEqualTo(Integer value) {
            addCriterion("beginning_num <=", value, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andBeginningNumIn(List<Integer> values) {
            addCriterion("beginning_num in", values, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andBeginningNumNotIn(List<Integer> values) {
            addCriterion("beginning_num not in", values, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andBeginningNumBetween(Integer value1, Integer value2) {
            addCriterion("beginning_num between", value1, value2, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andBeginningNumNotBetween(Integer value1, Integer value2) {
            addCriterion("beginning_num not between", value1, value2, "beginningNum");
            return (Criteria) this;
        }

        public Criteria andYhBenjinIsNull() {
            addCriterion("yh_benjin is null");
            return (Criteria) this;
        }

        public Criteria andYhBenjinIsNotNull() {
            addCriterion("yh_benjin is not null");
            return (Criteria) this;
        }

        public Criteria andYhBenjinEqualTo(Double value) {
            addCriterion("yh_benjin =", value, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhBenjinNotEqualTo(Double value) {
            addCriterion("yh_benjin <>", value, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhBenjinGreaterThan(Double value) {
            addCriterion("yh_benjin >", value, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhBenjinGreaterThanOrEqualTo(Double value) {
            addCriterion("yh_benjin >=", value, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhBenjinLessThan(Double value) {
            addCriterion("yh_benjin <", value, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhBenjinLessThanOrEqualTo(Double value) {
            addCriterion("yh_benjin <=", value, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhBenjinIn(List<Double> values) {
            addCriterion("yh_benjin in", values, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhBenjinNotIn(List<Double> values) {
            addCriterion("yh_benjin not in", values, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhBenjinBetween(Double value1, Double value2) {
            addCriterion("yh_benjin between", value1, value2, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhBenjinNotBetween(Double value1, Double value2) {
            addCriterion("yh_benjin not between", value1, value2, "yhBenjin");
            return (Criteria) this;
        }

        public Criteria andYhLixiIsNull() {
            addCriterion("yh_lixi is null");
            return (Criteria) this;
        }

        public Criteria andYhLixiIsNotNull() {
            addCriterion("yh_lixi is not null");
            return (Criteria) this;
        }

        public Criteria andYhLixiEqualTo(Double value) {
            addCriterion("yh_lixi =", value, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andYhLixiNotEqualTo(Double value) {
            addCriterion("yh_lixi <>", value, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andYhLixiGreaterThan(Double value) {
            addCriterion("yh_lixi >", value, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andYhLixiGreaterThanOrEqualTo(Double value) {
            addCriterion("yh_lixi >=", value, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andYhLixiLessThan(Double value) {
            addCriterion("yh_lixi <", value, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andYhLixiLessThanOrEqualTo(Double value) {
            addCriterion("yh_lixi <=", value, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andYhLixiIn(List<Double> values) {
            addCriterion("yh_lixi in", values, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andYhLixiNotIn(List<Double> values) {
            addCriterion("yh_lixi not in", values, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andYhLixiBetween(Double value1, Double value2) {
            addCriterion("yh_lixi between", value1, value2, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andYhLixiNotBetween(Double value1, Double value2) {
            addCriterion("yh_lixi not between", value1, value2, "yhLixi");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidIsNull() {
            addCriterion("penalty_paid is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidIsNotNull() {
            addCriterion("penalty_paid is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidEqualTo(Double value) {
            addCriterion("penalty_paid =", value, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidNotEqualTo(Double value) {
            addCriterion("penalty_paid <>", value, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidGreaterThan(Double value) {
            addCriterion("penalty_paid >", value, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidGreaterThanOrEqualTo(Double value) {
            addCriterion("penalty_paid >=", value, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidLessThan(Double value) {
            addCriterion("penalty_paid <", value, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidLessThanOrEqualTo(Double value) {
            addCriterion("penalty_paid <=", value, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidIn(List<Double> values) {
            addCriterion("penalty_paid in", values, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidNotIn(List<Double> values) {
            addCriterion("penalty_paid not in", values, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidBetween(Double value1, Double value2) {
            addCriterion("penalty_paid between", value1, value2, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andPenaltyPaidNotBetween(Double value1, Double value2) {
            addCriterion("penalty_paid not between", value1, value2, "penaltyPaid");
            return (Criteria) this;
        }

        public Criteria andYsBenjinIsNull() {
            addCriterion("ys_benjin is null");
            return (Criteria) this;
        }

        public Criteria andYsBenjinIsNotNull() {
            addCriterion("ys_benjin is not null");
            return (Criteria) this;
        }

        public Criteria andYsBenjinEqualTo(Double value) {
            addCriterion("ys_benjin =", value, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsBenjinNotEqualTo(Double value) {
            addCriterion("ys_benjin <>", value, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsBenjinGreaterThan(Double value) {
            addCriterion("ys_benjin >", value, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsBenjinGreaterThanOrEqualTo(Double value) {
            addCriterion("ys_benjin >=", value, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsBenjinLessThan(Double value) {
            addCriterion("ys_benjin <", value, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsBenjinLessThanOrEqualTo(Double value) {
            addCriterion("ys_benjin <=", value, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsBenjinIn(List<Double> values) {
            addCriterion("ys_benjin in", values, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsBenjinNotIn(List<Double> values) {
            addCriterion("ys_benjin not in", values, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsBenjinBetween(Double value1, Double value2) {
            addCriterion("ys_benjin between", value1, value2, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsBenjinNotBetween(Double value1, Double value2) {
            addCriterion("ys_benjin not between", value1, value2, "ysBenjin");
            return (Criteria) this;
        }

        public Criteria andYsLixiIsNull() {
            addCriterion("ys_lixi is null");
            return (Criteria) this;
        }

        public Criteria andYsLixiIsNotNull() {
            addCriterion("ys_lixi is not null");
            return (Criteria) this;
        }

        public Criteria andYsLixiEqualTo(Double value) {
            addCriterion("ys_lixi =", value, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andYsLixiNotEqualTo(Double value) {
            addCriterion("ys_lixi <>", value, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andYsLixiGreaterThan(Double value) {
            addCriterion("ys_lixi >", value, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andYsLixiGreaterThanOrEqualTo(Double value) {
            addCriterion("ys_lixi >=", value, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andYsLixiLessThan(Double value) {
            addCriterion("ys_lixi <", value, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andYsLixiLessThanOrEqualTo(Double value) {
            addCriterion("ys_lixi <=", value, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andYsLixiIn(List<Double> values) {
            addCriterion("ys_lixi in", values, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andYsLixiNotIn(List<Double> values) {
            addCriterion("ys_lixi not in", values, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andYsLixiBetween(Double value1, Double value2) {
            addCriterion("ys_lixi between", value1, value2, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andYsLixiNotBetween(Double value1, Double value2) {
            addCriterion("ys_lixi not between", value1, value2, "ysLixi");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceIsNull() {
            addCriterion("penalty_rece is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceIsNotNull() {
            addCriterion("penalty_rece is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceEqualTo(Double value) {
            addCriterion("penalty_rece =", value, "penaltyRece");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceNotEqualTo(Double value) {
            addCriterion("penalty_rece <>", value, "penaltyRece");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceGreaterThan(Double value) {
            addCriterion("penalty_rece >", value, "penaltyRece");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceGreaterThanOrEqualTo(Double value) {
            addCriterion("penalty_rece >=", value, "penaltyRece");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceLessThan(Double value) {
            addCriterion("penalty_rece <", value, "penaltyRece");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceLessThanOrEqualTo(Double value) {
            addCriterion("penalty_rece <=", value, "penaltyRece");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceIn(List<Double> values) {
            addCriterion("penalty_rece in", values, "penaltyRece");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceNotIn(List<Double> values) {
            addCriterion("penalty_rece not in", values, "penaltyRece");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceBetween(Double value1, Double value2) {
            addCriterion("penalty_rece between", value1, value2, "penaltyRece");
            return (Criteria) this;
        }

        public Criteria andPenaltyReceNotBetween(Double value1, Double value2) {
            addCriterion("penalty_rece not between", value1, value2, "penaltyRece");
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