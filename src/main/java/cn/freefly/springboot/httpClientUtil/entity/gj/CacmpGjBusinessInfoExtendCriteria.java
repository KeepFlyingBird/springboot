package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjBusinessInfoExtendCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjBusinessInfoExtendCriteria() {
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

        public Criteria andBusiProvinceIsNull() {
            addCriterion("busi_province is null");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceIsNotNull() {
            addCriterion("busi_province is not null");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceEqualTo(String value) {
            addCriterion("busi_province =", value, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNotEqualTo(String value) {
            addCriterion("busi_province <>", value, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceGreaterThan(String value) {
            addCriterion("busi_province >", value, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("busi_province >=", value, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceLessThan(String value) {
            addCriterion("busi_province <", value, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceLessThanOrEqualTo(String value) {
            addCriterion("busi_province <=", value, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceLike(String value) {
            addCriterion("busi_province like", value, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNotLike(String value) {
            addCriterion("busi_province not like", value, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceIn(List<String> values) {
            addCriterion("busi_province in", values, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNotIn(List<String> values) {
            addCriterion("busi_province not in", values, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceBetween(String value1, String value2) {
            addCriterion("busi_province between", value1, value2, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNotBetween(String value1, String value2) {
            addCriterion("busi_province not between", value1, value2, "busiProvince");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameIsNull() {
            addCriterion("busi_province_name is null");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameIsNotNull() {
            addCriterion("busi_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameEqualTo(String value) {
            addCriterion("busi_province_name =", value, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameNotEqualTo(String value) {
            addCriterion("busi_province_name <>", value, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameGreaterThan(String value) {
            addCriterion("busi_province_name >", value, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("busi_province_name >=", value, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameLessThan(String value) {
            addCriterion("busi_province_name <", value, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("busi_province_name <=", value, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameLike(String value) {
            addCriterion("busi_province_name like", value, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameNotLike(String value) {
            addCriterion("busi_province_name not like", value, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameIn(List<String> values) {
            addCriterion("busi_province_name in", values, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameNotIn(List<String> values) {
            addCriterion("busi_province_name not in", values, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameBetween(String value1, String value2) {
            addCriterion("busi_province_name between", value1, value2, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiProvinceNameNotBetween(String value1, String value2) {
            addCriterion("busi_province_name not between", value1, value2, "busiProvinceName");
            return (Criteria) this;
        }

        public Criteria andBusiCityIsNull() {
            addCriterion("busi_city is null");
            return (Criteria) this;
        }

        public Criteria andBusiCityIsNotNull() {
            addCriterion("busi_city is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCityEqualTo(String value) {
            addCriterion("busi_city =", value, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityNotEqualTo(String value) {
            addCriterion("busi_city <>", value, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityGreaterThan(String value) {
            addCriterion("busi_city >", value, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityGreaterThanOrEqualTo(String value) {
            addCriterion("busi_city >=", value, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityLessThan(String value) {
            addCriterion("busi_city <", value, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityLessThanOrEqualTo(String value) {
            addCriterion("busi_city <=", value, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityLike(String value) {
            addCriterion("busi_city like", value, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityNotLike(String value) {
            addCriterion("busi_city not like", value, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityIn(List<String> values) {
            addCriterion("busi_city in", values, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityNotIn(List<String> values) {
            addCriterion("busi_city not in", values, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityBetween(String value1, String value2) {
            addCriterion("busi_city between", value1, value2, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityNotBetween(String value1, String value2) {
            addCriterion("busi_city not between", value1, value2, "busiCity");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameIsNull() {
            addCriterion("busi_city_name is null");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameIsNotNull() {
            addCriterion("busi_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameEqualTo(String value) {
            addCriterion("busi_city_name =", value, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameNotEqualTo(String value) {
            addCriterion("busi_city_name <>", value, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameGreaterThan(String value) {
            addCriterion("busi_city_name >", value, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("busi_city_name >=", value, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameLessThan(String value) {
            addCriterion("busi_city_name <", value, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameLessThanOrEqualTo(String value) {
            addCriterion("busi_city_name <=", value, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameLike(String value) {
            addCriterion("busi_city_name like", value, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameNotLike(String value) {
            addCriterion("busi_city_name not like", value, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameIn(List<String> values) {
            addCriterion("busi_city_name in", values, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameNotIn(List<String> values) {
            addCriterion("busi_city_name not in", values, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameBetween(String value1, String value2) {
            addCriterion("busi_city_name between", value1, value2, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiCityNameNotBetween(String value1, String value2) {
            addCriterion("busi_city_name not between", value1, value2, "busiCityName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictIsNull() {
            addCriterion("busi_district is null");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictIsNotNull() {
            addCriterion("busi_district is not null");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictEqualTo(String value) {
            addCriterion("busi_district =", value, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNotEqualTo(String value) {
            addCriterion("busi_district <>", value, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictGreaterThan(String value) {
            addCriterion("busi_district >", value, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("busi_district >=", value, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictLessThan(String value) {
            addCriterion("busi_district <", value, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictLessThanOrEqualTo(String value) {
            addCriterion("busi_district <=", value, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictLike(String value) {
            addCriterion("busi_district like", value, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNotLike(String value) {
            addCriterion("busi_district not like", value, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictIn(List<String> values) {
            addCriterion("busi_district in", values, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNotIn(List<String> values) {
            addCriterion("busi_district not in", values, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictBetween(String value1, String value2) {
            addCriterion("busi_district between", value1, value2, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNotBetween(String value1, String value2) {
            addCriterion("busi_district not between", value1, value2, "busiDistrict");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameIsNull() {
            addCriterion("busi_district_name is null");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameIsNotNull() {
            addCriterion("busi_district_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameEqualTo(String value) {
            addCriterion("busi_district_name =", value, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameNotEqualTo(String value) {
            addCriterion("busi_district_name <>", value, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameGreaterThan(String value) {
            addCriterion("busi_district_name >", value, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("busi_district_name >=", value, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameLessThan(String value) {
            addCriterion("busi_district_name <", value, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("busi_district_name <=", value, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameLike(String value) {
            addCriterion("busi_district_name like", value, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameNotLike(String value) {
            addCriterion("busi_district_name not like", value, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameIn(List<String> values) {
            addCriterion("busi_district_name in", values, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameNotIn(List<String> values) {
            addCriterion("busi_district_name not in", values, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameBetween(String value1, String value2) {
            addCriterion("busi_district_name between", value1, value2, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiDistrictNameNotBetween(String value1, String value2) {
            addCriterion("busi_district_name not between", value1, value2, "busiDistrictName");
            return (Criteria) this;
        }

        public Criteria andBusiAddressIsNull() {
            addCriterion("busi_address is null");
            return (Criteria) this;
        }

        public Criteria andBusiAddressIsNotNull() {
            addCriterion("busi_address is not null");
            return (Criteria) this;
        }

        public Criteria andBusiAddressEqualTo(String value) {
            addCriterion("busi_address =", value, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressNotEqualTo(String value) {
            addCriterion("busi_address <>", value, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressGreaterThan(String value) {
            addCriterion("busi_address >", value, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressGreaterThanOrEqualTo(String value) {
            addCriterion("busi_address >=", value, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressLessThan(String value) {
            addCriterion("busi_address <", value, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressLessThanOrEqualTo(String value) {
            addCriterion("busi_address <=", value, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressLike(String value) {
            addCriterion("busi_address like", value, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressNotLike(String value) {
            addCriterion("busi_address not like", value, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressIn(List<String> values) {
            addCriterion("busi_address in", values, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressNotIn(List<String> values) {
            addCriterion("busi_address not in", values, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressBetween(String value1, String value2) {
            addCriterion("busi_address between", value1, value2, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiAddressNotBetween(String value1, String value2) {
            addCriterion("busi_address not between", value1, value2, "busiAddress");
            return (Criteria) this;
        }

        public Criteria andBusiLngIsNull() {
            addCriterion("busi_lng is null");
            return (Criteria) this;
        }

        public Criteria andBusiLngIsNotNull() {
            addCriterion("busi_lng is not null");
            return (Criteria) this;
        }

        public Criteria andBusiLngEqualTo(String value) {
            addCriterion("busi_lng =", value, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngNotEqualTo(String value) {
            addCriterion("busi_lng <>", value, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngGreaterThan(String value) {
            addCriterion("busi_lng >", value, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngGreaterThanOrEqualTo(String value) {
            addCriterion("busi_lng >=", value, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngLessThan(String value) {
            addCriterion("busi_lng <", value, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngLessThanOrEqualTo(String value) {
            addCriterion("busi_lng <=", value, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngLike(String value) {
            addCriterion("busi_lng like", value, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngNotLike(String value) {
            addCriterion("busi_lng not like", value, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngIn(List<String> values) {
            addCriterion("busi_lng in", values, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngNotIn(List<String> values) {
            addCriterion("busi_lng not in", values, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngBetween(String value1, String value2) {
            addCriterion("busi_lng between", value1, value2, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLngNotBetween(String value1, String value2) {
            addCriterion("busi_lng not between", value1, value2, "busiLng");
            return (Criteria) this;
        }

        public Criteria andBusiLatIsNull() {
            addCriterion("busi_lat is null");
            return (Criteria) this;
        }

        public Criteria andBusiLatIsNotNull() {
            addCriterion("busi_lat is not null");
            return (Criteria) this;
        }

        public Criteria andBusiLatEqualTo(String value) {
            addCriterion("busi_lat =", value, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatNotEqualTo(String value) {
            addCriterion("busi_lat <>", value, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatGreaterThan(String value) {
            addCriterion("busi_lat >", value, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatGreaterThanOrEqualTo(String value) {
            addCriterion("busi_lat >=", value, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatLessThan(String value) {
            addCriterion("busi_lat <", value, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatLessThanOrEqualTo(String value) {
            addCriterion("busi_lat <=", value, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatLike(String value) {
            addCriterion("busi_lat like", value, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatNotLike(String value) {
            addCriterion("busi_lat not like", value, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatIn(List<String> values) {
            addCriterion("busi_lat in", values, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatNotIn(List<String> values) {
            addCriterion("busi_lat not in", values, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatBetween(String value1, String value2) {
            addCriterion("busi_lat between", value1, value2, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiLatNotBetween(String value1, String value2) {
            addCriterion("busi_lat not between", value1, value2, "busiLat");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateIsNull() {
            addCriterion("busi_contract_date is null");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateIsNotNull() {
            addCriterion("busi_contract_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateEqualTo(String value) {
            addCriterion("busi_contract_date =", value, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateNotEqualTo(String value) {
            addCriterion("busi_contract_date <>", value, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateGreaterThan(String value) {
            addCriterion("busi_contract_date >", value, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateGreaterThanOrEqualTo(String value) {
            addCriterion("busi_contract_date >=", value, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateLessThan(String value) {
            addCriterion("busi_contract_date <", value, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateLessThanOrEqualTo(String value) {
            addCriterion("busi_contract_date <=", value, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateLike(String value) {
            addCriterion("busi_contract_date like", value, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateNotLike(String value) {
            addCriterion("busi_contract_date not like", value, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateIn(List<String> values) {
            addCriterion("busi_contract_date in", values, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateNotIn(List<String> values) {
            addCriterion("busi_contract_date not in", values, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateBetween(String value1, String value2) {
            addCriterion("busi_contract_date between", value1, value2, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andBusiContractDateNotBetween(String value1, String value2) {
            addCriterion("busi_contract_date not between", value1, value2, "busiContractDate");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicIsNull() {
            addCriterion("rongzihetong_fic is null");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicIsNotNull() {
            addCriterion("rongzihetong_fic is not null");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicEqualTo(String value) {
            addCriterion("rongzihetong_fic =", value, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicNotEqualTo(String value) {
            addCriterion("rongzihetong_fic <>", value, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicGreaterThan(String value) {
            addCriterion("rongzihetong_fic >", value, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicGreaterThanOrEqualTo(String value) {
            addCriterion("rongzihetong_fic >=", value, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicLessThan(String value) {
            addCriterion("rongzihetong_fic <", value, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicLessThanOrEqualTo(String value) {
            addCriterion("rongzihetong_fic <=", value, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicLike(String value) {
            addCriterion("rongzihetong_fic like", value, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicNotLike(String value) {
            addCriterion("rongzihetong_fic not like", value, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicIn(List<String> values) {
            addCriterion("rongzihetong_fic in", values, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicNotIn(List<String> values) {
            addCriterion("rongzihetong_fic not in", values, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicBetween(String value1, String value2) {
            addCriterion("rongzihetong_fic between", value1, value2, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andRongzihetongFicNotBetween(String value1, String value2) {
            addCriterion("rongzihetong_fic not between", value1, value2, "rongzihetongFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicIsNull() {
            addCriterion("toubaodan_fic is null");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicIsNotNull() {
            addCriterion("toubaodan_fic is not null");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicEqualTo(String value) {
            addCriterion("toubaodan_fic =", value, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicNotEqualTo(String value) {
            addCriterion("toubaodan_fic <>", value, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicGreaterThan(String value) {
            addCriterion("toubaodan_fic >", value, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicGreaterThanOrEqualTo(String value) {
            addCriterion("toubaodan_fic >=", value, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicLessThan(String value) {
            addCriterion("toubaodan_fic <", value, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicLessThanOrEqualTo(String value) {
            addCriterion("toubaodan_fic <=", value, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicLike(String value) {
            addCriterion("toubaodan_fic like", value, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicNotLike(String value) {
            addCriterion("toubaodan_fic not like", value, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicIn(List<String> values) {
            addCriterion("toubaodan_fic in", values, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicNotIn(List<String> values) {
            addCriterion("toubaodan_fic not in", values, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicBetween(String value1, String value2) {
            addCriterion("toubaodan_fic between", value1, value2, "toubaodanFic");
            return (Criteria) this;
        }

        public Criteria andToubaodanFicNotBetween(String value1, String value2) {
            addCriterion("toubaodan_fic not between", value1, value2, "toubaodanFic");
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

        public Criteria andBusiCodeIsNull() {
            addCriterion("busi_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIsNotNull() {
            addCriterion("busi_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeEqualTo(String value) {
            addCriterion("busi_code =", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotEqualTo(String value) {
            addCriterion("busi_code <>", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThan(String value) {
            addCriterion("busi_code >", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_code >=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThan(String value) {
            addCriterion("busi_code <", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_code <=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLike(String value) {
            addCriterion("busi_code like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotLike(String value) {
            addCriterion("busi_code not like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIn(List<String> values) {
            addCriterion("busi_code in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotIn(List<String> values) {
            addCriterion("busi_code not in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeBetween(String value1, String value2) {
            addCriterion("busi_code between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotBetween(String value1, String value2) {
            addCriterion("busi_code not between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNull() {
            addCriterion("busi_type is null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNotNull() {
            addCriterion("busi_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeEqualTo(String value) {
            addCriterion("busi_type =", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotEqualTo(String value) {
            addCriterion("busi_type <>", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThan(String value) {
            addCriterion("busi_type >", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_type >=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThan(String value) {
            addCriterion("busi_type <", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("busi_type <=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLike(String value) {
            addCriterion("busi_type like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotLike(String value) {
            addCriterion("busi_type not like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIn(List<String> values) {
            addCriterion("busi_type in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotIn(List<String> values) {
            addCriterion("busi_type not in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeBetween(String value1, String value2) {
            addCriterion("busi_type between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotBetween(String value1, String value2) {
            addCriterion("busi_type not between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdIsNull() {
            addCriterion("seller_company_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdIsNotNull() {
            addCriterion("seller_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdEqualTo(String value) {
            addCriterion("seller_company_id =", value, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdNotEqualTo(String value) {
            addCriterion("seller_company_id <>", value, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdGreaterThan(String value) {
            addCriterion("seller_company_id >", value, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_company_id >=", value, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdLessThan(String value) {
            addCriterion("seller_company_id <", value, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("seller_company_id <=", value, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdLike(String value) {
            addCriterion("seller_company_id like", value, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdNotLike(String value) {
            addCriterion("seller_company_id not like", value, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdIn(List<String> values) {
            addCriterion("seller_company_id in", values, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdNotIn(List<String> values) {
            addCriterion("seller_company_id not in", values, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdBetween(String value1, String value2) {
            addCriterion("seller_company_id between", value1, value2, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyIdNotBetween(String value1, String value2) {
            addCriterion("seller_company_id not between", value1, value2, "sellerCompanyId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdIsNull() {
            addCriterion("seller_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdIsNotNull() {
            addCriterion("seller_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdEqualTo(String value) {
            addCriterion("seller_dept_id =", value, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdNotEqualTo(String value) {
            addCriterion("seller_dept_id <>", value, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdGreaterThan(String value) {
            addCriterion("seller_dept_id >", value, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_dept_id >=", value, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdLessThan(String value) {
            addCriterion("seller_dept_id <", value, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdLessThanOrEqualTo(String value) {
            addCriterion("seller_dept_id <=", value, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdLike(String value) {
            addCriterion("seller_dept_id like", value, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdNotLike(String value) {
            addCriterion("seller_dept_id not like", value, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdIn(List<String> values) {
            addCriterion("seller_dept_id in", values, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdNotIn(List<String> values) {
            addCriterion("seller_dept_id not in", values, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdBetween(String value1, String value2) {
            addCriterion("seller_dept_id between", value1, value2, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerDeptIdNotBetween(String value1, String value2) {
            addCriterion("seller_dept_id not between", value1, value2, "sellerDeptId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdIsNull() {
            addCriterion("seller_leader_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdIsNotNull() {
            addCriterion("seller_leader_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdEqualTo(String value) {
            addCriterion("seller_leader_id =", value, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdNotEqualTo(String value) {
            addCriterion("seller_leader_id <>", value, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdGreaterThan(String value) {
            addCriterion("seller_leader_id >", value, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_leader_id >=", value, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdLessThan(String value) {
            addCriterion("seller_leader_id <", value, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdLessThanOrEqualTo(String value) {
            addCriterion("seller_leader_id <=", value, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdLike(String value) {
            addCriterion("seller_leader_id like", value, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdNotLike(String value) {
            addCriterion("seller_leader_id not like", value, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdIn(List<String> values) {
            addCriterion("seller_leader_id in", values, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdNotIn(List<String> values) {
            addCriterion("seller_leader_id not in", values, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdBetween(String value1, String value2) {
            addCriterion("seller_leader_id between", value1, value2, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerLeaderIdNotBetween(String value1, String value2) {
            addCriterion("seller_leader_id not between", value1, value2, "sellerLeaderId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingIsNull() {
            addCriterion("nuclear_recording is null");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingIsNotNull() {
            addCriterion("nuclear_recording is not null");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingEqualTo(String value) {
            addCriterion("nuclear_recording =", value, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingNotEqualTo(String value) {
            addCriterion("nuclear_recording <>", value, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingGreaterThan(String value) {
            addCriterion("nuclear_recording >", value, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingGreaterThanOrEqualTo(String value) {
            addCriterion("nuclear_recording >=", value, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingLessThan(String value) {
            addCriterion("nuclear_recording <", value, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingLessThanOrEqualTo(String value) {
            addCriterion("nuclear_recording <=", value, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingLike(String value) {
            addCriterion("nuclear_recording like", value, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingNotLike(String value) {
            addCriterion("nuclear_recording not like", value, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingIn(List<String> values) {
            addCriterion("nuclear_recording in", values, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingNotIn(List<String> values) {
            addCriterion("nuclear_recording not in", values, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingBetween(String value1, String value2) {
            addCriterion("nuclear_recording between", value1, value2, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andNuclearRecordingNotBetween(String value1, String value2) {
            addCriterion("nuclear_recording not between", value1, value2, "nuclearRecording");
            return (Criteria) this;
        }

        public Criteria andOtherFilesIsNull() {
            addCriterion("other_files is null");
            return (Criteria) this;
        }

        public Criteria andOtherFilesIsNotNull() {
            addCriterion("other_files is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFilesEqualTo(String value) {
            addCriterion("other_files =", value, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesNotEqualTo(String value) {
            addCriterion("other_files <>", value, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesGreaterThan(String value) {
            addCriterion("other_files >", value, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesGreaterThanOrEqualTo(String value) {
            addCriterion("other_files >=", value, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesLessThan(String value) {
            addCriterion("other_files <", value, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesLessThanOrEqualTo(String value) {
            addCriterion("other_files <=", value, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesLike(String value) {
            addCriterion("other_files like", value, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesNotLike(String value) {
            addCriterion("other_files not like", value, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesIn(List<String> values) {
            addCriterion("other_files in", values, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesNotIn(List<String> values) {
            addCriterion("other_files not in", values, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesBetween(String value1, String value2) {
            addCriterion("other_files between", value1, value2, "otherFiles");
            return (Criteria) this;
        }

        public Criteria andOtherFilesNotBetween(String value1, String value2) {
            addCriterion("other_files not between", value1, value2, "otherFiles");
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