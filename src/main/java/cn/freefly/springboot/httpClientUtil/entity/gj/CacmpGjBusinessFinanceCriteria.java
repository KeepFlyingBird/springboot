package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CacmpGjBusinessFinanceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CacmpGjBusinessFinanceCriteria() {
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(String value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(String value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(String value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(String value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLike(String value) {
            addCriterion("business_id like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotLike(String value) {
            addCriterion("business_id not like", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<String> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<String> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(String value1, String value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(String value1, String value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageIsNull() {
            addCriterion("max_approve_percentage is null");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageIsNotNull() {
            addCriterion("max_approve_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageEqualTo(String value) {
            addCriterion("max_approve_percentage =", value, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageNotEqualTo(String value) {
            addCriterion("max_approve_percentage <>", value, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageGreaterThan(String value) {
            addCriterion("max_approve_percentage >", value, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageGreaterThanOrEqualTo(String value) {
            addCriterion("max_approve_percentage >=", value, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageLessThan(String value) {
            addCriterion("max_approve_percentage <", value, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageLessThanOrEqualTo(String value) {
            addCriterion("max_approve_percentage <=", value, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageLike(String value) {
            addCriterion("max_approve_percentage like", value, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageNotLike(String value) {
            addCriterion("max_approve_percentage not like", value, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageIn(List<String> values) {
            addCriterion("max_approve_percentage in", values, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageNotIn(List<String> values) {
            addCriterion("max_approve_percentage not in", values, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageBetween(String value1, String value2) {
            addCriterion("max_approve_percentage between", value1, value2, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovePercentageNotBetween(String value1, String value2) {
            addCriterion("max_approve_percentage not between", value1, value2, "maxApprovePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageIsNull() {
            addCriterion("approve_percentage is null");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageIsNotNull() {
            addCriterion("approve_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageEqualTo(String value) {
            addCriterion("approve_percentage =", value, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageNotEqualTo(String value) {
            addCriterion("approve_percentage <>", value, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageGreaterThan(String value) {
            addCriterion("approve_percentage >", value, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageGreaterThanOrEqualTo(String value) {
            addCriterion("approve_percentage >=", value, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageLessThan(String value) {
            addCriterion("approve_percentage <", value, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageLessThanOrEqualTo(String value) {
            addCriterion("approve_percentage <=", value, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageLike(String value) {
            addCriterion("approve_percentage like", value, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageNotLike(String value) {
            addCriterion("approve_percentage not like", value, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageIn(List<String> values) {
            addCriterion("approve_percentage in", values, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageNotIn(List<String> values) {
            addCriterion("approve_percentage not in", values, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageBetween(String value1, String value2) {
            addCriterion("approve_percentage between", value1, value2, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andApprovePercentageNotBetween(String value1, String value2) {
            addCriterion("approve_percentage not between", value1, value2, "approvePercentage");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumIsNull() {
            addCriterion("max_approveSum is null");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumIsNotNull() {
            addCriterion("max_approveSum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumEqualTo(BigDecimal value) {
            addCriterion("max_approveSum =", value, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumNotEqualTo(BigDecimal value) {
            addCriterion("max_approveSum <>", value, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumGreaterThan(BigDecimal value) {
            addCriterion("max_approveSum >", value, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_approveSum >=", value, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumLessThan(BigDecimal value) {
            addCriterion("max_approveSum <", value, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_approveSum <=", value, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumIn(List<BigDecimal> values) {
            addCriterion("max_approveSum in", values, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumNotIn(List<BigDecimal> values) {
            addCriterion("max_approveSum not in", values, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_approveSum between", value1, value2, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andMaxApprovesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_approveSum not between", value1, value2, "maxApprovesum");
            return (Criteria) this;
        }

        public Criteria andApproveSumIsNull() {
            addCriterion("approve_sum is null");
            return (Criteria) this;
        }

        public Criteria andApproveSumIsNotNull() {
            addCriterion("approve_sum is not null");
            return (Criteria) this;
        }

        public Criteria andApproveSumEqualTo(BigDecimal value) {
            addCriterion("approve_sum =", value, "approveSum");
            return (Criteria) this;
        }

        public Criteria andApproveSumNotEqualTo(BigDecimal value) {
            addCriterion("approve_sum <>", value, "approveSum");
            return (Criteria) this;
        }

        public Criteria andApproveSumGreaterThan(BigDecimal value) {
            addCriterion("approve_sum >", value, "approveSum");
            return (Criteria) this;
        }

        public Criteria andApproveSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("approve_sum >=", value, "approveSum");
            return (Criteria) this;
        }

        public Criteria andApproveSumLessThan(BigDecimal value) {
            addCriterion("approve_sum <", value, "approveSum");
            return (Criteria) this;
        }

        public Criteria andApproveSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("approve_sum <=", value, "approveSum");
            return (Criteria) this;
        }

        public Criteria andApproveSumIn(List<BigDecimal> values) {
            addCriterion("approve_sum in", values, "approveSum");
            return (Criteria) this;
        }

        public Criteria andApproveSumNotIn(List<BigDecimal> values) {
            addCriterion("approve_sum not in", values, "approveSum");
            return (Criteria) this;
        }

        public Criteria andApproveSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approve_sum between", value1, value2, "approveSum");
            return (Criteria) this;
        }

        public Criteria andApproveSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approve_sum not between", value1, value2, "approveSum");
            return (Criteria) this;
        }

        public Criteria andContractSumIsNull() {
            addCriterion("contract_sum is null");
            return (Criteria) this;
        }

        public Criteria andContractSumIsNotNull() {
            addCriterion("contract_sum is not null");
            return (Criteria) this;
        }

        public Criteria andContractSumEqualTo(BigDecimal value) {
            addCriterion("contract_sum =", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumNotEqualTo(BigDecimal value) {
            addCriterion("contract_sum <>", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumGreaterThan(BigDecimal value) {
            addCriterion("contract_sum >", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("contract_sum >=", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumLessThan(BigDecimal value) {
            addCriterion("contract_sum <", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("contract_sum <=", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumIn(List<BigDecimal> values) {
            addCriterion("contract_sum in", values, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumNotIn(List<BigDecimal> values) {
            addCriterion("contract_sum not in", values, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contract_sum between", value1, value2, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contract_sum not between", value1, value2, "contractSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateIsNull() {
            addCriterion("bank_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateIsNotNull() {
            addCriterion("bank_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateEqualTo(BigDecimal value) {
            addCriterion("bank_interest_rate =", value, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateNotEqualTo(BigDecimal value) {
            addCriterion("bank_interest_rate <>", value, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateGreaterThan(BigDecimal value) {
            addCriterion("bank_interest_rate >", value, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_interest_rate >=", value, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateLessThan(BigDecimal value) {
            addCriterion("bank_interest_rate <", value, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_interest_rate <=", value, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateIn(List<BigDecimal> values) {
            addCriterion("bank_interest_rate in", values, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateNotIn(List<BigDecimal> values) {
            addCriterion("bank_interest_rate not in", values, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_interest_rate between", value1, value2, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andBankInterestRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_interest_rate not between", value1, value2, "bankInterestRate");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeIsNull() {
            addCriterion("disposable_fee is null");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeIsNotNull() {
            addCriterion("disposable_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeEqualTo(BigDecimal value) {
            addCriterion("disposable_fee =", value, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeNotEqualTo(BigDecimal value) {
            addCriterion("disposable_fee <>", value, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeGreaterThan(BigDecimal value) {
            addCriterion("disposable_fee >", value, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("disposable_fee >=", value, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeLessThan(BigDecimal value) {
            addCriterion("disposable_fee <", value, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("disposable_fee <=", value, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeIn(List<BigDecimal> values) {
            addCriterion("disposable_fee in", values, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeNotIn(List<BigDecimal> values) {
            addCriterion("disposable_fee not in", values, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("disposable_fee between", value1, value2, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andDisposableFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("disposable_fee not between", value1, value2, "disposableFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeIsNull() {
            addCriterion("eachissue_fee is null");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeIsNotNull() {
            addCriterion("eachissue_fee is not null");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeEqualTo(BigDecimal value) {
            addCriterion("eachissue_fee =", value, "eachissueFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeNotEqualTo(BigDecimal value) {
            addCriterion("eachissue_fee <>", value, "eachissueFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeGreaterThan(BigDecimal value) {
            addCriterion("eachissue_fee >", value, "eachissueFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("eachissue_fee >=", value, "eachissueFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeLessThan(BigDecimal value) {
            addCriterion("eachissue_fee <", value, "eachissueFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("eachissue_fee <=", value, "eachissueFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeIn(List<BigDecimal> values) {
            addCriterion("eachissue_fee in", values, "eachissueFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeNotIn(List<BigDecimal> values) {
            addCriterion("eachissue_fee not in", values, "eachissueFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eachissue_fee between", value1, value2, "eachissueFee");
            return (Criteria) this;
        }

        public Criteria andEachissueFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eachissue_fee not between", value1, value2, "eachissueFee");
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