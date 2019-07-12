package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonasDayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonasDayExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumIsNull() {
            addCriterion("telephone_num is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumIsNotNull() {
            addCriterion("telephone_num is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumEqualTo(String value) {
            addCriterion("telephone_num =", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotEqualTo(String value) {
            addCriterion("telephone_num <>", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumGreaterThan(String value) {
            addCriterion("telephone_num >", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("telephone_num >=", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumLessThan(String value) {
            addCriterion("telephone_num <", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumLessThanOrEqualTo(String value) {
            addCriterion("telephone_num <=", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumLike(String value) {
            addCriterion("telephone_num like", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotLike(String value) {
            addCriterion("telephone_num not like", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumIn(List<String> values) {
            addCriterion("telephone_num in", values, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotIn(List<String> values) {
            addCriterion("telephone_num not in", values, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumBetween(String value1, String value2) {
            addCriterion("telephone_num between", value1, value2, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotBetween(String value1, String value2) {
            addCriterion("telephone_num not between", value1, value2, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andSucccallCountIsNull() {
            addCriterion("succcall_count is null");
            return (Criteria) this;
        }

        public Criteria andSucccallCountIsNotNull() {
            addCriterion("succcall_count is not null");
            return (Criteria) this;
        }

        public Criteria andSucccallCountEqualTo(Integer value) {
            addCriterion("succcall_count =", value, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSucccallCountNotEqualTo(Integer value) {
            addCriterion("succcall_count <>", value, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSucccallCountGreaterThan(Integer value) {
            addCriterion("succcall_count >", value, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSucccallCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("succcall_count >=", value, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSucccallCountLessThan(Integer value) {
            addCriterion("succcall_count <", value, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSucccallCountLessThanOrEqualTo(Integer value) {
            addCriterion("succcall_count <=", value, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSucccallCountIn(List<Integer> values) {
            addCriterion("succcall_count in", values, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSucccallCountNotIn(List<Integer> values) {
            addCriterion("succcall_count not in", values, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSucccallCountBetween(Integer value1, Integer value2) {
            addCriterion("succcall_count between", value1, value2, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSucccallCountNotBetween(Integer value1, Integer value2) {
            addCriterion("succcall_count not between", value1, value2, "succcallCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountIsNull() {
            addCriterion("succorder_count is null");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountIsNotNull() {
            addCriterion("succorder_count is not null");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountEqualTo(Integer value) {
            addCriterion("succorder_count =", value, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountNotEqualTo(Integer value) {
            addCriterion("succorder_count <>", value, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountGreaterThan(Integer value) {
            addCriterion("succorder_count >", value, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("succorder_count >=", value, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountLessThan(Integer value) {
            addCriterion("succorder_count <", value, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountLessThanOrEqualTo(Integer value) {
            addCriterion("succorder_count <=", value, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountIn(List<Integer> values) {
            addCriterion("succorder_count in", values, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountNotIn(List<Integer> values) {
            addCriterion("succorder_count not in", values, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountBetween(Integer value1, Integer value2) {
            addCriterion("succorder_count between", value1, value2, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andSuccorderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("succorder_count not between", value1, value2, "succorderCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountIsNull() {
            addCriterion("concall_count is null");
            return (Criteria) this;
        }

        public Criteria andConcallCountIsNotNull() {
            addCriterion("concall_count is not null");
            return (Criteria) this;
        }

        public Criteria andConcallCountEqualTo(Integer value) {
            addCriterion("concall_count =", value, "concallCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountNotEqualTo(Integer value) {
            addCriterion("concall_count <>", value, "concallCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountGreaterThan(Integer value) {
            addCriterion("concall_count >", value, "concallCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("concall_count >=", value, "concallCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountLessThan(Integer value) {
            addCriterion("concall_count <", value, "concallCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountLessThanOrEqualTo(Integer value) {
            addCriterion("concall_count <=", value, "concallCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountIn(List<Integer> values) {
            addCriterion("concall_count in", values, "concallCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountNotIn(List<Integer> values) {
            addCriterion("concall_count not in", values, "concallCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountBetween(Integer value1, Integer value2) {
            addCriterion("concall_count between", value1, value2, "concallCount");
            return (Criteria) this;
        }

        public Criteria andConcallCountNotBetween(Integer value1, Integer value2) {
            addCriterion("concall_count not between", value1, value2, "concallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountIsNull() {
            addCriterion("allcall_count is null");
            return (Criteria) this;
        }

        public Criteria andAllcallCountIsNotNull() {
            addCriterion("allcall_count is not null");
            return (Criteria) this;
        }

        public Criteria andAllcallCountEqualTo(Integer value) {
            addCriterion("allcall_count =", value, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountNotEqualTo(Integer value) {
            addCriterion("allcall_count <>", value, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountGreaterThan(Integer value) {
            addCriterion("allcall_count >", value, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("allcall_count >=", value, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountLessThan(Integer value) {
            addCriterion("allcall_count <", value, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountLessThanOrEqualTo(Integer value) {
            addCriterion("allcall_count <=", value, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountIn(List<Integer> values) {
            addCriterion("allcall_count in", values, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountNotIn(List<Integer> values) {
            addCriterion("allcall_count not in", values, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountBetween(Integer value1, Integer value2) {
            addCriterion("allcall_count between", value1, value2, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andAllcallCountNotBetween(Integer value1, Integer value2) {
            addCriterion("allcall_count not between", value1, value2, "allcallCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountIsNull() {
            addCriterion("succqc_count is null");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountIsNotNull() {
            addCriterion("succqc_count is not null");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountEqualTo(Integer value) {
            addCriterion("succqc_count =", value, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountNotEqualTo(Integer value) {
            addCriterion("succqc_count <>", value, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountGreaterThan(Integer value) {
            addCriterion("succqc_count >", value, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("succqc_count >=", value, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountLessThan(Integer value) {
            addCriterion("succqc_count <", value, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountLessThanOrEqualTo(Integer value) {
            addCriterion("succqc_count <=", value, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountIn(List<Integer> values) {
            addCriterion("succqc_count in", values, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountNotIn(List<Integer> values) {
            addCriterion("succqc_count not in", values, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountBetween(Integer value1, Integer value2) {
            addCriterion("succqc_count between", value1, value2, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccqcCountNotBetween(Integer value1, Integer value2) {
            addCriterion("succqc_count not between", value1, value2, "succqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountIsNull() {
            addCriterion("succsecqc_count is null");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountIsNotNull() {
            addCriterion("succsecqc_count is not null");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountEqualTo(Integer value) {
            addCriterion("succsecqc_count =", value, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountNotEqualTo(Integer value) {
            addCriterion("succsecqc_count <>", value, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountGreaterThan(Integer value) {
            addCriterion("succsecqc_count >", value, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("succsecqc_count >=", value, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountLessThan(Integer value) {
            addCriterion("succsecqc_count <", value, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountLessThanOrEqualTo(Integer value) {
            addCriterion("succsecqc_count <=", value, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountIn(List<Integer> values) {
            addCriterion("succsecqc_count in", values, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountNotIn(List<Integer> values) {
            addCriterion("succsecqc_count not in", values, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountBetween(Integer value1, Integer value2) {
            addCriterion("succsecqc_count between", value1, value2, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccsecqcCountNotBetween(Integer value1, Integer value2) {
            addCriterion("succsecqc_count not between", value1, value2, "succsecqcCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountIsNull() {
            addCriterion("succaccount_count is null");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountIsNotNull() {
            addCriterion("succaccount_count is not null");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountEqualTo(Integer value) {
            addCriterion("succaccount_count =", value, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountNotEqualTo(Integer value) {
            addCriterion("succaccount_count <>", value, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountGreaterThan(Integer value) {
            addCriterion("succaccount_count >", value, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("succaccount_count >=", value, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountLessThan(Integer value) {
            addCriterion("succaccount_count <", value, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountLessThanOrEqualTo(Integer value) {
            addCriterion("succaccount_count <=", value, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountIn(List<Integer> values) {
            addCriterion("succaccount_count in", values, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountNotIn(List<Integer> values) {
            addCriterion("succaccount_count not in", values, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountBetween(Integer value1, Integer value2) {
            addCriterion("succaccount_count between", value1, value2, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andSuccaccountCountNotBetween(Integer value1, Integer value2) {
            addCriterion("succaccount_count not between", value1, value2, "succaccountCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountIsNull() {
            addCriterion("complain_count is null");
            return (Criteria) this;
        }

        public Criteria andComplainCountIsNotNull() {
            addCriterion("complain_count is not null");
            return (Criteria) this;
        }

        public Criteria andComplainCountEqualTo(Integer value) {
            addCriterion("complain_count =", value, "complainCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountNotEqualTo(Integer value) {
            addCriterion("complain_count <>", value, "complainCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountGreaterThan(Integer value) {
            addCriterion("complain_count >", value, "complainCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_count >=", value, "complainCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountLessThan(Integer value) {
            addCriterion("complain_count <", value, "complainCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountLessThanOrEqualTo(Integer value) {
            addCriterion("complain_count <=", value, "complainCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountIn(List<Integer> values) {
            addCriterion("complain_count in", values, "complainCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountNotIn(List<Integer> values) {
            addCriterion("complain_count not in", values, "complainCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountBetween(Integer value1, Integer value2) {
            addCriterion("complain_count between", value1, value2, "complainCount");
            return (Criteria) this;
        }

        public Criteria andComplainCountNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_count not between", value1, value2, "complainCount");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalIsNull() {
            addCriterion("voice_normal is null");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalIsNotNull() {
            addCriterion("voice_normal is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalEqualTo(Integer value) {
            addCriterion("voice_normal =", value, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalNotEqualTo(Integer value) {
            addCriterion("voice_normal <>", value, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalGreaterThan(Integer value) {
            addCriterion("voice_normal >", value, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalGreaterThanOrEqualTo(Integer value) {
            addCriterion("voice_normal >=", value, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalLessThan(Integer value) {
            addCriterion("voice_normal <", value, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalLessThanOrEqualTo(Integer value) {
            addCriterion("voice_normal <=", value, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalIn(List<Integer> values) {
            addCriterion("voice_normal in", values, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalNotIn(List<Integer> values) {
            addCriterion("voice_normal not in", values, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalBetween(Integer value1, Integer value2) {
            addCriterion("voice_normal between", value1, value2, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceNormalNotBetween(Integer value1, Integer value2) {
            addCriterion("voice_normal not between", value1, value2, "voiceNormal");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionIsNull() {
            addCriterion("voice_exception is null");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionIsNotNull() {
            addCriterion("voice_exception is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionEqualTo(Integer value) {
            addCriterion("voice_exception =", value, "voiceException");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionNotEqualTo(Integer value) {
            addCriterion("voice_exception <>", value, "voiceException");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionGreaterThan(Integer value) {
            addCriterion("voice_exception >", value, "voiceException");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("voice_exception >=", value, "voiceException");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionLessThan(Integer value) {
            addCriterion("voice_exception <", value, "voiceException");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionLessThanOrEqualTo(Integer value) {
            addCriterion("voice_exception <=", value, "voiceException");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionIn(List<Integer> values) {
            addCriterion("voice_exception in", values, "voiceException");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionNotIn(List<Integer> values) {
            addCriterion("voice_exception not in", values, "voiceException");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionBetween(Integer value1, Integer value2) {
            addCriterion("voice_exception between", value1, value2, "voiceException");
            return (Criteria) this;
        }

        public Criteria andVoiceExceptionNotBetween(Integer value1, Integer value2) {
            addCriterion("voice_exception not between", value1, value2, "voiceException");
            return (Criteria) this;
        }

        public Criteria andQualityServiceIsNull() {
            addCriterion("quality_service is null");
            return (Criteria) this;
        }

        public Criteria andQualityServiceIsNotNull() {
            addCriterion("quality_service is not null");
            return (Criteria) this;
        }

        public Criteria andQualityServiceEqualTo(Integer value) {
            addCriterion("quality_service =", value, "qualityService");
            return (Criteria) this;
        }

        public Criteria andQualityServiceNotEqualTo(Integer value) {
            addCriterion("quality_service <>", value, "qualityService");
            return (Criteria) this;
        }

        public Criteria andQualityServiceGreaterThan(Integer value) {
            addCriterion("quality_service >", value, "qualityService");
            return (Criteria) this;
        }

        public Criteria andQualityServiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_service >=", value, "qualityService");
            return (Criteria) this;
        }

        public Criteria andQualityServiceLessThan(Integer value) {
            addCriterion("quality_service <", value, "qualityService");
            return (Criteria) this;
        }

        public Criteria andQualityServiceLessThanOrEqualTo(Integer value) {
            addCriterion("quality_service <=", value, "qualityService");
            return (Criteria) this;
        }

        public Criteria andQualityServiceIn(List<Integer> values) {
            addCriterion("quality_service in", values, "qualityService");
            return (Criteria) this;
        }

        public Criteria andQualityServiceNotIn(List<Integer> values) {
            addCriterion("quality_service not in", values, "qualityService");
            return (Criteria) this;
        }

        public Criteria andQualityServiceBetween(Integer value1, Integer value2) {
            addCriterion("quality_service between", value1, value2, "qualityService");
            return (Criteria) this;
        }

        public Criteria andQualityServiceNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_service not between", value1, value2, "qualityService");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultIsNull() {
            addCriterion("error_endresult is null");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultIsNotNull() {
            addCriterion("error_endresult is not null");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultEqualTo(Integer value) {
            addCriterion("error_endresult =", value, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultNotEqualTo(Integer value) {
            addCriterion("error_endresult <>", value, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultGreaterThan(Integer value) {
            addCriterion("error_endresult >", value, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultGreaterThanOrEqualTo(Integer value) {
            addCriterion("error_endresult >=", value, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultLessThan(Integer value) {
            addCriterion("error_endresult <", value, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultLessThanOrEqualTo(Integer value) {
            addCriterion("error_endresult <=", value, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultIn(List<Integer> values) {
            addCriterion("error_endresult in", values, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultNotIn(List<Integer> values) {
            addCriterion("error_endresult not in", values, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultBetween(Integer value1, Integer value2) {
            addCriterion("error_endresult between", value1, value2, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andErrorEndresultNotBetween(Integer value1, Integer value2) {
            addCriterion("error_endresult not between", value1, value2, "errorEndresult");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNull() {
            addCriterion("credit_score is null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNotNull() {
            addCriterion("credit_score is not null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreEqualTo(Integer value) {
            addCriterion("credit_score =", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotEqualTo(Integer value) {
            addCriterion("credit_score <>", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThan(Integer value) {
            addCriterion("credit_score >", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_score >=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThan(Integer value) {
            addCriterion("credit_score <", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThanOrEqualTo(Integer value) {
            addCriterion("credit_score <=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIn(List<Integer> values) {
            addCriterion("credit_score in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotIn(List<Integer> values) {
            addCriterion("credit_score not in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreBetween(Integer value1, Integer value2) {
            addCriterion("credit_score between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_score not between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNull() {
            addCriterion("skills is null");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNotNull() {
            addCriterion("skills is not null");
            return (Criteria) this;
        }

        public Criteria andSkillsEqualTo(String value) {
            addCriterion("skills =", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotEqualTo(String value) {
            addCriterion("skills <>", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThan(String value) {
            addCriterion("skills >", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThanOrEqualTo(String value) {
            addCriterion("skills >=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThan(String value) {
            addCriterion("skills <", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThanOrEqualTo(String value) {
            addCriterion("skills <=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLike(String value) {
            addCriterion("skills like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotLike(String value) {
            addCriterion("skills not like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsIn(List<String> values) {
            addCriterion("skills in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotIn(List<String> values) {
            addCriterion("skills not in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsBetween(String value1, String value2) {
            addCriterion("skills between", value1, value2, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotBetween(String value1, String value2) {
            addCriterion("skills not between", value1, value2, "skills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsIsNull() {
            addCriterion("business_skills is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsIsNotNull() {
            addCriterion("business_skills is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsEqualTo(String value) {
            addCriterion("business_skills =", value, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsNotEqualTo(String value) {
            addCriterion("business_skills <>", value, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsGreaterThan(String value) {
            addCriterion("business_skills >", value, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsGreaterThanOrEqualTo(String value) {
            addCriterion("business_skills >=", value, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsLessThan(String value) {
            addCriterion("business_skills <", value, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsLessThanOrEqualTo(String value) {
            addCriterion("business_skills <=", value, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsLike(String value) {
            addCriterion("business_skills like", value, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsNotLike(String value) {
            addCriterion("business_skills not like", value, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsIn(List<String> values) {
            addCriterion("business_skills in", values, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsNotIn(List<String> values) {
            addCriterion("business_skills not in", values, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsBetween(String value1, String value2) {
            addCriterion("business_skills between", value1, value2, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andBusinessSkillsNotBetween(String value1, String value2) {
            addCriterion("business_skills not between", value1, value2, "businessSkills");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNull() {
            addCriterion("educational is null");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNotNull() {
            addCriterion("educational is not null");
            return (Criteria) this;
        }

        public Criteria andEducationalEqualTo(String value) {
            addCriterion("educational =", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotEqualTo(String value) {
            addCriterion("educational <>", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThan(String value) {
            addCriterion("educational >", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThanOrEqualTo(String value) {
            addCriterion("educational >=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThan(String value) {
            addCriterion("educational <", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThanOrEqualTo(String value) {
            addCriterion("educational <=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLike(String value) {
            addCriterion("educational like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotLike(String value) {
            addCriterion("educational not like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalIn(List<String> values) {
            addCriterion("educational in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotIn(List<String> values) {
            addCriterion("educational not in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalBetween(String value1, String value2) {
            addCriterion("educational between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotBetween(String value1, String value2) {
            addCriterion("educational not between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andWorkExpIsNull() {
            addCriterion("work_exp is null");
            return (Criteria) this;
        }

        public Criteria andWorkExpIsNotNull() {
            addCriterion("work_exp is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExpEqualTo(String value) {
            addCriterion("work_exp =", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpNotEqualTo(String value) {
            addCriterion("work_exp <>", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpGreaterThan(String value) {
            addCriterion("work_exp >", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpGreaterThanOrEqualTo(String value) {
            addCriterion("work_exp >=", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpLessThan(String value) {
            addCriterion("work_exp <", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpLessThanOrEqualTo(String value) {
            addCriterion("work_exp <=", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpLike(String value) {
            addCriterion("work_exp like", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpNotLike(String value) {
            addCriterion("work_exp not like", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpIn(List<String> values) {
            addCriterion("work_exp in", values, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpNotIn(List<String> values) {
            addCriterion("work_exp not in", values, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpBetween(String value1, String value2) {
            addCriterion("work_exp between", value1, value2, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpNotBetween(String value1, String value2) {
            addCriterion("work_exp not between", value1, value2, "workExp");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andNowpointsIsNull() {
            addCriterion("nowpoints is null");
            return (Criteria) this;
        }

        public Criteria andNowpointsIsNotNull() {
            addCriterion("nowpoints is not null");
            return (Criteria) this;
        }

        public Criteria andNowpointsEqualTo(Integer value) {
            addCriterion("nowpoints =", value, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andNowpointsNotEqualTo(Integer value) {
            addCriterion("nowpoints <>", value, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andNowpointsGreaterThan(Integer value) {
            addCriterion("nowpoints >", value, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andNowpointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("nowpoints >=", value, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andNowpointsLessThan(Integer value) {
            addCriterion("nowpoints <", value, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andNowpointsLessThanOrEqualTo(Integer value) {
            addCriterion("nowpoints <=", value, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andNowpointsIn(List<Integer> values) {
            addCriterion("nowpoints in", values, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andNowpointsNotIn(List<Integer> values) {
            addCriterion("nowpoints not in", values, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andNowpointsBetween(Integer value1, Integer value2) {
            addCriterion("nowpoints between", value1, value2, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andNowpointsNotBetween(Integer value1, Integer value2) {
            addCriterion("nowpoints not between", value1, value2, "nowpoints");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andPersonInfoIsNull() {
            addCriterion("person_info is null");
            return (Criteria) this;
        }

        public Criteria andPersonInfoIsNotNull() {
            addCriterion("person_info is not null");
            return (Criteria) this;
        }

        public Criteria andPersonInfoEqualTo(String value) {
            addCriterion("person_info =", value, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoNotEqualTo(String value) {
            addCriterion("person_info <>", value, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoGreaterThan(String value) {
            addCriterion("person_info >", value, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoGreaterThanOrEqualTo(String value) {
            addCriterion("person_info >=", value, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoLessThan(String value) {
            addCriterion("person_info <", value, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoLessThanOrEqualTo(String value) {
            addCriterion("person_info <=", value, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoLike(String value) {
            addCriterion("person_info like", value, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoNotLike(String value) {
            addCriterion("person_info not like", value, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoIn(List<String> values) {
            addCriterion("person_info in", values, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoNotIn(List<String> values) {
            addCriterion("person_info not in", values, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoBetween(String value1, String value2) {
            addCriterion("person_info between", value1, value2, "personInfo");
            return (Criteria) this;
        }

        public Criteria andPersonInfoNotBetween(String value1, String value2) {
            addCriterion("person_info not between", value1, value2, "personInfo");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeIsNull() {
            addCriterion("all_loginTime is null");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeIsNotNull() {
            addCriterion("all_loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeEqualTo(Long value) {
            addCriterion("all_loginTime =", value, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeNotEqualTo(Long value) {
            addCriterion("all_loginTime <>", value, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeGreaterThan(Long value) {
            addCriterion("all_loginTime >", value, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeGreaterThanOrEqualTo(Long value) {
            addCriterion("all_loginTime >=", value, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeLessThan(Long value) {
            addCriterion("all_loginTime <", value, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeLessThanOrEqualTo(Long value) {
            addCriterion("all_loginTime <=", value, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeIn(List<Long> values) {
            addCriterion("all_loginTime in", values, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeNotIn(List<Long> values) {
            addCriterion("all_loginTime not in", values, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeBetween(Long value1, Long value2) {
            addCriterion("all_loginTime between", value1, value2, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllLogintimeNotBetween(Long value1, Long value2) {
            addCriterion("all_loginTime not between", value1, value2, "allLogintime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeIsNull() {
            addCriterion("all_callTime is null");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeIsNotNull() {
            addCriterion("all_callTime is not null");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeEqualTo(Long value) {
            addCriterion("all_callTime =", value, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeNotEqualTo(Long value) {
            addCriterion("all_callTime <>", value, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeGreaterThan(Long value) {
            addCriterion("all_callTime >", value, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeGreaterThanOrEqualTo(Long value) {
            addCriterion("all_callTime >=", value, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeLessThan(Long value) {
            addCriterion("all_callTime <", value, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeLessThanOrEqualTo(Long value) {
            addCriterion("all_callTime <=", value, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeIn(List<Long> values) {
            addCriterion("all_callTime in", values, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeNotIn(List<Long> values) {
            addCriterion("all_callTime not in", values, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeBetween(Long value1, Long value2) {
            addCriterion("all_callTime between", value1, value2, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andAllCalltimeNotBetween(Long value1, Long value2) {
            addCriterion("all_callTime not between", value1, value2, "allCalltime");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNull() {
            addCriterion("datatime is null");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNotNull() {
            addCriterion("datatime is not null");
            return (Criteria) this;
        }

        public Criteria andDatatimeEqualTo(Date value) {
            addCriterionForJDBCDate("datatime =", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("datatime <>", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThan(Date value) {
            addCriterionForJDBCDate("datatime >", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datatime >=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThan(Date value) {
            addCriterionForJDBCDate("datatime <", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datatime <=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeIn(List<Date> values) {
            addCriterionForJDBCDate("datatime in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("datatime not in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datatime between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datatime not between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeIsNull() {
            addCriterion("screen_busytime is null");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeIsNotNull() {
            addCriterion("screen_busytime is not null");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeEqualTo(Long value) {
            addCriterion("screen_busytime =", value, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeNotEqualTo(Long value) {
            addCriterion("screen_busytime <>", value, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeGreaterThan(Long value) {
            addCriterion("screen_busytime >", value, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeGreaterThanOrEqualTo(Long value) {
            addCriterion("screen_busytime >=", value, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeLessThan(Long value) {
            addCriterion("screen_busytime <", value, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeLessThanOrEqualTo(Long value) {
            addCriterion("screen_busytime <=", value, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeIn(List<Long> values) {
            addCriterion("screen_busytime in", values, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeNotIn(List<Long> values) {
            addCriterion("screen_busytime not in", values, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeBetween(Long value1, Long value2) {
            addCriterion("screen_busytime between", value1, value2, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andScreenBusytimeNotBetween(Long value1, Long value2) {
            addCriterion("screen_busytime not between", value1, value2, "screenBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeIsNull() {
            addCriterion("hand_busytime is null");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeIsNotNull() {
            addCriterion("hand_busytime is not null");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeEqualTo(Long value) {
            addCriterion("hand_busytime =", value, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeNotEqualTo(Long value) {
            addCriterion("hand_busytime <>", value, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeGreaterThan(Long value) {
            addCriterion("hand_busytime >", value, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeGreaterThanOrEqualTo(Long value) {
            addCriterion("hand_busytime >=", value, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeLessThan(Long value) {
            addCriterion("hand_busytime <", value, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeLessThanOrEqualTo(Long value) {
            addCriterion("hand_busytime <=", value, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeIn(List<Long> values) {
            addCriterion("hand_busytime in", values, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeNotIn(List<Long> values) {
            addCriterion("hand_busytime not in", values, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeBetween(Long value1, Long value2) {
            addCriterion("hand_busytime between", value1, value2, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andHandBusytimeNotBetween(Long value1, Long value2) {
            addCriterion("hand_busytime not between", value1, value2, "handBusytime");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceId is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceId is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Integer value) {
            addCriterion("provinceId =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Integer value) {
            addCriterion("provinceId <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Integer value) {
            addCriterion("provinceId >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("provinceId >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Integer value) {
            addCriterion("provinceId <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("provinceId <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Integer> values) {
            addCriterion("provinceId in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Integer> values) {
            addCriterion("provinceId not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("provinceId between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("provinceId not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andPAgentidIsNull() {
            addCriterion("p_agentId is null");
            return (Criteria) this;
        }

        public Criteria andPAgentidIsNotNull() {
            addCriterion("p_agentId is not null");
            return (Criteria) this;
        }

        public Criteria andPAgentidEqualTo(Integer value) {
            addCriterion("p_agentId =", value, "pAgentid");
            return (Criteria) this;
        }

        public Criteria andPAgentidNotEqualTo(Integer value) {
            addCriterion("p_agentId <>", value, "pAgentid");
            return (Criteria) this;
        }

        public Criteria andPAgentidGreaterThan(Integer value) {
            addCriterion("p_agentId >", value, "pAgentid");
            return (Criteria) this;
        }

        public Criteria andPAgentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_agentId >=", value, "pAgentid");
            return (Criteria) this;
        }

        public Criteria andPAgentidLessThan(Integer value) {
            addCriterion("p_agentId <", value, "pAgentid");
            return (Criteria) this;
        }

        public Criteria andPAgentidLessThanOrEqualTo(Integer value) {
            addCriterion("p_agentId <=", value, "pAgentid");
            return (Criteria) this;
        }

        public Criteria andPAgentidIn(List<Integer> values) {
            addCriterion("p_agentId in", values, "pAgentid");
            return (Criteria) this;
        }

        public Criteria andPAgentidNotIn(List<Integer> values) {
            addCriterion("p_agentId not in", values, "pAgentid");
            return (Criteria) this;
        }

        public Criteria andPAgentidBetween(Integer value1, Integer value2) {
            addCriterion("p_agentId between", value1, value2, "pAgentid");
            return (Criteria) this;
        }

        public Criteria andPAgentidNotBetween(Integer value1, Integer value2) {
            addCriterion("p_agentId not between", value1, value2, "pAgentid");
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