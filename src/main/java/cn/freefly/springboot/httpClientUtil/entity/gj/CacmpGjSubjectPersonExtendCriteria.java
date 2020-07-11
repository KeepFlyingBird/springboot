package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjSubjectPersonExtendCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjSubjectPersonExtendCriteria() {
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

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("person_id like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("person_id not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateIsNull() {
            addCriterion("cert_effective_date is null");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateIsNotNull() {
            addCriterion("cert_effective_date is not null");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateEqualTo(String value) {
            addCriterion("cert_effective_date =", value, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateNotEqualTo(String value) {
            addCriterion("cert_effective_date <>", value, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateGreaterThan(String value) {
            addCriterion("cert_effective_date >", value, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("cert_effective_date >=", value, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateLessThan(String value) {
            addCriterion("cert_effective_date <", value, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateLessThanOrEqualTo(String value) {
            addCriterion("cert_effective_date <=", value, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateLike(String value) {
            addCriterion("cert_effective_date like", value, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateNotLike(String value) {
            addCriterion("cert_effective_date not like", value, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateIn(List<String> values) {
            addCriterion("cert_effective_date in", values, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateNotIn(List<String> values) {
            addCriterion("cert_effective_date not in", values, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateBetween(String value1, String value2) {
            addCriterion("cert_effective_date between", value1, value2, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertEffectiveDateNotBetween(String value1, String value2) {
            addCriterion("cert_effective_date not between", value1, value2, "certEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateIsNull() {
            addCriterion("cert_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateIsNotNull() {
            addCriterion("cert_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateEqualTo(String value) {
            addCriterion("cert_expiry_date =", value, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateNotEqualTo(String value) {
            addCriterion("cert_expiry_date <>", value, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateGreaterThan(String value) {
            addCriterion("cert_expiry_date >", value, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateGreaterThanOrEqualTo(String value) {
            addCriterion("cert_expiry_date >=", value, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateLessThan(String value) {
            addCriterion("cert_expiry_date <", value, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateLessThanOrEqualTo(String value) {
            addCriterion("cert_expiry_date <=", value, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateLike(String value) {
            addCriterion("cert_expiry_date like", value, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateNotLike(String value) {
            addCriterion("cert_expiry_date not like", value, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateIn(List<String> values) {
            addCriterion("cert_expiry_date in", values, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateNotIn(List<String> values) {
            addCriterion("cert_expiry_date not in", values, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateBetween(String value1, String value2) {
            addCriterion("cert_expiry_date between", value1, value2, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertExpiryDateNotBetween(String value1, String value2) {
            addCriterion("cert_expiry_date not between", value1, value2, "certExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertIssuerIsNull() {
            addCriterion("cert_issuer is null");
            return (Criteria) this;
        }

        public Criteria andCertIssuerIsNotNull() {
            addCriterion("cert_issuer is not null");
            return (Criteria) this;
        }

        public Criteria andCertIssuerEqualTo(String value) {
            addCriterion("cert_issuer =", value, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerNotEqualTo(String value) {
            addCriterion("cert_issuer <>", value, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerGreaterThan(String value) {
            addCriterion("cert_issuer >", value, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("cert_issuer >=", value, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerLessThan(String value) {
            addCriterion("cert_issuer <", value, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerLessThanOrEqualTo(String value) {
            addCriterion("cert_issuer <=", value, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerLike(String value) {
            addCriterion("cert_issuer like", value, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerNotLike(String value) {
            addCriterion("cert_issuer not like", value, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerIn(List<String> values) {
            addCriterion("cert_issuer in", values, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerNotIn(List<String> values) {
            addCriterion("cert_issuer not in", values, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerBetween(String value1, String value2) {
            addCriterion("cert_issuer between", value1, value2, "certIssuer");
            return (Criteria) this;
        }

        public Criteria andCertIssuerNotBetween(String value1, String value2) {
            addCriterion("cert_issuer not between", value1, value2, "certIssuer");
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

        public Criteria andHealthStatusIsNull() {
            addCriterion("health_status is null");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIsNotNull() {
            addCriterion("health_status is not null");
            return (Criteria) this;
        }

        public Criteria andHealthStatusEqualTo(String value) {
            addCriterion("health_status =", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotEqualTo(String value) {
            addCriterion("health_status <>", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusGreaterThan(String value) {
            addCriterion("health_status >", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusGreaterThanOrEqualTo(String value) {
            addCriterion("health_status >=", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLessThan(String value) {
            addCriterion("health_status <", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLessThanOrEqualTo(String value) {
            addCriterion("health_status <=", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLike(String value) {
            addCriterion("health_status like", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotLike(String value) {
            addCriterion("health_status not like", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIn(List<String> values) {
            addCriterion("health_status in", values, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotIn(List<String> values) {
            addCriterion("health_status not in", values, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusBetween(String value1, String value2) {
            addCriterion("health_status between", value1, value2, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotBetween(String value1, String value2) {
            addCriterion("health_status not between", value1, value2, "healthStatus");
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

        public Criteria andCurrentProvinceIsNull() {
            addCriterion("current_province is null");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceIsNotNull() {
            addCriterion("current_province is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceEqualTo(String value) {
            addCriterion("current_province =", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotEqualTo(String value) {
            addCriterion("current_province <>", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceGreaterThan(String value) {
            addCriterion("current_province >", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("current_province >=", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceLessThan(String value) {
            addCriterion("current_province <", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceLessThanOrEqualTo(String value) {
            addCriterion("current_province <=", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceLike(String value) {
            addCriterion("current_province like", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotLike(String value) {
            addCriterion("current_province not like", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceIn(List<String> values) {
            addCriterion("current_province in", values, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotIn(List<String> values) {
            addCriterion("current_province not in", values, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceBetween(String value1, String value2) {
            addCriterion("current_province between", value1, value2, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotBetween(String value1, String value2) {
            addCriterion("current_province not between", value1, value2, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameIsNull() {
            addCriterion("current_province_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameIsNotNull() {
            addCriterion("current_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameEqualTo(String value) {
            addCriterion("current_province_name =", value, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameNotEqualTo(String value) {
            addCriterion("current_province_name <>", value, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameGreaterThan(String value) {
            addCriterion("current_province_name >", value, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("current_province_name >=", value, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameLessThan(String value) {
            addCriterion("current_province_name <", value, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("current_province_name <=", value, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameLike(String value) {
            addCriterion("current_province_name like", value, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameNotLike(String value) {
            addCriterion("current_province_name not like", value, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameIn(List<String> values) {
            addCriterion("current_province_name in", values, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameNotIn(List<String> values) {
            addCriterion("current_province_name not in", values, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameBetween(String value1, String value2) {
            addCriterion("current_province_name between", value1, value2, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNameNotBetween(String value1, String value2) {
            addCriterion("current_province_name not between", value1, value2, "currentProvinceName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIsNull() {
            addCriterion("current_city is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIsNotNull() {
            addCriterion("current_city is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityEqualTo(String value) {
            addCriterion("current_city =", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotEqualTo(String value) {
            addCriterion("current_city <>", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityGreaterThan(String value) {
            addCriterion("current_city >", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityGreaterThanOrEqualTo(String value) {
            addCriterion("current_city >=", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLessThan(String value) {
            addCriterion("current_city <", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLessThanOrEqualTo(String value) {
            addCriterion("current_city <=", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLike(String value) {
            addCriterion("current_city like", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotLike(String value) {
            addCriterion("current_city not like", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIn(List<String> values) {
            addCriterion("current_city in", values, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotIn(List<String> values) {
            addCriterion("current_city not in", values, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityBetween(String value1, String value2) {
            addCriterion("current_city between", value1, value2, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotBetween(String value1, String value2) {
            addCriterion("current_city not between", value1, value2, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameIsNull() {
            addCriterion("current_city_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameIsNotNull() {
            addCriterion("current_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameEqualTo(String value) {
            addCriterion("current_city_name =", value, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameNotEqualTo(String value) {
            addCriterion("current_city_name <>", value, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameGreaterThan(String value) {
            addCriterion("current_city_name >", value, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("current_city_name >=", value, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameLessThan(String value) {
            addCriterion("current_city_name <", value, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameLessThanOrEqualTo(String value) {
            addCriterion("current_city_name <=", value, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameLike(String value) {
            addCriterion("current_city_name like", value, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameNotLike(String value) {
            addCriterion("current_city_name not like", value, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameIn(List<String> values) {
            addCriterion("current_city_name in", values, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameNotIn(List<String> values) {
            addCriterion("current_city_name not in", values, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameBetween(String value1, String value2) {
            addCriterion("current_city_name between", value1, value2, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNameNotBetween(String value1, String value2) {
            addCriterion("current_city_name not between", value1, value2, "currentCityName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictIsNull() {
            addCriterion("current_district is null");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictIsNotNull() {
            addCriterion("current_district is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictEqualTo(String value) {
            addCriterion("current_district =", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNotEqualTo(String value) {
            addCriterion("current_district <>", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictGreaterThan(String value) {
            addCriterion("current_district >", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("current_district >=", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictLessThan(String value) {
            addCriterion("current_district <", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictLessThanOrEqualTo(String value) {
            addCriterion("current_district <=", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictLike(String value) {
            addCriterion("current_district like", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNotLike(String value) {
            addCriterion("current_district not like", value, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictIn(List<String> values) {
            addCriterion("current_district in", values, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNotIn(List<String> values) {
            addCriterion("current_district not in", values, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictBetween(String value1, String value2) {
            addCriterion("current_district between", value1, value2, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNotBetween(String value1, String value2) {
            addCriterion("current_district not between", value1, value2, "currentDistrict");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameIsNull() {
            addCriterion("current_district_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameIsNotNull() {
            addCriterion("current_district_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameEqualTo(String value) {
            addCriterion("current_district_name =", value, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameNotEqualTo(String value) {
            addCriterion("current_district_name <>", value, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameGreaterThan(String value) {
            addCriterion("current_district_name >", value, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("current_district_name >=", value, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameLessThan(String value) {
            addCriterion("current_district_name <", value, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("current_district_name <=", value, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameLike(String value) {
            addCriterion("current_district_name like", value, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameNotLike(String value) {
            addCriterion("current_district_name not like", value, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameIn(List<String> values) {
            addCriterion("current_district_name in", values, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameNotIn(List<String> values) {
            addCriterion("current_district_name not in", values, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameBetween(String value1, String value2) {
            addCriterion("current_district_name between", value1, value2, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentDistrictNameNotBetween(String value1, String value2) {
            addCriterion("current_district_name not between", value1, value2, "currentDistrictName");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIsNull() {
            addCriterion("current_address is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIsNotNull() {
            addCriterion("current_address is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressEqualTo(String value) {
            addCriterion("current_address =", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotEqualTo(String value) {
            addCriterion("current_address <>", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressGreaterThan(String value) {
            addCriterion("current_address >", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("current_address >=", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLessThan(String value) {
            addCriterion("current_address <", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLessThanOrEqualTo(String value) {
            addCriterion("current_address <=", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLike(String value) {
            addCriterion("current_address like", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotLike(String value) {
            addCriterion("current_address not like", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIn(List<String> values) {
            addCriterion("current_address in", values, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotIn(List<String> values) {
            addCriterion("current_address not in", values, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressBetween(String value1, String value2) {
            addCriterion("current_address between", value1, value2, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotBetween(String value1, String value2) {
            addCriterion("current_address not between", value1, value2, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentLngIsNull() {
            addCriterion("current_lng is null");
            return (Criteria) this;
        }

        public Criteria andCurrentLngIsNotNull() {
            addCriterion("current_lng is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentLngEqualTo(String value) {
            addCriterion("current_lng =", value, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngNotEqualTo(String value) {
            addCriterion("current_lng <>", value, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngGreaterThan(String value) {
            addCriterion("current_lng >", value, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngGreaterThanOrEqualTo(String value) {
            addCriterion("current_lng >=", value, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngLessThan(String value) {
            addCriterion("current_lng <", value, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngLessThanOrEqualTo(String value) {
            addCriterion("current_lng <=", value, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngLike(String value) {
            addCriterion("current_lng like", value, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngNotLike(String value) {
            addCriterion("current_lng not like", value, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngIn(List<String> values) {
            addCriterion("current_lng in", values, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngNotIn(List<String> values) {
            addCriterion("current_lng not in", values, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngBetween(String value1, String value2) {
            addCriterion("current_lng between", value1, value2, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLngNotBetween(String value1, String value2) {
            addCriterion("current_lng not between", value1, value2, "currentLng");
            return (Criteria) this;
        }

        public Criteria andCurrentLatIsNull() {
            addCriterion("current_lat is null");
            return (Criteria) this;
        }

        public Criteria andCurrentLatIsNotNull() {
            addCriterion("current_lat is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentLatEqualTo(String value) {
            addCriterion("current_lat =", value, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatNotEqualTo(String value) {
            addCriterion("current_lat <>", value, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatGreaterThan(String value) {
            addCriterion("current_lat >", value, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatGreaterThanOrEqualTo(String value) {
            addCriterion("current_lat >=", value, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatLessThan(String value) {
            addCriterion("current_lat <", value, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatLessThanOrEqualTo(String value) {
            addCriterion("current_lat <=", value, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatLike(String value) {
            addCriterion("current_lat like", value, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatNotLike(String value) {
            addCriterion("current_lat not like", value, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatIn(List<String> values) {
            addCriterion("current_lat in", values, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatNotIn(List<String> values) {
            addCriterion("current_lat not in", values, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatBetween(String value1, String value2) {
            addCriterion("current_lat between", value1, value2, "currentLat");
            return (Criteria) this;
        }

        public Criteria andCurrentLatNotBetween(String value1, String value2) {
            addCriterion("current_lat not between", value1, value2, "currentLat");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumIsNull() {
            addCriterion("family_population_num is null");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumIsNotNull() {
            addCriterion("family_population_num is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumEqualTo(String value) {
            addCriterion("family_population_num =", value, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumNotEqualTo(String value) {
            addCriterion("family_population_num <>", value, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumGreaterThan(String value) {
            addCriterion("family_population_num >", value, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumGreaterThanOrEqualTo(String value) {
            addCriterion("family_population_num >=", value, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumLessThan(String value) {
            addCriterion("family_population_num <", value, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumLessThanOrEqualTo(String value) {
            addCriterion("family_population_num <=", value, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumLike(String value) {
            addCriterion("family_population_num like", value, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumNotLike(String value) {
            addCriterion("family_population_num not like", value, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumIn(List<String> values) {
            addCriterion("family_population_num in", values, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumNotIn(List<String> values) {
            addCriterion("family_population_num not in", values, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumBetween(String value1, String value2) {
            addCriterion("family_population_num between", value1, value2, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andFamilyPopulationNumNotBetween(String value1, String value2) {
            addCriterion("family_population_num not between", value1, value2, "familyPopulationNum");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIsNull() {
            addCriterion("company_province is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIsNotNull() {
            addCriterion("company_province is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceEqualTo(String value) {
            addCriterion("company_province =", value, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNotEqualTo(String value) {
            addCriterion("company_province <>", value, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceGreaterThan(String value) {
            addCriterion("company_province >", value, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("company_province >=", value, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceLessThan(String value) {
            addCriterion("company_province <", value, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceLessThanOrEqualTo(String value) {
            addCriterion("company_province <=", value, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceLike(String value) {
            addCriterion("company_province like", value, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNotLike(String value) {
            addCriterion("company_province not like", value, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIn(List<String> values) {
            addCriterion("company_province in", values, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNotIn(List<String> values) {
            addCriterion("company_province not in", values, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceBetween(String value1, String value2) {
            addCriterion("company_province between", value1, value2, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNotBetween(String value1, String value2) {
            addCriterion("company_province not between", value1, value2, "companyProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameIsNull() {
            addCriterion("company_province_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameIsNotNull() {
            addCriterion("company_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameEqualTo(String value) {
            addCriterion("company_province_name =", value, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameNotEqualTo(String value) {
            addCriterion("company_province_name <>", value, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameGreaterThan(String value) {
            addCriterion("company_province_name >", value, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_province_name >=", value, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameLessThan(String value) {
            addCriterion("company_province_name <", value, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("company_province_name <=", value, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameLike(String value) {
            addCriterion("company_province_name like", value, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameNotLike(String value) {
            addCriterion("company_province_name not like", value, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameIn(List<String> values) {
            addCriterion("company_province_name in", values, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameNotIn(List<String> values) {
            addCriterion("company_province_name not in", values, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameBetween(String value1, String value2) {
            addCriterion("company_province_name between", value1, value2, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceNameNotBetween(String value1, String value2) {
            addCriterion("company_province_name not between", value1, value2, "companyProvinceName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIsNull() {
            addCriterion("company_city is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIsNotNull() {
            addCriterion("company_city is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityEqualTo(String value) {
            addCriterion("company_city =", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotEqualTo(String value) {
            addCriterion("company_city <>", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityGreaterThan(String value) {
            addCriterion("company_city >", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityGreaterThanOrEqualTo(String value) {
            addCriterion("company_city >=", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityLessThan(String value) {
            addCriterion("company_city <", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityLessThanOrEqualTo(String value) {
            addCriterion("company_city <=", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityLike(String value) {
            addCriterion("company_city like", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotLike(String value) {
            addCriterion("company_city not like", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIn(List<String> values) {
            addCriterion("company_city in", values, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotIn(List<String> values) {
            addCriterion("company_city not in", values, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityBetween(String value1, String value2) {
            addCriterion("company_city between", value1, value2, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotBetween(String value1, String value2) {
            addCriterion("company_city not between", value1, value2, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameIsNull() {
            addCriterion("company_city_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameIsNotNull() {
            addCriterion("company_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameEqualTo(String value) {
            addCriterion("company_city_name =", value, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameNotEqualTo(String value) {
            addCriterion("company_city_name <>", value, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameGreaterThan(String value) {
            addCriterion("company_city_name >", value, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_city_name >=", value, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameLessThan(String value) {
            addCriterion("company_city_name <", value, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameLessThanOrEqualTo(String value) {
            addCriterion("company_city_name <=", value, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameLike(String value) {
            addCriterion("company_city_name like", value, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameNotLike(String value) {
            addCriterion("company_city_name not like", value, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameIn(List<String> values) {
            addCriterion("company_city_name in", values, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameNotIn(List<String> values) {
            addCriterion("company_city_name not in", values, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameBetween(String value1, String value2) {
            addCriterion("company_city_name between", value1, value2, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNameNotBetween(String value1, String value2) {
            addCriterion("company_city_name not between", value1, value2, "companyCityName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictIsNull() {
            addCriterion("company_district is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictIsNotNull() {
            addCriterion("company_district is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictEqualTo(String value) {
            addCriterion("company_district =", value, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNotEqualTo(String value) {
            addCriterion("company_district <>", value, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictGreaterThan(String value) {
            addCriterion("company_district >", value, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("company_district >=", value, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictLessThan(String value) {
            addCriterion("company_district <", value, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictLessThanOrEqualTo(String value) {
            addCriterion("company_district <=", value, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictLike(String value) {
            addCriterion("company_district like", value, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNotLike(String value) {
            addCriterion("company_district not like", value, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictIn(List<String> values) {
            addCriterion("company_district in", values, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNotIn(List<String> values) {
            addCriterion("company_district not in", values, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictBetween(String value1, String value2) {
            addCriterion("company_district between", value1, value2, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNotBetween(String value1, String value2) {
            addCriterion("company_district not between", value1, value2, "companyDistrict");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameIsNull() {
            addCriterion("company_district_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameIsNotNull() {
            addCriterion("company_district_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameEqualTo(String value) {
            addCriterion("company_district_name =", value, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameNotEqualTo(String value) {
            addCriterion("company_district_name <>", value, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameGreaterThan(String value) {
            addCriterion("company_district_name >", value, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_district_name >=", value, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameLessThan(String value) {
            addCriterion("company_district_name <", value, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("company_district_name <=", value, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameLike(String value) {
            addCriterion("company_district_name like", value, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameNotLike(String value) {
            addCriterion("company_district_name not like", value, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameIn(List<String> values) {
            addCriterion("company_district_name in", values, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameNotIn(List<String> values) {
            addCriterion("company_district_name not in", values, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameBetween(String value1, String value2) {
            addCriterion("company_district_name between", value1, value2, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyDistrictNameNotBetween(String value1, String value2) {
            addCriterion("company_district_name not between", value1, value2, "companyDistrictName");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyLngIsNull() {
            addCriterion("company_lng is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLngIsNotNull() {
            addCriterion("company_lng is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLngEqualTo(String value) {
            addCriterion("company_lng =", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngNotEqualTo(String value) {
            addCriterion("company_lng <>", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngGreaterThan(String value) {
            addCriterion("company_lng >", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngGreaterThanOrEqualTo(String value) {
            addCriterion("company_lng >=", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngLessThan(String value) {
            addCriterion("company_lng <", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngLessThanOrEqualTo(String value) {
            addCriterion("company_lng <=", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngLike(String value) {
            addCriterion("company_lng like", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngNotLike(String value) {
            addCriterion("company_lng not like", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngIn(List<String> values) {
            addCriterion("company_lng in", values, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngNotIn(List<String> values) {
            addCriterion("company_lng not in", values, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngBetween(String value1, String value2) {
            addCriterion("company_lng between", value1, value2, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngNotBetween(String value1, String value2) {
            addCriterion("company_lng not between", value1, value2, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLatIsNull() {
            addCriterion("company_lat is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLatIsNotNull() {
            addCriterion("company_lat is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLatEqualTo(String value) {
            addCriterion("company_lat =", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatNotEqualTo(String value) {
            addCriterion("company_lat <>", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatGreaterThan(String value) {
            addCriterion("company_lat >", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatGreaterThanOrEqualTo(String value) {
            addCriterion("company_lat >=", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatLessThan(String value) {
            addCriterion("company_lat <", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatLessThanOrEqualTo(String value) {
            addCriterion("company_lat <=", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatLike(String value) {
            addCriterion("company_lat like", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatNotLike(String value) {
            addCriterion("company_lat not like", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatIn(List<String> values) {
            addCriterion("company_lat in", values, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatNotIn(List<String> values) {
            addCriterion("company_lat not in", values, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatBetween(String value1, String value2) {
            addCriterion("company_lat between", value1, value2, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatNotBetween(String value1, String value2) {
            addCriterion("company_lat not between", value1, value2, "companyLat");
            return (Criteria) this;
        }

        public Criteria andWorkNatureIsNull() {
            addCriterion("work_nature is null");
            return (Criteria) this;
        }

        public Criteria andWorkNatureIsNotNull() {
            addCriterion("work_nature is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNatureEqualTo(String value) {
            addCriterion("work_nature =", value, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureNotEqualTo(String value) {
            addCriterion("work_nature <>", value, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureGreaterThan(String value) {
            addCriterion("work_nature >", value, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureGreaterThanOrEqualTo(String value) {
            addCriterion("work_nature >=", value, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureLessThan(String value) {
            addCriterion("work_nature <", value, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureLessThanOrEqualTo(String value) {
            addCriterion("work_nature <=", value, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureLike(String value) {
            addCriterion("work_nature like", value, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureNotLike(String value) {
            addCriterion("work_nature not like", value, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureIn(List<String> values) {
            addCriterion("work_nature in", values, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureNotIn(List<String> values) {
            addCriterion("work_nature not in", values, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureBetween(String value1, String value2) {
            addCriterion("work_nature between", value1, value2, "workNature");
            return (Criteria) this;
        }

        public Criteria andWorkNatureNotBetween(String value1, String value2) {
            addCriterion("work_nature not between", value1, value2, "workNature");
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