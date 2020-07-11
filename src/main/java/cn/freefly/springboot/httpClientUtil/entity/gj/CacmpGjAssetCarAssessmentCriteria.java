package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjAssetCarAssessmentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjAssetCarAssessmentCriteria() {
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

        public Criteria andEngineLidIsNull() {
            addCriterion("engine_lid is null");
            return (Criteria) this;
        }

        public Criteria andEngineLidIsNotNull() {
            addCriterion("engine_lid is not null");
            return (Criteria) this;
        }

        public Criteria andEngineLidEqualTo(String value) {
            addCriterion("engine_lid =", value, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidNotEqualTo(String value) {
            addCriterion("engine_lid <>", value, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidGreaterThan(String value) {
            addCriterion("engine_lid >", value, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidGreaterThanOrEqualTo(String value) {
            addCriterion("engine_lid >=", value, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidLessThan(String value) {
            addCriterion("engine_lid <", value, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidLessThanOrEqualTo(String value) {
            addCriterion("engine_lid <=", value, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidLike(String value) {
            addCriterion("engine_lid like", value, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidNotLike(String value) {
            addCriterion("engine_lid not like", value, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidIn(List<String> values) {
            addCriterion("engine_lid in", values, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidNotIn(List<String> values) {
            addCriterion("engine_lid not in", values, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidBetween(String value1, String value2) {
            addCriterion("engine_lid between", value1, value2, "engineLid");
            return (Criteria) this;
        }

        public Criteria andEngineLidNotBetween(String value1, String value2) {
            addCriterion("engine_lid not between", value1, value2, "engineLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidIsNull() {
            addCriterion("trunk_lid is null");
            return (Criteria) this;
        }

        public Criteria andTrunkLidIsNotNull() {
            addCriterion("trunk_lid is not null");
            return (Criteria) this;
        }

        public Criteria andTrunkLidEqualTo(String value) {
            addCriterion("trunk_lid =", value, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidNotEqualTo(String value) {
            addCriterion("trunk_lid <>", value, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidGreaterThan(String value) {
            addCriterion("trunk_lid >", value, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidGreaterThanOrEqualTo(String value) {
            addCriterion("trunk_lid >=", value, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidLessThan(String value) {
            addCriterion("trunk_lid <", value, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidLessThanOrEqualTo(String value) {
            addCriterion("trunk_lid <=", value, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidLike(String value) {
            addCriterion("trunk_lid like", value, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidNotLike(String value) {
            addCriterion("trunk_lid not like", value, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidIn(List<String> values) {
            addCriterion("trunk_lid in", values, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidNotIn(List<String> values) {
            addCriterion("trunk_lid not in", values, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidBetween(String value1, String value2) {
            addCriterion("trunk_lid between", value1, value2, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andTrunkLidNotBetween(String value1, String value2) {
            addCriterion("trunk_lid not between", value1, value2, "trunkLid");
            return (Criteria) this;
        }

        public Criteria andRearBumperIsNull() {
            addCriterion("rear_bumper is null");
            return (Criteria) this;
        }

        public Criteria andRearBumperIsNotNull() {
            addCriterion("rear_bumper is not null");
            return (Criteria) this;
        }

        public Criteria andRearBumperEqualTo(String value) {
            addCriterion("rear_bumper =", value, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperNotEqualTo(String value) {
            addCriterion("rear_bumper <>", value, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperGreaterThan(String value) {
            addCriterion("rear_bumper >", value, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperGreaterThanOrEqualTo(String value) {
            addCriterion("rear_bumper >=", value, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperLessThan(String value) {
            addCriterion("rear_bumper <", value, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperLessThanOrEqualTo(String value) {
            addCriterion("rear_bumper <=", value, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperLike(String value) {
            addCriterion("rear_bumper like", value, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperNotLike(String value) {
            addCriterion("rear_bumper not like", value, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperIn(List<String> values) {
            addCriterion("rear_bumper in", values, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperNotIn(List<String> values) {
            addCriterion("rear_bumper not in", values, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperBetween(String value1, String value2) {
            addCriterion("rear_bumper between", value1, value2, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andRearBumperNotBetween(String value1, String value2) {
            addCriterion("rear_bumper not between", value1, value2, "rearBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperIsNull() {
            addCriterion("front_bumper is null");
            return (Criteria) this;
        }

        public Criteria andFrontBumperIsNotNull() {
            addCriterion("front_bumper is not null");
            return (Criteria) this;
        }

        public Criteria andFrontBumperEqualTo(String value) {
            addCriterion("front_bumper =", value, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperNotEqualTo(String value) {
            addCriterion("front_bumper <>", value, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperGreaterThan(String value) {
            addCriterion("front_bumper >", value, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperGreaterThanOrEqualTo(String value) {
            addCriterion("front_bumper >=", value, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperLessThan(String value) {
            addCriterion("front_bumper <", value, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperLessThanOrEqualTo(String value) {
            addCriterion("front_bumper <=", value, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperLike(String value) {
            addCriterion("front_bumper like", value, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperNotLike(String value) {
            addCriterion("front_bumper not like", value, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperIn(List<String> values) {
            addCriterion("front_bumper in", values, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperNotIn(List<String> values) {
            addCriterion("front_bumper not in", values, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperBetween(String value1, String value2) {
            addCriterion("front_bumper between", value1, value2, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontBumperNotBetween(String value1, String value2) {
            addCriterion("front_bumper not between", value1, value2, "frontBumper");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldIsNull() {
            addCriterion("front_windshield is null");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldIsNotNull() {
            addCriterion("front_windshield is not null");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldEqualTo(String value) {
            addCriterion("front_windshield =", value, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldNotEqualTo(String value) {
            addCriterion("front_windshield <>", value, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldGreaterThan(String value) {
            addCriterion("front_windshield >", value, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldGreaterThanOrEqualTo(String value) {
            addCriterion("front_windshield >=", value, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldLessThan(String value) {
            addCriterion("front_windshield <", value, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldLessThanOrEqualTo(String value) {
            addCriterion("front_windshield <=", value, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldLike(String value) {
            addCriterion("front_windshield like", value, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldNotLike(String value) {
            addCriterion("front_windshield not like", value, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldIn(List<String> values) {
            addCriterion("front_windshield in", values, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldNotIn(List<String> values) {
            addCriterion("front_windshield not in", values, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldBetween(String value1, String value2) {
            addCriterion("front_windshield between", value1, value2, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andFrontWindshieldNotBetween(String value1, String value2) {
            addCriterion("front_windshield not between", value1, value2, "frontWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldIsNull() {
            addCriterion("rear_windshield is null");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldIsNotNull() {
            addCriterion("rear_windshield is not null");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldEqualTo(String value) {
            addCriterion("rear_windshield =", value, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldNotEqualTo(String value) {
            addCriterion("rear_windshield <>", value, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldGreaterThan(String value) {
            addCriterion("rear_windshield >", value, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldGreaterThanOrEqualTo(String value) {
            addCriterion("rear_windshield >=", value, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldLessThan(String value) {
            addCriterion("rear_windshield <", value, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldLessThanOrEqualTo(String value) {
            addCriterion("rear_windshield <=", value, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldLike(String value) {
            addCriterion("rear_windshield like", value, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldNotLike(String value) {
            addCriterion("rear_windshield not like", value, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldIn(List<String> values) {
            addCriterion("rear_windshield in", values, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldNotIn(List<String> values) {
            addCriterion("rear_windshield not in", values, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldBetween(String value1, String value2) {
            addCriterion("rear_windshield between", value1, value2, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andRearWindshieldNotBetween(String value1, String value2) {
            addCriterion("rear_windshield not between", value1, value2, "rearWindshield");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhIsNull() {
            addCriterion("panel_front_fender_rh is null");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhIsNotNull() {
            addCriterion("panel_front_fender_rh is not null");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhEqualTo(String value) {
            addCriterion("panel_front_fender_rh =", value, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhNotEqualTo(String value) {
            addCriterion("panel_front_fender_rh <>", value, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhGreaterThan(String value) {
            addCriterion("panel_front_fender_rh >", value, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhGreaterThanOrEqualTo(String value) {
            addCriterion("panel_front_fender_rh >=", value, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhLessThan(String value) {
            addCriterion("panel_front_fender_rh <", value, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhLessThanOrEqualTo(String value) {
            addCriterion("panel_front_fender_rh <=", value, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhLike(String value) {
            addCriterion("panel_front_fender_rh like", value, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhNotLike(String value) {
            addCriterion("panel_front_fender_rh not like", value, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhIn(List<String> values) {
            addCriterion("panel_front_fender_rh in", values, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhNotIn(List<String> values) {
            addCriterion("panel_front_fender_rh not in", values, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhBetween(String value1, String value2) {
            addCriterion("panel_front_fender_rh between", value1, value2, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderRhNotBetween(String value1, String value2) {
            addCriterion("panel_front_fender_rh not between", value1, value2, "panelFrontFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhIsNull() {
            addCriterion("panel_front_fender_lh is null");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhIsNotNull() {
            addCriterion("panel_front_fender_lh is not null");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhEqualTo(String value) {
            addCriterion("panel_front_fender_lh =", value, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhNotEqualTo(String value) {
            addCriterion("panel_front_fender_lh <>", value, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhGreaterThan(String value) {
            addCriterion("panel_front_fender_lh >", value, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhGreaterThanOrEqualTo(String value) {
            addCriterion("panel_front_fender_lh >=", value, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhLessThan(String value) {
            addCriterion("panel_front_fender_lh <", value, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhLessThanOrEqualTo(String value) {
            addCriterion("panel_front_fender_lh <=", value, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhLike(String value) {
            addCriterion("panel_front_fender_lh like", value, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhNotLike(String value) {
            addCriterion("panel_front_fender_lh not like", value, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhIn(List<String> values) {
            addCriterion("panel_front_fender_lh in", values, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhNotIn(List<String> values) {
            addCriterion("panel_front_fender_lh not in", values, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhBetween(String value1, String value2) {
            addCriterion("panel_front_fender_lh between", value1, value2, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelFrontFenderLhNotBetween(String value1, String value2) {
            addCriterion("panel_front_fender_lh not between", value1, value2, "panelFrontFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhIsNull() {
            addCriterion("panel_rear_fender_rh is null");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhIsNotNull() {
            addCriterion("panel_rear_fender_rh is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhEqualTo(String value) {
            addCriterion("panel_rear_fender_rh =", value, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhNotEqualTo(String value) {
            addCriterion("panel_rear_fender_rh <>", value, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhGreaterThan(String value) {
            addCriterion("panel_rear_fender_rh >", value, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhGreaterThanOrEqualTo(String value) {
            addCriterion("panel_rear_fender_rh >=", value, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhLessThan(String value) {
            addCriterion("panel_rear_fender_rh <", value, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhLessThanOrEqualTo(String value) {
            addCriterion("panel_rear_fender_rh <=", value, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhLike(String value) {
            addCriterion("panel_rear_fender_rh like", value, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhNotLike(String value) {
            addCriterion("panel_rear_fender_rh not like", value, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhIn(List<String> values) {
            addCriterion("panel_rear_fender_rh in", values, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhNotIn(List<String> values) {
            addCriterion("panel_rear_fender_rh not in", values, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhBetween(String value1, String value2) {
            addCriterion("panel_rear_fender_rh between", value1, value2, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderRhNotBetween(String value1, String value2) {
            addCriterion("panel_rear_fender_rh not between", value1, value2, "panelRearFenderRh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhIsNull() {
            addCriterion("panel_rear_fender_lh is null");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhIsNotNull() {
            addCriterion("panel_rear_fender_lh is not null");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhEqualTo(String value) {
            addCriterion("panel_rear_fender_lh =", value, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhNotEqualTo(String value) {
            addCriterion("panel_rear_fender_lh <>", value, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhGreaterThan(String value) {
            addCriterion("panel_rear_fender_lh >", value, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhGreaterThanOrEqualTo(String value) {
            addCriterion("panel_rear_fender_lh >=", value, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhLessThan(String value) {
            addCriterion("panel_rear_fender_lh <", value, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhLessThanOrEqualTo(String value) {
            addCriterion("panel_rear_fender_lh <=", value, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhLike(String value) {
            addCriterion("panel_rear_fender_lh like", value, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhNotLike(String value) {
            addCriterion("panel_rear_fender_lh not like", value, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhIn(List<String> values) {
            addCriterion("panel_rear_fender_lh in", values, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhNotIn(List<String> values) {
            addCriterion("panel_rear_fender_lh not in", values, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhBetween(String value1, String value2) {
            addCriterion("panel_rear_fender_lh between", value1, value2, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andPanelRearFenderLhNotBetween(String value1, String value2) {
            addCriterion("panel_rear_fender_lh not between", value1, value2, "panelRearFenderLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhIsNull() {
            addCriterion("front_door_rh is null");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhIsNotNull() {
            addCriterion("front_door_rh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhEqualTo(String value) {
            addCriterion("front_door_rh =", value, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhNotEqualTo(String value) {
            addCriterion("front_door_rh <>", value, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhGreaterThan(String value) {
            addCriterion("front_door_rh >", value, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhGreaterThanOrEqualTo(String value) {
            addCriterion("front_door_rh >=", value, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhLessThan(String value) {
            addCriterion("front_door_rh <", value, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhLessThanOrEqualTo(String value) {
            addCriterion("front_door_rh <=", value, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhLike(String value) {
            addCriterion("front_door_rh like", value, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhNotLike(String value) {
            addCriterion("front_door_rh not like", value, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhIn(List<String> values) {
            addCriterion("front_door_rh in", values, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhNotIn(List<String> values) {
            addCriterion("front_door_rh not in", values, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhBetween(String value1, String value2) {
            addCriterion("front_door_rh between", value1, value2, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorRhNotBetween(String value1, String value2) {
            addCriterion("front_door_rh not between", value1, value2, "frontDoorRh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhIsNull() {
            addCriterion("front_door_lh is null");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhIsNotNull() {
            addCriterion("front_door_lh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhEqualTo(String value) {
            addCriterion("front_door_lh =", value, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhNotEqualTo(String value) {
            addCriterion("front_door_lh <>", value, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhGreaterThan(String value) {
            addCriterion("front_door_lh >", value, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhGreaterThanOrEqualTo(String value) {
            addCriterion("front_door_lh >=", value, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhLessThan(String value) {
            addCriterion("front_door_lh <", value, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhLessThanOrEqualTo(String value) {
            addCriterion("front_door_lh <=", value, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhLike(String value) {
            addCriterion("front_door_lh like", value, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhNotLike(String value) {
            addCriterion("front_door_lh not like", value, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhIn(List<String> values) {
            addCriterion("front_door_lh in", values, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhNotIn(List<String> values) {
            addCriterion("front_door_lh not in", values, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhBetween(String value1, String value2) {
            addCriterion("front_door_lh between", value1, value2, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontDoorLhNotBetween(String value1, String value2) {
            addCriterion("front_door_lh not between", value1, value2, "frontDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhIsNull() {
            addCriterion("rear_door_rh is null");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhIsNotNull() {
            addCriterion("rear_door_rh is not null");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhEqualTo(String value) {
            addCriterion("rear_door_rh =", value, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhNotEqualTo(String value) {
            addCriterion("rear_door_rh <>", value, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhGreaterThan(String value) {
            addCriterion("rear_door_rh >", value, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_door_rh >=", value, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhLessThan(String value) {
            addCriterion("rear_door_rh <", value, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhLessThanOrEqualTo(String value) {
            addCriterion("rear_door_rh <=", value, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhLike(String value) {
            addCriterion("rear_door_rh like", value, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhNotLike(String value) {
            addCriterion("rear_door_rh not like", value, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhIn(List<String> values) {
            addCriterion("rear_door_rh in", values, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhNotIn(List<String> values) {
            addCriterion("rear_door_rh not in", values, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhBetween(String value1, String value2) {
            addCriterion("rear_door_rh between", value1, value2, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorRhNotBetween(String value1, String value2) {
            addCriterion("rear_door_rh not between", value1, value2, "rearDoorRh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhIsNull() {
            addCriterion("rear_door_lh is null");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhIsNotNull() {
            addCriterion("rear_door_lh is not null");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhEqualTo(String value) {
            addCriterion("rear_door_lh =", value, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhNotEqualTo(String value) {
            addCriterion("rear_door_lh <>", value, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhGreaterThan(String value) {
            addCriterion("rear_door_lh >", value, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_door_lh >=", value, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhLessThan(String value) {
            addCriterion("rear_door_lh <", value, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhLessThanOrEqualTo(String value) {
            addCriterion("rear_door_lh <=", value, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhLike(String value) {
            addCriterion("rear_door_lh like", value, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhNotLike(String value) {
            addCriterion("rear_door_lh not like", value, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhIn(List<String> values) {
            addCriterion("rear_door_lh in", values, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhNotIn(List<String> values) {
            addCriterion("rear_door_lh not in", values, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhBetween(String value1, String value2) {
            addCriterion("rear_door_lh between", value1, value2, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andRearDoorLhNotBetween(String value1, String value2) {
            addCriterion("rear_door_lh not between", value1, value2, "rearDoorLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhIsNull() {
            addCriterion("front_headlight_lh is null");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhIsNotNull() {
            addCriterion("front_headlight_lh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhEqualTo(String value) {
            addCriterion("front_headlight_lh =", value, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhNotEqualTo(String value) {
            addCriterion("front_headlight_lh <>", value, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhGreaterThan(String value) {
            addCriterion("front_headlight_lh >", value, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhGreaterThanOrEqualTo(String value) {
            addCriterion("front_headlight_lh >=", value, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhLessThan(String value) {
            addCriterion("front_headlight_lh <", value, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhLessThanOrEqualTo(String value) {
            addCriterion("front_headlight_lh <=", value, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhLike(String value) {
            addCriterion("front_headlight_lh like", value, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhNotLike(String value) {
            addCriterion("front_headlight_lh not like", value, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhIn(List<String> values) {
            addCriterion("front_headlight_lh in", values, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhNotIn(List<String> values) {
            addCriterion("front_headlight_lh not in", values, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhBetween(String value1, String value2) {
            addCriterion("front_headlight_lh between", value1, value2, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightLhNotBetween(String value1, String value2) {
            addCriterion("front_headlight_lh not between", value1, value2, "frontHeadlightLh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhIsNull() {
            addCriterion("front_headlight_rh is null");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhIsNotNull() {
            addCriterion("front_headlight_rh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhEqualTo(String value) {
            addCriterion("front_headlight_rh =", value, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhNotEqualTo(String value) {
            addCriterion("front_headlight_rh <>", value, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhGreaterThan(String value) {
            addCriterion("front_headlight_rh >", value, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhGreaterThanOrEqualTo(String value) {
            addCriterion("front_headlight_rh >=", value, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhLessThan(String value) {
            addCriterion("front_headlight_rh <", value, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhLessThanOrEqualTo(String value) {
            addCriterion("front_headlight_rh <=", value, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhLike(String value) {
            addCriterion("front_headlight_rh like", value, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhNotLike(String value) {
            addCriterion("front_headlight_rh not like", value, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhIn(List<String> values) {
            addCriterion("front_headlight_rh in", values, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhNotIn(List<String> values) {
            addCriterion("front_headlight_rh not in", values, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhBetween(String value1, String value2) {
            addCriterion("front_headlight_rh between", value1, value2, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andFrontHeadlightRhNotBetween(String value1, String value2) {
            addCriterion("front_headlight_rh not between", value1, value2, "frontHeadlightRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhIsNull() {
            addCriterion("rear_taillamp_lh is null");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhIsNotNull() {
            addCriterion("rear_taillamp_lh is not null");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhEqualTo(String value) {
            addCriterion("rear_taillamp_lh =", value, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhNotEqualTo(String value) {
            addCriterion("rear_taillamp_lh <>", value, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhGreaterThan(String value) {
            addCriterion("rear_taillamp_lh >", value, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_taillamp_lh >=", value, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhLessThan(String value) {
            addCriterion("rear_taillamp_lh <", value, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhLessThanOrEqualTo(String value) {
            addCriterion("rear_taillamp_lh <=", value, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhLike(String value) {
            addCriterion("rear_taillamp_lh like", value, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhNotLike(String value) {
            addCriterion("rear_taillamp_lh not like", value, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhIn(List<String> values) {
            addCriterion("rear_taillamp_lh in", values, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhNotIn(List<String> values) {
            addCriterion("rear_taillamp_lh not in", values, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhBetween(String value1, String value2) {
            addCriterion("rear_taillamp_lh between", value1, value2, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampLhNotBetween(String value1, String value2) {
            addCriterion("rear_taillamp_lh not between", value1, value2, "rearTaillampLh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhIsNull() {
            addCriterion("rear_taillamp_rh is null");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhIsNotNull() {
            addCriterion("rear_taillamp_rh is not null");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhEqualTo(String value) {
            addCriterion("rear_taillamp_rh =", value, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhNotEqualTo(String value) {
            addCriterion("rear_taillamp_rh <>", value, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhGreaterThan(String value) {
            addCriterion("rear_taillamp_rh >", value, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_taillamp_rh >=", value, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhLessThan(String value) {
            addCriterion("rear_taillamp_rh <", value, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhLessThanOrEqualTo(String value) {
            addCriterion("rear_taillamp_rh <=", value, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhLike(String value) {
            addCriterion("rear_taillamp_rh like", value, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhNotLike(String value) {
            addCriterion("rear_taillamp_rh not like", value, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhIn(List<String> values) {
            addCriterion("rear_taillamp_rh in", values, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhNotIn(List<String> values) {
            addCriterion("rear_taillamp_rh not in", values, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhBetween(String value1, String value2) {
            addCriterion("rear_taillamp_rh between", value1, value2, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andRearTaillampRhNotBetween(String value1, String value2) {
            addCriterion("rear_taillamp_rh not between", value1, value2, "rearTaillampRh");
            return (Criteria) this;
        }

        public Criteria andCarRoofIsNull() {
            addCriterion("car_roof is null");
            return (Criteria) this;
        }

        public Criteria andCarRoofIsNotNull() {
            addCriterion("car_roof is not null");
            return (Criteria) this;
        }

        public Criteria andCarRoofEqualTo(String value) {
            addCriterion("car_roof =", value, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofNotEqualTo(String value) {
            addCriterion("car_roof <>", value, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofGreaterThan(String value) {
            addCriterion("car_roof >", value, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofGreaterThanOrEqualTo(String value) {
            addCriterion("car_roof >=", value, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofLessThan(String value) {
            addCriterion("car_roof <", value, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofLessThanOrEqualTo(String value) {
            addCriterion("car_roof <=", value, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofLike(String value) {
            addCriterion("car_roof like", value, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofNotLike(String value) {
            addCriterion("car_roof not like", value, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofIn(List<String> values) {
            addCriterion("car_roof in", values, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofNotIn(List<String> values) {
            addCriterion("car_roof not in", values, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofBetween(String value1, String value2) {
            addCriterion("car_roof between", value1, value2, "carRoof");
            return (Criteria) this;
        }

        public Criteria andCarRoofNotBetween(String value1, String value2) {
            addCriterion("car_roof not between", value1, value2, "carRoof");
            return (Criteria) this;
        }

        public Criteria andAPillarRhIsNull() {
            addCriterion("a_pillar_rh is null");
            return (Criteria) this;
        }

        public Criteria andAPillarRhIsNotNull() {
            addCriterion("a_pillar_rh is not null");
            return (Criteria) this;
        }

        public Criteria andAPillarRhEqualTo(String value) {
            addCriterion("a_pillar_rh =", value, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhNotEqualTo(String value) {
            addCriterion("a_pillar_rh <>", value, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhGreaterThan(String value) {
            addCriterion("a_pillar_rh >", value, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhGreaterThanOrEqualTo(String value) {
            addCriterion("a_pillar_rh >=", value, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhLessThan(String value) {
            addCriterion("a_pillar_rh <", value, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhLessThanOrEqualTo(String value) {
            addCriterion("a_pillar_rh <=", value, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhLike(String value) {
            addCriterion("a_pillar_rh like", value, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhNotLike(String value) {
            addCriterion("a_pillar_rh not like", value, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhIn(List<String> values) {
            addCriterion("a_pillar_rh in", values, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhNotIn(List<String> values) {
            addCriterion("a_pillar_rh not in", values, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhBetween(String value1, String value2) {
            addCriterion("a_pillar_rh between", value1, value2, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarRhNotBetween(String value1, String value2) {
            addCriterion("a_pillar_rh not between", value1, value2, "aPillarRh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhIsNull() {
            addCriterion("a_pillar_lh is null");
            return (Criteria) this;
        }

        public Criteria andAPillarLhIsNotNull() {
            addCriterion("a_pillar_lh is not null");
            return (Criteria) this;
        }

        public Criteria andAPillarLhEqualTo(String value) {
            addCriterion("a_pillar_lh =", value, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhNotEqualTo(String value) {
            addCriterion("a_pillar_lh <>", value, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhGreaterThan(String value) {
            addCriterion("a_pillar_lh >", value, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhGreaterThanOrEqualTo(String value) {
            addCriterion("a_pillar_lh >=", value, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhLessThan(String value) {
            addCriterion("a_pillar_lh <", value, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhLessThanOrEqualTo(String value) {
            addCriterion("a_pillar_lh <=", value, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhLike(String value) {
            addCriterion("a_pillar_lh like", value, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhNotLike(String value) {
            addCriterion("a_pillar_lh not like", value, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhIn(List<String> values) {
            addCriterion("a_pillar_lh in", values, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhNotIn(List<String> values) {
            addCriterion("a_pillar_lh not in", values, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhBetween(String value1, String value2) {
            addCriterion("a_pillar_lh between", value1, value2, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andAPillarLhNotBetween(String value1, String value2) {
            addCriterion("a_pillar_lh not between", value1, value2, "aPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhIsNull() {
            addCriterion("b_pillar_rh is null");
            return (Criteria) this;
        }

        public Criteria andBPillarRhIsNotNull() {
            addCriterion("b_pillar_rh is not null");
            return (Criteria) this;
        }

        public Criteria andBPillarRhEqualTo(String value) {
            addCriterion("b_pillar_rh =", value, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhNotEqualTo(String value) {
            addCriterion("b_pillar_rh <>", value, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhGreaterThan(String value) {
            addCriterion("b_pillar_rh >", value, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhGreaterThanOrEqualTo(String value) {
            addCriterion("b_pillar_rh >=", value, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhLessThan(String value) {
            addCriterion("b_pillar_rh <", value, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhLessThanOrEqualTo(String value) {
            addCriterion("b_pillar_rh <=", value, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhLike(String value) {
            addCriterion("b_pillar_rh like", value, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhNotLike(String value) {
            addCriterion("b_pillar_rh not like", value, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhIn(List<String> values) {
            addCriterion("b_pillar_rh in", values, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhNotIn(List<String> values) {
            addCriterion("b_pillar_rh not in", values, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhBetween(String value1, String value2) {
            addCriterion("b_pillar_rh between", value1, value2, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarRhNotBetween(String value1, String value2) {
            addCriterion("b_pillar_rh not between", value1, value2, "bPillarRh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhIsNull() {
            addCriterion("b_pillar_lh is null");
            return (Criteria) this;
        }

        public Criteria andBPillarLhIsNotNull() {
            addCriterion("b_pillar_lh is not null");
            return (Criteria) this;
        }

        public Criteria andBPillarLhEqualTo(String value) {
            addCriterion("b_pillar_lh =", value, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhNotEqualTo(String value) {
            addCriterion("b_pillar_lh <>", value, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhGreaterThan(String value) {
            addCriterion("b_pillar_lh >", value, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhGreaterThanOrEqualTo(String value) {
            addCriterion("b_pillar_lh >=", value, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhLessThan(String value) {
            addCriterion("b_pillar_lh <", value, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhLessThanOrEqualTo(String value) {
            addCriterion("b_pillar_lh <=", value, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhLike(String value) {
            addCriterion("b_pillar_lh like", value, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhNotLike(String value) {
            addCriterion("b_pillar_lh not like", value, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhIn(List<String> values) {
            addCriterion("b_pillar_lh in", values, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhNotIn(List<String> values) {
            addCriterion("b_pillar_lh not in", values, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhBetween(String value1, String value2) {
            addCriterion("b_pillar_lh between", value1, value2, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andBPillarLhNotBetween(String value1, String value2) {
            addCriterion("b_pillar_lh not between", value1, value2, "bPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhIsNull() {
            addCriterion("c_pillar_rh is null");
            return (Criteria) this;
        }

        public Criteria andCPillarRhIsNotNull() {
            addCriterion("c_pillar_rh is not null");
            return (Criteria) this;
        }

        public Criteria andCPillarRhEqualTo(String value) {
            addCriterion("c_pillar_rh =", value, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhNotEqualTo(String value) {
            addCriterion("c_pillar_rh <>", value, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhGreaterThan(String value) {
            addCriterion("c_pillar_rh >", value, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhGreaterThanOrEqualTo(String value) {
            addCriterion("c_pillar_rh >=", value, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhLessThan(String value) {
            addCriterion("c_pillar_rh <", value, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhLessThanOrEqualTo(String value) {
            addCriterion("c_pillar_rh <=", value, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhLike(String value) {
            addCriterion("c_pillar_rh like", value, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhNotLike(String value) {
            addCriterion("c_pillar_rh not like", value, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhIn(List<String> values) {
            addCriterion("c_pillar_rh in", values, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhNotIn(List<String> values) {
            addCriterion("c_pillar_rh not in", values, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhBetween(String value1, String value2) {
            addCriterion("c_pillar_rh between", value1, value2, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarRhNotBetween(String value1, String value2) {
            addCriterion("c_pillar_rh not between", value1, value2, "cPillarRh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhIsNull() {
            addCriterion("c_pillar_lh is null");
            return (Criteria) this;
        }

        public Criteria andCPillarLhIsNotNull() {
            addCriterion("c_pillar_lh is not null");
            return (Criteria) this;
        }

        public Criteria andCPillarLhEqualTo(String value) {
            addCriterion("c_pillar_lh =", value, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhNotEqualTo(String value) {
            addCriterion("c_pillar_lh <>", value, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhGreaterThan(String value) {
            addCriterion("c_pillar_lh >", value, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhGreaterThanOrEqualTo(String value) {
            addCriterion("c_pillar_lh >=", value, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhLessThan(String value) {
            addCriterion("c_pillar_lh <", value, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhLessThanOrEqualTo(String value) {
            addCriterion("c_pillar_lh <=", value, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhLike(String value) {
            addCriterion("c_pillar_lh like", value, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhNotLike(String value) {
            addCriterion("c_pillar_lh not like", value, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhIn(List<String> values) {
            addCriterion("c_pillar_lh in", values, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhNotIn(List<String> values) {
            addCriterion("c_pillar_lh not in", values, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhBetween(String value1, String value2) {
            addCriterion("c_pillar_lh between", value1, value2, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCPillarLhNotBetween(String value1, String value2) {
            addCriterion("c_pillar_lh not between", value1, value2, "cPillarLh");
            return (Criteria) this;
        }

        public Criteria andCisternFrameIsNull() {
            addCriterion("cistern_frame is null");
            return (Criteria) this;
        }

        public Criteria andCisternFrameIsNotNull() {
            addCriterion("cistern_frame is not null");
            return (Criteria) this;
        }

        public Criteria andCisternFrameEqualTo(String value) {
            addCriterion("cistern_frame =", value, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameNotEqualTo(String value) {
            addCriterion("cistern_frame <>", value, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameGreaterThan(String value) {
            addCriterion("cistern_frame >", value, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameGreaterThanOrEqualTo(String value) {
            addCriterion("cistern_frame >=", value, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameLessThan(String value) {
            addCriterion("cistern_frame <", value, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameLessThanOrEqualTo(String value) {
            addCriterion("cistern_frame <=", value, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameLike(String value) {
            addCriterion("cistern_frame like", value, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameNotLike(String value) {
            addCriterion("cistern_frame not like", value, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameIn(List<String> values) {
            addCriterion("cistern_frame in", values, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameNotIn(List<String> values) {
            addCriterion("cistern_frame not in", values, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameBetween(String value1, String value2) {
            addCriterion("cistern_frame between", value1, value2, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andCisternFrameNotBetween(String value1, String value2) {
            addCriterion("cistern_frame not between", value1, value2, "cisternFrame");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamIsNull() {
            addCriterion("anticollision_deam is null");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamIsNotNull() {
            addCriterion("anticollision_deam is not null");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamEqualTo(String value) {
            addCriterion("anticollision_deam =", value, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamNotEqualTo(String value) {
            addCriterion("anticollision_deam <>", value, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamGreaterThan(String value) {
            addCriterion("anticollision_deam >", value, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamGreaterThanOrEqualTo(String value) {
            addCriterion("anticollision_deam >=", value, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamLessThan(String value) {
            addCriterion("anticollision_deam <", value, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamLessThanOrEqualTo(String value) {
            addCriterion("anticollision_deam <=", value, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamLike(String value) {
            addCriterion("anticollision_deam like", value, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamNotLike(String value) {
            addCriterion("anticollision_deam not like", value, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamIn(List<String> values) {
            addCriterion("anticollision_deam in", values, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamNotIn(List<String> values) {
            addCriterion("anticollision_deam not in", values, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamBetween(String value1, String value2) {
            addCriterion("anticollision_deam between", value1, value2, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamNotBetween(String value1, String value2) {
            addCriterion("anticollision_deam not between", value1, value2, "anticollisionDeam");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhIsNull() {
            addCriterion("front_longeron_lh is null");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhIsNotNull() {
            addCriterion("front_longeron_lh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhEqualTo(String value) {
            addCriterion("front_longeron_lh =", value, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhNotEqualTo(String value) {
            addCriterion("front_longeron_lh <>", value, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhGreaterThan(String value) {
            addCriterion("front_longeron_lh >", value, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhGreaterThanOrEqualTo(String value) {
            addCriterion("front_longeron_lh >=", value, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhLessThan(String value) {
            addCriterion("front_longeron_lh <", value, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhLessThanOrEqualTo(String value) {
            addCriterion("front_longeron_lh <=", value, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhLike(String value) {
            addCriterion("front_longeron_lh like", value, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhNotLike(String value) {
            addCriterion("front_longeron_lh not like", value, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhIn(List<String> values) {
            addCriterion("front_longeron_lh in", values, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhNotIn(List<String> values) {
            addCriterion("front_longeron_lh not in", values, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhBetween(String value1, String value2) {
            addCriterion("front_longeron_lh between", value1, value2, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronLhNotBetween(String value1, String value2) {
            addCriterion("front_longeron_lh not between", value1, value2, "frontLongeronLh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhIsNull() {
            addCriterion("front_longeron_rh is null");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhIsNotNull() {
            addCriterion("front_longeron_rh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhEqualTo(String value) {
            addCriterion("front_longeron_rh =", value, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhNotEqualTo(String value) {
            addCriterion("front_longeron_rh <>", value, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhGreaterThan(String value) {
            addCriterion("front_longeron_rh >", value, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhGreaterThanOrEqualTo(String value) {
            addCriterion("front_longeron_rh >=", value, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhLessThan(String value) {
            addCriterion("front_longeron_rh <", value, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhLessThanOrEqualTo(String value) {
            addCriterion("front_longeron_rh <=", value, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhLike(String value) {
            addCriterion("front_longeron_rh like", value, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhNotLike(String value) {
            addCriterion("front_longeron_rh not like", value, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhIn(List<String> values) {
            addCriterion("front_longeron_rh in", values, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhNotIn(List<String> values) {
            addCriterion("front_longeron_rh not in", values, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhBetween(String value1, String value2) {
            addCriterion("front_longeron_rh between", value1, value2, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontLongeronRhNotBetween(String value1, String value2) {
            addCriterion("front_longeron_rh not between", value1, value2, "frontLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhIsNull() {
            addCriterion("rear_longeron_lh is null");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhIsNotNull() {
            addCriterion("rear_longeron_lh is not null");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhEqualTo(String value) {
            addCriterion("rear_longeron_lh =", value, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhNotEqualTo(String value) {
            addCriterion("rear_longeron_lh <>", value, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhGreaterThan(String value) {
            addCriterion("rear_longeron_lh >", value, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_longeron_lh >=", value, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhLessThan(String value) {
            addCriterion("rear_longeron_lh <", value, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhLessThanOrEqualTo(String value) {
            addCriterion("rear_longeron_lh <=", value, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhLike(String value) {
            addCriterion("rear_longeron_lh like", value, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhNotLike(String value) {
            addCriterion("rear_longeron_lh not like", value, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhIn(List<String> values) {
            addCriterion("rear_longeron_lh in", values, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhNotIn(List<String> values) {
            addCriterion("rear_longeron_lh not in", values, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhBetween(String value1, String value2) {
            addCriterion("rear_longeron_lh between", value1, value2, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronLhNotBetween(String value1, String value2) {
            addCriterion("rear_longeron_lh not between", value1, value2, "rearLongeronLh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhIsNull() {
            addCriterion("rear_longeron_rh is null");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhIsNotNull() {
            addCriterion("rear_longeron_rh is not null");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhEqualTo(String value) {
            addCriterion("rear_longeron_rh =", value, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhNotEqualTo(String value) {
            addCriterion("rear_longeron_rh <>", value, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhGreaterThan(String value) {
            addCriterion("rear_longeron_rh >", value, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_longeron_rh >=", value, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhLessThan(String value) {
            addCriterion("rear_longeron_rh <", value, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhLessThanOrEqualTo(String value) {
            addCriterion("rear_longeron_rh <=", value, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhLike(String value) {
            addCriterion("rear_longeron_rh like", value, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhNotLike(String value) {
            addCriterion("rear_longeron_rh not like", value, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhIn(List<String> values) {
            addCriterion("rear_longeron_rh in", values, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhNotIn(List<String> values) {
            addCriterion("rear_longeron_rh not in", values, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhBetween(String value1, String value2) {
            addCriterion("rear_longeron_rh between", value1, value2, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andRearLongeronRhNotBetween(String value1, String value2) {
            addCriterion("rear_longeron_rh not between", value1, value2, "rearLongeronRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhIsNull() {
            addCriterion("front_panel_lh is null");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhIsNotNull() {
            addCriterion("front_panel_lh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhEqualTo(String value) {
            addCriterion("front_panel_lh =", value, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhNotEqualTo(String value) {
            addCriterion("front_panel_lh <>", value, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhGreaterThan(String value) {
            addCriterion("front_panel_lh >", value, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhGreaterThanOrEqualTo(String value) {
            addCriterion("front_panel_lh >=", value, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhLessThan(String value) {
            addCriterion("front_panel_lh <", value, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhLessThanOrEqualTo(String value) {
            addCriterion("front_panel_lh <=", value, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhLike(String value) {
            addCriterion("front_panel_lh like", value, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhNotLike(String value) {
            addCriterion("front_panel_lh not like", value, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhIn(List<String> values) {
            addCriterion("front_panel_lh in", values, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhNotIn(List<String> values) {
            addCriterion("front_panel_lh not in", values, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhBetween(String value1, String value2) {
            addCriterion("front_panel_lh between", value1, value2, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelLhNotBetween(String value1, String value2) {
            addCriterion("front_panel_lh not between", value1, value2, "frontPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhIsNull() {
            addCriterion("front_panel_rh is null");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhIsNotNull() {
            addCriterion("front_panel_rh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhEqualTo(String value) {
            addCriterion("front_panel_rh =", value, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhNotEqualTo(String value) {
            addCriterion("front_panel_rh <>", value, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhGreaterThan(String value) {
            addCriterion("front_panel_rh >", value, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhGreaterThanOrEqualTo(String value) {
            addCriterion("front_panel_rh >=", value, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhLessThan(String value) {
            addCriterion("front_panel_rh <", value, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhLessThanOrEqualTo(String value) {
            addCriterion("front_panel_rh <=", value, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhLike(String value) {
            addCriterion("front_panel_rh like", value, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhNotLike(String value) {
            addCriterion("front_panel_rh not like", value, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhIn(List<String> values) {
            addCriterion("front_panel_rh in", values, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhNotIn(List<String> values) {
            addCriterion("front_panel_rh not in", values, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhBetween(String value1, String value2) {
            addCriterion("front_panel_rh between", value1, value2, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontPanelRhNotBetween(String value1, String value2) {
            addCriterion("front_panel_rh not between", value1, value2, "frontPanelRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhIsNull() {
            addCriterion("front_absorber_bearing_lh is null");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhIsNotNull() {
            addCriterion("front_absorber_bearing_lh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhEqualTo(String value) {
            addCriterion("front_absorber_bearing_lh =", value, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhNotEqualTo(String value) {
            addCriterion("front_absorber_bearing_lh <>", value, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhGreaterThan(String value) {
            addCriterion("front_absorber_bearing_lh >", value, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhGreaterThanOrEqualTo(String value) {
            addCriterion("front_absorber_bearing_lh >=", value, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhLessThan(String value) {
            addCriterion("front_absorber_bearing_lh <", value, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhLessThanOrEqualTo(String value) {
            addCriterion("front_absorber_bearing_lh <=", value, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhLike(String value) {
            addCriterion("front_absorber_bearing_lh like", value, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhNotLike(String value) {
            addCriterion("front_absorber_bearing_lh not like", value, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhIn(List<String> values) {
            addCriterion("front_absorber_bearing_lh in", values, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhNotIn(List<String> values) {
            addCriterion("front_absorber_bearing_lh not in", values, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhBetween(String value1, String value2) {
            addCriterion("front_absorber_bearing_lh between", value1, value2, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingLhNotBetween(String value1, String value2) {
            addCriterion("front_absorber_bearing_lh not between", value1, value2, "frontAbsorberBearingLh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhIsNull() {
            addCriterion("front_absorber_bearing_rh is null");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhIsNotNull() {
            addCriterion("front_absorber_bearing_rh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhEqualTo(String value) {
            addCriterion("front_absorber_bearing_rh =", value, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhNotEqualTo(String value) {
            addCriterion("front_absorber_bearing_rh <>", value, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhGreaterThan(String value) {
            addCriterion("front_absorber_bearing_rh >", value, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhGreaterThanOrEqualTo(String value) {
            addCriterion("front_absorber_bearing_rh >=", value, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhLessThan(String value) {
            addCriterion("front_absorber_bearing_rh <", value, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhLessThanOrEqualTo(String value) {
            addCriterion("front_absorber_bearing_rh <=", value, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhLike(String value) {
            addCriterion("front_absorber_bearing_rh like", value, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhNotLike(String value) {
            addCriterion("front_absorber_bearing_rh not like", value, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhIn(List<String> values) {
            addCriterion("front_absorber_bearing_rh in", values, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhNotIn(List<String> values) {
            addCriterion("front_absorber_bearing_rh not in", values, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhBetween(String value1, String value2) {
            addCriterion("front_absorber_bearing_rh between", value1, value2, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFrontAbsorberBearingRhNotBetween(String value1, String value2) {
            addCriterion("front_absorber_bearing_rh not between", value1, value2, "frontAbsorberBearingRh");
            return (Criteria) this;
        }

        public Criteria andFirewallIsNull() {
            addCriterion("firewall is null");
            return (Criteria) this;
        }

        public Criteria andFirewallIsNotNull() {
            addCriterion("firewall is not null");
            return (Criteria) this;
        }

        public Criteria andFirewallEqualTo(String value) {
            addCriterion("firewall =", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallNotEqualTo(String value) {
            addCriterion("firewall <>", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallGreaterThan(String value) {
            addCriterion("firewall >", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallGreaterThanOrEqualTo(String value) {
            addCriterion("firewall >=", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallLessThan(String value) {
            addCriterion("firewall <", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallLessThanOrEqualTo(String value) {
            addCriterion("firewall <=", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallLike(String value) {
            addCriterion("firewall like", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallNotLike(String value) {
            addCriterion("firewall not like", value, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallIn(List<String> values) {
            addCriterion("firewall in", values, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallNotIn(List<String> values) {
            addCriterion("firewall not in", values, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallBetween(String value1, String value2) {
            addCriterion("firewall between", value1, value2, "firewall");
            return (Criteria) this;
        }

        public Criteria andFirewallNotBetween(String value1, String value2) {
            addCriterion("firewall not between", value1, value2, "firewall");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearIsNull() {
            addCriterion("anticollision_deam_rear is null");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearIsNotNull() {
            addCriterion("anticollision_deam_rear is not null");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearEqualTo(String value) {
            addCriterion("anticollision_deam_rear =", value, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearNotEqualTo(String value) {
            addCriterion("anticollision_deam_rear <>", value, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearGreaterThan(String value) {
            addCriterion("anticollision_deam_rear >", value, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearGreaterThanOrEqualTo(String value) {
            addCriterion("anticollision_deam_rear >=", value, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearLessThan(String value) {
            addCriterion("anticollision_deam_rear <", value, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearLessThanOrEqualTo(String value) {
            addCriterion("anticollision_deam_rear <=", value, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearLike(String value) {
            addCriterion("anticollision_deam_rear like", value, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearNotLike(String value) {
            addCriterion("anticollision_deam_rear not like", value, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearIn(List<String> values) {
            addCriterion("anticollision_deam_rear in", values, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearNotIn(List<String> values) {
            addCriterion("anticollision_deam_rear not in", values, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearBetween(String value1, String value2) {
            addCriterion("anticollision_deam_rear between", value1, value2, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andAnticollisionDeamRearNotBetween(String value1, String value2) {
            addCriterion("anticollision_deam_rear not between", value1, value2, "anticollisionDeamRear");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeIsNull() {
            addCriterion("spare_wheel_mulde is null");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeIsNotNull() {
            addCriterion("spare_wheel_mulde is not null");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeEqualTo(String value) {
            addCriterion("spare_wheel_mulde =", value, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeNotEqualTo(String value) {
            addCriterion("spare_wheel_mulde <>", value, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeGreaterThan(String value) {
            addCriterion("spare_wheel_mulde >", value, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeGreaterThanOrEqualTo(String value) {
            addCriterion("spare_wheel_mulde >=", value, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeLessThan(String value) {
            addCriterion("spare_wheel_mulde <", value, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeLessThanOrEqualTo(String value) {
            addCriterion("spare_wheel_mulde <=", value, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeLike(String value) {
            addCriterion("spare_wheel_mulde like", value, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeNotLike(String value) {
            addCriterion("spare_wheel_mulde not like", value, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeIn(List<String> values) {
            addCriterion("spare_wheel_mulde in", values, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeNotIn(List<String> values) {
            addCriterion("spare_wheel_mulde not in", values, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeBetween(String value1, String value2) {
            addCriterion("spare_wheel_mulde between", value1, value2, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andSpareWheelMuldeNotBetween(String value1, String value2) {
            addCriterion("spare_wheel_mulde not between", value1, value2, "spareWheelMulde");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhIsNull() {
            addCriterion("rear_water_channel_lh is null");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhIsNotNull() {
            addCriterion("rear_water_channel_lh is not null");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhEqualTo(String value) {
            addCriterion("rear_water_channel_lh =", value, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhNotEqualTo(String value) {
            addCriterion("rear_water_channel_lh <>", value, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhGreaterThan(String value) {
            addCriterion("rear_water_channel_lh >", value, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_water_channel_lh >=", value, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhLessThan(String value) {
            addCriterion("rear_water_channel_lh <", value, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhLessThanOrEqualTo(String value) {
            addCriterion("rear_water_channel_lh <=", value, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhLike(String value) {
            addCriterion("rear_water_channel_lh like", value, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhNotLike(String value) {
            addCriterion("rear_water_channel_lh not like", value, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhIn(List<String> values) {
            addCriterion("rear_water_channel_lh in", values, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhNotIn(List<String> values) {
            addCriterion("rear_water_channel_lh not in", values, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhBetween(String value1, String value2) {
            addCriterion("rear_water_channel_lh between", value1, value2, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelLhNotBetween(String value1, String value2) {
            addCriterion("rear_water_channel_lh not between", value1, value2, "rearWaterChannelLh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhIsNull() {
            addCriterion("rear_water_channel_rh is null");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhIsNotNull() {
            addCriterion("rear_water_channel_rh is not null");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhEqualTo(String value) {
            addCriterion("rear_water_channel_rh =", value, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhNotEqualTo(String value) {
            addCriterion("rear_water_channel_rh <>", value, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhGreaterThan(String value) {
            addCriterion("rear_water_channel_rh >", value, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_water_channel_rh >=", value, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhLessThan(String value) {
            addCriterion("rear_water_channel_rh <", value, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhLessThanOrEqualTo(String value) {
            addCriterion("rear_water_channel_rh <=", value, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhLike(String value) {
            addCriterion("rear_water_channel_rh like", value, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhNotLike(String value) {
            addCriterion("rear_water_channel_rh not like", value, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhIn(List<String> values) {
            addCriterion("rear_water_channel_rh in", values, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhNotIn(List<String> values) {
            addCriterion("rear_water_channel_rh not in", values, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhBetween(String value1, String value2) {
            addCriterion("rear_water_channel_rh between", value1, value2, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andRearWaterChannelRhNotBetween(String value1, String value2) {
            addCriterion("rear_water_channel_rh not between", value1, value2, "rearWaterChannelRh");
            return (Criteria) this;
        }

        public Criteria andBackPanelIsNull() {
            addCriterion("back_panel is null");
            return (Criteria) this;
        }

        public Criteria andBackPanelIsNotNull() {
            addCriterion("back_panel is not null");
            return (Criteria) this;
        }

        public Criteria andBackPanelEqualTo(String value) {
            addCriterion("back_panel =", value, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelNotEqualTo(String value) {
            addCriterion("back_panel <>", value, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelGreaterThan(String value) {
            addCriterion("back_panel >", value, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelGreaterThanOrEqualTo(String value) {
            addCriterion("back_panel >=", value, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelLessThan(String value) {
            addCriterion("back_panel <", value, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelLessThanOrEqualTo(String value) {
            addCriterion("back_panel <=", value, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelLike(String value) {
            addCriterion("back_panel like", value, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelNotLike(String value) {
            addCriterion("back_panel not like", value, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelIn(List<String> values) {
            addCriterion("back_panel in", values, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelNotIn(List<String> values) {
            addCriterion("back_panel not in", values, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelBetween(String value1, String value2) {
            addCriterion("back_panel between", value1, value2, "backPanel");
            return (Criteria) this;
        }

        public Criteria andBackPanelNotBetween(String value1, String value2) {
            addCriterion("back_panel not between", value1, value2, "backPanel");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2IsNull() {
            addCriterion("a_pillar_rh2 is null");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2IsNotNull() {
            addCriterion("a_pillar_rh2 is not null");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2EqualTo(String value) {
            addCriterion("a_pillar_rh2 =", value, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2NotEqualTo(String value) {
            addCriterion("a_pillar_rh2 <>", value, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2GreaterThan(String value) {
            addCriterion("a_pillar_rh2 >", value, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2GreaterThanOrEqualTo(String value) {
            addCriterion("a_pillar_rh2 >=", value, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2LessThan(String value) {
            addCriterion("a_pillar_rh2 <", value, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2LessThanOrEqualTo(String value) {
            addCriterion("a_pillar_rh2 <=", value, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2Like(String value) {
            addCriterion("a_pillar_rh2 like", value, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2NotLike(String value) {
            addCriterion("a_pillar_rh2 not like", value, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2In(List<String> values) {
            addCriterion("a_pillar_rh2 in", values, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2NotIn(List<String> values) {
            addCriterion("a_pillar_rh2 not in", values, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2Between(String value1, String value2) {
            addCriterion("a_pillar_rh2 between", value1, value2, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarRh2NotBetween(String value1, String value2) {
            addCriterion("a_pillar_rh2 not between", value1, value2, "aPillarRh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2IsNull() {
            addCriterion("a_pillar_lh2 is null");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2IsNotNull() {
            addCriterion("a_pillar_lh2 is not null");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2EqualTo(String value) {
            addCriterion("a_pillar_lh2 =", value, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2NotEqualTo(String value) {
            addCriterion("a_pillar_lh2 <>", value, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2GreaterThan(String value) {
            addCriterion("a_pillar_lh2 >", value, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2GreaterThanOrEqualTo(String value) {
            addCriterion("a_pillar_lh2 >=", value, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2LessThan(String value) {
            addCriterion("a_pillar_lh2 <", value, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2LessThanOrEqualTo(String value) {
            addCriterion("a_pillar_lh2 <=", value, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2Like(String value) {
            addCriterion("a_pillar_lh2 like", value, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2NotLike(String value) {
            addCriterion("a_pillar_lh2 not like", value, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2In(List<String> values) {
            addCriterion("a_pillar_lh2 in", values, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2NotIn(List<String> values) {
            addCriterion("a_pillar_lh2 not in", values, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2Between(String value1, String value2) {
            addCriterion("a_pillar_lh2 between", value1, value2, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andAPillarLh2NotBetween(String value1, String value2) {
            addCriterion("a_pillar_lh2 not between", value1, value2, "aPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2IsNull() {
            addCriterion("b_pillar_rh2 is null");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2IsNotNull() {
            addCriterion("b_pillar_rh2 is not null");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2EqualTo(String value) {
            addCriterion("b_pillar_rh2 =", value, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2NotEqualTo(String value) {
            addCriterion("b_pillar_rh2 <>", value, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2GreaterThan(String value) {
            addCriterion("b_pillar_rh2 >", value, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2GreaterThanOrEqualTo(String value) {
            addCriterion("b_pillar_rh2 >=", value, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2LessThan(String value) {
            addCriterion("b_pillar_rh2 <", value, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2LessThanOrEqualTo(String value) {
            addCriterion("b_pillar_rh2 <=", value, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2Like(String value) {
            addCriterion("b_pillar_rh2 like", value, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2NotLike(String value) {
            addCriterion("b_pillar_rh2 not like", value, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2In(List<String> values) {
            addCriterion("b_pillar_rh2 in", values, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2NotIn(List<String> values) {
            addCriterion("b_pillar_rh2 not in", values, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2Between(String value1, String value2) {
            addCriterion("b_pillar_rh2 between", value1, value2, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarRh2NotBetween(String value1, String value2) {
            addCriterion("b_pillar_rh2 not between", value1, value2, "bPillarRh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2IsNull() {
            addCriterion("b_pillar_lh2 is null");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2IsNotNull() {
            addCriterion("b_pillar_lh2 is not null");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2EqualTo(String value) {
            addCriterion("b_pillar_lh2 =", value, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2NotEqualTo(String value) {
            addCriterion("b_pillar_lh2 <>", value, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2GreaterThan(String value) {
            addCriterion("b_pillar_lh2 >", value, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2GreaterThanOrEqualTo(String value) {
            addCriterion("b_pillar_lh2 >=", value, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2LessThan(String value) {
            addCriterion("b_pillar_lh2 <", value, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2LessThanOrEqualTo(String value) {
            addCriterion("b_pillar_lh2 <=", value, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2Like(String value) {
            addCriterion("b_pillar_lh2 like", value, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2NotLike(String value) {
            addCriterion("b_pillar_lh2 not like", value, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2In(List<String> values) {
            addCriterion("b_pillar_lh2 in", values, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2NotIn(List<String> values) {
            addCriterion("b_pillar_lh2 not in", values, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2Between(String value1, String value2) {
            addCriterion("b_pillar_lh2 between", value1, value2, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andBPillarLh2NotBetween(String value1, String value2) {
            addCriterion("b_pillar_lh2 not between", value1, value2, "bPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2IsNull() {
            addCriterion("c_pillar_rh2 is null");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2IsNotNull() {
            addCriterion("c_pillar_rh2 is not null");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2EqualTo(String value) {
            addCriterion("c_pillar_rh2 =", value, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2NotEqualTo(String value) {
            addCriterion("c_pillar_rh2 <>", value, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2GreaterThan(String value) {
            addCriterion("c_pillar_rh2 >", value, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2GreaterThanOrEqualTo(String value) {
            addCriterion("c_pillar_rh2 >=", value, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2LessThan(String value) {
            addCriterion("c_pillar_rh2 <", value, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2LessThanOrEqualTo(String value) {
            addCriterion("c_pillar_rh2 <=", value, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2Like(String value) {
            addCriterion("c_pillar_rh2 like", value, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2NotLike(String value) {
            addCriterion("c_pillar_rh2 not like", value, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2In(List<String> values) {
            addCriterion("c_pillar_rh2 in", values, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2NotIn(List<String> values) {
            addCriterion("c_pillar_rh2 not in", values, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2Between(String value1, String value2) {
            addCriterion("c_pillar_rh2 between", value1, value2, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarRh2NotBetween(String value1, String value2) {
            addCriterion("c_pillar_rh2 not between", value1, value2, "cPillarRh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2IsNull() {
            addCriterion("c_pillar_lh2 is null");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2IsNotNull() {
            addCriterion("c_pillar_lh2 is not null");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2EqualTo(String value) {
            addCriterion("c_pillar_lh2 =", value, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2NotEqualTo(String value) {
            addCriterion("c_pillar_lh2 <>", value, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2GreaterThan(String value) {
            addCriterion("c_pillar_lh2 >", value, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2GreaterThanOrEqualTo(String value) {
            addCriterion("c_pillar_lh2 >=", value, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2LessThan(String value) {
            addCriterion("c_pillar_lh2 <", value, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2LessThanOrEqualTo(String value) {
            addCriterion("c_pillar_lh2 <=", value, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2Like(String value) {
            addCriterion("c_pillar_lh2 like", value, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2NotLike(String value) {
            addCriterion("c_pillar_lh2 not like", value, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2In(List<String> values) {
            addCriterion("c_pillar_lh2 in", values, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2NotIn(List<String> values) {
            addCriterion("c_pillar_lh2 not in", values, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2Between(String value1, String value2) {
            addCriterion("c_pillar_lh2 between", value1, value2, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andCPillarLh2NotBetween(String value1, String value2) {
            addCriterion("c_pillar_lh2 not between", value1, value2, "cPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2IsNull() {
            addCriterion("d_pillar_rh2 is null");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2IsNotNull() {
            addCriterion("d_pillar_rh2 is not null");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2EqualTo(String value) {
            addCriterion("d_pillar_rh2 =", value, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2NotEqualTo(String value) {
            addCriterion("d_pillar_rh2 <>", value, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2GreaterThan(String value) {
            addCriterion("d_pillar_rh2 >", value, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2GreaterThanOrEqualTo(String value) {
            addCriterion("d_pillar_rh2 >=", value, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2LessThan(String value) {
            addCriterion("d_pillar_rh2 <", value, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2LessThanOrEqualTo(String value) {
            addCriterion("d_pillar_rh2 <=", value, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2Like(String value) {
            addCriterion("d_pillar_rh2 like", value, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2NotLike(String value) {
            addCriterion("d_pillar_rh2 not like", value, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2In(List<String> values) {
            addCriterion("d_pillar_rh2 in", values, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2NotIn(List<String> values) {
            addCriterion("d_pillar_rh2 not in", values, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2Between(String value1, String value2) {
            addCriterion("d_pillar_rh2 between", value1, value2, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarRh2NotBetween(String value1, String value2) {
            addCriterion("d_pillar_rh2 not between", value1, value2, "dPillarRh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2IsNull() {
            addCriterion("d_pillar_lh2 is null");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2IsNotNull() {
            addCriterion("d_pillar_lh2 is not null");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2EqualTo(String value) {
            addCriterion("d_pillar_lh2 =", value, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2NotEqualTo(String value) {
            addCriterion("d_pillar_lh2 <>", value, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2GreaterThan(String value) {
            addCriterion("d_pillar_lh2 >", value, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2GreaterThanOrEqualTo(String value) {
            addCriterion("d_pillar_lh2 >=", value, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2LessThan(String value) {
            addCriterion("d_pillar_lh2 <", value, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2LessThanOrEqualTo(String value) {
            addCriterion("d_pillar_lh2 <=", value, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2Like(String value) {
            addCriterion("d_pillar_lh2 like", value, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2NotLike(String value) {
            addCriterion("d_pillar_lh2 not like", value, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2In(List<String> values) {
            addCriterion("d_pillar_lh2 in", values, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2NotIn(List<String> values) {
            addCriterion("d_pillar_lh2 not in", values, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2Between(String value1, String value2) {
            addCriterion("d_pillar_lh2 between", value1, value2, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andDPillarLh2NotBetween(String value1, String value2) {
            addCriterion("d_pillar_lh2 not between", value1, value2, "dPillarLh2");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhIsNull() {
            addCriterion("top_beam_rh is null");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhIsNotNull() {
            addCriterion("top_beam_rh is not null");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhEqualTo(String value) {
            addCriterion("top_beam_rh =", value, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhNotEqualTo(String value) {
            addCriterion("top_beam_rh <>", value, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhGreaterThan(String value) {
            addCriterion("top_beam_rh >", value, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhGreaterThanOrEqualTo(String value) {
            addCriterion("top_beam_rh >=", value, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhLessThan(String value) {
            addCriterion("top_beam_rh <", value, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhLessThanOrEqualTo(String value) {
            addCriterion("top_beam_rh <=", value, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhLike(String value) {
            addCriterion("top_beam_rh like", value, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhNotLike(String value) {
            addCriterion("top_beam_rh not like", value, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhIn(List<String> values) {
            addCriterion("top_beam_rh in", values, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhNotIn(List<String> values) {
            addCriterion("top_beam_rh not in", values, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhBetween(String value1, String value2) {
            addCriterion("top_beam_rh between", value1, value2, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamRhNotBetween(String value1, String value2) {
            addCriterion("top_beam_rh not between", value1, value2, "topBeamRh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhIsNull() {
            addCriterion("top_beam_lh is null");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhIsNotNull() {
            addCriterion("top_beam_lh is not null");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhEqualTo(String value) {
            addCriterion("top_beam_lh =", value, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhNotEqualTo(String value) {
            addCriterion("top_beam_lh <>", value, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhGreaterThan(String value) {
            addCriterion("top_beam_lh >", value, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhGreaterThanOrEqualTo(String value) {
            addCriterion("top_beam_lh >=", value, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhLessThan(String value) {
            addCriterion("top_beam_lh <", value, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhLessThanOrEqualTo(String value) {
            addCriterion("top_beam_lh <=", value, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhLike(String value) {
            addCriterion("top_beam_lh like", value, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhNotLike(String value) {
            addCriterion("top_beam_lh not like", value, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhIn(List<String> values) {
            addCriterion("top_beam_lh in", values, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhNotIn(List<String> values) {
            addCriterion("top_beam_lh not in", values, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhBetween(String value1, String value2) {
            addCriterion("top_beam_lh between", value1, value2, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andTopBeamLhNotBetween(String value1, String value2) {
            addCriterion("top_beam_lh not between", value1, value2, "topBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhIsNull() {
            addCriterion("bottom_beam_rh is null");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhIsNotNull() {
            addCriterion("bottom_beam_rh is not null");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhEqualTo(String value) {
            addCriterion("bottom_beam_rh =", value, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhNotEqualTo(String value) {
            addCriterion("bottom_beam_rh <>", value, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhGreaterThan(String value) {
            addCriterion("bottom_beam_rh >", value, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhGreaterThanOrEqualTo(String value) {
            addCriterion("bottom_beam_rh >=", value, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhLessThan(String value) {
            addCriterion("bottom_beam_rh <", value, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhLessThanOrEqualTo(String value) {
            addCriterion("bottom_beam_rh <=", value, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhLike(String value) {
            addCriterion("bottom_beam_rh like", value, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhNotLike(String value) {
            addCriterion("bottom_beam_rh not like", value, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhIn(List<String> values) {
            addCriterion("bottom_beam_rh in", values, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhNotIn(List<String> values) {
            addCriterion("bottom_beam_rh not in", values, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhBetween(String value1, String value2) {
            addCriterion("bottom_beam_rh between", value1, value2, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamRhNotBetween(String value1, String value2) {
            addCriterion("bottom_beam_rh not between", value1, value2, "bottomBeamRh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhIsNull() {
            addCriterion("bottom_beam_lh is null");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhIsNotNull() {
            addCriterion("bottom_beam_lh is not null");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhEqualTo(String value) {
            addCriterion("bottom_beam_lh =", value, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhNotEqualTo(String value) {
            addCriterion("bottom_beam_lh <>", value, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhGreaterThan(String value) {
            addCriterion("bottom_beam_lh >", value, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhGreaterThanOrEqualTo(String value) {
            addCriterion("bottom_beam_lh >=", value, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhLessThan(String value) {
            addCriterion("bottom_beam_lh <", value, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhLessThanOrEqualTo(String value) {
            addCriterion("bottom_beam_lh <=", value, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhLike(String value) {
            addCriterion("bottom_beam_lh like", value, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhNotLike(String value) {
            addCriterion("bottom_beam_lh not like", value, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhIn(List<String> values) {
            addCriterion("bottom_beam_lh in", values, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhNotIn(List<String> values) {
            addCriterion("bottom_beam_lh not in", values, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhBetween(String value1, String value2) {
            addCriterion("bottom_beam_lh between", value1, value2, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andBottomBeamLhNotBetween(String value1, String value2) {
            addCriterion("bottom_beam_lh not between", value1, value2, "bottomBeamLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhIsNull() {
            addCriterion("rear_panel_rh is null");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhIsNotNull() {
            addCriterion("rear_panel_rh is not null");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhEqualTo(String value) {
            addCriterion("rear_panel_rh =", value, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhNotEqualTo(String value) {
            addCriterion("rear_panel_rh <>", value, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhGreaterThan(String value) {
            addCriterion("rear_panel_rh >", value, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_panel_rh >=", value, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhLessThan(String value) {
            addCriterion("rear_panel_rh <", value, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhLessThanOrEqualTo(String value) {
            addCriterion("rear_panel_rh <=", value, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhLike(String value) {
            addCriterion("rear_panel_rh like", value, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhNotLike(String value) {
            addCriterion("rear_panel_rh not like", value, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhIn(List<String> values) {
            addCriterion("rear_panel_rh in", values, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhNotIn(List<String> values) {
            addCriterion("rear_panel_rh not in", values, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhBetween(String value1, String value2) {
            addCriterion("rear_panel_rh between", value1, value2, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelRhNotBetween(String value1, String value2) {
            addCriterion("rear_panel_rh not between", value1, value2, "rearPanelRh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhIsNull() {
            addCriterion("rear_panel_lh is null");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhIsNotNull() {
            addCriterion("rear_panel_lh is not null");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhEqualTo(String value) {
            addCriterion("rear_panel_lh =", value, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhNotEqualTo(String value) {
            addCriterion("rear_panel_lh <>", value, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhGreaterThan(String value) {
            addCriterion("rear_panel_lh >", value, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_panel_lh >=", value, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhLessThan(String value) {
            addCriterion("rear_panel_lh <", value, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhLessThanOrEqualTo(String value) {
            addCriterion("rear_panel_lh <=", value, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhLike(String value) {
            addCriterion("rear_panel_lh like", value, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhNotLike(String value) {
            addCriterion("rear_panel_lh not like", value, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhIn(List<String> values) {
            addCriterion("rear_panel_lh in", values, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhNotIn(List<String> values) {
            addCriterion("rear_panel_lh not in", values, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhBetween(String value1, String value2) {
            addCriterion("rear_panel_lh between", value1, value2, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andRearPanelLhNotBetween(String value1, String value2) {
            addCriterion("rear_panel_lh not between", value1, value2, "rearPanelLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhIsNull() {
            addCriterion("front_hinge_bracket_rh is null");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhIsNotNull() {
            addCriterion("front_hinge_bracket_rh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhEqualTo(String value) {
            addCriterion("front_hinge_bracket_rh =", value, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhNotEqualTo(String value) {
            addCriterion("front_hinge_bracket_rh <>", value, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhGreaterThan(String value) {
            addCriterion("front_hinge_bracket_rh >", value, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhGreaterThanOrEqualTo(String value) {
            addCriterion("front_hinge_bracket_rh >=", value, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhLessThan(String value) {
            addCriterion("front_hinge_bracket_rh <", value, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhLessThanOrEqualTo(String value) {
            addCriterion("front_hinge_bracket_rh <=", value, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhLike(String value) {
            addCriterion("front_hinge_bracket_rh like", value, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhNotLike(String value) {
            addCriterion("front_hinge_bracket_rh not like", value, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhIn(List<String> values) {
            addCriterion("front_hinge_bracket_rh in", values, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhNotIn(List<String> values) {
            addCriterion("front_hinge_bracket_rh not in", values, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhBetween(String value1, String value2) {
            addCriterion("front_hinge_bracket_rh between", value1, value2, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketRhNotBetween(String value1, String value2) {
            addCriterion("front_hinge_bracket_rh not between", value1, value2, "frontHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhIsNull() {
            addCriterion("front_hinge_bracket_lh is null");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhIsNotNull() {
            addCriterion("front_hinge_bracket_lh is not null");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhEqualTo(String value) {
            addCriterion("front_hinge_bracket_lh =", value, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhNotEqualTo(String value) {
            addCriterion("front_hinge_bracket_lh <>", value, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhGreaterThan(String value) {
            addCriterion("front_hinge_bracket_lh >", value, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhGreaterThanOrEqualTo(String value) {
            addCriterion("front_hinge_bracket_lh >=", value, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhLessThan(String value) {
            addCriterion("front_hinge_bracket_lh <", value, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhLessThanOrEqualTo(String value) {
            addCriterion("front_hinge_bracket_lh <=", value, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhLike(String value) {
            addCriterion("front_hinge_bracket_lh like", value, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhNotLike(String value) {
            addCriterion("front_hinge_bracket_lh not like", value, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhIn(List<String> values) {
            addCriterion("front_hinge_bracket_lh in", values, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhNotIn(List<String> values) {
            addCriterion("front_hinge_bracket_lh not in", values, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhBetween(String value1, String value2) {
            addCriterion("front_hinge_bracket_lh between", value1, value2, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andFrontHingeBracketLhNotBetween(String value1, String value2) {
            addCriterion("front_hinge_bracket_lh not between", value1, value2, "frontHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhIsNull() {
            addCriterion("rear_hinge_bracket_rh is null");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhIsNotNull() {
            addCriterion("rear_hinge_bracket_rh is not null");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhEqualTo(String value) {
            addCriterion("rear_hinge_bracket_rh =", value, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhNotEqualTo(String value) {
            addCriterion("rear_hinge_bracket_rh <>", value, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhGreaterThan(String value) {
            addCriterion("rear_hinge_bracket_rh >", value, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_hinge_bracket_rh >=", value, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhLessThan(String value) {
            addCriterion("rear_hinge_bracket_rh <", value, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhLessThanOrEqualTo(String value) {
            addCriterion("rear_hinge_bracket_rh <=", value, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhLike(String value) {
            addCriterion("rear_hinge_bracket_rh like", value, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhNotLike(String value) {
            addCriterion("rear_hinge_bracket_rh not like", value, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhIn(List<String> values) {
            addCriterion("rear_hinge_bracket_rh in", values, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhNotIn(List<String> values) {
            addCriterion("rear_hinge_bracket_rh not in", values, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhBetween(String value1, String value2) {
            addCriterion("rear_hinge_bracket_rh between", value1, value2, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketRhNotBetween(String value1, String value2) {
            addCriterion("rear_hinge_bracket_rh not between", value1, value2, "rearHingeBracketRh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhIsNull() {
            addCriterion("rear_hinge_bracket_lh is null");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhIsNotNull() {
            addCriterion("rear_hinge_bracket_lh is not null");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhEqualTo(String value) {
            addCriterion("rear_hinge_bracket_lh =", value, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhNotEqualTo(String value) {
            addCriterion("rear_hinge_bracket_lh <>", value, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhGreaterThan(String value) {
            addCriterion("rear_hinge_bracket_lh >", value, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhGreaterThanOrEqualTo(String value) {
            addCriterion("rear_hinge_bracket_lh >=", value, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhLessThan(String value) {
            addCriterion("rear_hinge_bracket_lh <", value, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhLessThanOrEqualTo(String value) {
            addCriterion("rear_hinge_bracket_lh <=", value, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhLike(String value) {
            addCriterion("rear_hinge_bracket_lh like", value, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhNotLike(String value) {
            addCriterion("rear_hinge_bracket_lh not like", value, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhIn(List<String> values) {
            addCriterion("rear_hinge_bracket_lh in", values, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhNotIn(List<String> values) {
            addCriterion("rear_hinge_bracket_lh not in", values, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhBetween(String value1, String value2) {
            addCriterion("rear_hinge_bracket_lh between", value1, value2, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andRearHingeBracketLhNotBetween(String value1, String value2) {
            addCriterion("rear_hinge_bracket_lh not between", value1, value2, "rearHingeBracketLh");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleIsNull() {
            addCriterion("main_engine_bundle is null");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleIsNotNull() {
            addCriterion("main_engine_bundle is not null");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleEqualTo(String value) {
            addCriterion("main_engine_bundle =", value, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleNotEqualTo(String value) {
            addCriterion("main_engine_bundle <>", value, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleGreaterThan(String value) {
            addCriterion("main_engine_bundle >", value, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleGreaterThanOrEqualTo(String value) {
            addCriterion("main_engine_bundle >=", value, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleLessThan(String value) {
            addCriterion("main_engine_bundle <", value, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleLessThanOrEqualTo(String value) {
            addCriterion("main_engine_bundle <=", value, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleLike(String value) {
            addCriterion("main_engine_bundle like", value, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleNotLike(String value) {
            addCriterion("main_engine_bundle not like", value, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleIn(List<String> values) {
            addCriterion("main_engine_bundle in", values, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleNotIn(List<String> values) {
            addCriterion("main_engine_bundle not in", values, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleBetween(String value1, String value2) {
            addCriterion("main_engine_bundle between", value1, value2, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andMainEngineBundleNotBetween(String value1, String value2) {
            addCriterion("main_engine_bundle not between", value1, value2, "mainEngineBundle");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailIsNull() {
            addCriterion("seat_slide_rail is null");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailIsNotNull() {
            addCriterion("seat_slide_rail is not null");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailEqualTo(String value) {
            addCriterion("seat_slide_rail =", value, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailNotEqualTo(String value) {
            addCriterion("seat_slide_rail <>", value, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailGreaterThan(String value) {
            addCriterion("seat_slide_rail >", value, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailGreaterThanOrEqualTo(String value) {
            addCriterion("seat_slide_rail >=", value, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailLessThan(String value) {
            addCriterion("seat_slide_rail <", value, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailLessThanOrEqualTo(String value) {
            addCriterion("seat_slide_rail <=", value, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailLike(String value) {
            addCriterion("seat_slide_rail like", value, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailNotLike(String value) {
            addCriterion("seat_slide_rail not like", value, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailIn(List<String> values) {
            addCriterion("seat_slide_rail in", values, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailNotIn(List<String> values) {
            addCriterion("seat_slide_rail not in", values, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailBetween(String value1, String value2) {
            addCriterion("seat_slide_rail between", value1, value2, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andSeatSlideRailNotBetween(String value1, String value2) {
            addCriterion("seat_slide_rail not between", value1, value2, "seatSlideRail");
            return (Criteria) this;
        }

        public Criteria andInCarWireIsNull() {
            addCriterion("in_car_wire is null");
            return (Criteria) this;
        }

        public Criteria andInCarWireIsNotNull() {
            addCriterion("in_car_wire is not null");
            return (Criteria) this;
        }

        public Criteria andInCarWireEqualTo(String value) {
            addCriterion("in_car_wire =", value, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireNotEqualTo(String value) {
            addCriterion("in_car_wire <>", value, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireGreaterThan(String value) {
            addCriterion("in_car_wire >", value, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireGreaterThanOrEqualTo(String value) {
            addCriterion("in_car_wire >=", value, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireLessThan(String value) {
            addCriterion("in_car_wire <", value, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireLessThanOrEqualTo(String value) {
            addCriterion("in_car_wire <=", value, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireLike(String value) {
            addCriterion("in_car_wire like", value, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireNotLike(String value) {
            addCriterion("in_car_wire not like", value, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireIn(List<String> values) {
            addCriterion("in_car_wire in", values, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireNotIn(List<String> values) {
            addCriterion("in_car_wire not in", values, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireBetween(String value1, String value2) {
            addCriterion("in_car_wire between", value1, value2, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andInCarWireNotBetween(String value1, String value2) {
            addCriterion("in_car_wire not between", value1, value2, "inCarWire");
            return (Criteria) this;
        }

        public Criteria andSeatBeltIsNull() {
            addCriterion("seat_belt is null");
            return (Criteria) this;
        }

        public Criteria andSeatBeltIsNotNull() {
            addCriterion("seat_belt is not null");
            return (Criteria) this;
        }

        public Criteria andSeatBeltEqualTo(String value) {
            addCriterion("seat_belt =", value, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltNotEqualTo(String value) {
            addCriterion("seat_belt <>", value, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltGreaterThan(String value) {
            addCriterion("seat_belt >", value, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltGreaterThanOrEqualTo(String value) {
            addCriterion("seat_belt >=", value, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltLessThan(String value) {
            addCriterion("seat_belt <", value, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltLessThanOrEqualTo(String value) {
            addCriterion("seat_belt <=", value, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltLike(String value) {
            addCriterion("seat_belt like", value, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltNotLike(String value) {
            addCriterion("seat_belt not like", value, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltIn(List<String> values) {
            addCriterion("seat_belt in", values, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltNotIn(List<String> values) {
            addCriterion("seat_belt not in", values, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltBetween(String value1, String value2) {
            addCriterion("seat_belt between", value1, value2, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andSeatBeltNotBetween(String value1, String value2) {
            addCriterion("seat_belt not between", value1, value2, "seatBelt");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerIsNull() {
            addCriterion("trunk_corner is null");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerIsNotNull() {
            addCriterion("trunk_corner is not null");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerEqualTo(String value) {
            addCriterion("trunk_corner =", value, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerNotEqualTo(String value) {
            addCriterion("trunk_corner <>", value, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerGreaterThan(String value) {
            addCriterion("trunk_corner >", value, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerGreaterThanOrEqualTo(String value) {
            addCriterion("trunk_corner >=", value, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerLessThan(String value) {
            addCriterion("trunk_corner <", value, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerLessThanOrEqualTo(String value) {
            addCriterion("trunk_corner <=", value, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerLike(String value) {
            addCriterion("trunk_corner like", value, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerNotLike(String value) {
            addCriterion("trunk_corner not like", value, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerIn(List<String> values) {
            addCriterion("trunk_corner in", values, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerNotIn(List<String> values) {
            addCriterion("trunk_corner not in", values, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerBetween(String value1, String value2) {
            addCriterion("trunk_corner between", value1, value2, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andTrunkCornerNotBetween(String value1, String value2) {
            addCriterion("trunk_corner not between", value1, value2, "trunkCorner");
            return (Criteria) this;
        }

        public Criteria andSeatCushionIsNull() {
            addCriterion("seat_cushion is null");
            return (Criteria) this;
        }

        public Criteria andSeatCushionIsNotNull() {
            addCriterion("seat_cushion is not null");
            return (Criteria) this;
        }

        public Criteria andSeatCushionEqualTo(String value) {
            addCriterion("seat_cushion =", value, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionNotEqualTo(String value) {
            addCriterion("seat_cushion <>", value, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionGreaterThan(String value) {
            addCriterion("seat_cushion >", value, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionGreaterThanOrEqualTo(String value) {
            addCriterion("seat_cushion >=", value, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionLessThan(String value) {
            addCriterion("seat_cushion <", value, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionLessThanOrEqualTo(String value) {
            addCriterion("seat_cushion <=", value, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionLike(String value) {
            addCriterion("seat_cushion like", value, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionNotLike(String value) {
            addCriterion("seat_cushion not like", value, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionIn(List<String> values) {
            addCriterion("seat_cushion in", values, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionNotIn(List<String> values) {
            addCriterion("seat_cushion not in", values, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionBetween(String value1, String value2) {
            addCriterion("seat_cushion between", value1, value2, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andSeatCushionNotBetween(String value1, String value2) {
            addCriterion("seat_cushion not between", value1, value2, "seatCushion");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuIsNull() {
            addCriterion("fuse_box_ecu is null");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuIsNotNull() {
            addCriterion("fuse_box_ecu is not null");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuEqualTo(String value) {
            addCriterion("fuse_box_ecu =", value, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuNotEqualTo(String value) {
            addCriterion("fuse_box_ecu <>", value, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuGreaterThan(String value) {
            addCriterion("fuse_box_ecu >", value, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuGreaterThanOrEqualTo(String value) {
            addCriterion("fuse_box_ecu >=", value, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuLessThan(String value) {
            addCriterion("fuse_box_ecu <", value, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuLessThanOrEqualTo(String value) {
            addCriterion("fuse_box_ecu <=", value, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuLike(String value) {
            addCriterion("fuse_box_ecu like", value, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuNotLike(String value) {
            addCriterion("fuse_box_ecu not like", value, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuIn(List<String> values) {
            addCriterion("fuse_box_ecu in", values, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuNotIn(List<String> values) {
            addCriterion("fuse_box_ecu not in", values, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuBetween(String value1, String value2) {
            addCriterion("fuse_box_ecu between", value1, value2, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andFuseBoxEcuNotBetween(String value1, String value2) {
            addCriterion("fuse_box_ecu not between", value1, value2, "fuseBoxEcu");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsIsNull() {
            addCriterion("rubber_carpets is null");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsIsNotNull() {
            addCriterion("rubber_carpets is not null");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsEqualTo(String value) {
            addCriterion("rubber_carpets =", value, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsNotEqualTo(String value) {
            addCriterion("rubber_carpets <>", value, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsGreaterThan(String value) {
            addCriterion("rubber_carpets >", value, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsGreaterThanOrEqualTo(String value) {
            addCriterion("rubber_carpets >=", value, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsLessThan(String value) {
            addCriterion("rubber_carpets <", value, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsLessThanOrEqualTo(String value) {
            addCriterion("rubber_carpets <=", value, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsLike(String value) {
            addCriterion("rubber_carpets like", value, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsNotLike(String value) {
            addCriterion("rubber_carpets not like", value, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsIn(List<String> values) {
            addCriterion("rubber_carpets in", values, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsNotIn(List<String> values) {
            addCriterion("rubber_carpets not in", values, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsBetween(String value1, String value2) {
            addCriterion("rubber_carpets between", value1, value2, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andRubberCarpetsNotBetween(String value1, String value2) {
            addCriterion("rubber_carpets not between", value1, value2, "rubberCarpets");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomIsNull() {
            addCriterion("ashtray_bottom is null");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomIsNotNull() {
            addCriterion("ashtray_bottom is not null");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomEqualTo(String value) {
            addCriterion("ashtray_bottom =", value, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomNotEqualTo(String value) {
            addCriterion("ashtray_bottom <>", value, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomGreaterThan(String value) {
            addCriterion("ashtray_bottom >", value, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomGreaterThanOrEqualTo(String value) {
            addCriterion("ashtray_bottom >=", value, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomLessThan(String value) {
            addCriterion("ashtray_bottom <", value, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomLessThanOrEqualTo(String value) {
            addCriterion("ashtray_bottom <=", value, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomLike(String value) {
            addCriterion("ashtray_bottom like", value, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomNotLike(String value) {
            addCriterion("ashtray_bottom not like", value, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomIn(List<String> values) {
            addCriterion("ashtray_bottom in", values, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomNotIn(List<String> values) {
            addCriterion("ashtray_bottom not in", values, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomBetween(String value1, String value2) {
            addCriterion("ashtray_bottom between", value1, value2, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andAshtrayBottomNotBetween(String value1, String value2) {
            addCriterion("ashtray_bottom not between", value1, value2, "ashtrayBottom");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonIsNull() {
            addCriterion("insulation_cotton is null");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonIsNotNull() {
            addCriterion("insulation_cotton is not null");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonEqualTo(String value) {
            addCriterion("insulation_cotton =", value, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonNotEqualTo(String value) {
            addCriterion("insulation_cotton <>", value, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonGreaterThan(String value) {
            addCriterion("insulation_cotton >", value, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonGreaterThanOrEqualTo(String value) {
            addCriterion("insulation_cotton >=", value, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonLessThan(String value) {
            addCriterion("insulation_cotton <", value, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonLessThanOrEqualTo(String value) {
            addCriterion("insulation_cotton <=", value, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonLike(String value) {
            addCriterion("insulation_cotton like", value, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonNotLike(String value) {
            addCriterion("insulation_cotton not like", value, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonIn(List<String> values) {
            addCriterion("insulation_cotton in", values, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonNotIn(List<String> values) {
            addCriterion("insulation_cotton not in", values, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonBetween(String value1, String value2) {
            addCriterion("insulation_cotton between", value1, value2, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andInsulationCottonNotBetween(String value1, String value2) {
            addCriterion("insulation_cotton not between", value1, value2, "insulationCotton");
            return (Criteria) this;
        }

        public Criteria andRubberProductIsNull() {
            addCriterion("rubber_product is null");
            return (Criteria) this;
        }

        public Criteria andRubberProductIsNotNull() {
            addCriterion("rubber_product is not null");
            return (Criteria) this;
        }

        public Criteria andRubberProductEqualTo(String value) {
            addCriterion("rubber_product =", value, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductNotEqualTo(String value) {
            addCriterion("rubber_product <>", value, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductGreaterThan(String value) {
            addCriterion("rubber_product >", value, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductGreaterThanOrEqualTo(String value) {
            addCriterion("rubber_product >=", value, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductLessThan(String value) {
            addCriterion("rubber_product <", value, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductLessThanOrEqualTo(String value) {
            addCriterion("rubber_product <=", value, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductLike(String value) {
            addCriterion("rubber_product like", value, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductNotLike(String value) {
            addCriterion("rubber_product not like", value, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductIn(List<String> values) {
            addCriterion("rubber_product in", values, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductNotIn(List<String> values) {
            addCriterion("rubber_product not in", values, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductBetween(String value1, String value2) {
            addCriterion("rubber_product between", value1, value2, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andRubberProductNotBetween(String value1, String value2) {
            addCriterion("rubber_product not between", value1, value2, "rubberProduct");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitIsNull() {
            addCriterion("vehicle_cover_cockpit is null");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitIsNotNull() {
            addCriterion("vehicle_cover_cockpit is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitEqualTo(String value) {
            addCriterion("vehicle_cover_cockpit =", value, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitNotEqualTo(String value) {
            addCriterion("vehicle_cover_cockpit <>", value, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitGreaterThan(String value) {
            addCriterion("vehicle_cover_cockpit >", value, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_cover_cockpit >=", value, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitLessThan(String value) {
            addCriterion("vehicle_cover_cockpit <", value, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitLessThanOrEqualTo(String value) {
            addCriterion("vehicle_cover_cockpit <=", value, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitLike(String value) {
            addCriterion("vehicle_cover_cockpit like", value, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitNotLike(String value) {
            addCriterion("vehicle_cover_cockpit not like", value, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitIn(List<String> values) {
            addCriterion("vehicle_cover_cockpit in", values, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitNotIn(List<String> values) {
            addCriterion("vehicle_cover_cockpit not in", values, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitBetween(String value1, String value2) {
            addCriterion("vehicle_cover_cockpit between", value1, value2, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andVehicleCoverCockpitNotBetween(String value1, String value2) {
            addCriterion("vehicle_cover_cockpit not between", value1, value2, "vehicleCoverCockpit");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketIsNull() {
            addCriterion("valve_cover_dasket is null");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketIsNotNull() {
            addCriterion("valve_cover_dasket is not null");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketEqualTo(String value) {
            addCriterion("valve_cover_dasket =", value, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketNotEqualTo(String value) {
            addCriterion("valve_cover_dasket <>", value, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketGreaterThan(String value) {
            addCriterion("valve_cover_dasket >", value, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketGreaterThanOrEqualTo(String value) {
            addCriterion("valve_cover_dasket >=", value, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketLessThan(String value) {
            addCriterion("valve_cover_dasket <", value, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketLessThanOrEqualTo(String value) {
            addCriterion("valve_cover_dasket <=", value, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketLike(String value) {
            addCriterion("valve_cover_dasket like", value, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketNotLike(String value) {
            addCriterion("valve_cover_dasket not like", value, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketIn(List<String> values) {
            addCriterion("valve_cover_dasket in", values, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketNotIn(List<String> values) {
            addCriterion("valve_cover_dasket not in", values, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketBetween(String value1, String value2) {
            addCriterion("valve_cover_dasket between", value1, value2, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andValveCoverDasketNotBetween(String value1, String value2) {
            addCriterion("valve_cover_dasket not between", value1, value2, "valveCoverDasket");
            return (Criteria) this;
        }

        public Criteria andEngineHeadIsNull() {
            addCriterion("engine_head is null");
            return (Criteria) this;
        }

        public Criteria andEngineHeadIsNotNull() {
            addCriterion("engine_head is not null");
            return (Criteria) this;
        }

        public Criteria andEngineHeadEqualTo(String value) {
            addCriterion("engine_head =", value, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadNotEqualTo(String value) {
            addCriterion("engine_head <>", value, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadGreaterThan(String value) {
            addCriterion("engine_head >", value, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadGreaterThanOrEqualTo(String value) {
            addCriterion("engine_head >=", value, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadLessThan(String value) {
            addCriterion("engine_head <", value, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadLessThanOrEqualTo(String value) {
            addCriterion("engine_head <=", value, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadLike(String value) {
            addCriterion("engine_head like", value, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadNotLike(String value) {
            addCriterion("engine_head not like", value, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadIn(List<String> values) {
            addCriterion("engine_head in", values, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadNotIn(List<String> values) {
            addCriterion("engine_head not in", values, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadBetween(String value1, String value2) {
            addCriterion("engine_head between", value1, value2, "engineHead");
            return (Criteria) this;
        }

        public Criteria andEngineHeadNotBetween(String value1, String value2) {
            addCriterion("engine_head not between", value1, value2, "engineHead");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpIsNull() {
            addCriterion("power_steering_pump is null");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpIsNotNull() {
            addCriterion("power_steering_pump is not null");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpEqualTo(String value) {
            addCriterion("power_steering_pump =", value, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpNotEqualTo(String value) {
            addCriterion("power_steering_pump <>", value, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpGreaterThan(String value) {
            addCriterion("power_steering_pump >", value, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpGreaterThanOrEqualTo(String value) {
            addCriterion("power_steering_pump >=", value, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpLessThan(String value) {
            addCriterion("power_steering_pump <", value, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpLessThanOrEqualTo(String value) {
            addCriterion("power_steering_pump <=", value, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpLike(String value) {
            addCriterion("power_steering_pump like", value, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpNotLike(String value) {
            addCriterion("power_steering_pump not like", value, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpIn(List<String> values) {
            addCriterion("power_steering_pump in", values, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpNotIn(List<String> values) {
            addCriterion("power_steering_pump not in", values, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpBetween(String value1, String value2) {
            addCriterion("power_steering_pump between", value1, value2, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andPowerSteeringPumpNotBetween(String value1, String value2) {
            addCriterion("power_steering_pump not between", value1, value2, "powerSteeringPump");
            return (Criteria) this;
        }

        public Criteria andEngineAssyIsNull() {
            addCriterion("engine_assy is null");
            return (Criteria) this;
        }

        public Criteria andEngineAssyIsNotNull() {
            addCriterion("engine_assy is not null");
            return (Criteria) this;
        }

        public Criteria andEngineAssyEqualTo(String value) {
            addCriterion("engine_assy =", value, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyNotEqualTo(String value) {
            addCriterion("engine_assy <>", value, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyGreaterThan(String value) {
            addCriterion("engine_assy >", value, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyGreaterThanOrEqualTo(String value) {
            addCriterion("engine_assy >=", value, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyLessThan(String value) {
            addCriterion("engine_assy <", value, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyLessThanOrEqualTo(String value) {
            addCriterion("engine_assy <=", value, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyLike(String value) {
            addCriterion("engine_assy like", value, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyNotLike(String value) {
            addCriterion("engine_assy not like", value, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyIn(List<String> values) {
            addCriterion("engine_assy in", values, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyNotIn(List<String> values) {
            addCriterion("engine_assy not in", values, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyBetween(String value1, String value2) {
            addCriterion("engine_assy between", value1, value2, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andEngineAssyNotBetween(String value1, String value2) {
            addCriterion("engine_assy not between", value1, value2, "engineAssy");
            return (Criteria) this;
        }

        public Criteria andCisternIsNull() {
            addCriterion("cistern is null");
            return (Criteria) this;
        }

        public Criteria andCisternIsNotNull() {
            addCriterion("cistern is not null");
            return (Criteria) this;
        }

        public Criteria andCisternEqualTo(String value) {
            addCriterion("cistern =", value, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternNotEqualTo(String value) {
            addCriterion("cistern <>", value, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternGreaterThan(String value) {
            addCriterion("cistern >", value, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternGreaterThanOrEqualTo(String value) {
            addCriterion("cistern >=", value, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternLessThan(String value) {
            addCriterion("cistern <", value, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternLessThanOrEqualTo(String value) {
            addCriterion("cistern <=", value, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternLike(String value) {
            addCriterion("cistern like", value, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternNotLike(String value) {
            addCriterion("cistern not like", value, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternIn(List<String> values) {
            addCriterion("cistern in", values, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternNotIn(List<String> values) {
            addCriterion("cistern not in", values, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternBetween(String value1, String value2) {
            addCriterion("cistern between", value1, value2, "cistern");
            return (Criteria) this;
        }

        public Criteria andCisternNotBetween(String value1, String value2) {
            addCriterion("cistern not between", value1, value2, "cistern");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyIsNull() {
            addCriterion("transmission_assembly is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyIsNotNull() {
            addCriterion("transmission_assembly is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyEqualTo(String value) {
            addCriterion("transmission_assembly =", value, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyNotEqualTo(String value) {
            addCriterion("transmission_assembly <>", value, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyGreaterThan(String value) {
            addCriterion("transmission_assembly >", value, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyGreaterThanOrEqualTo(String value) {
            addCriterion("transmission_assembly >=", value, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyLessThan(String value) {
            addCriterion("transmission_assembly <", value, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyLessThanOrEqualTo(String value) {
            addCriterion("transmission_assembly <=", value, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyLike(String value) {
            addCriterion("transmission_assembly like", value, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyNotLike(String value) {
            addCriterion("transmission_assembly not like", value, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyIn(List<String> values) {
            addCriterion("transmission_assembly in", values, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyNotIn(List<String> values) {
            addCriterion("transmission_assembly not in", values, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyBetween(String value1, String value2) {
            addCriterion("transmission_assembly between", value1, value2, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andTransmissionAssemblyNotBetween(String value1, String value2) {
            addCriterion("transmission_assembly not between", value1, value2, "transmissionAssembly");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagIsNull() {
            addCriterion("drivers_airbag is null");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagIsNotNull() {
            addCriterion("drivers_airbag is not null");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagEqualTo(String value) {
            addCriterion("drivers_airbag =", value, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagNotEqualTo(String value) {
            addCriterion("drivers_airbag <>", value, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagGreaterThan(String value) {
            addCriterion("drivers_airbag >", value, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagGreaterThanOrEqualTo(String value) {
            addCriterion("drivers_airbag >=", value, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagLessThan(String value) {
            addCriterion("drivers_airbag <", value, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagLessThanOrEqualTo(String value) {
            addCriterion("drivers_airbag <=", value, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagLike(String value) {
            addCriterion("drivers_airbag like", value, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagNotLike(String value) {
            addCriterion("drivers_airbag not like", value, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagIn(List<String> values) {
            addCriterion("drivers_airbag in", values, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagNotIn(List<String> values) {
            addCriterion("drivers_airbag not in", values, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagBetween(String value1, String value2) {
            addCriterion("drivers_airbag between", value1, value2, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andDriversAirbagNotBetween(String value1, String value2) {
            addCriterion("drivers_airbag not between", value1, value2, "driversAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagIsNull() {
            addCriterion("passengers_airbag is null");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagIsNotNull() {
            addCriterion("passengers_airbag is not null");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagEqualTo(String value) {
            addCriterion("passengers_airbag =", value, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagNotEqualTo(String value) {
            addCriterion("passengers_airbag <>", value, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagGreaterThan(String value) {
            addCriterion("passengers_airbag >", value, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagGreaterThanOrEqualTo(String value) {
            addCriterion("passengers_airbag >=", value, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagLessThan(String value) {
            addCriterion("passengers_airbag <", value, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagLessThanOrEqualTo(String value) {
            addCriterion("passengers_airbag <=", value, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagLike(String value) {
            addCriterion("passengers_airbag like", value, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagNotLike(String value) {
            addCriterion("passengers_airbag not like", value, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagIn(List<String> values) {
            addCriterion("passengers_airbag in", values, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagNotIn(List<String> values) {
            addCriterion("passengers_airbag not in", values, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagBetween(String value1, String value2) {
            addCriterion("passengers_airbag between", value1, value2, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andPassengersAirbagNotBetween(String value1, String value2) {
            addCriterion("passengers_airbag not between", value1, value2, "passengersAirbag");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsIsNull() {
            addCriterion("front_Side_airbags is null");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsIsNotNull() {
            addCriterion("front_Side_airbags is not null");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsEqualTo(String value) {
            addCriterion("front_Side_airbags =", value, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsNotEqualTo(String value) {
            addCriterion("front_Side_airbags <>", value, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsGreaterThan(String value) {
            addCriterion("front_Side_airbags >", value, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsGreaterThanOrEqualTo(String value) {
            addCriterion("front_Side_airbags >=", value, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsLessThan(String value) {
            addCriterion("front_Side_airbags <", value, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsLessThanOrEqualTo(String value) {
            addCriterion("front_Side_airbags <=", value, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsLike(String value) {
            addCriterion("front_Side_airbags like", value, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsNotLike(String value) {
            addCriterion("front_Side_airbags not like", value, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsIn(List<String> values) {
            addCriterion("front_Side_airbags in", values, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsNotIn(List<String> values) {
            addCriterion("front_Side_airbags not in", values, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsBetween(String value1, String value2) {
            addCriterion("front_Side_airbags between", value1, value2, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontSideAirbagsNotBetween(String value1, String value2) {
            addCriterion("front_Side_airbags not between", value1, value2, "frontSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsIsNull() {
            addCriterion("rear_Side_airbags is null");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsIsNotNull() {
            addCriterion("rear_Side_airbags is not null");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsEqualTo(String value) {
            addCriterion("rear_Side_airbags =", value, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsNotEqualTo(String value) {
            addCriterion("rear_Side_airbags <>", value, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsGreaterThan(String value) {
            addCriterion("rear_Side_airbags >", value, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsGreaterThanOrEqualTo(String value) {
            addCriterion("rear_Side_airbags >=", value, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsLessThan(String value) {
            addCriterion("rear_Side_airbags <", value, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsLessThanOrEqualTo(String value) {
            addCriterion("rear_Side_airbags <=", value, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsLike(String value) {
            addCriterion("rear_Side_airbags like", value, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsNotLike(String value) {
            addCriterion("rear_Side_airbags not like", value, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsIn(List<String> values) {
            addCriterion("rear_Side_airbags in", values, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsNotIn(List<String> values) {
            addCriterion("rear_Side_airbags not in", values, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsBetween(String value1, String value2) {
            addCriterion("rear_Side_airbags between", value1, value2, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andRearSideAirbagsNotBetween(String value1, String value2) {
            addCriterion("rear_Side_airbags not between", value1, value2, "rearSideAirbags");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagIsNull() {
            addCriterion("front_head_bag is null");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagIsNotNull() {
            addCriterion("front_head_bag is not null");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagEqualTo(String value) {
            addCriterion("front_head_bag =", value, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagNotEqualTo(String value) {
            addCriterion("front_head_bag <>", value, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagGreaterThan(String value) {
            addCriterion("front_head_bag >", value, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagGreaterThanOrEqualTo(String value) {
            addCriterion("front_head_bag >=", value, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagLessThan(String value) {
            addCriterion("front_head_bag <", value, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagLessThanOrEqualTo(String value) {
            addCriterion("front_head_bag <=", value, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagLike(String value) {
            addCriterion("front_head_bag like", value, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagNotLike(String value) {
            addCriterion("front_head_bag not like", value, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagIn(List<String> values) {
            addCriterion("front_head_bag in", values, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagNotIn(List<String> values) {
            addCriterion("front_head_bag not in", values, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagBetween(String value1, String value2) {
            addCriterion("front_head_bag between", value1, value2, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andFrontHeadBagNotBetween(String value1, String value2) {
            addCriterion("front_head_bag not between", value1, value2, "frontHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagIsNull() {
            addCriterion("bear_head_bag is null");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagIsNotNull() {
            addCriterion("bear_head_bag is not null");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagEqualTo(String value) {
            addCriterion("bear_head_bag =", value, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagNotEqualTo(String value) {
            addCriterion("bear_head_bag <>", value, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagGreaterThan(String value) {
            addCriterion("bear_head_bag >", value, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagGreaterThanOrEqualTo(String value) {
            addCriterion("bear_head_bag >=", value, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagLessThan(String value) {
            addCriterion("bear_head_bag <", value, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagLessThanOrEqualTo(String value) {
            addCriterion("bear_head_bag <=", value, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagLike(String value) {
            addCriterion("bear_head_bag like", value, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagNotLike(String value) {
            addCriterion("bear_head_bag not like", value, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagIn(List<String> values) {
            addCriterion("bear_head_bag in", values, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagNotIn(List<String> values) {
            addCriterion("bear_head_bag not in", values, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagBetween(String value1, String value2) {
            addCriterion("bear_head_bag between", value1, value2, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andBearHeadBagNotBetween(String value1, String value2) {
            addCriterion("bear_head_bag not between", value1, value2, "bearHeadBag");
            return (Criteria) this;
        }

        public Criteria andRearSeatIsNull() {
            addCriterion("rear_seat is null");
            return (Criteria) this;
        }

        public Criteria andRearSeatIsNotNull() {
            addCriterion("rear_seat is not null");
            return (Criteria) this;
        }

        public Criteria andRearSeatEqualTo(String value) {
            addCriterion("rear_seat =", value, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatNotEqualTo(String value) {
            addCriterion("rear_seat <>", value, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatGreaterThan(String value) {
            addCriterion("rear_seat >", value, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatGreaterThanOrEqualTo(String value) {
            addCriterion("rear_seat >=", value, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatLessThan(String value) {
            addCriterion("rear_seat <", value, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatLessThanOrEqualTo(String value) {
            addCriterion("rear_seat <=", value, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatLike(String value) {
            addCriterion("rear_seat like", value, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatNotLike(String value) {
            addCriterion("rear_seat not like", value, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatIn(List<String> values) {
            addCriterion("rear_seat in", values, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatNotIn(List<String> values) {
            addCriterion("rear_seat not in", values, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatBetween(String value1, String value2) {
            addCriterion("rear_seat between", value1, value2, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andRearSeatNotBetween(String value1, String value2) {
            addCriterion("rear_seat not between", value1, value2, "rearSeat");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleIsNull() {
            addCriterion("center_console is null");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleIsNotNull() {
            addCriterion("center_console is not null");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleEqualTo(String value) {
            addCriterion("center_console =", value, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleNotEqualTo(String value) {
            addCriterion("center_console <>", value, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleGreaterThan(String value) {
            addCriterion("center_console >", value, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleGreaterThanOrEqualTo(String value) {
            addCriterion("center_console >=", value, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleLessThan(String value) {
            addCriterion("center_console <", value, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleLessThanOrEqualTo(String value) {
            addCriterion("center_console <=", value, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleLike(String value) {
            addCriterion("center_console like", value, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleNotLike(String value) {
            addCriterion("center_console not like", value, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleIn(List<String> values) {
            addCriterion("center_console in", values, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleNotIn(List<String> values) {
            addCriterion("center_console not in", values, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleBetween(String value1, String value2) {
            addCriterion("center_console between", value1, value2, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andCenterConsoleNotBetween(String value1, String value2) {
            addCriterion("center_console not between", value1, value2, "centerConsole");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxIsNull() {
            addCriterion("armrest_box is null");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxIsNotNull() {
            addCriterion("armrest_box is not null");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxEqualTo(String value) {
            addCriterion("armrest_box =", value, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxNotEqualTo(String value) {
            addCriterion("armrest_box <>", value, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxGreaterThan(String value) {
            addCriterion("armrest_box >", value, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxGreaterThanOrEqualTo(String value) {
            addCriterion("armrest_box >=", value, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxLessThan(String value) {
            addCriterion("armrest_box <", value, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxLessThanOrEqualTo(String value) {
            addCriterion("armrest_box <=", value, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxLike(String value) {
            addCriterion("armrest_box like", value, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxNotLike(String value) {
            addCriterion("armrest_box not like", value, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxIn(List<String> values) {
            addCriterion("armrest_box in", values, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxNotIn(List<String> values) {
            addCriterion("armrest_box not in", values, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxBetween(String value1, String value2) {
            addCriterion("armrest_box between", value1, value2, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andArmrestBoxNotBetween(String value1, String value2) {
            addCriterion("armrest_box not between", value1, value2, "armrestBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxIsNull() {
            addCriterion("car_storage_box is null");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxIsNotNull() {
            addCriterion("car_storage_box is not null");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxEqualTo(String value) {
            addCriterion("car_storage_box =", value, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxNotEqualTo(String value) {
            addCriterion("car_storage_box <>", value, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxGreaterThan(String value) {
            addCriterion("car_storage_box >", value, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxGreaterThanOrEqualTo(String value) {
            addCriterion("car_storage_box >=", value, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxLessThan(String value) {
            addCriterion("car_storage_box <", value, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxLessThanOrEqualTo(String value) {
            addCriterion("car_storage_box <=", value, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxLike(String value) {
            addCriterion("car_storage_box like", value, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxNotLike(String value) {
            addCriterion("car_storage_box not like", value, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxIn(List<String> values) {
            addCriterion("car_storage_box in", values, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxNotIn(List<String> values) {
            addCriterion("car_storage_box not in", values, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxBetween(String value1, String value2) {
            addCriterion("car_storage_box between", value1, value2, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andCarStorageBoxNotBetween(String value1, String value2) {
            addCriterion("car_storage_box not between", value1, value2, "carStorageBox");
            return (Criteria) this;
        }

        public Criteria andShieldIsNull() {
            addCriterion("shield is null");
            return (Criteria) this;
        }

        public Criteria andShieldIsNotNull() {
            addCriterion("shield is not null");
            return (Criteria) this;
        }

        public Criteria andShieldEqualTo(String value) {
            addCriterion("shield =", value, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldNotEqualTo(String value) {
            addCriterion("shield <>", value, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldGreaterThan(String value) {
            addCriterion("shield >", value, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldGreaterThanOrEqualTo(String value) {
            addCriterion("shield >=", value, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldLessThan(String value) {
            addCriterion("shield <", value, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldLessThanOrEqualTo(String value) {
            addCriterion("shield <=", value, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldLike(String value) {
            addCriterion("shield like", value, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldNotLike(String value) {
            addCriterion("shield not like", value, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldIn(List<String> values) {
            addCriterion("shield in", values, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldNotIn(List<String> values) {
            addCriterion("shield not in", values, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldBetween(String value1, String value2) {
            addCriterion("shield between", value1, value2, "shield");
            return (Criteria) this;
        }

        public Criteria andShieldNotBetween(String value1, String value2) {
            addCriterion("shield not between", value1, value2, "shield");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelIsNull() {
            addCriterion("steering_wheel is null");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelIsNotNull() {
            addCriterion("steering_wheel is not null");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelEqualTo(String value) {
            addCriterion("steering_wheel =", value, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelNotEqualTo(String value) {
            addCriterion("steering_wheel <>", value, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelGreaterThan(String value) {
            addCriterion("steering_wheel >", value, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelGreaterThanOrEqualTo(String value) {
            addCriterion("steering_wheel >=", value, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelLessThan(String value) {
            addCriterion("steering_wheel <", value, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelLessThanOrEqualTo(String value) {
            addCriterion("steering_wheel <=", value, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelLike(String value) {
            addCriterion("steering_wheel like", value, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelNotLike(String value) {
            addCriterion("steering_wheel not like", value, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelIn(List<String> values) {
            addCriterion("steering_wheel in", values, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelNotIn(List<String> values) {
            addCriterion("steering_wheel not in", values, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelBetween(String value1, String value2) {
            addCriterion("steering_wheel between", value1, value2, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andSteeringWheelNotBetween(String value1, String value2) {
            addCriterion("steering_wheel not between", value1, value2, "steeringWheel");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatIsNull() {
            addCriterion("main_driving_seat is null");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatIsNotNull() {
            addCriterion("main_driving_seat is not null");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatEqualTo(String value) {
            addCriterion("main_driving_seat =", value, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatNotEqualTo(String value) {
            addCriterion("main_driving_seat <>", value, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatGreaterThan(String value) {
            addCriterion("main_driving_seat >", value, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatGreaterThanOrEqualTo(String value) {
            addCriterion("main_driving_seat >=", value, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatLessThan(String value) {
            addCriterion("main_driving_seat <", value, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatLessThanOrEqualTo(String value) {
            addCriterion("main_driving_seat <=", value, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatLike(String value) {
            addCriterion("main_driving_seat like", value, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatNotLike(String value) {
            addCriterion("main_driving_seat not like", value, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatIn(List<String> values) {
            addCriterion("main_driving_seat in", values, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatNotIn(List<String> values) {
            addCriterion("main_driving_seat not in", values, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatBetween(String value1, String value2) {
            addCriterion("main_driving_seat between", value1, value2, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andMainDrivingSeatNotBetween(String value1, String value2) {
            addCriterion("main_driving_seat not between", value1, value2, "mainDrivingSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatIsNull() {
            addCriterion("assistant_seat is null");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatIsNotNull() {
            addCriterion("assistant_seat is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatEqualTo(String value) {
            addCriterion("assistant_seat =", value, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatNotEqualTo(String value) {
            addCriterion("assistant_seat <>", value, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatGreaterThan(String value) {
            addCriterion("assistant_seat >", value, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatGreaterThanOrEqualTo(String value) {
            addCriterion("assistant_seat >=", value, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatLessThan(String value) {
            addCriterion("assistant_seat <", value, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatLessThanOrEqualTo(String value) {
            addCriterion("assistant_seat <=", value, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatLike(String value) {
            addCriterion("assistant_seat like", value, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatNotLike(String value) {
            addCriterion("assistant_seat not like", value, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatIn(List<String> values) {
            addCriterion("assistant_seat in", values, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatNotIn(List<String> values) {
            addCriterion("assistant_seat not in", values, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatBetween(String value1, String value2) {
            addCriterion("assistant_seat between", value1, value2, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andAssistantSeatNotBetween(String value1, String value2) {
            addCriterion("assistant_seat not between", value1, value2, "assistantSeat");
            return (Criteria) this;
        }

        public Criteria andCarCarpetIsNull() {
            addCriterion("car_carpet is null");
            return (Criteria) this;
        }

        public Criteria andCarCarpetIsNotNull() {
            addCriterion("car_carpet is not null");
            return (Criteria) this;
        }

        public Criteria andCarCarpetEqualTo(String value) {
            addCriterion("car_carpet =", value, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetNotEqualTo(String value) {
            addCriterion("car_carpet <>", value, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetGreaterThan(String value) {
            addCriterion("car_carpet >", value, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetGreaterThanOrEqualTo(String value) {
            addCriterion("car_carpet >=", value, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetLessThan(String value) {
            addCriterion("car_carpet <", value, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetLessThanOrEqualTo(String value) {
            addCriterion("car_carpet <=", value, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetLike(String value) {
            addCriterion("car_carpet like", value, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetNotLike(String value) {
            addCriterion("car_carpet not like", value, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetIn(List<String> values) {
            addCriterion("car_carpet in", values, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetNotIn(List<String> values) {
            addCriterion("car_carpet not in", values, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetBetween(String value1, String value2) {
            addCriterion("car_carpet between", value1, value2, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andCarCarpetNotBetween(String value1, String value2) {
            addCriterion("car_carpet not between", value1, value2, "carCarpet");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskIsNull() {
            addCriterion("instrument_desk is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskIsNotNull() {
            addCriterion("instrument_desk is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskEqualTo(String value) {
            addCriterion("instrument_desk =", value, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskNotEqualTo(String value) {
            addCriterion("instrument_desk <>", value, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskGreaterThan(String value) {
            addCriterion("instrument_desk >", value, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskGreaterThanOrEqualTo(String value) {
            addCriterion("instrument_desk >=", value, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskLessThan(String value) {
            addCriterion("instrument_desk <", value, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskLessThanOrEqualTo(String value) {
            addCriterion("instrument_desk <=", value, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskLike(String value) {
            addCriterion("instrument_desk like", value, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskNotLike(String value) {
            addCriterion("instrument_desk not like", value, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskIn(List<String> values) {
            addCriterion("instrument_desk in", values, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskNotIn(List<String> values) {
            addCriterion("instrument_desk not in", values, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskBetween(String value1, String value2) {
            addCriterion("instrument_desk between", value1, value2, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInstrumentDeskNotBetween(String value1, String value2) {
            addCriterion("instrument_desk not between", value1, value2, "instrumentDesk");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIsNull() {
            addCriterion("invoice_price is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIsNotNull() {
            addCriterion("invoice_price is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceEqualTo(String value) {
            addCriterion("invoice_price =", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotEqualTo(String value) {
            addCriterion("invoice_price <>", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceGreaterThan(String value) {
            addCriterion("invoice_price >", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_price >=", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLessThan(String value) {
            addCriterion("invoice_price <", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLessThanOrEqualTo(String value) {
            addCriterion("invoice_price <=", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLike(String value) {
            addCriterion("invoice_price like", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotLike(String value) {
            addCriterion("invoice_price not like", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIn(List<String> values) {
            addCriterion("invoice_price in", values, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotIn(List<String> values) {
            addCriterion("invoice_price not in", values, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceBetween(String value1, String value2) {
            addCriterion("invoice_price between", value1, value2, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotBetween(String value1, String value2) {
            addCriterion("invoice_price not between", value1, value2, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2IsNull() {
            addCriterion("appraiser_result2 is null");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2IsNotNull() {
            addCriterion("appraiser_result2 is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2EqualTo(String value) {
            addCriterion("appraiser_result2 =", value, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2NotEqualTo(String value) {
            addCriterion("appraiser_result2 <>", value, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2GreaterThan(String value) {
            addCriterion("appraiser_result2 >", value, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2GreaterThanOrEqualTo(String value) {
            addCriterion("appraiser_result2 >=", value, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2LessThan(String value) {
            addCriterion("appraiser_result2 <", value, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2LessThanOrEqualTo(String value) {
            addCriterion("appraiser_result2 <=", value, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2Like(String value) {
            addCriterion("appraiser_result2 like", value, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2NotLike(String value) {
            addCriterion("appraiser_result2 not like", value, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2In(List<String> values) {
            addCriterion("appraiser_result2 in", values, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2NotIn(List<String> values) {
            addCriterion("appraiser_result2 not in", values, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2Between(String value1, String value2) {
            addCriterion("appraiser_result2 between", value1, value2, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andAppraiserResult2NotBetween(String value1, String value2) {
            addCriterion("appraiser_result2 not between", value1, value2, "appraiserResult2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceIsNull() {
            addCriterion("system_ass_price is null");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceIsNotNull() {
            addCriterion("system_ass_price is not null");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceEqualTo(BigDecimal value) {
            addCriterion("system_ass_price =", value, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceNotEqualTo(BigDecimal value) {
            addCriterion("system_ass_price <>", value, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceGreaterThan(BigDecimal value) {
            addCriterion("system_ass_price >", value, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("system_ass_price >=", value, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceLessThan(BigDecimal value) {
            addCriterion("system_ass_price <", value, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("system_ass_price <=", value, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceIn(List<BigDecimal> values) {
            addCriterion("system_ass_price in", values, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceNotIn(List<BigDecimal> values) {
            addCriterion("system_ass_price not in", values, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("system_ass_price between", value1, value2, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andSystemAssPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("system_ass_price not between", value1, value2, "systemAssPrice");
            return (Criteria) this;
        }

        public Criteria andTransferCountIsNull() {
            addCriterion("transfer_count is null");
            return (Criteria) this;
        }

        public Criteria andTransferCountIsNotNull() {
            addCriterion("transfer_count is not null");
            return (Criteria) this;
        }

        public Criteria andTransferCountEqualTo(BigDecimal value) {
            addCriterion("transfer_count =", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountNotEqualTo(BigDecimal value) {
            addCriterion("transfer_count <>", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountGreaterThan(BigDecimal value) {
            addCriterion("transfer_count >", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transfer_count >=", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountLessThan(BigDecimal value) {
            addCriterion("transfer_count <", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transfer_count <=", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountIn(List<BigDecimal> values) {
            addCriterion("transfer_count in", values, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountNotIn(List<BigDecimal> values) {
            addCriterion("transfer_count not in", values, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transfer_count between", value1, value2, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transfer_count not between", value1, value2, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearIsNull() {
            addCriterion("transfer_count_oneyear is null");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearIsNotNull() {
            addCriterion("transfer_count_oneyear is not null");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearEqualTo(BigDecimal value) {
            addCriterion("transfer_count_oneyear =", value, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearNotEqualTo(BigDecimal value) {
            addCriterion("transfer_count_oneyear <>", value, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearGreaterThan(BigDecimal value) {
            addCriterion("transfer_count_oneyear >", value, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transfer_count_oneyear >=", value, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearLessThan(BigDecimal value) {
            addCriterion("transfer_count_oneyear <", value, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transfer_count_oneyear <=", value, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearIn(List<BigDecimal> values) {
            addCriterion("transfer_count_oneyear in", values, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearNotIn(List<BigDecimal> values) {
            addCriterion("transfer_count_oneyear not in", values, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transfer_count_oneyear between", value1, value2, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andTransferCountOneyearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transfer_count_oneyear not between", value1, value2, "transferCountOneyear");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2IsNull() {
            addCriterion("system_ass_price2 is null");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2IsNotNull() {
            addCriterion("system_ass_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2EqualTo(BigDecimal value) {
            addCriterion("system_ass_price2 =", value, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2NotEqualTo(BigDecimal value) {
            addCriterion("system_ass_price2 <>", value, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2GreaterThan(BigDecimal value) {
            addCriterion("system_ass_price2 >", value, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("system_ass_price2 >=", value, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2LessThan(BigDecimal value) {
            addCriterion("system_ass_price2 <", value, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("system_ass_price2 <=", value, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2In(List<BigDecimal> values) {
            addCriterion("system_ass_price2 in", values, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2NotIn(List<BigDecimal> values) {
            addCriterion("system_ass_price2 not in", values, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("system_ass_price2 between", value1, value2, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andSystemAssPrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("system_ass_price2 not between", value1, value2, "systemAssPrice2");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceIsNull() {
            addCriterion("artificial_price is null");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceIsNotNull() {
            addCriterion("artificial_price is not null");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceEqualTo(BigDecimal value) {
            addCriterion("artificial_price =", value, "artificialPrice");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceNotEqualTo(BigDecimal value) {
            addCriterion("artificial_price <>", value, "artificialPrice");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceGreaterThan(BigDecimal value) {
            addCriterion("artificial_price >", value, "artificialPrice");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artificial_price >=", value, "artificialPrice");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceLessThan(BigDecimal value) {
            addCriterion("artificial_price <", value, "artificialPrice");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artificial_price <=", value, "artificialPrice");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceIn(List<BigDecimal> values) {
            addCriterion("artificial_price in", values, "artificialPrice");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceNotIn(List<BigDecimal> values) {
            addCriterion("artificial_price not in", values, "artificialPrice");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artificial_price between", value1, value2, "artificialPrice");
            return (Criteria) this;
        }

        public Criteria andArtificialPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artificial_price not between", value1, value2, "artificialPrice");
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