package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjOrderCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjOrderCriteria() {
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

        public Criteria andInstNoIsNull() {
            addCriterion("inst_no is null");
            return (Criteria) this;
        }

        public Criteria andInstNoIsNotNull() {
            addCriterion("inst_no is not null");
            return (Criteria) this;
        }

        public Criteria andInstNoEqualTo(String value) {
            addCriterion("inst_no =", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoNotEqualTo(String value) {
            addCriterion("inst_no <>", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoGreaterThan(String value) {
            addCriterion("inst_no >", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoGreaterThanOrEqualTo(String value) {
            addCriterion("inst_no >=", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoLessThan(String value) {
            addCriterion("inst_no <", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoLessThanOrEqualTo(String value) {
            addCriterion("inst_no <=", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoLike(String value) {
            addCriterion("inst_no like", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoNotLike(String value) {
            addCriterion("inst_no not like", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoIn(List<String> values) {
            addCriterion("inst_no in", values, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoNotIn(List<String> values) {
            addCriterion("inst_no not in", values, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoBetween(String value1, String value2) {
            addCriterion("inst_no between", value1, value2, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoNotBetween(String value1, String value2) {
            addCriterion("inst_no not between", value1, value2, "instNo");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeIsNull() {
            addCriterion("product_series_code is null");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeIsNotNull() {
            addCriterion("product_series_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeEqualTo(String value) {
            addCriterion("product_series_code =", value, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeNotEqualTo(String value) {
            addCriterion("product_series_code <>", value, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeGreaterThan(String value) {
            addCriterion("product_series_code >", value, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_series_code >=", value, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeLessThan(String value) {
            addCriterion("product_series_code <", value, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeLessThanOrEqualTo(String value) {
            addCriterion("product_series_code <=", value, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeLike(String value) {
            addCriterion("product_series_code like", value, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeNotLike(String value) {
            addCriterion("product_series_code not like", value, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeIn(List<String> values) {
            addCriterion("product_series_code in", values, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeNotIn(List<String> values) {
            addCriterion("product_series_code not in", values, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeBetween(String value1, String value2) {
            addCriterion("product_series_code between", value1, value2, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andProductSeriesCodeNotBetween(String value1, String value2) {
            addCriterion("product_series_code not between", value1, value2, "productSeriesCode");
            return (Criteria) this;
        }

        public Criteria andChannelKeyIsNull() {
            addCriterion("channel_key is null");
            return (Criteria) this;
        }

        public Criteria andChannelKeyIsNotNull() {
            addCriterion("channel_key is not null");
            return (Criteria) this;
        }

        public Criteria andChannelKeyEqualTo(String value) {
            addCriterion("channel_key =", value, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyNotEqualTo(String value) {
            addCriterion("channel_key <>", value, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyGreaterThan(String value) {
            addCriterion("channel_key >", value, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyGreaterThanOrEqualTo(String value) {
            addCriterion("channel_key >=", value, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyLessThan(String value) {
            addCriterion("channel_key <", value, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyLessThanOrEqualTo(String value) {
            addCriterion("channel_key <=", value, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyLike(String value) {
            addCriterion("channel_key like", value, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyNotLike(String value) {
            addCriterion("channel_key not like", value, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyIn(List<String> values) {
            addCriterion("channel_key in", values, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyNotIn(List<String> values) {
            addCriterion("channel_key not in", values, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyBetween(String value1, String value2) {
            addCriterion("channel_key between", value1, value2, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelKeyNotBetween(String value1, String value2) {
            addCriterion("channel_key not between", value1, value2, "channelKey");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNull() {
            addCriterion("status_code is null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNotNull() {
            addCriterion("status_code is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeEqualTo(String value) {
            addCriterion("status_code =", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotEqualTo(String value) {
            addCriterion("status_code <>", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThan(String value) {
            addCriterion("status_code >", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("status_code >=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThan(String value) {
            addCriterion("status_code <", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("status_code <=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLike(String value) {
            addCriterion("status_code like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotLike(String value) {
            addCriterion("status_code not like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIn(List<String> values) {
            addCriterion("status_code in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotIn(List<String> values) {
            addCriterion("status_code not in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeBetween(String value1, String value2) {
            addCriterion("status_code between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotBetween(String value1, String value2) {
            addCriterion("status_code not between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusMessageIsNull() {
            addCriterion("status_message is null");
            return (Criteria) this;
        }

        public Criteria andStatusMessageIsNotNull() {
            addCriterion("status_message is not null");
            return (Criteria) this;
        }

        public Criteria andStatusMessageEqualTo(String value) {
            addCriterion("status_message =", value, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageNotEqualTo(String value) {
            addCriterion("status_message <>", value, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageGreaterThan(String value) {
            addCriterion("status_message >", value, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageGreaterThanOrEqualTo(String value) {
            addCriterion("status_message >=", value, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageLessThan(String value) {
            addCriterion("status_message <", value, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageLessThanOrEqualTo(String value) {
            addCriterion("status_message <=", value, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageLike(String value) {
            addCriterion("status_message like", value, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageNotLike(String value) {
            addCriterion("status_message not like", value, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageIn(List<String> values) {
            addCriterion("status_message in", values, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageNotIn(List<String> values) {
            addCriterion("status_message not in", values, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageBetween(String value1, String value2) {
            addCriterion("status_message between", value1, value2, "statusMessage");
            return (Criteria) this;
        }

        public Criteria andStatusMessageNotBetween(String value1, String value2) {
            addCriterion("status_message not between", value1, value2, "statusMessage");
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