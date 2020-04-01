package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjAssetCarExtendCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjAssetCarExtendCriteria() {
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

        public Criteria andOldCarPlateIsNull() {
            addCriterion("old_car_plate is null");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateIsNotNull() {
            addCriterion("old_car_plate is not null");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateEqualTo(String value) {
            addCriterion("old_car_plate =", value, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateNotEqualTo(String value) {
            addCriterion("old_car_plate <>", value, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateGreaterThan(String value) {
            addCriterion("old_car_plate >", value, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateGreaterThanOrEqualTo(String value) {
            addCriterion("old_car_plate >=", value, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateLessThan(String value) {
            addCriterion("old_car_plate <", value, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateLessThanOrEqualTo(String value) {
            addCriterion("old_car_plate <=", value, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateLike(String value) {
            addCriterion("old_car_plate like", value, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateNotLike(String value) {
            addCriterion("old_car_plate not like", value, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateIn(List<String> values) {
            addCriterion("old_car_plate in", values, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateNotIn(List<String> values) {
            addCriterion("old_car_plate not in", values, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateBetween(String value1, String value2) {
            addCriterion("old_car_plate between", value1, value2, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andOldCarPlateNotBetween(String value1, String value2) {
            addCriterion("old_car_plate not between", value1, value2, "oldCarPlate");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedIsNull() {
            addCriterion("variable_speed is null");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedIsNotNull() {
            addCriterion("variable_speed is not null");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedEqualTo(String value) {
            addCriterion("variable_speed =", value, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedNotEqualTo(String value) {
            addCriterion("variable_speed <>", value, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedGreaterThan(String value) {
            addCriterion("variable_speed >", value, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("variable_speed >=", value, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedLessThan(String value) {
            addCriterion("variable_speed <", value, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedLessThanOrEqualTo(String value) {
            addCriterion("variable_speed <=", value, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedLike(String value) {
            addCriterion("variable_speed like", value, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedNotLike(String value) {
            addCriterion("variable_speed not like", value, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedIn(List<String> values) {
            addCriterion("variable_speed in", values, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedNotIn(List<String> values) {
            addCriterion("variable_speed not in", values, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedBetween(String value1, String value2) {
            addCriterion("variable_speed between", value1, value2, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andVariableSpeedNotBetween(String value1, String value2) {
            addCriterion("variable_speed not between", value1, value2, "variableSpeed");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementIsNull() {
            addCriterion("car_displacement is null");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementIsNotNull() {
            addCriterion("car_displacement is not null");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementEqualTo(String value) {
            addCriterion("car_displacement =", value, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementNotEqualTo(String value) {
            addCriterion("car_displacement <>", value, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementGreaterThan(String value) {
            addCriterion("car_displacement >", value, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementGreaterThanOrEqualTo(String value) {
            addCriterion("car_displacement >=", value, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementLessThan(String value) {
            addCriterion("car_displacement <", value, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementLessThanOrEqualTo(String value) {
            addCriterion("car_displacement <=", value, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementLike(String value) {
            addCriterion("car_displacement like", value, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementNotLike(String value) {
            addCriterion("car_displacement not like", value, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementIn(List<String> values) {
            addCriterion("car_displacement in", values, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementNotIn(List<String> values) {
            addCriterion("car_displacement not in", values, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementBetween(String value1, String value2) {
            addCriterion("car_displacement between", value1, value2, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andCarDisplacementNotBetween(String value1, String value2) {
            addCriterion("car_displacement not between", value1, value2, "carDisplacement");
            return (Criteria) this;
        }

        public Criteria andPassengerNumIsNull() {
            addCriterion("passenger_num is null");
            return (Criteria) this;
        }

        public Criteria andPassengerNumIsNotNull() {
            addCriterion("passenger_num is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerNumEqualTo(String value) {
            addCriterion("passenger_num =", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumNotEqualTo(String value) {
            addCriterion("passenger_num <>", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumGreaterThan(String value) {
            addCriterion("passenger_num >", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_num >=", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumLessThan(String value) {
            addCriterion("passenger_num <", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumLessThanOrEqualTo(String value) {
            addCriterion("passenger_num <=", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumLike(String value) {
            addCriterion("passenger_num like", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumNotLike(String value) {
            addCriterion("passenger_num not like", value, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumIn(List<String> values) {
            addCriterion("passenger_num in", values, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumNotIn(List<String> values) {
            addCriterion("passenger_num not in", values, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumBetween(String value1, String value2) {
            addCriterion("passenger_num between", value1, value2, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andPassengerNumNotBetween(String value1, String value2) {
            addCriterion("passenger_num not between", value1, value2, "passengerNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumIsNull() {
            addCriterion("weight_num is null");
            return (Criteria) this;
        }

        public Criteria andWeightNumIsNotNull() {
            addCriterion("weight_num is not null");
            return (Criteria) this;
        }

        public Criteria andWeightNumEqualTo(String value) {
            addCriterion("weight_num =", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumNotEqualTo(String value) {
            addCriterion("weight_num <>", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumGreaterThan(String value) {
            addCriterion("weight_num >", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumGreaterThanOrEqualTo(String value) {
            addCriterion("weight_num >=", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumLessThan(String value) {
            addCriterion("weight_num <", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumLessThanOrEqualTo(String value) {
            addCriterion("weight_num <=", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumLike(String value) {
            addCriterion("weight_num like", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumNotLike(String value) {
            addCriterion("weight_num not like", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumIn(List<String> values) {
            addCriterion("weight_num in", values, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumNotIn(List<String> values) {
            addCriterion("weight_num not in", values, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumBetween(String value1, String value2) {
            addCriterion("weight_num between", value1, value2, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumNotBetween(String value1, String value2) {
            addCriterion("weight_num not between", value1, value2, "weightNum");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateIsNull() {
            addCriterion("yearly_inspection_date is null");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateIsNotNull() {
            addCriterion("yearly_inspection_date is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateEqualTo(Date value) {
            addCriterion("yearly_inspection_date =", value, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateNotEqualTo(Date value) {
            addCriterion("yearly_inspection_date <>", value, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateGreaterThan(Date value) {
            addCriterion("yearly_inspection_date >", value, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("yearly_inspection_date >=", value, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateLessThan(Date value) {
            addCriterion("yearly_inspection_date <", value, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateLessThanOrEqualTo(Date value) {
            addCriterion("yearly_inspection_date <=", value, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateIn(List<Date> values) {
            addCriterion("yearly_inspection_date in", values, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateNotIn(List<Date> values) {
            addCriterion("yearly_inspection_date not in", values, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateBetween(Date value1, Date value2) {
            addCriterion("yearly_inspection_date between", value1, value2, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andYearlyInspectionDateNotBetween(Date value1, Date value2) {
            addCriterion("yearly_inspection_date not between", value1, value2, "yearlyInspectionDate");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicIsNull() {
            addCriterion("xingshizheng_fic is null");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicIsNotNull() {
            addCriterion("xingshizheng_fic is not null");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicEqualTo(String value) {
            addCriterion("xingshizheng_fic =", value, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicNotEqualTo(String value) {
            addCriterion("xingshizheng_fic <>", value, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicGreaterThan(String value) {
            addCriterion("xingshizheng_fic >", value, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicGreaterThanOrEqualTo(String value) {
            addCriterion("xingshizheng_fic >=", value, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicLessThan(String value) {
            addCriterion("xingshizheng_fic <", value, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicLessThanOrEqualTo(String value) {
            addCriterion("xingshizheng_fic <=", value, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicLike(String value) {
            addCriterion("xingshizheng_fic like", value, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicNotLike(String value) {
            addCriterion("xingshizheng_fic not like", value, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicIn(List<String> values) {
            addCriterion("xingshizheng_fic in", values, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicNotIn(List<String> values) {
            addCriterion("xingshizheng_fic not in", values, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicBetween(String value1, String value2) {
            addCriterion("xingshizheng_fic between", value1, value2, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengFicNotBetween(String value1, String value2) {
            addCriterion("xingshizheng_fic not between", value1, value2, "xingshizhengFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicIsNull() {
            addCriterion("xingshizheng_back_fic is null");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicIsNotNull() {
            addCriterion("xingshizheng_back_fic is not null");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicEqualTo(String value) {
            addCriterion("xingshizheng_back_fic =", value, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicNotEqualTo(String value) {
            addCriterion("xingshizheng_back_fic <>", value, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicGreaterThan(String value) {
            addCriterion("xingshizheng_back_fic >", value, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicGreaterThanOrEqualTo(String value) {
            addCriterion("xingshizheng_back_fic >=", value, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicLessThan(String value) {
            addCriterion("xingshizheng_back_fic <", value, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicLessThanOrEqualTo(String value) {
            addCriterion("xingshizheng_back_fic <=", value, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicLike(String value) {
            addCriterion("xingshizheng_back_fic like", value, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicNotLike(String value) {
            addCriterion("xingshizheng_back_fic not like", value, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicIn(List<String> values) {
            addCriterion("xingshizheng_back_fic in", values, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicNotIn(List<String> values) {
            addCriterion("xingshizheng_back_fic not in", values, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicBetween(String value1, String value2) {
            addCriterion("xingshizheng_back_fic between", value1, value2, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andXingshizhengBackFicNotBetween(String value1, String value2) {
            addCriterion("xingshizheng_back_fic not between", value1, value2, "xingshizhengBackFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicIsNull() {
            addCriterion("dengjiz_fic is null");
            return (Criteria) this;
        }

        public Criteria andDengjizFicIsNotNull() {
            addCriterion("dengjiz_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDengjizFicEqualTo(String value) {
            addCriterion("dengjiz_fic =", value, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicNotEqualTo(String value) {
            addCriterion("dengjiz_fic <>", value, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicGreaterThan(String value) {
            addCriterion("dengjiz_fic >", value, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicGreaterThanOrEqualTo(String value) {
            addCriterion("dengjiz_fic >=", value, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicLessThan(String value) {
            addCriterion("dengjiz_fic <", value, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicLessThanOrEqualTo(String value) {
            addCriterion("dengjiz_fic <=", value, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicLike(String value) {
            addCriterion("dengjiz_fic like", value, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicNotLike(String value) {
            addCriterion("dengjiz_fic not like", value, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicIn(List<String> values) {
            addCriterion("dengjiz_fic in", values, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicNotIn(List<String> values) {
            addCriterion("dengjiz_fic not in", values, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicBetween(String value1, String value2) {
            addCriterion("dengjiz_fic between", value1, value2, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFicNotBetween(String value1, String value2) {
            addCriterion("dengjiz_fic not between", value1, value2, "dengjizFic");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2IsNull() {
            addCriterion("dengjiz_fic2 is null");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2IsNotNull() {
            addCriterion("dengjiz_fic2 is not null");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2EqualTo(String value) {
            addCriterion("dengjiz_fic2 =", value, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2NotEqualTo(String value) {
            addCriterion("dengjiz_fic2 <>", value, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2GreaterThan(String value) {
            addCriterion("dengjiz_fic2 >", value, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2GreaterThanOrEqualTo(String value) {
            addCriterion("dengjiz_fic2 >=", value, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2LessThan(String value) {
            addCriterion("dengjiz_fic2 <", value, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2LessThanOrEqualTo(String value) {
            addCriterion("dengjiz_fic2 <=", value, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2Like(String value) {
            addCriterion("dengjiz_fic2 like", value, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2NotLike(String value) {
            addCriterion("dengjiz_fic2 not like", value, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2In(List<String> values) {
            addCriterion("dengjiz_fic2 in", values, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2NotIn(List<String> values) {
            addCriterion("dengjiz_fic2 not in", values, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2Between(String value1, String value2) {
            addCriterion("dengjiz_fic2 between", value1, value2, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andDengjizFic2NotBetween(String value1, String value2) {
            addCriterion("dengjiz_fic2 not between", value1, value2, "dengjizFic2");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicIsNull() {
            addCriterion("jiaoqiangxianzhao_fic is null");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicIsNotNull() {
            addCriterion("jiaoqiangxianzhao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicEqualTo(String value) {
            addCriterion("jiaoqiangxianzhao_fic =", value, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicNotEqualTo(String value) {
            addCriterion("jiaoqiangxianzhao_fic <>", value, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicGreaterThan(String value) {
            addCriterion("jiaoqiangxianzhao_fic >", value, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("jiaoqiangxianzhao_fic >=", value, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicLessThan(String value) {
            addCriterion("jiaoqiangxianzhao_fic <", value, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicLessThanOrEqualTo(String value) {
            addCriterion("jiaoqiangxianzhao_fic <=", value, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicLike(String value) {
            addCriterion("jiaoqiangxianzhao_fic like", value, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicNotLike(String value) {
            addCriterion("jiaoqiangxianzhao_fic not like", value, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicIn(List<String> values) {
            addCriterion("jiaoqiangxianzhao_fic in", values, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicNotIn(List<String> values) {
            addCriterion("jiaoqiangxianzhao_fic not in", values, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicBetween(String value1, String value2) {
            addCriterion("jiaoqiangxianzhao_fic between", value1, value2, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianzhaoFicNotBetween(String value1, String value2) {
            addCriterion("jiaoqiangxianzhao_fic not between", value1, value2, "jiaoqiangxianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicIsNull() {
            addCriterion("shangyebaodan_fic is null");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicIsNotNull() {
            addCriterion("shangyebaodan_fic is not null");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicEqualTo(String value) {
            addCriterion("shangyebaodan_fic =", value, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicNotEqualTo(String value) {
            addCriterion("shangyebaodan_fic <>", value, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicGreaterThan(String value) {
            addCriterion("shangyebaodan_fic >", value, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicGreaterThanOrEqualTo(String value) {
            addCriterion("shangyebaodan_fic >=", value, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicLessThan(String value) {
            addCriterion("shangyebaodan_fic <", value, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicLessThanOrEqualTo(String value) {
            addCriterion("shangyebaodan_fic <=", value, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicLike(String value) {
            addCriterion("shangyebaodan_fic like", value, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicNotLike(String value) {
            addCriterion("shangyebaodan_fic not like", value, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicIn(List<String> values) {
            addCriterion("shangyebaodan_fic in", values, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicNotIn(List<String> values) {
            addCriterion("shangyebaodan_fic not in", values, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicBetween(String value1, String value2) {
            addCriterion("shangyebaodan_fic between", value1, value2, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andShangyebaodanFicNotBetween(String value1, String value2) {
            addCriterion("shangyebaodan_fic not between", value1, value2, "shangyebaodanFic");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeIsNull() {
            addCriterion("buy_car_contract_code is null");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeIsNotNull() {
            addCriterion("buy_car_contract_code is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeEqualTo(String value) {
            addCriterion("buy_car_contract_code =", value, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeNotEqualTo(String value) {
            addCriterion("buy_car_contract_code <>", value, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeGreaterThan(String value) {
            addCriterion("buy_car_contract_code >", value, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeGreaterThanOrEqualTo(String value) {
            addCriterion("buy_car_contract_code >=", value, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeLessThan(String value) {
            addCriterion("buy_car_contract_code <", value, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeLessThanOrEqualTo(String value) {
            addCriterion("buy_car_contract_code <=", value, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeLike(String value) {
            addCriterion("buy_car_contract_code like", value, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeNotLike(String value) {
            addCriterion("buy_car_contract_code not like", value, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeIn(List<String> values) {
            addCriterion("buy_car_contract_code in", values, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeNotIn(List<String> values) {
            addCriterion("buy_car_contract_code not in", values, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeBetween(String value1, String value2) {
            addCriterion("buy_car_contract_code between", value1, value2, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andBuyCarContractCodeNotBetween(String value1, String value2) {
            addCriterion("buy_car_contract_code not between", value1, value2, "buyCarContractCode");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateIsNull() {
            addCriterion("relieve_mortgage_date is null");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateIsNotNull() {
            addCriterion("relieve_mortgage_date is not null");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateEqualTo(Date value) {
            addCriterion("relieve_mortgage_date =", value, "relieveMortgageDate");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateNotEqualTo(Date value) {
            addCriterion("relieve_mortgage_date <>", value, "relieveMortgageDate");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateGreaterThan(Date value) {
            addCriterion("relieve_mortgage_date >", value, "relieveMortgageDate");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("relieve_mortgage_date >=", value, "relieveMortgageDate");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateLessThan(Date value) {
            addCriterion("relieve_mortgage_date <", value, "relieveMortgageDate");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateLessThanOrEqualTo(Date value) {
            addCriterion("relieve_mortgage_date <=", value, "relieveMortgageDate");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateIn(List<Date> values) {
            addCriterion("relieve_mortgage_date in", values, "relieveMortgageDate");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateNotIn(List<Date> values) {
            addCriterion("relieve_mortgage_date not in", values, "relieveMortgageDate");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateBetween(Date value1, Date value2) {
            addCriterion("relieve_mortgage_date between", value1, value2, "relieveMortgageDate");
            return (Criteria) this;
        }

        public Criteria andRelieveMortgageDateNotBetween(Date value1, Date value2) {
            addCriterion("relieve_mortgage_date not between", value1, value2, "relieveMortgageDate");
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