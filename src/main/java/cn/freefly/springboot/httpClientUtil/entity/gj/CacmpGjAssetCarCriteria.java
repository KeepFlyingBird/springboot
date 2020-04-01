package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjAssetCarCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjAssetCarCriteria() {
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

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarNatureIsNull() {
            addCriterion("car_nature is null");
            return (Criteria) this;
        }

        public Criteria andCarNatureIsNotNull() {
            addCriterion("car_nature is not null");
            return (Criteria) this;
        }

        public Criteria andCarNatureEqualTo(String value) {
            addCriterion("car_nature =", value, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureNotEqualTo(String value) {
            addCriterion("car_nature <>", value, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureGreaterThan(String value) {
            addCriterion("car_nature >", value, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureGreaterThanOrEqualTo(String value) {
            addCriterion("car_nature >=", value, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureLessThan(String value) {
            addCriterion("car_nature <", value, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureLessThanOrEqualTo(String value) {
            addCriterion("car_nature <=", value, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureLike(String value) {
            addCriterion("car_nature like", value, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureNotLike(String value) {
            addCriterion("car_nature not like", value, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureIn(List<String> values) {
            addCriterion("car_nature in", values, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureNotIn(List<String> values) {
            addCriterion("car_nature not in", values, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureBetween(String value1, String value2) {
            addCriterion("car_nature between", value1, value2, "carNature");
            return (Criteria) this;
        }

        public Criteria andCarNatureNotBetween(String value1, String value2) {
            addCriterion("car_nature not between", value1, value2, "carNature");
            return (Criteria) this;
        }

        public Criteria andBelongTypeIsNull() {
            addCriterion("belong_type is null");
            return (Criteria) this;
        }

        public Criteria andBelongTypeIsNotNull() {
            addCriterion("belong_type is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTypeEqualTo(String value) {
            addCriterion("belong_type =", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotEqualTo(String value) {
            addCriterion("belong_type <>", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeGreaterThan(String value) {
            addCriterion("belong_type >", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeGreaterThanOrEqualTo(String value) {
            addCriterion("belong_type >=", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeLessThan(String value) {
            addCriterion("belong_type <", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeLessThanOrEqualTo(String value) {
            addCriterion("belong_type <=", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeLike(String value) {
            addCriterion("belong_type like", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotLike(String value) {
            addCriterion("belong_type not like", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeIn(List<String> values) {
            addCriterion("belong_type in", values, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotIn(List<String> values) {
            addCriterion("belong_type not in", values, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeBetween(String value1, String value2) {
            addCriterion("belong_type between", value1, value2, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotBetween(String value1, String value2) {
            addCriterion("belong_type not between", value1, value2, "belongType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeIsNull() {
            addCriterion("car_production_type is null");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeIsNotNull() {
            addCriterion("car_production_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeEqualTo(String value) {
            addCriterion("car_production_type =", value, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeNotEqualTo(String value) {
            addCriterion("car_production_type <>", value, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeGreaterThan(String value) {
            addCriterion("car_production_type >", value, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_production_type >=", value, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeLessThan(String value) {
            addCriterion("car_production_type <", value, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeLessThanOrEqualTo(String value) {
            addCriterion("car_production_type <=", value, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeLike(String value) {
            addCriterion("car_production_type like", value, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeNotLike(String value) {
            addCriterion("car_production_type not like", value, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeIn(List<String> values) {
            addCriterion("car_production_type in", values, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeNotIn(List<String> values) {
            addCriterion("car_production_type not in", values, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeBetween(String value1, String value2) {
            addCriterion("car_production_type between", value1, value2, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarProductionTypeNotBetween(String value1, String value2) {
            addCriterion("car_production_type not between", value1, value2, "carProductionType");
            return (Criteria) this;
        }

        public Criteria andCarClassifyIsNull() {
            addCriterion("car_classify is null");
            return (Criteria) this;
        }

        public Criteria andCarClassifyIsNotNull() {
            addCriterion("car_classify is not null");
            return (Criteria) this;
        }

        public Criteria andCarClassifyEqualTo(String value) {
            addCriterion("car_classify =", value, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyNotEqualTo(String value) {
            addCriterion("car_classify <>", value, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyGreaterThan(String value) {
            addCriterion("car_classify >", value, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("car_classify >=", value, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyLessThan(String value) {
            addCriterion("car_classify <", value, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyLessThanOrEqualTo(String value) {
            addCriterion("car_classify <=", value, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyLike(String value) {
            addCriterion("car_classify like", value, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyNotLike(String value) {
            addCriterion("car_classify not like", value, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyIn(List<String> values) {
            addCriterion("car_classify in", values, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyNotIn(List<String> values) {
            addCriterion("car_classify not in", values, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyBetween(String value1, String value2) {
            addCriterion("car_classify between", value1, value2, "carClassify");
            return (Criteria) this;
        }

        public Criteria andCarClassifyNotBetween(String value1, String value2) {
            addCriterion("car_classify not between", value1, value2, "carClassify");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageIsNull() {
            addCriterion("vehicle_usage is null");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageIsNotNull() {
            addCriterion("vehicle_usage is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageEqualTo(String value) {
            addCriterion("vehicle_usage =", value, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageNotEqualTo(String value) {
            addCriterion("vehicle_usage <>", value, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageGreaterThan(String value) {
            addCriterion("vehicle_usage >", value, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_usage >=", value, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageLessThan(String value) {
            addCriterion("vehicle_usage <", value, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageLessThanOrEqualTo(String value) {
            addCriterion("vehicle_usage <=", value, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageLike(String value) {
            addCriterion("vehicle_usage like", value, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageNotLike(String value) {
            addCriterion("vehicle_usage not like", value, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageIn(List<String> values) {
            addCriterion("vehicle_usage in", values, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageNotIn(List<String> values) {
            addCriterion("vehicle_usage not in", values, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageBetween(String value1, String value2) {
            addCriterion("vehicle_usage between", value1, value2, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andVehicleUsageNotBetween(String value1, String value2) {
            addCriterion("vehicle_usage not between", value1, value2, "vehicleUsage");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andCarSeriesIsNull() {
            addCriterion("car_series is null");
            return (Criteria) this;
        }

        public Criteria andCarSeriesIsNotNull() {
            addCriterion("car_series is not null");
            return (Criteria) this;
        }

        public Criteria andCarSeriesEqualTo(String value) {
            addCriterion("car_series =", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotEqualTo(String value) {
            addCriterion("car_series <>", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesGreaterThan(String value) {
            addCriterion("car_series >", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("car_series >=", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesLessThan(String value) {
            addCriterion("car_series <", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesLessThanOrEqualTo(String value) {
            addCriterion("car_series <=", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesLike(String value) {
            addCriterion("car_series like", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotLike(String value) {
            addCriterion("car_series not like", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesIn(List<String> values) {
            addCriterion("car_series in", values, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotIn(List<String> values) {
            addCriterion("car_series not in", values, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesBetween(String value1, String value2) {
            addCriterion("car_series between", value1, value2, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotBetween(String value1, String value2) {
            addCriterion("car_series not between", value1, value2, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarColorIsNull() {
            addCriterion("car_color is null");
            return (Criteria) this;
        }

        public Criteria andCarColorIsNotNull() {
            addCriterion("car_color is not null");
            return (Criteria) this;
        }

        public Criteria andCarColorEqualTo(String value) {
            addCriterion("car_color =", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotEqualTo(String value) {
            addCriterion("car_color <>", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorGreaterThan(String value) {
            addCriterion("car_color >", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorGreaterThanOrEqualTo(String value) {
            addCriterion("car_color >=", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLessThan(String value) {
            addCriterion("car_color <", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLessThanOrEqualTo(String value) {
            addCriterion("car_color <=", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLike(String value) {
            addCriterion("car_color like", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotLike(String value) {
            addCriterion("car_color not like", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorIn(List<String> values) {
            addCriterion("car_color in", values, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotIn(List<String> values) {
            addCriterion("car_color not in", values, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorBetween(String value1, String value2) {
            addCriterion("car_color between", value1, value2, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotBetween(String value1, String value2) {
            addCriterion("car_color not between", value1, value2, "carColor");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("fuel_type is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("fuel_type is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(String value) {
            addCriterion("fuel_type =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(String value) {
            addCriterion("fuel_type <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(String value) {
            addCriterion("fuel_type >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_type >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(String value) {
            addCriterion("fuel_type <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("fuel_type <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLike(String value) {
            addCriterion("fuel_type like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotLike(String value) {
            addCriterion("fuel_type not like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<String> values) {
            addCriterion("fuel_type in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<String> values) {
            addCriterion("fuel_type not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(String value1, String value2) {
            addCriterion("fuel_type between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(String value1, String value2) {
            addCriterion("fuel_type not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceIsNull() {
            addCriterion("register_province is null");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceIsNotNull() {
            addCriterion("register_province is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceEqualTo(String value) {
            addCriterion("register_province =", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotEqualTo(String value) {
            addCriterion("register_province <>", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceGreaterThan(String value) {
            addCriterion("register_province >", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("register_province >=", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceLessThan(String value) {
            addCriterion("register_province <", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceLessThanOrEqualTo(String value) {
            addCriterion("register_province <=", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceLike(String value) {
            addCriterion("register_province like", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotLike(String value) {
            addCriterion("register_province not like", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceIn(List<String> values) {
            addCriterion("register_province in", values, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotIn(List<String> values) {
            addCriterion("register_province not in", values, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceBetween(String value1, String value2) {
            addCriterion("register_province between", value1, value2, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotBetween(String value1, String value2) {
            addCriterion("register_province not between", value1, value2, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameIsNull() {
            addCriterion("register_province_name is null");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameIsNotNull() {
            addCriterion("register_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameEqualTo(String value) {
            addCriterion("register_province_name =", value, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameNotEqualTo(String value) {
            addCriterion("register_province_name <>", value, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameGreaterThan(String value) {
            addCriterion("register_province_name >", value, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("register_province_name >=", value, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameLessThan(String value) {
            addCriterion("register_province_name <", value, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("register_province_name <=", value, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameLike(String value) {
            addCriterion("register_province_name like", value, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameNotLike(String value) {
            addCriterion("register_province_name not like", value, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameIn(List<String> values) {
            addCriterion("register_province_name in", values, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameNotIn(List<String> values) {
            addCriterion("register_province_name not in", values, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameBetween(String value1, String value2) {
            addCriterion("register_province_name between", value1, value2, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNameNotBetween(String value1, String value2) {
            addCriterion("register_province_name not between", value1, value2, "registerProvinceName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityIsNull() {
            addCriterion("register_city is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCityIsNotNull() {
            addCriterion("register_city is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCityEqualTo(String value) {
            addCriterion("register_city =", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotEqualTo(String value) {
            addCriterion("register_city <>", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityGreaterThan(String value) {
            addCriterion("register_city >", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityGreaterThanOrEqualTo(String value) {
            addCriterion("register_city >=", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityLessThan(String value) {
            addCriterion("register_city <", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityLessThanOrEqualTo(String value) {
            addCriterion("register_city <=", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityLike(String value) {
            addCriterion("register_city like", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotLike(String value) {
            addCriterion("register_city not like", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityIn(List<String> values) {
            addCriterion("register_city in", values, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotIn(List<String> values) {
            addCriterion("register_city not in", values, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityBetween(String value1, String value2) {
            addCriterion("register_city between", value1, value2, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotBetween(String value1, String value2) {
            addCriterion("register_city not between", value1, value2, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameIsNull() {
            addCriterion("register_city_name is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameIsNotNull() {
            addCriterion("register_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameEqualTo(String value) {
            addCriterion("register_city_name =", value, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameNotEqualTo(String value) {
            addCriterion("register_city_name <>", value, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameGreaterThan(String value) {
            addCriterion("register_city_name >", value, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("register_city_name >=", value, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameLessThan(String value) {
            addCriterion("register_city_name <", value, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameLessThanOrEqualTo(String value) {
            addCriterion("register_city_name <=", value, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameLike(String value) {
            addCriterion("register_city_name like", value, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameNotLike(String value) {
            addCriterion("register_city_name not like", value, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameIn(List<String> values) {
            addCriterion("register_city_name in", values, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameNotIn(List<String> values) {
            addCriterion("register_city_name not in", values, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameBetween(String value1, String value2) {
            addCriterion("register_city_name between", value1, value2, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNameNotBetween(String value1, String value2) {
            addCriterion("register_city_name not between", value1, value2, "registerCityName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictIsNull() {
            addCriterion("register_district is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictIsNotNull() {
            addCriterion("register_district is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictEqualTo(String value) {
            addCriterion("register_district =", value, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNotEqualTo(String value) {
            addCriterion("register_district <>", value, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictGreaterThan(String value) {
            addCriterion("register_district >", value, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("register_district >=", value, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictLessThan(String value) {
            addCriterion("register_district <", value, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictLessThanOrEqualTo(String value) {
            addCriterion("register_district <=", value, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictLike(String value) {
            addCriterion("register_district like", value, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNotLike(String value) {
            addCriterion("register_district not like", value, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictIn(List<String> values) {
            addCriterion("register_district in", values, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNotIn(List<String> values) {
            addCriterion("register_district not in", values, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictBetween(String value1, String value2) {
            addCriterion("register_district between", value1, value2, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNotBetween(String value1, String value2) {
            addCriterion("register_district not between", value1, value2, "registerDistrict");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameIsNull() {
            addCriterion("register_district_name is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameIsNotNull() {
            addCriterion("register_district_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameEqualTo(String value) {
            addCriterion("register_district_name =", value, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameNotEqualTo(String value) {
            addCriterion("register_district_name <>", value, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameGreaterThan(String value) {
            addCriterion("register_district_name >", value, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("register_district_name >=", value, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameLessThan(String value) {
            addCriterion("register_district_name <", value, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("register_district_name <=", value, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameLike(String value) {
            addCriterion("register_district_name like", value, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameNotLike(String value) {
            addCriterion("register_district_name not like", value, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameIn(List<String> values) {
            addCriterion("register_district_name in", values, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameNotIn(List<String> values) {
            addCriterion("register_district_name not in", values, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameBetween(String value1, String value2) {
            addCriterion("register_district_name between", value1, value2, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterDistrictNameNotBetween(String value1, String value2) {
            addCriterion("register_district_name not between", value1, value2, "registerDistrictName");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNull() {
            addCriterion("register_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNotNull() {
            addCriterion("register_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressEqualTo(String value) {
            addCriterion("register_address =", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotEqualTo(String value) {
            addCriterion("register_address <>", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThan(String value) {
            addCriterion("register_address >", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("register_address >=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThan(String value) {
            addCriterion("register_address <", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThanOrEqualTo(String value) {
            addCriterion("register_address <=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLike(String value) {
            addCriterion("register_address like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotLike(String value) {
            addCriterion("register_address not like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIn(List<String> values) {
            addCriterion("register_address in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotIn(List<String> values) {
            addCriterion("register_address not in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressBetween(String value1, String value2) {
            addCriterion("register_address between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotBetween(String value1, String value2) {
            addCriterion("register_address not between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterLngIsNull() {
            addCriterion("register_lng is null");
            return (Criteria) this;
        }

        public Criteria andRegisterLngIsNotNull() {
            addCriterion("register_lng is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterLngEqualTo(String value) {
            addCriterion("register_lng =", value, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngNotEqualTo(String value) {
            addCriterion("register_lng <>", value, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngGreaterThan(String value) {
            addCriterion("register_lng >", value, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngGreaterThanOrEqualTo(String value) {
            addCriterion("register_lng >=", value, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngLessThan(String value) {
            addCriterion("register_lng <", value, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngLessThanOrEqualTo(String value) {
            addCriterion("register_lng <=", value, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngLike(String value) {
            addCriterion("register_lng like", value, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngNotLike(String value) {
            addCriterion("register_lng not like", value, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngIn(List<String> values) {
            addCriterion("register_lng in", values, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngNotIn(List<String> values) {
            addCriterion("register_lng not in", values, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngBetween(String value1, String value2) {
            addCriterion("register_lng between", value1, value2, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLngNotBetween(String value1, String value2) {
            addCriterion("register_lng not between", value1, value2, "registerLng");
            return (Criteria) this;
        }

        public Criteria andRegisterLatIsNull() {
            addCriterion("register_lat is null");
            return (Criteria) this;
        }

        public Criteria andRegisterLatIsNotNull() {
            addCriterion("register_lat is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterLatEqualTo(String value) {
            addCriterion("register_lat =", value, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatNotEqualTo(String value) {
            addCriterion("register_lat <>", value, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatGreaterThan(String value) {
            addCriterion("register_lat >", value, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatGreaterThanOrEqualTo(String value) {
            addCriterion("register_lat >=", value, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatLessThan(String value) {
            addCriterion("register_lat <", value, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatLessThanOrEqualTo(String value) {
            addCriterion("register_lat <=", value, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatLike(String value) {
            addCriterion("register_lat like", value, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatNotLike(String value) {
            addCriterion("register_lat not like", value, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatIn(List<String> values) {
            addCriterion("register_lat in", values, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatNotIn(List<String> values) {
            addCriterion("register_lat not in", values, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatBetween(String value1, String value2) {
            addCriterion("register_lat between", value1, value2, "registerLat");
            return (Criteria) this;
        }

        public Criteria andRegisterLatNotBetween(String value1, String value2) {
            addCriterion("register_lat not between", value1, value2, "registerLat");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNull() {
            addCriterion("car_model is null");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNotNull() {
            addCriterion("car_model is not null");
            return (Criteria) this;
        }

        public Criteria andCarModelEqualTo(String value) {
            addCriterion("car_model =", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotEqualTo(String value) {
            addCriterion("car_model <>", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThan(String value) {
            addCriterion("car_model >", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThanOrEqualTo(String value) {
            addCriterion("car_model >=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThan(String value) {
            addCriterion("car_model <", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThanOrEqualTo(String value) {
            addCriterion("car_model <=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLike(String value) {
            addCriterion("car_model like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotLike(String value) {
            addCriterion("car_model not like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelIn(List<String> values) {
            addCriterion("car_model in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotIn(List<String> values) {
            addCriterion("car_model not in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelBetween(String value1, String value2) {
            addCriterion("car_model between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotBetween(String value1, String value2) {
            addCriterion("car_model not between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andVinCodeIsNull() {
            addCriterion("vin_code is null");
            return (Criteria) this;
        }

        public Criteria andVinCodeIsNotNull() {
            addCriterion("vin_code is not null");
            return (Criteria) this;
        }

        public Criteria andVinCodeEqualTo(String value) {
            addCriterion("vin_code =", value, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeNotEqualTo(String value) {
            addCriterion("vin_code <>", value, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeGreaterThan(String value) {
            addCriterion("vin_code >", value, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vin_code >=", value, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeLessThan(String value) {
            addCriterion("vin_code <", value, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeLessThanOrEqualTo(String value) {
            addCriterion("vin_code <=", value, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeLike(String value) {
            addCriterion("vin_code like", value, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeNotLike(String value) {
            addCriterion("vin_code not like", value, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeIn(List<String> values) {
            addCriterion("vin_code in", values, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeNotIn(List<String> values) {
            addCriterion("vin_code not in", values, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeBetween(String value1, String value2) {
            addCriterion("vin_code between", value1, value2, "vinCode");
            return (Criteria) this;
        }

        public Criteria andVinCodeNotBetween(String value1, String value2) {
            addCriterion("vin_code not between", value1, value2, "vinCode");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNull() {
            addCriterion("engine_no is null");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNotNull() {
            addCriterion("engine_no is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNoEqualTo(String value) {
            addCriterion("engine_no =", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotEqualTo(String value) {
            addCriterion("engine_no <>", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThan(String value) {
            addCriterion("engine_no >", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("engine_no >=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThan(String value) {
            addCriterion("engine_no <", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThanOrEqualTo(String value) {
            addCriterion("engine_no <=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLike(String value) {
            addCriterion("engine_no like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotLike(String value) {
            addCriterion("engine_no not like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoIn(List<String> values) {
            addCriterion("engine_no in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotIn(List<String> values) {
            addCriterion("engine_no not in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoBetween(String value1, String value2) {
            addCriterion("engine_no between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotBetween(String value1, String value2) {
            addCriterion("engine_no not between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNull() {
            addCriterion("registration_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNotNull() {
            addCriterion("registration_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateEqualTo(Date value) {
            addCriterion("registration_date =", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotEqualTo(Date value) {
            addCriterion("registration_date <>", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThan(Date value) {
            addCriterion("registration_date >", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("registration_date >=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThan(Date value) {
            addCriterion("registration_date <", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThanOrEqualTo(Date value) {
            addCriterion("registration_date <=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIn(List<Date> values) {
            addCriterion("registration_date in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotIn(List<Date> values) {
            addCriterion("registration_date not in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateBetween(Date value1, Date value2) {
            addCriterion("registration_date between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotBetween(Date value1, Date value2) {
            addCriterion("registration_date not between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNull() {
            addCriterion("production_date is null");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNotNull() {
            addCriterion("production_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductionDateEqualTo(Date value) {
            addCriterion("production_date =", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotEqualTo(Date value) {
            addCriterion("production_date <>", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThan(Date value) {
            addCriterion("production_date >", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("production_date >=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThan(Date value) {
            addCriterion("production_date <", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThanOrEqualTo(Date value) {
            addCriterion("production_date <=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateIn(List<Date> values) {
            addCriterion("production_date in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotIn(List<Date> values) {
            addCriterion("production_date not in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateBetween(Date value1, Date value2) {
            addCriterion("production_date between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotBetween(Date value1, Date value2) {
            addCriterion("production_date not between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(Integer value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(Integer value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(Integer value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(Integer value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(Integer value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<Integer> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<Integer> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(Integer value1, Integer value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicIsNull() {
            addCriterion("cheqianzhao_fic is null");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicIsNotNull() {
            addCriterion("cheqianzhao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicEqualTo(String value) {
            addCriterion("cheqianzhao_fic =", value, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicNotEqualTo(String value) {
            addCriterion("cheqianzhao_fic <>", value, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicGreaterThan(String value) {
            addCriterion("cheqianzhao_fic >", value, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("cheqianzhao_fic >=", value, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicLessThan(String value) {
            addCriterion("cheqianzhao_fic <", value, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicLessThanOrEqualTo(String value) {
            addCriterion("cheqianzhao_fic <=", value, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicLike(String value) {
            addCriterion("cheqianzhao_fic like", value, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicNotLike(String value) {
            addCriterion("cheqianzhao_fic not like", value, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicIn(List<String> values) {
            addCriterion("cheqianzhao_fic in", values, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicNotIn(List<String> values) {
            addCriterion("cheqianzhao_fic not in", values, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicBetween(String value1, String value2) {
            addCriterion("cheqianzhao_fic between", value1, value2, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andCheqianzhaoFicNotBetween(String value1, String value2) {
            addCriterion("cheqianzhao_fic not between", value1, value2, "cheqianzhaoFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicIsNull() {
            addCriterion("pinggushi_fic is null");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicIsNotNull() {
            addCriterion("pinggushi_fic is not null");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicEqualTo(String value) {
            addCriterion("pinggushi_fic =", value, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicNotEqualTo(String value) {
            addCriterion("pinggushi_fic <>", value, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicGreaterThan(String value) {
            addCriterion("pinggushi_fic >", value, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicGreaterThanOrEqualTo(String value) {
            addCriterion("pinggushi_fic >=", value, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicLessThan(String value) {
            addCriterion("pinggushi_fic <", value, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicLessThanOrEqualTo(String value) {
            addCriterion("pinggushi_fic <=", value, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicLike(String value) {
            addCriterion("pinggushi_fic like", value, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicNotLike(String value) {
            addCriterion("pinggushi_fic not like", value, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicIn(List<String> values) {
            addCriterion("pinggushi_fic in", values, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicNotIn(List<String> values) {
            addCriterion("pinggushi_fic not in", values, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicBetween(String value1, String value2) {
            addCriterion("pinggushi_fic between", value1, value2, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andPinggushiFicNotBetween(String value1, String value2) {
            addCriterion("pinggushi_fic not between", value1, value2, "pinggushiFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicIsNull() {
            addCriterion("abzhu_fic is null");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicIsNotNull() {
            addCriterion("abzhu_fic is not null");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicEqualTo(String value) {
            addCriterion("abzhu_fic =", value, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicNotEqualTo(String value) {
            addCriterion("abzhu_fic <>", value, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicGreaterThan(String value) {
            addCriterion("abzhu_fic >", value, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicGreaterThanOrEqualTo(String value) {
            addCriterion("abzhu_fic >=", value, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicLessThan(String value) {
            addCriterion("abzhu_fic <", value, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicLessThanOrEqualTo(String value) {
            addCriterion("abzhu_fic <=", value, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicLike(String value) {
            addCriterion("abzhu_fic like", value, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicNotLike(String value) {
            addCriterion("abzhu_fic not like", value, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicIn(List<String> values) {
            addCriterion("abzhu_fic in", values, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicNotIn(List<String> values) {
            addCriterion("abzhu_fic not in", values, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicBetween(String value1, String value2) {
            addCriterion("abzhu_fic between", value1, value2, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andAbzhuFicNotBetween(String value1, String value2) {
            addCriterion("abzhu_fic not between", value1, value2, "abzhuFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicIsNull() {
            addCriterion("yibaio_fic is null");
            return (Criteria) this;
        }

        public Criteria andYibaioFicIsNotNull() {
            addCriterion("yibaio_fic is not null");
            return (Criteria) this;
        }

        public Criteria andYibaioFicEqualTo(String value) {
            addCriterion("yibaio_fic =", value, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicNotEqualTo(String value) {
            addCriterion("yibaio_fic <>", value, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicGreaterThan(String value) {
            addCriterion("yibaio_fic >", value, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicGreaterThanOrEqualTo(String value) {
            addCriterion("yibaio_fic >=", value, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicLessThan(String value) {
            addCriterion("yibaio_fic <", value, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicLessThanOrEqualTo(String value) {
            addCriterion("yibaio_fic <=", value, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicLike(String value) {
            addCriterion("yibaio_fic like", value, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicNotLike(String value) {
            addCriterion("yibaio_fic not like", value, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicIn(List<String> values) {
            addCriterion("yibaio_fic in", values, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicNotIn(List<String> values) {
            addCriterion("yibaio_fic not in", values, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicBetween(String value1, String value2) {
            addCriterion("yibaio_fic between", value1, value2, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYibaioFicNotBetween(String value1, String value2) {
            addCriterion("yibaio_fic not between", value1, value2, "yibaioFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicIsNull() {
            addCriterion("yaoshi_fic is null");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicIsNotNull() {
            addCriterion("yaoshi_fic is not null");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicEqualTo(String value) {
            addCriterion("yaoshi_fic =", value, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicNotEqualTo(String value) {
            addCriterion("yaoshi_fic <>", value, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicGreaterThan(String value) {
            addCriterion("yaoshi_fic >", value, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicGreaterThanOrEqualTo(String value) {
            addCriterion("yaoshi_fic >=", value, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicLessThan(String value) {
            addCriterion("yaoshi_fic <", value, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicLessThanOrEqualTo(String value) {
            addCriterion("yaoshi_fic <=", value, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicLike(String value) {
            addCriterion("yaoshi_fic like", value, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicNotLike(String value) {
            addCriterion("yaoshi_fic not like", value, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicIn(List<String> values) {
            addCriterion("yaoshi_fic in", values, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicNotIn(List<String> values) {
            addCriterion("yaoshi_fic not in", values, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicBetween(String value1, String value2) {
            addCriterion("yaoshi_fic between", value1, value2, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andYaoshiFicNotBetween(String value1, String value2) {
            addCriterion("yaoshi_fic not between", value1, value2, "yaoshiFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicIsNull() {
            addCriterion("zhongkong_fic is null");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicIsNotNull() {
            addCriterion("zhongkong_fic is not null");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicEqualTo(String value) {
            addCriterion("zhongkong_fic =", value, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicNotEqualTo(String value) {
            addCriterion("zhongkong_fic <>", value, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicGreaterThan(String value) {
            addCriterion("zhongkong_fic >", value, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicGreaterThanOrEqualTo(String value) {
            addCriterion("zhongkong_fic >=", value, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicLessThan(String value) {
            addCriterion("zhongkong_fic <", value, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicLessThanOrEqualTo(String value) {
            addCriterion("zhongkong_fic <=", value, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicLike(String value) {
            addCriterion("zhongkong_fic like", value, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicNotLike(String value) {
            addCriterion("zhongkong_fic not like", value, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicIn(List<String> values) {
            addCriterion("zhongkong_fic in", values, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicNotIn(List<String> values) {
            addCriterion("zhongkong_fic not in", values, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicBetween(String value1, String value2) {
            addCriterion("zhongkong_fic between", value1, value2, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZhongkongFicNotBetween(String value1, String value2) {
            addCriterion("zhongkong_fic not between", value1, value2, "zhongkongFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicIsNull() {
            addCriterion("zuohoumen_fic is null");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicIsNotNull() {
            addCriterion("zuohoumen_fic is not null");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicEqualTo(String value) {
            addCriterion("zuohoumen_fic =", value, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicNotEqualTo(String value) {
            addCriterion("zuohoumen_fic <>", value, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicGreaterThan(String value) {
            addCriterion("zuohoumen_fic >", value, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicGreaterThanOrEqualTo(String value) {
            addCriterion("zuohoumen_fic >=", value, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicLessThan(String value) {
            addCriterion("zuohoumen_fic <", value, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicLessThanOrEqualTo(String value) {
            addCriterion("zuohoumen_fic <=", value, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicLike(String value) {
            addCriterion("zuohoumen_fic like", value, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicNotLike(String value) {
            addCriterion("zuohoumen_fic not like", value, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicIn(List<String> values) {
            addCriterion("zuohoumen_fic in", values, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicNotIn(List<String> values) {
            addCriterion("zuohoumen_fic not in", values, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicBetween(String value1, String value2) {
            addCriterion("zuohoumen_fic between", value1, value2, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andZuohoumenFicNotBetween(String value1, String value2) {
            addCriterion("zuohoumen_fic not between", value1, value2, "zuohoumenFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicIsNull() {
            addCriterion("beitai_fic is null");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicIsNotNull() {
            addCriterion("beitai_fic is not null");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicEqualTo(String value) {
            addCriterion("beitai_fic =", value, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicNotEqualTo(String value) {
            addCriterion("beitai_fic <>", value, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicGreaterThan(String value) {
            addCriterion("beitai_fic >", value, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicGreaterThanOrEqualTo(String value) {
            addCriterion("beitai_fic >=", value, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicLessThan(String value) {
            addCriterion("beitai_fic <", value, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicLessThanOrEqualTo(String value) {
            addCriterion("beitai_fic <=", value, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicLike(String value) {
            addCriterion("beitai_fic like", value, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicNotLike(String value) {
            addCriterion("beitai_fic not like", value, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicIn(List<String> values) {
            addCriterion("beitai_fic in", values, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicNotIn(List<String> values) {
            addCriterion("beitai_fic not in", values, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicBetween(String value1, String value2) {
            addCriterion("beitai_fic between", value1, value2, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andBeitaiFicNotBetween(String value1, String value2) {
            addCriterion("beitai_fic not between", value1, value2, "beitaiFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicIsNull() {
            addCriterion("chehouzhao_fic is null");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicIsNotNull() {
            addCriterion("chehouzhao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicEqualTo(String value) {
            addCriterion("chehouzhao_fic =", value, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicNotEqualTo(String value) {
            addCriterion("chehouzhao_fic <>", value, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicGreaterThan(String value) {
            addCriterion("chehouzhao_fic >", value, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("chehouzhao_fic >=", value, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicLessThan(String value) {
            addCriterion("chehouzhao_fic <", value, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicLessThanOrEqualTo(String value) {
            addCriterion("chehouzhao_fic <=", value, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicLike(String value) {
            addCriterion("chehouzhao_fic like", value, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicNotLike(String value) {
            addCriterion("chehouzhao_fic not like", value, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicIn(List<String> values) {
            addCriterion("chehouzhao_fic in", values, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicNotIn(List<String> values) {
            addCriterion("chehouzhao_fic not in", values, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicBetween(String value1, String value2) {
            addCriterion("chehouzhao_fic between", value1, value2, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andChehouzhaoFicNotBetween(String value1, String value2) {
            addCriterion("chehouzhao_fic not between", value1, value2, "chehouzhaoFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicIsNull() {
            addCriterion("youhou_fic is null");
            return (Criteria) this;
        }

        public Criteria andYouhouFicIsNotNull() {
            addCriterion("youhou_fic is not null");
            return (Criteria) this;
        }

        public Criteria andYouhouFicEqualTo(String value) {
            addCriterion("youhou_fic =", value, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicNotEqualTo(String value) {
            addCriterion("youhou_fic <>", value, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicGreaterThan(String value) {
            addCriterion("youhou_fic >", value, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicGreaterThanOrEqualTo(String value) {
            addCriterion("youhou_fic >=", value, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicLessThan(String value) {
            addCriterion("youhou_fic <", value, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicLessThanOrEqualTo(String value) {
            addCriterion("youhou_fic <=", value, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicLike(String value) {
            addCriterion("youhou_fic like", value, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicNotLike(String value) {
            addCriterion("youhou_fic not like", value, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicIn(List<String> values) {
            addCriterion("youhou_fic in", values, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicNotIn(List<String> values) {
            addCriterion("youhou_fic not in", values, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicBetween(String value1, String value2) {
            addCriterion("youhou_fic between", value1, value2, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouhouFicNotBetween(String value1, String value2) {
            addCriterion("youhou_fic not between", value1, value2, "youhouFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicIsNull() {
            addCriterion("youqian_fic is null");
            return (Criteria) this;
        }

        public Criteria andYouqianFicIsNotNull() {
            addCriterion("youqian_fic is not null");
            return (Criteria) this;
        }

        public Criteria andYouqianFicEqualTo(String value) {
            addCriterion("youqian_fic =", value, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicNotEqualTo(String value) {
            addCriterion("youqian_fic <>", value, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicGreaterThan(String value) {
            addCriterion("youqian_fic >", value, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicGreaterThanOrEqualTo(String value) {
            addCriterion("youqian_fic >=", value, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicLessThan(String value) {
            addCriterion("youqian_fic <", value, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicLessThanOrEqualTo(String value) {
            addCriterion("youqian_fic <=", value, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicLike(String value) {
            addCriterion("youqian_fic like", value, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicNotLike(String value) {
            addCriterion("youqian_fic not like", value, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicIn(List<String> values) {
            addCriterion("youqian_fic in", values, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicNotIn(List<String> values) {
            addCriterion("youqian_fic not in", values, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicBetween(String value1, String value2) {
            addCriterion("youqian_fic between", value1, value2, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andYouqianFicNotBetween(String value1, String value2) {
            addCriterion("youqian_fic not between", value1, value2, "youqianFic");
            return (Criteria) this;
        }

        public Criteria andVinFicIsNull() {
            addCriterion("vin_fic is null");
            return (Criteria) this;
        }

        public Criteria andVinFicIsNotNull() {
            addCriterion("vin_fic is not null");
            return (Criteria) this;
        }

        public Criteria andVinFicEqualTo(String value) {
            addCriterion("vin_fic =", value, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicNotEqualTo(String value) {
            addCriterion("vin_fic <>", value, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicGreaterThan(String value) {
            addCriterion("vin_fic >", value, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicGreaterThanOrEqualTo(String value) {
            addCriterion("vin_fic >=", value, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicLessThan(String value) {
            addCriterion("vin_fic <", value, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicLessThanOrEqualTo(String value) {
            addCriterion("vin_fic <=", value, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicLike(String value) {
            addCriterion("vin_fic like", value, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicNotLike(String value) {
            addCriterion("vin_fic not like", value, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicIn(List<String> values) {
            addCriterion("vin_fic in", values, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicNotIn(List<String> values) {
            addCriterion("vin_fic not in", values, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicBetween(String value1, String value2) {
            addCriterion("vin_fic between", value1, value2, "vinFic");
            return (Criteria) this;
        }

        public Criteria andVinFicNotBetween(String value1, String value2) {
            addCriterion("vin_fic not between", value1, value2, "vinFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicIsNull() {
            addCriterion("chuchang_fic is null");
            return (Criteria) this;
        }

        public Criteria andChuchangFicIsNotNull() {
            addCriterion("chuchang_fic is not null");
            return (Criteria) this;
        }

        public Criteria andChuchangFicEqualTo(String value) {
            addCriterion("chuchang_fic =", value, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicNotEqualTo(String value) {
            addCriterion("chuchang_fic <>", value, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicGreaterThan(String value) {
            addCriterion("chuchang_fic >", value, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicGreaterThanOrEqualTo(String value) {
            addCriterion("chuchang_fic >=", value, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicLessThan(String value) {
            addCriterion("chuchang_fic <", value, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicLessThanOrEqualTo(String value) {
            addCriterion("chuchang_fic <=", value, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicLike(String value) {
            addCriterion("chuchang_fic like", value, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicNotLike(String value) {
            addCriterion("chuchang_fic not like", value, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicIn(List<String> values) {
            addCriterion("chuchang_fic in", values, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicNotIn(List<String> values) {
            addCriterion("chuchang_fic not in", values, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicBetween(String value1, String value2) {
            addCriterion("chuchang_fic between", value1, value2, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andChuchangFicNotBetween(String value1, String value2) {
            addCriterion("chuchang_fic not between", value1, value2, "chuchangFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicIsNull() {
            addCriterion("yinqing_fic is null");
            return (Criteria) this;
        }

        public Criteria andYinqingFicIsNotNull() {
            addCriterion("yinqing_fic is not null");
            return (Criteria) this;
        }

        public Criteria andYinqingFicEqualTo(String value) {
            addCriterion("yinqing_fic =", value, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicNotEqualTo(String value) {
            addCriterion("yinqing_fic <>", value, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicGreaterThan(String value) {
            addCriterion("yinqing_fic >", value, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicGreaterThanOrEqualTo(String value) {
            addCriterion("yinqing_fic >=", value, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicLessThan(String value) {
            addCriterion("yinqing_fic <", value, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicLessThanOrEqualTo(String value) {
            addCriterion("yinqing_fic <=", value, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicLike(String value) {
            addCriterion("yinqing_fic like", value, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicNotLike(String value) {
            addCriterion("yinqing_fic not like", value, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicIn(List<String> values) {
            addCriterion("yinqing_fic in", values, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicNotIn(List<String> values) {
            addCriterion("yinqing_fic not in", values, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicBetween(String value1, String value2) {
            addCriterion("yinqing_fic between", value1, value2, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andYinqingFicNotBetween(String value1, String value2) {
            addCriterion("yinqing_fic not between", value1, value2, "yinqingFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicIsNull() {
            addCriterion("weixiu_fic is null");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicIsNotNull() {
            addCriterion("weixiu_fic is not null");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicEqualTo(String value) {
            addCriterion("weixiu_fic =", value, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicNotEqualTo(String value) {
            addCriterion("weixiu_fic <>", value, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicGreaterThan(String value) {
            addCriterion("weixiu_fic >", value, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicGreaterThanOrEqualTo(String value) {
            addCriterion("weixiu_fic >=", value, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicLessThan(String value) {
            addCriterion("weixiu_fic <", value, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicLessThanOrEqualTo(String value) {
            addCriterion("weixiu_fic <=", value, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicLike(String value) {
            addCriterion("weixiu_fic like", value, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicNotLike(String value) {
            addCriterion("weixiu_fic not like", value, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicIn(List<String> values) {
            addCriterion("weixiu_fic in", values, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicNotIn(List<String> values) {
            addCriterion("weixiu_fic not in", values, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicBetween(String value1, String value2) {
            addCriterion("weixiu_fic between", value1, value2, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andWeixiuFicNotBetween(String value1, String value2) {
            addCriterion("weixiu_fic not between", value1, value2, "weixiuFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicIsNull() {
            addCriterion("gouchehetong_fic is null");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicIsNotNull() {
            addCriterion("gouchehetong_fic is not null");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicEqualTo(String value) {
            addCriterion("gouchehetong_fic =", value, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicNotEqualTo(String value) {
            addCriterion("gouchehetong_fic <>", value, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicGreaterThan(String value) {
            addCriterion("gouchehetong_fic >", value, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicGreaterThanOrEqualTo(String value) {
            addCriterion("gouchehetong_fic >=", value, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicLessThan(String value) {
            addCriterion("gouchehetong_fic <", value, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicLessThanOrEqualTo(String value) {
            addCriterion("gouchehetong_fic <=", value, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicLike(String value) {
            addCriterion("gouchehetong_fic like", value, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicNotLike(String value) {
            addCriterion("gouchehetong_fic not like", value, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicIn(List<String> values) {
            addCriterion("gouchehetong_fic in", values, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicNotIn(List<String> values) {
            addCriterion("gouchehetong_fic not in", values, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicBetween(String value1, String value2) {
            addCriterion("gouchehetong_fic between", value1, value2, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andGouchehetongFicNotBetween(String value1, String value2) {
            addCriterion("gouchehetong_fic not between", value1, value2, "gouchehetongFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicIsNull() {
            addCriterion("add_gps_fic is null");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicIsNotNull() {
            addCriterion("add_gps_fic is not null");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicEqualTo(String value) {
            addCriterion("add_gps_fic =", value, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicNotEqualTo(String value) {
            addCriterion("add_gps_fic <>", value, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicGreaterThan(String value) {
            addCriterion("add_gps_fic >", value, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicGreaterThanOrEqualTo(String value) {
            addCriterion("add_gps_fic >=", value, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicLessThan(String value) {
            addCriterion("add_gps_fic <", value, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicLessThanOrEqualTo(String value) {
            addCriterion("add_gps_fic <=", value, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicLike(String value) {
            addCriterion("add_gps_fic like", value, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicNotLike(String value) {
            addCriterion("add_gps_fic not like", value, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicIn(List<String> values) {
            addCriterion("add_gps_fic in", values, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicNotIn(List<String> values) {
            addCriterion("add_gps_fic not in", values, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicBetween(String value1, String value2) {
            addCriterion("add_gps_fic between", value1, value2, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andAddGpsFicNotBetween(String value1, String value2) {
            addCriterion("add_gps_fic not between", value1, value2, "addGpsFic");
            return (Criteria) this;
        }

        public Criteria andGpsficIsNull() {
            addCriterion("gpsFic is null");
            return (Criteria) this;
        }

        public Criteria andGpsficIsNotNull() {
            addCriterion("gpsFic is not null");
            return (Criteria) this;
        }

        public Criteria andGpsficEqualTo(String value) {
            addCriterion("gpsFic =", value, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficNotEqualTo(String value) {
            addCriterion("gpsFic <>", value, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficGreaterThan(String value) {
            addCriterion("gpsFic >", value, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficGreaterThanOrEqualTo(String value) {
            addCriterion("gpsFic >=", value, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficLessThan(String value) {
            addCriterion("gpsFic <", value, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficLessThanOrEqualTo(String value) {
            addCriterion("gpsFic <=", value, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficLike(String value) {
            addCriterion("gpsFic like", value, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficNotLike(String value) {
            addCriterion("gpsFic not like", value, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficIn(List<String> values) {
            addCriterion("gpsFic in", values, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficNotIn(List<String> values) {
            addCriterion("gpsFic not in", values, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficBetween(String value1, String value2) {
            addCriterion("gpsFic between", value1, value2, "gpsfic");
            return (Criteria) this;
        }

        public Criteria andGpsficNotBetween(String value1, String value2) {
            addCriterion("gpsFic not between", value1, value2, "gpsfic");
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