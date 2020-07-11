package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjFileCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjFileCriteria() {
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

        public Criteria andFileStageIsNull() {
            addCriterion("file_stage is null");
            return (Criteria) this;
        }

        public Criteria andFileStageIsNotNull() {
            addCriterion("file_stage is not null");
            return (Criteria) this;
        }

        public Criteria andFileStageEqualTo(String value) {
            addCriterion("file_stage =", value, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageNotEqualTo(String value) {
            addCriterion("file_stage <>", value, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageGreaterThan(String value) {
            addCriterion("file_stage >", value, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageGreaterThanOrEqualTo(String value) {
            addCriterion("file_stage >=", value, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageLessThan(String value) {
            addCriterion("file_stage <", value, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageLessThanOrEqualTo(String value) {
            addCriterion("file_stage <=", value, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageLike(String value) {
            addCriterion("file_stage like", value, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageNotLike(String value) {
            addCriterion("file_stage not like", value, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageIn(List<String> values) {
            addCriterion("file_stage in", values, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageNotIn(List<String> values) {
            addCriterion("file_stage not in", values, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageBetween(String value1, String value2) {
            addCriterion("file_stage between", value1, value2, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileStageNotBetween(String value1, String value2) {
            addCriterion("file_stage not between", value1, value2, "fileStage");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlIsNull() {
            addCriterion("fastdfs_url is null");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlIsNotNull() {
            addCriterion("fastdfs_url is not null");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlEqualTo(String value) {
            addCriterion("fastdfs_url =", value, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlNotEqualTo(String value) {
            addCriterion("fastdfs_url <>", value, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlGreaterThan(String value) {
            addCriterion("fastdfs_url >", value, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fastdfs_url >=", value, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlLessThan(String value) {
            addCriterion("fastdfs_url <", value, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlLessThanOrEqualTo(String value) {
            addCriterion("fastdfs_url <=", value, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlLike(String value) {
            addCriterion("fastdfs_url like", value, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlNotLike(String value) {
            addCriterion("fastdfs_url not like", value, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlIn(List<String> values) {
            addCriterion("fastdfs_url in", values, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlNotIn(List<String> values) {
            addCriterion("fastdfs_url not in", values, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlBetween(String value1, String value2) {
            addCriterion("fastdfs_url between", value1, value2, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andFastdfsUrlNotBetween(String value1, String value2) {
            addCriterion("fastdfs_url not between", value1, value2, "fastdfsUrl");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("upload_time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("upload_time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("upload_time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("upload_time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("upload_time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("upload_time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("upload_time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_time not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeIsNull() {
            addCriterion("file_stage_type is null");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeIsNotNull() {
            addCriterion("file_stage_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeEqualTo(String value) {
            addCriterion("file_stage_type =", value, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeNotEqualTo(String value) {
            addCriterion("file_stage_type <>", value, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeGreaterThan(String value) {
            addCriterion("file_stage_type >", value, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_stage_type >=", value, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeLessThan(String value) {
            addCriterion("file_stage_type <", value, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeLessThanOrEqualTo(String value) {
            addCriterion("file_stage_type <=", value, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeLike(String value) {
            addCriterion("file_stage_type like", value, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeNotLike(String value) {
            addCriterion("file_stage_type not like", value, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeIn(List<String> values) {
            addCriterion("file_stage_type in", values, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeNotIn(List<String> values) {
            addCriterion("file_stage_type not in", values, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeBetween(String value1, String value2) {
            addCriterion("file_stage_type between", value1, value2, "fileStageType");
            return (Criteria) this;
        }

        public Criteria andFileStageTypeNotBetween(String value1, String value2) {
            addCriterion("file_stage_type not between", value1, value2, "fileStageType");
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