package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjBusinessInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjBusinessInfoCriteria() {
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

        public Criteria andBusiPeriodsIsNull() {
            addCriterion("busi_periods is null");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsIsNotNull() {
            addCriterion("busi_periods is not null");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsEqualTo(String value) {
            addCriterion("busi_periods =", value, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsNotEqualTo(String value) {
            addCriterion("busi_periods <>", value, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsGreaterThan(String value) {
            addCriterion("busi_periods >", value, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsGreaterThanOrEqualTo(String value) {
            addCriterion("busi_periods >=", value, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsLessThan(String value) {
            addCriterion("busi_periods <", value, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsLessThanOrEqualTo(String value) {
            addCriterion("busi_periods <=", value, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsLike(String value) {
            addCriterion("busi_periods like", value, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsNotLike(String value) {
            addCriterion("busi_periods not like", value, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsIn(List<String> values) {
            addCriterion("busi_periods in", values, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsNotIn(List<String> values) {
            addCriterion("busi_periods not in", values, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsBetween(String value1, String value2) {
            addCriterion("busi_periods between", value1, value2, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andBusiPeriodsNotBetween(String value1, String value2) {
            addCriterion("busi_periods not between", value1, value2, "busiPeriods");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicIsNull() {
            addCriterion("luduanbais_fic is null");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicIsNotNull() {
            addCriterion("luduanbais_fic is not null");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicEqualTo(String value) {
            addCriterion("luduanbais_fic =", value, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicNotEqualTo(String value) {
            addCriterion("luduanbais_fic <>", value, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicGreaterThan(String value) {
            addCriterion("luduanbais_fic >", value, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicGreaterThanOrEqualTo(String value) {
            addCriterion("luduanbais_fic >=", value, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicLessThan(String value) {
            addCriterion("luduanbais_fic <", value, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicLessThanOrEqualTo(String value) {
            addCriterion("luduanbais_fic <=", value, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicLike(String value) {
            addCriterion("luduanbais_fic like", value, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicNotLike(String value) {
            addCriterion("luduanbais_fic not like", value, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicIn(List<String> values) {
            addCriterion("luduanbais_fic in", values, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicNotIn(List<String> values) {
            addCriterion("luduanbais_fic not in", values, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicBetween(String value1, String value2) {
            addCriterion("luduanbais_fic between", value1, value2, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andLuduanbaisFicNotBetween(String value1, String value2) {
            addCriterion("luduanbais_fic not between", value1, value2, "luduanbaisFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicIsNull() {
            addCriterion("xiaoquname_fic is null");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicIsNotNull() {
            addCriterion("xiaoquname_fic is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicEqualTo(String value) {
            addCriterion("xiaoquname_fic =", value, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicNotEqualTo(String value) {
            addCriterion("xiaoquname_fic <>", value, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicGreaterThan(String value) {
            addCriterion("xiaoquname_fic >", value, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicGreaterThanOrEqualTo(String value) {
            addCriterion("xiaoquname_fic >=", value, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicLessThan(String value) {
            addCriterion("xiaoquname_fic <", value, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicLessThanOrEqualTo(String value) {
            addCriterion("xiaoquname_fic <=", value, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicLike(String value) {
            addCriterion("xiaoquname_fic like", value, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicNotLike(String value) {
            addCriterion("xiaoquname_fic not like", value, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicIn(List<String> values) {
            addCriterion("xiaoquname_fic in", values, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicNotIn(List<String> values) {
            addCriterion("xiaoquname_fic not in", values, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicBetween(String value1, String value2) {
            addCriterion("xiaoquname_fic between", value1, value2, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andXiaoqunameFicNotBetween(String value1, String value2) {
            addCriterion("xiaoquname_fic not between", value1, value2, "xiaoqunameFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicIsNull() {
            addCriterion("biaozjianzhu_fic is null");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicIsNotNull() {
            addCriterion("biaozjianzhu_fic is not null");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicEqualTo(String value) {
            addCriterion("biaozjianzhu_fic =", value, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicNotEqualTo(String value) {
            addCriterion("biaozjianzhu_fic <>", value, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicGreaterThan(String value) {
            addCriterion("biaozjianzhu_fic >", value, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicGreaterThanOrEqualTo(String value) {
            addCriterion("biaozjianzhu_fic >=", value, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicLessThan(String value) {
            addCriterion("biaozjianzhu_fic <", value, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicLessThanOrEqualTo(String value) {
            addCriterion("biaozjianzhu_fic <=", value, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicLike(String value) {
            addCriterion("biaozjianzhu_fic like", value, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicNotLike(String value) {
            addCriterion("biaozjianzhu_fic not like", value, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicIn(List<String> values) {
            addCriterion("biaozjianzhu_fic in", values, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicNotIn(List<String> values) {
            addCriterion("biaozjianzhu_fic not in", values, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicBetween(String value1, String value2) {
            addCriterion("biaozjianzhu_fic between", value1, value2, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andBiaozjianzhuFicNotBetween(String value1, String value2) {
            addCriterion("biaozjianzhu_fic not between", value1, value2, "biaozjianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicIsNull() {
            addCriterion("danyuan_fic is null");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicIsNotNull() {
            addCriterion("danyuan_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicEqualTo(String value) {
            addCriterion("danyuan_fic =", value, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicNotEqualTo(String value) {
            addCriterion("danyuan_fic <>", value, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicGreaterThan(String value) {
            addCriterion("danyuan_fic >", value, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicGreaterThanOrEqualTo(String value) {
            addCriterion("danyuan_fic >=", value, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicLessThan(String value) {
            addCriterion("danyuan_fic <", value, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicLessThanOrEqualTo(String value) {
            addCriterion("danyuan_fic <=", value, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicLike(String value) {
            addCriterion("danyuan_fic like", value, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicNotLike(String value) {
            addCriterion("danyuan_fic not like", value, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicIn(List<String> values) {
            addCriterion("danyuan_fic in", values, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicNotIn(List<String> values) {
            addCriterion("danyuan_fic not in", values, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicBetween(String value1, String value2) {
            addCriterion("danyuan_fic between", value1, value2, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andDanyuanFicNotBetween(String value1, String value2) {
            addCriterion("danyuan_fic not between", value1, value2, "danyuanFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicIsNull() {
            addCriterion("loucenghao_fic is null");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicIsNotNull() {
            addCriterion("loucenghao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicEqualTo(String value) {
            addCriterion("loucenghao_fic =", value, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicNotEqualTo(String value) {
            addCriterion("loucenghao_fic <>", value, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicGreaterThan(String value) {
            addCriterion("loucenghao_fic >", value, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("loucenghao_fic >=", value, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicLessThan(String value) {
            addCriterion("loucenghao_fic <", value, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicLessThanOrEqualTo(String value) {
            addCriterion("loucenghao_fic <=", value, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicLike(String value) {
            addCriterion("loucenghao_fic like", value, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicNotLike(String value) {
            addCriterion("loucenghao_fic not like", value, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicIn(List<String> values) {
            addCriterion("loucenghao_fic in", values, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicNotIn(List<String> values) {
            addCriterion("loucenghao_fic not in", values, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicBetween(String value1, String value2) {
            addCriterion("loucenghao_fic between", value1, value2, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andLoucenghaoFicNotBetween(String value1, String value2) {
            addCriterion("loucenghao_fic not between", value1, value2, "loucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicIsNull() {
            addCriterion("huhao_fic is null");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicIsNotNull() {
            addCriterion("huhao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicEqualTo(String value) {
            addCriterion("huhao_fic =", value, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicNotEqualTo(String value) {
            addCriterion("huhao_fic <>", value, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicGreaterThan(String value) {
            addCriterion("huhao_fic >", value, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("huhao_fic >=", value, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicLessThan(String value) {
            addCriterion("huhao_fic <", value, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicLessThanOrEqualTo(String value) {
            addCriterion("huhao_fic <=", value, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicLike(String value) {
            addCriterion("huhao_fic like", value, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicNotLike(String value) {
            addCriterion("huhao_fic not like", value, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicIn(List<String> values) {
            addCriterion("huhao_fic in", values, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicNotIn(List<String> values) {
            addCriterion("huhao_fic not in", values, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicBetween(String value1, String value2) {
            addCriterion("huhao_fic between", value1, value2, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andHuhaoFicNotBetween(String value1, String value2) {
            addCriterion("huhao_fic not between", value1, value2, "huhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicIsNull() {
            addCriterion("kaimenzhao_fic is null");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicIsNotNull() {
            addCriterion("kaimenzhao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicEqualTo(String value) {
            addCriterion("kaimenzhao_fic =", value, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicNotEqualTo(String value) {
            addCriterion("kaimenzhao_fic <>", value, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicGreaterThan(String value) {
            addCriterion("kaimenzhao_fic >", value, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("kaimenzhao_fic >=", value, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicLessThan(String value) {
            addCriterion("kaimenzhao_fic <", value, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicLessThanOrEqualTo(String value) {
            addCriterion("kaimenzhao_fic <=", value, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicLike(String value) {
            addCriterion("kaimenzhao_fic like", value, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicNotLike(String value) {
            addCriterion("kaimenzhao_fic not like", value, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicIn(List<String> values) {
            addCriterion("kaimenzhao_fic in", values, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicNotIn(List<String> values) {
            addCriterion("kaimenzhao_fic not in", values, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicBetween(String value1, String value2) {
            addCriterion("kaimenzhao_fic between", value1, value2, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andKaimenzhaoFicNotBetween(String value1, String value2) {
            addCriterion("kaimenzhao_fic not between", value1, value2, "kaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicIsNull() {
            addCriterion("xiegui_fic is null");
            return (Criteria) this;
        }

        public Criteria andXieguiFicIsNotNull() {
            addCriterion("xiegui_fic is not null");
            return (Criteria) this;
        }

        public Criteria andXieguiFicEqualTo(String value) {
            addCriterion("xiegui_fic =", value, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicNotEqualTo(String value) {
            addCriterion("xiegui_fic <>", value, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicGreaterThan(String value) {
            addCriterion("xiegui_fic >", value, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicGreaterThanOrEqualTo(String value) {
            addCriterion("xiegui_fic >=", value, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicLessThan(String value) {
            addCriterion("xiegui_fic <", value, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicLessThanOrEqualTo(String value) {
            addCriterion("xiegui_fic <=", value, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicLike(String value) {
            addCriterion("xiegui_fic like", value, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicNotLike(String value) {
            addCriterion("xiegui_fic not like", value, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicIn(List<String> values) {
            addCriterion("xiegui_fic in", values, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicNotIn(List<String> values) {
            addCriterion("xiegui_fic not in", values, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicBetween(String value1, String value2) {
            addCriterion("xiegui_fic between", value1, value2, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andXieguiFicNotBetween(String value1, String value2) {
            addCriterion("xiegui_fic not between", value1, value2, "xieguiFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicIsNull() {
            addCriterion("keting_fic is null");
            return (Criteria) this;
        }

        public Criteria andKetingFicIsNotNull() {
            addCriterion("keting_fic is not null");
            return (Criteria) this;
        }

        public Criteria andKetingFicEqualTo(String value) {
            addCriterion("keting_fic =", value, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicNotEqualTo(String value) {
            addCriterion("keting_fic <>", value, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicGreaterThan(String value) {
            addCriterion("keting_fic >", value, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicGreaterThanOrEqualTo(String value) {
            addCriterion("keting_fic >=", value, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicLessThan(String value) {
            addCriterion("keting_fic <", value, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicLessThanOrEqualTo(String value) {
            addCriterion("keting_fic <=", value, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicLike(String value) {
            addCriterion("keting_fic like", value, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicNotLike(String value) {
            addCriterion("keting_fic not like", value, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicIn(List<String> values) {
            addCriterion("keting_fic in", values, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicNotIn(List<String> values) {
            addCriterion("keting_fic not in", values, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicBetween(String value1, String value2) {
            addCriterion("keting_fic between", value1, value2, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andKetingFicNotBetween(String value1, String value2) {
            addCriterion("keting_fic not between", value1, value2, "ketingFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicIsNull() {
            addCriterion("cufang_fic is null");
            return (Criteria) this;
        }

        public Criteria andCufangFicIsNotNull() {
            addCriterion("cufang_fic is not null");
            return (Criteria) this;
        }

        public Criteria andCufangFicEqualTo(String value) {
            addCriterion("cufang_fic =", value, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicNotEqualTo(String value) {
            addCriterion("cufang_fic <>", value, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicGreaterThan(String value) {
            addCriterion("cufang_fic >", value, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicGreaterThanOrEqualTo(String value) {
            addCriterion("cufang_fic >=", value, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicLessThan(String value) {
            addCriterion("cufang_fic <", value, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicLessThanOrEqualTo(String value) {
            addCriterion("cufang_fic <=", value, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicLike(String value) {
            addCriterion("cufang_fic like", value, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicNotLike(String value) {
            addCriterion("cufang_fic not like", value, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicIn(List<String> values) {
            addCriterion("cufang_fic in", values, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicNotIn(List<String> values) {
            addCriterion("cufang_fic not in", values, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicBetween(String value1, String value2) {
            addCriterion("cufang_fic between", value1, value2, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andCufangFicNotBetween(String value1, String value2) {
            addCriterion("cufang_fic not between", value1, value2, "cufangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicIsNull() {
            addCriterion("bingxiang_fic is null");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicIsNotNull() {
            addCriterion("bingxiang_fic is not null");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicEqualTo(String value) {
            addCriterion("bingxiang_fic =", value, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicNotEqualTo(String value) {
            addCriterion("bingxiang_fic <>", value, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicGreaterThan(String value) {
            addCriterion("bingxiang_fic >", value, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicGreaterThanOrEqualTo(String value) {
            addCriterion("bingxiang_fic >=", value, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicLessThan(String value) {
            addCriterion("bingxiang_fic <", value, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicLessThanOrEqualTo(String value) {
            addCriterion("bingxiang_fic <=", value, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicLike(String value) {
            addCriterion("bingxiang_fic like", value, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicNotLike(String value) {
            addCriterion("bingxiang_fic not like", value, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicIn(List<String> values) {
            addCriterion("bingxiang_fic in", values, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicNotIn(List<String> values) {
            addCriterion("bingxiang_fic not in", values, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicBetween(String value1, String value2) {
            addCriterion("bingxiang_fic between", value1, value2, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andBingxiangFicNotBetween(String value1, String value2) {
            addCriterion("bingxiang_fic not between", value1, value2, "bingxiangFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicIsNull() {
            addCriterion("fanting_fic is null");
            return (Criteria) this;
        }

        public Criteria andFantingFicIsNotNull() {
            addCriterion("fanting_fic is not null");
            return (Criteria) this;
        }

        public Criteria andFantingFicEqualTo(String value) {
            addCriterion("fanting_fic =", value, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicNotEqualTo(String value) {
            addCriterion("fanting_fic <>", value, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicGreaterThan(String value) {
            addCriterion("fanting_fic >", value, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicGreaterThanOrEqualTo(String value) {
            addCriterion("fanting_fic >=", value, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicLessThan(String value) {
            addCriterion("fanting_fic <", value, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicLessThanOrEqualTo(String value) {
            addCriterion("fanting_fic <=", value, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicLike(String value) {
            addCriterion("fanting_fic like", value, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicNotLike(String value) {
            addCriterion("fanting_fic not like", value, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicIn(List<String> values) {
            addCriterion("fanting_fic in", values, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicNotIn(List<String> values) {
            addCriterion("fanting_fic not in", values, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicBetween(String value1, String value2) {
            addCriterion("fanting_fic between", value1, value2, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andFantingFicNotBetween(String value1, String value2) {
            addCriterion("fanting_fic not between", value1, value2, "fantingFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicIsNull() {
            addCriterion("weishengjian_fic is null");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicIsNotNull() {
            addCriterion("weishengjian_fic is not null");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicEqualTo(String value) {
            addCriterion("weishengjian_fic =", value, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicNotEqualTo(String value) {
            addCriterion("weishengjian_fic <>", value, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicGreaterThan(String value) {
            addCriterion("weishengjian_fic >", value, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicGreaterThanOrEqualTo(String value) {
            addCriterion("weishengjian_fic >=", value, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicLessThan(String value) {
            addCriterion("weishengjian_fic <", value, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicLessThanOrEqualTo(String value) {
            addCriterion("weishengjian_fic <=", value, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicLike(String value) {
            addCriterion("weishengjian_fic like", value, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicNotLike(String value) {
            addCriterion("weishengjian_fic not like", value, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicIn(List<String> values) {
            addCriterion("weishengjian_fic in", values, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicNotIn(List<String> values) {
            addCriterion("weishengjian_fic not in", values, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicBetween(String value1, String value2) {
            addCriterion("weishengjian_fic between", value1, value2, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andWeishengjianFicNotBetween(String value1, String value2) {
            addCriterion("weishengjian_fic not between", value1, value2, "weishengjianFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicIsNull() {
            addCriterion("yangtai_fic is null");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicIsNotNull() {
            addCriterion("yangtai_fic is not null");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicEqualTo(String value) {
            addCriterion("yangtai_fic =", value, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicNotEqualTo(String value) {
            addCriterion("yangtai_fic <>", value, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicGreaterThan(String value) {
            addCriterion("yangtai_fic >", value, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicGreaterThanOrEqualTo(String value) {
            addCriterion("yangtai_fic >=", value, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicLessThan(String value) {
            addCriterion("yangtai_fic <", value, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicLessThanOrEqualTo(String value) {
            addCriterion("yangtai_fic <=", value, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicLike(String value) {
            addCriterion("yangtai_fic like", value, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicNotLike(String value) {
            addCriterion("yangtai_fic not like", value, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicIn(List<String> values) {
            addCriterion("yangtai_fic in", values, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicNotIn(List<String> values) {
            addCriterion("yangtai_fic not in", values, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicBetween(String value1, String value2) {
            addCriterion("yangtai_fic between", value1, value2, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andYangtaiFicNotBetween(String value1, String value2) {
            addCriterion("yangtai_fic not between", value1, value2, "yangtaiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicIsNull() {
            addCriterion("woshi_fic is null");
            return (Criteria) this;
        }

        public Criteria andWoshiFicIsNotNull() {
            addCriterion("woshi_fic is not null");
            return (Criteria) this;
        }

        public Criteria andWoshiFicEqualTo(String value) {
            addCriterion("woshi_fic =", value, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicNotEqualTo(String value) {
            addCriterion("woshi_fic <>", value, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicGreaterThan(String value) {
            addCriterion("woshi_fic >", value, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicGreaterThanOrEqualTo(String value) {
            addCriterion("woshi_fic >=", value, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicLessThan(String value) {
            addCriterion("woshi_fic <", value, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicLessThanOrEqualTo(String value) {
            addCriterion("woshi_fic <=", value, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicLike(String value) {
            addCriterion("woshi_fic like", value, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicNotLike(String value) {
            addCriterion("woshi_fic not like", value, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicIn(List<String> values) {
            addCriterion("woshi_fic in", values, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicNotIn(List<String> values) {
            addCriterion("woshi_fic not in", values, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicBetween(String value1, String value2) {
            addCriterion("woshi_fic between", value1, value2, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andWoshiFicNotBetween(String value1, String value2) {
            addCriterion("woshi_fic not between", value1, value2, "woshiFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicIsNull() {
            addCriterion("zhuzhai_other_fic is null");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicIsNotNull() {
            addCriterion("zhuzhai_other_fic is not null");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicEqualTo(String value) {
            addCriterion("zhuzhai_other_fic =", value, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicNotEqualTo(String value) {
            addCriterion("zhuzhai_other_fic <>", value, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicGreaterThan(String value) {
            addCriterion("zhuzhai_other_fic >", value, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicGreaterThanOrEqualTo(String value) {
            addCriterion("zhuzhai_other_fic >=", value, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicLessThan(String value) {
            addCriterion("zhuzhai_other_fic <", value, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicLessThanOrEqualTo(String value) {
            addCriterion("zhuzhai_other_fic <=", value, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicLike(String value) {
            addCriterion("zhuzhai_other_fic like", value, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicNotLike(String value) {
            addCriterion("zhuzhai_other_fic not like", value, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicIn(List<String> values) {
            addCriterion("zhuzhai_other_fic in", values, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicNotIn(List<String> values) {
            addCriterion("zhuzhai_other_fic not in", values, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicBetween(String value1, String value2) {
            addCriterion("zhuzhai_other_fic between", value1, value2, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andZhuzhaiOtherFicNotBetween(String value1, String value2) {
            addCriterion("zhuzhai_other_fic not between", value1, value2, "zhuzhaiOtherFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicIsNull() {
            addCriterion("jiafangyuangongzhudairen_fic is null");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicIsNotNull() {
            addCriterion("jiafangyuangongzhudairen_fic is not null");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicEqualTo(String value) {
            addCriterion("jiafangyuangongzhudairen_fic =", value, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicNotEqualTo(String value) {
            addCriterion("jiafangyuangongzhudairen_fic <>", value, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicGreaterThan(String value) {
            addCriterion("jiafangyuangongzhudairen_fic >", value, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicGreaterThanOrEqualTo(String value) {
            addCriterion("jiafangyuangongzhudairen_fic >=", value, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicLessThan(String value) {
            addCriterion("jiafangyuangongzhudairen_fic <", value, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicLessThanOrEqualTo(String value) {
            addCriterion("jiafangyuangongzhudairen_fic <=", value, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicLike(String value) {
            addCriterion("jiafangyuangongzhudairen_fic like", value, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicNotLike(String value) {
            addCriterion("jiafangyuangongzhudairen_fic not like", value, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicIn(List<String> values) {
            addCriterion("jiafangyuangongzhudairen_fic in", values, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicNotIn(List<String> values) {
            addCriterion("jiafangyuangongzhudairen_fic not in", values, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicBetween(String value1, String value2) {
            addCriterion("jiafangyuangongzhudairen_fic between", value1, value2, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairenFicNotBetween(String value1, String value2) {
            addCriterion("jiafangyuangongzhudairen_fic not between", value1, value2, "jiafangyuangongzhudairenFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicIsNull() {
            addCriterion("dw_luduanbiaos_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicIsNotNull() {
            addCriterion("dw_luduanbiaos_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicEqualTo(String value) {
            addCriterion("dw_luduanbiaos_fic =", value, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicNotEqualTo(String value) {
            addCriterion("dw_luduanbiaos_fic <>", value, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicGreaterThan(String value) {
            addCriterion("dw_luduanbiaos_fic >", value, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_luduanbiaos_fic >=", value, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicLessThan(String value) {
            addCriterion("dw_luduanbiaos_fic <", value, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicLessThanOrEqualTo(String value) {
            addCriterion("dw_luduanbiaos_fic <=", value, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicLike(String value) {
            addCriterion("dw_luduanbiaos_fic like", value, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicNotLike(String value) {
            addCriterion("dw_luduanbiaos_fic not like", value, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicIn(List<String> values) {
            addCriterion("dw_luduanbiaos_fic in", values, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicNotIn(List<String> values) {
            addCriterion("dw_luduanbiaos_fic not in", values, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicBetween(String value1, String value2) {
            addCriterion("dw_luduanbiaos_fic between", value1, value2, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLuduanbiaosFicNotBetween(String value1, String value2) {
            addCriterion("dw_luduanbiaos_fic not between", value1, value2, "dwLuduanbiaosFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicIsNull() {
            addCriterion("dw_loupan_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicIsNotNull() {
            addCriterion("dw_loupan_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicEqualTo(String value) {
            addCriterion("dw_loupan_fic =", value, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicNotEqualTo(String value) {
            addCriterion("dw_loupan_fic <>", value, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicGreaterThan(String value) {
            addCriterion("dw_loupan_fic >", value, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_loupan_fic >=", value, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicLessThan(String value) {
            addCriterion("dw_loupan_fic <", value, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicLessThanOrEqualTo(String value) {
            addCriterion("dw_loupan_fic <=", value, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicLike(String value) {
            addCriterion("dw_loupan_fic like", value, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicNotLike(String value) {
            addCriterion("dw_loupan_fic not like", value, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicIn(List<String> values) {
            addCriterion("dw_loupan_fic in", values, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicNotIn(List<String> values) {
            addCriterion("dw_loupan_fic not in", values, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicBetween(String value1, String value2) {
            addCriterion("dw_loupan_fic between", value1, value2, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoupanFicNotBetween(String value1, String value2) {
            addCriterion("dw_loupan_fic not between", value1, value2, "dwLoupanFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicIsNull() {
            addCriterion("dw_biaozhijianzhu_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicIsNotNull() {
            addCriterion("dw_biaozhijianzhu_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicEqualTo(String value) {
            addCriterion("dw_biaozhijianzhu_fic =", value, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicNotEqualTo(String value) {
            addCriterion("dw_biaozhijianzhu_fic <>", value, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicGreaterThan(String value) {
            addCriterion("dw_biaozhijianzhu_fic >", value, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_biaozhijianzhu_fic >=", value, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicLessThan(String value) {
            addCriterion("dw_biaozhijianzhu_fic <", value, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicLessThanOrEqualTo(String value) {
            addCriterion("dw_biaozhijianzhu_fic <=", value, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicLike(String value) {
            addCriterion("dw_biaozhijianzhu_fic like", value, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicNotLike(String value) {
            addCriterion("dw_biaozhijianzhu_fic not like", value, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicIn(List<String> values) {
            addCriterion("dw_biaozhijianzhu_fic in", values, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicNotIn(List<String> values) {
            addCriterion("dw_biaozhijianzhu_fic not in", values, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicBetween(String value1, String value2) {
            addCriterion("dw_biaozhijianzhu_fic between", value1, value2, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwBiaozhijianzhuFicNotBetween(String value1, String value2) {
            addCriterion("dw_biaozhijianzhu_fic not between", value1, value2, "dwBiaozhijianzhuFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicIsNull() {
            addCriterion("dw_danyuan_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicIsNotNull() {
            addCriterion("dw_danyuan_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicEqualTo(String value) {
            addCriterion("dw_danyuan_fic =", value, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicNotEqualTo(String value) {
            addCriterion("dw_danyuan_fic <>", value, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicGreaterThan(String value) {
            addCriterion("dw_danyuan_fic >", value, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_danyuan_fic >=", value, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicLessThan(String value) {
            addCriterion("dw_danyuan_fic <", value, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicLessThanOrEqualTo(String value) {
            addCriterion("dw_danyuan_fic <=", value, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicLike(String value) {
            addCriterion("dw_danyuan_fic like", value, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicNotLike(String value) {
            addCriterion("dw_danyuan_fic not like", value, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicIn(List<String> values) {
            addCriterion("dw_danyuan_fic in", values, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicNotIn(List<String> values) {
            addCriterion("dw_danyuan_fic not in", values, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicBetween(String value1, String value2) {
            addCriterion("dw_danyuan_fic between", value1, value2, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwDanyuanFicNotBetween(String value1, String value2) {
            addCriterion("dw_danyuan_fic not between", value1, value2, "dwDanyuanFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicIsNull() {
            addCriterion("dw_loucenghao_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicIsNotNull() {
            addCriterion("dw_loucenghao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicEqualTo(String value) {
            addCriterion("dw_loucenghao_fic =", value, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicNotEqualTo(String value) {
            addCriterion("dw_loucenghao_fic <>", value, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicGreaterThan(String value) {
            addCriterion("dw_loucenghao_fic >", value, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_loucenghao_fic >=", value, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicLessThan(String value) {
            addCriterion("dw_loucenghao_fic <", value, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicLessThanOrEqualTo(String value) {
            addCriterion("dw_loucenghao_fic <=", value, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicLike(String value) {
            addCriterion("dw_loucenghao_fic like", value, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicNotLike(String value) {
            addCriterion("dw_loucenghao_fic not like", value, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicIn(List<String> values) {
            addCriterion("dw_loucenghao_fic in", values, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicNotIn(List<String> values) {
            addCriterion("dw_loucenghao_fic not in", values, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicBetween(String value1, String value2) {
            addCriterion("dw_loucenghao_fic between", value1, value2, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwLoucenghaoFicNotBetween(String value1, String value2) {
            addCriterion("dw_loucenghao_fic not between", value1, value2, "dwLoucenghaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicIsNull() {
            addCriterion("dw_huhao_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicIsNotNull() {
            addCriterion("dw_huhao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicEqualTo(String value) {
            addCriterion("dw_huhao_fic =", value, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicNotEqualTo(String value) {
            addCriterion("dw_huhao_fic <>", value, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicGreaterThan(String value) {
            addCriterion("dw_huhao_fic >", value, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_huhao_fic >=", value, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicLessThan(String value) {
            addCriterion("dw_huhao_fic <", value, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicLessThanOrEqualTo(String value) {
            addCriterion("dw_huhao_fic <=", value, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicLike(String value) {
            addCriterion("dw_huhao_fic like", value, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicNotLike(String value) {
            addCriterion("dw_huhao_fic not like", value, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicIn(List<String> values) {
            addCriterion("dw_huhao_fic in", values, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicNotIn(List<String> values) {
            addCriterion("dw_huhao_fic not in", values, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicBetween(String value1, String value2) {
            addCriterion("dw_huhao_fic between", value1, value2, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwHuhaoFicNotBetween(String value1, String value2) {
            addCriterion("dw_huhao_fic not between", value1, value2, "dwHuhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicIsNull() {
            addCriterion("dw_kaimenzhao_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicIsNotNull() {
            addCriterion("dw_kaimenzhao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicEqualTo(String value) {
            addCriterion("dw_kaimenzhao_fic =", value, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicNotEqualTo(String value) {
            addCriterion("dw_kaimenzhao_fic <>", value, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicGreaterThan(String value) {
            addCriterion("dw_kaimenzhao_fic >", value, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_kaimenzhao_fic >=", value, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicLessThan(String value) {
            addCriterion("dw_kaimenzhao_fic <", value, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicLessThanOrEqualTo(String value) {
            addCriterion("dw_kaimenzhao_fic <=", value, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicLike(String value) {
            addCriterion("dw_kaimenzhao_fic like", value, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicNotLike(String value) {
            addCriterion("dw_kaimenzhao_fic not like", value, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicIn(List<String> values) {
            addCriterion("dw_kaimenzhao_fic in", values, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicNotIn(List<String> values) {
            addCriterion("dw_kaimenzhao_fic not in", values, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicBetween(String value1, String value2) {
            addCriterion("dw_kaimenzhao_fic between", value1, value2, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwKaimenzhaoFicNotBetween(String value1, String value2) {
            addCriterion("dw_kaimenzhao_fic not between", value1, value2, "dwKaimenzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicIsNull() {
            addCriterion("dw_bejing_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicIsNotNull() {
            addCriterion("dw_bejing_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicEqualTo(String value) {
            addCriterion("dw_bejing_fic =", value, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicNotEqualTo(String value) {
            addCriterion("dw_bejing_fic <>", value, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicGreaterThan(String value) {
            addCriterion("dw_bejing_fic >", value, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_bejing_fic >=", value, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicLessThan(String value) {
            addCriterion("dw_bejing_fic <", value, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicLessThanOrEqualTo(String value) {
            addCriterion("dw_bejing_fic <=", value, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicLike(String value) {
            addCriterion("dw_bejing_fic like", value, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicNotLike(String value) {
            addCriterion("dw_bejing_fic not like", value, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicIn(List<String> values) {
            addCriterion("dw_bejing_fic in", values, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicNotIn(List<String> values) {
            addCriterion("dw_bejing_fic not in", values, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicBetween(String value1, String value2) {
            addCriterion("dw_bejing_fic between", value1, value2, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwBejingFicNotBetween(String value1, String value2) {
            addCriterion("dw_bejing_fic not between", value1, value2, "dwBejingFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicIsNull() {
            addCriterion("dw_yingyezhihzhao_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicIsNotNull() {
            addCriterion("dw_yingyezhihzhao_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicEqualTo(String value) {
            addCriterion("dw_yingyezhihzhao_fic =", value, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicNotEqualTo(String value) {
            addCriterion("dw_yingyezhihzhao_fic <>", value, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicGreaterThan(String value) {
            addCriterion("dw_yingyezhihzhao_fic >", value, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_yingyezhihzhao_fic >=", value, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicLessThan(String value) {
            addCriterion("dw_yingyezhihzhao_fic <", value, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicLessThanOrEqualTo(String value) {
            addCriterion("dw_yingyezhihzhao_fic <=", value, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicLike(String value) {
            addCriterion("dw_yingyezhihzhao_fic like", value, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicNotLike(String value) {
            addCriterion("dw_yingyezhihzhao_fic not like", value, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicIn(List<String> values) {
            addCriterion("dw_yingyezhihzhao_fic in", values, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicNotIn(List<String> values) {
            addCriterion("dw_yingyezhihzhao_fic not in", values, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicBetween(String value1, String value2) {
            addCriterion("dw_yingyezhihzhao_fic between", value1, value2, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwYingyezhihzhaoFicNotBetween(String value1, String value2) {
            addCriterion("dw_yingyezhihzhao_fic not between", value1, value2, "dwYingyezhihzhaoFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicIsNull() {
            addCriterion("dw_menmian_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicIsNotNull() {
            addCriterion("dw_menmian_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicEqualTo(String value) {
            addCriterion("dw_menmian_fic =", value, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicNotEqualTo(String value) {
            addCriterion("dw_menmian_fic <>", value, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicGreaterThan(String value) {
            addCriterion("dw_menmian_fic >", value, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_menmian_fic >=", value, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicLessThan(String value) {
            addCriterion("dw_menmian_fic <", value, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicLessThanOrEqualTo(String value) {
            addCriterion("dw_menmian_fic <=", value, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicLike(String value) {
            addCriterion("dw_menmian_fic like", value, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicNotLike(String value) {
            addCriterion("dw_menmian_fic not like", value, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicIn(List<String> values) {
            addCriterion("dw_menmian_fic in", values, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicNotIn(List<String> values) {
            addCriterion("dw_menmian_fic not in", values, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicBetween(String value1, String value2) {
            addCriterion("dw_menmian_fic between", value1, value2, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwMenmianFicNotBetween(String value1, String value2) {
            addCriterion("dw_menmian_fic not between", value1, value2, "dwMenmianFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicIsNull() {
            addCriterion("dw_office_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicIsNotNull() {
            addCriterion("dw_office_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicEqualTo(String value) {
            addCriterion("dw_office_fic =", value, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicNotEqualTo(String value) {
            addCriterion("dw_office_fic <>", value, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicGreaterThan(String value) {
            addCriterion("dw_office_fic >", value, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_office_fic >=", value, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicLessThan(String value) {
            addCriterion("dw_office_fic <", value, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicLessThanOrEqualTo(String value) {
            addCriterion("dw_office_fic <=", value, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicLike(String value) {
            addCriterion("dw_office_fic like", value, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicNotLike(String value) {
            addCriterion("dw_office_fic not like", value, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicIn(List<String> values) {
            addCriterion("dw_office_fic in", values, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicNotIn(List<String> values) {
            addCriterion("dw_office_fic not in", values, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicBetween(String value1, String value2) {
            addCriterion("dw_office_fic between", value1, value2, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwOfficeFicNotBetween(String value1, String value2) {
            addCriterion("dw_office_fic not between", value1, value2, "dwOfficeFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicIsNull() {
            addCriterion("dw_shebei_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicIsNotNull() {
            addCriterion("dw_shebei_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicEqualTo(String value) {
            addCriterion("dw_shebei_fic =", value, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicNotEqualTo(String value) {
            addCriterion("dw_shebei_fic <>", value, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicGreaterThan(String value) {
            addCriterion("dw_shebei_fic >", value, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_shebei_fic >=", value, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicLessThan(String value) {
            addCriterion("dw_shebei_fic <", value, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicLessThanOrEqualTo(String value) {
            addCriterion("dw_shebei_fic <=", value, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicLike(String value) {
            addCriterion("dw_shebei_fic like", value, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicNotLike(String value) {
            addCriterion("dw_shebei_fic not like", value, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicIn(List<String> values) {
            addCriterion("dw_shebei_fic in", values, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicNotIn(List<String> values) {
            addCriterion("dw_shebei_fic not in", values, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicBetween(String value1, String value2) {
            addCriterion("dw_shebei_fic between", value1, value2, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwShebeiFicNotBetween(String value1, String value2) {
            addCriterion("dw_shebei_fic not between", value1, value2, "dwShebeiFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicIsNull() {
            addCriterion("dw_cangku_fic is null");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicIsNotNull() {
            addCriterion("dw_cangku_fic is not null");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicEqualTo(String value) {
            addCriterion("dw_cangku_fic =", value, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicNotEqualTo(String value) {
            addCriterion("dw_cangku_fic <>", value, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicGreaterThan(String value) {
            addCriterion("dw_cangku_fic >", value, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicGreaterThanOrEqualTo(String value) {
            addCriterion("dw_cangku_fic >=", value, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicLessThan(String value) {
            addCriterion("dw_cangku_fic <", value, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicLessThanOrEqualTo(String value) {
            addCriterion("dw_cangku_fic <=", value, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicLike(String value) {
            addCriterion("dw_cangku_fic like", value, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicNotLike(String value) {
            addCriterion("dw_cangku_fic not like", value, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicIn(List<String> values) {
            addCriterion("dw_cangku_fic in", values, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicNotIn(List<String> values) {
            addCriterion("dw_cangku_fic not in", values, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicBetween(String value1, String value2) {
            addCriterion("dw_cangku_fic between", value1, value2, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwCangkuFicNotBetween(String value1, String value2) {
            addCriterion("dw_cangku_fic not between", value1, value2, "dwCangkuFic");
            return (Criteria) this;
        }

        public Criteria andDwOtherIsNull() {
            addCriterion("dw_other is null");
            return (Criteria) this;
        }

        public Criteria andDwOtherIsNotNull() {
            addCriterion("dw_other is not null");
            return (Criteria) this;
        }

        public Criteria andDwOtherEqualTo(String value) {
            addCriterion("dw_other =", value, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherNotEqualTo(String value) {
            addCriterion("dw_other <>", value, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherGreaterThan(String value) {
            addCriterion("dw_other >", value, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherGreaterThanOrEqualTo(String value) {
            addCriterion("dw_other >=", value, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherLessThan(String value) {
            addCriterion("dw_other <", value, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherLessThanOrEqualTo(String value) {
            addCriterion("dw_other <=", value, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherLike(String value) {
            addCriterion("dw_other like", value, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherNotLike(String value) {
            addCriterion("dw_other not like", value, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherIn(List<String> values) {
            addCriterion("dw_other in", values, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherNotIn(List<String> values) {
            addCriterion("dw_other not in", values, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherBetween(String value1, String value2) {
            addCriterion("dw_other between", value1, value2, "dwOther");
            return (Criteria) this;
        }

        public Criteria andDwOtherNotBetween(String value1, String value2) {
            addCriterion("dw_other not between", value1, value2, "dwOther");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicIsNull() {
            addCriterion("jiafangyuangongzhudairen2_fic is null");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicIsNotNull() {
            addCriterion("jiafangyuangongzhudairen2_fic is not null");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicEqualTo(String value) {
            addCriterion("jiafangyuangongzhudairen2_fic =", value, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicNotEqualTo(String value) {
            addCriterion("jiafangyuangongzhudairen2_fic <>", value, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicGreaterThan(String value) {
            addCriterion("jiafangyuangongzhudairen2_fic >", value, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicGreaterThanOrEqualTo(String value) {
            addCriterion("jiafangyuangongzhudairen2_fic >=", value, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicLessThan(String value) {
            addCriterion("jiafangyuangongzhudairen2_fic <", value, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicLessThanOrEqualTo(String value) {
            addCriterion("jiafangyuangongzhudairen2_fic <=", value, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicLike(String value) {
            addCriterion("jiafangyuangongzhudairen2_fic like", value, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicNotLike(String value) {
            addCriterion("jiafangyuangongzhudairen2_fic not like", value, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicIn(List<String> values) {
            addCriterion("jiafangyuangongzhudairen2_fic in", values, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicNotIn(List<String> values) {
            addCriterion("jiafangyuangongzhudairen2_fic not in", values, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicBetween(String value1, String value2) {
            addCriterion("jiafangyuangongzhudairen2_fic between", value1, value2, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andJiafangyuangongzhudairen2FicNotBetween(String value1, String value2) {
            addCriterion("jiafangyuangongzhudairen2_fic not between", value1, value2, "jiafangyuangongzhudairen2Fic");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdIsNull() {
            addCriterion("product_series_id is null");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdIsNotNull() {
            addCriterion("product_series_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdEqualTo(String value) {
            addCriterion("product_series_id =", value, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdNotEqualTo(String value) {
            addCriterion("product_series_id <>", value, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdGreaterThan(String value) {
            addCriterion("product_series_id >", value, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_series_id >=", value, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdLessThan(String value) {
            addCriterion("product_series_id <", value, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdLessThanOrEqualTo(String value) {
            addCriterion("product_series_id <=", value, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdLike(String value) {
            addCriterion("product_series_id like", value, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdNotLike(String value) {
            addCriterion("product_series_id not like", value, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdIn(List<String> values) {
            addCriterion("product_series_id in", values, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdNotIn(List<String> values) {
            addCriterion("product_series_id not in", values, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdBetween(String value1, String value2) {
            addCriterion("product_series_id between", value1, value2, "productSeriesId");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIdNotBetween(String value1, String value2) {
            addCriterion("product_series_id not between", value1, value2, "productSeriesId");
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

        public Criteria andRepaymentTypeIsNull() {
            addCriterion("repayment_type is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNotNull() {
            addCriterion("repayment_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeEqualTo(String value) {
            addCriterion("repayment_type =", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotEqualTo(String value) {
            addCriterion("repayment_type <>", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThan(String value) {
            addCriterion("repayment_type >", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_type >=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThan(String value) {
            addCriterion("repayment_type <", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("repayment_type <=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLike(String value) {
            addCriterion("repayment_type like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotLike(String value) {
            addCriterion("repayment_type not like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIn(List<String> values) {
            addCriterion("repayment_type in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotIn(List<String> values) {
            addCriterion("repayment_type not in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeBetween(String value1, String value2) {
            addCriterion("repayment_type between", value1, value2, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotBetween(String value1, String value2) {
            addCriterion("repayment_type not between", value1, value2, "repaymentType");
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