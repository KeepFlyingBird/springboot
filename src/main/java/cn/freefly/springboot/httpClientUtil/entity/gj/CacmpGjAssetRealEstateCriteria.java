package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjAssetRealEstateCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjAssetRealEstateCriteria() {
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

        public Criteria andOwnershipPersonNameIsNull() {
            addCriterion("ownership_person_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameIsNotNull() {
            addCriterion("ownership_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameEqualTo(String value) {
            addCriterion("ownership_person_name =", value, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameNotEqualTo(String value) {
            addCriterion("ownership_person_name <>", value, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameGreaterThan(String value) {
            addCriterion("ownership_person_name >", value, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("ownership_person_name >=", value, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameLessThan(String value) {
            addCriterion("ownership_person_name <", value, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameLessThanOrEqualTo(String value) {
            addCriterion("ownership_person_name <=", value, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameLike(String value) {
            addCriterion("ownership_person_name like", value, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameNotLike(String value) {
            addCriterion("ownership_person_name not like", value, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameIn(List<String> values) {
            addCriterion("ownership_person_name in", values, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameNotIn(List<String> values) {
            addCriterion("ownership_person_name not in", values, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameBetween(String value1, String value2) {
            addCriterion("ownership_person_name between", value1, value2, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andOwnershipPersonNameNotBetween(String value1, String value2) {
            addCriterion("ownership_person_name not between", value1, value2, "ownershipPersonName");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("property is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("property is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("property like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("property not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("property not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIsNull() {
            addCriterion("property_type is null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIsNotNull() {
            addCriterion("property_type is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeEqualTo(String value) {
            addCriterion("property_type =", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotEqualTo(String value) {
            addCriterion("property_type <>", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThan(String value) {
            addCriterion("property_type >", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("property_type >=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThan(String value) {
            addCriterion("property_type <", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThanOrEqualTo(String value) {
            addCriterion("property_type <=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLike(String value) {
            addCriterion("property_type like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotLike(String value) {
            addCriterion("property_type not like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIn(List<String> values) {
            addCriterion("property_type in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotIn(List<String> values) {
            addCriterion("property_type not in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeBetween(String value1, String value2) {
            addCriterion("property_type between", value1, value2, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotBetween(String value1, String value2) {
            addCriterion("property_type not between", value1, value2, "propertyType");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andConditionIsNull() {
            addCriterion("condition is null");
            return (Criteria) this;
        }

        public Criteria andConditionIsNotNull() {
            addCriterion("condition is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEqualTo(String value) {
            addCriterion("condition =", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotEqualTo(String value) {
            addCriterion("condition <>", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThan(String value) {
            addCriterion("condition >", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThanOrEqualTo(String value) {
            addCriterion("condition >=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThan(String value) {
            addCriterion("condition <", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThanOrEqualTo(String value) {
            addCriterion("condition <=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLike(String value) {
            addCriterion("condition like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotLike(String value) {
            addCriterion("condition not like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionIn(List<String> values) {
            addCriterion("condition in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotIn(List<String> values) {
            addCriterion("condition not in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionBetween(String value1, String value2) {
            addCriterion("condition between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotBetween(String value1, String value2) {
            addCriterion("condition not between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIsNull() {
            addCriterion("floor_space is null");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIsNotNull() {
            addCriterion("floor_space is not null");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceEqualTo(BigDecimal value) {
            addCriterion("floor_space =", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotEqualTo(BigDecimal value) {
            addCriterion("floor_space <>", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceGreaterThan(BigDecimal value) {
            addCriterion("floor_space >", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("floor_space >=", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceLessThan(BigDecimal value) {
            addCriterion("floor_space <", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("floor_space <=", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIn(List<BigDecimal> values) {
            addCriterion("floor_space in", values, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotIn(List<BigDecimal> values) {
            addCriterion("floor_space not in", values, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("floor_space between", value1, value2, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("floor_space not between", value1, value2, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountIsNull() {
            addCriterion("mortgage_amount is null");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountIsNotNull() {
            addCriterion("mortgage_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountEqualTo(String value) {
            addCriterion("mortgage_amount =", value, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountNotEqualTo(String value) {
            addCriterion("mortgage_amount <>", value, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountGreaterThan(String value) {
            addCriterion("mortgage_amount >", value, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_amount >=", value, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountLessThan(String value) {
            addCriterion("mortgage_amount <", value, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountLessThanOrEqualTo(String value) {
            addCriterion("mortgage_amount <=", value, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountLike(String value) {
            addCriterion("mortgage_amount like", value, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountNotLike(String value) {
            addCriterion("mortgage_amount not like", value, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountIn(List<String> values) {
            addCriterion("mortgage_amount in", values, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountNotIn(List<String> values) {
            addCriterion("mortgage_amount not in", values, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountBetween(String value1, String value2) {
            addCriterion("mortgage_amount between", value1, value2, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageAmountNotBetween(String value1, String value2) {
            addCriterion("mortgage_amount not between", value1, value2, "mortgageAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsIsNull() {
            addCriterion("mortgage_years is null");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsIsNotNull() {
            addCriterion("mortgage_years is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsEqualTo(String value) {
            addCriterion("mortgage_years =", value, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsNotEqualTo(String value) {
            addCriterion("mortgage_years <>", value, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsGreaterThan(String value) {
            addCriterion("mortgage_years >", value, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_years >=", value, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsLessThan(String value) {
            addCriterion("mortgage_years <", value, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsLessThanOrEqualTo(String value) {
            addCriterion("mortgage_years <=", value, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsLike(String value) {
            addCriterion("mortgage_years like", value, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsNotLike(String value) {
            addCriterion("mortgage_years not like", value, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsIn(List<String> values) {
            addCriterion("mortgage_years in", values, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsNotIn(List<String> values) {
            addCriterion("mortgage_years not in", values, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsBetween(String value1, String value2) {
            addCriterion("mortgage_years between", value1, value2, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageYearsNotBetween(String value1, String value2) {
            addCriterion("mortgage_years not between", value1, value2, "mortgageYears");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountIsNull() {
            addCriterion("mortgage_month_amount is null");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountIsNotNull() {
            addCriterion("mortgage_month_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountEqualTo(String value) {
            addCriterion("mortgage_month_amount =", value, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountNotEqualTo(String value) {
            addCriterion("mortgage_month_amount <>", value, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountGreaterThan(String value) {
            addCriterion("mortgage_month_amount >", value, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_month_amount >=", value, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountLessThan(String value) {
            addCriterion("mortgage_month_amount <", value, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountLessThanOrEqualTo(String value) {
            addCriterion("mortgage_month_amount <=", value, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountLike(String value) {
            addCriterion("mortgage_month_amount like", value, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountNotLike(String value) {
            addCriterion("mortgage_month_amount not like", value, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountIn(List<String> values) {
            addCriterion("mortgage_month_amount in", values, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountNotIn(List<String> values) {
            addCriterion("mortgage_month_amount not in", values, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountBetween(String value1, String value2) {
            addCriterion("mortgage_month_amount between", value1, value2, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andMortgageMonthAmountNotBetween(String value1, String value2) {
            addCriterion("mortgage_month_amount not between", value1, value2, "mortgageMonthAmount");
            return (Criteria) this;
        }

        public Criteria andXinxituFicIsNull() {
            addCriterion("xinxitu_fic is null");
            return (Criteria) this;
        }

        public Criteria andXinxituFicIsNotNull() {
            addCriterion("xinxitu_fic is not null");
            return (Criteria) this;
        }

        public Criteria andXinxituFicEqualTo(String value) {
            addCriterion("xinxitu_fic =", value, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicNotEqualTo(String value) {
            addCriterion("xinxitu_fic <>", value, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicGreaterThan(String value) {
            addCriterion("xinxitu_fic >", value, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicGreaterThanOrEqualTo(String value) {
            addCriterion("xinxitu_fic >=", value, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicLessThan(String value) {
            addCriterion("xinxitu_fic <", value, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicLessThanOrEqualTo(String value) {
            addCriterion("xinxitu_fic <=", value, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicLike(String value) {
            addCriterion("xinxitu_fic like", value, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicNotLike(String value) {
            addCriterion("xinxitu_fic not like", value, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicIn(List<String> values) {
            addCriterion("xinxitu_fic in", values, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicNotIn(List<String> values) {
            addCriterion("xinxitu_fic not in", values, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicBetween(String value1, String value2) {
            addCriterion("xinxitu_fic between", value1, value2, "xinxituFic");
            return (Criteria) this;
        }

        public Criteria andXinxituFicNotBetween(String value1, String value2) {
            addCriterion("xinxitu_fic not between", value1, value2, "xinxituFic");
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