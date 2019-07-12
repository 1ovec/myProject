package com.hd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StopTaskinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StopTaskinfoExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Integer value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Integer value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Integer value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Integer value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Integer> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Integer> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_name =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdIsNull() {
            addCriterion("task_batch_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdIsNotNull() {
            addCriterion("task_batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdEqualTo(Integer value) {
            addCriterion("task_batch_id =", value, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdNotEqualTo(Integer value) {
            addCriterion("task_batch_id <>", value, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdGreaterThan(Integer value) {
            addCriterion("task_batch_id >", value, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_batch_id >=", value, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdLessThan(Integer value) {
            addCriterion("task_batch_id <", value, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_batch_id <=", value, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdIn(List<Integer> values) {
            addCriterion("task_batch_id in", values, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdNotIn(List<Integer> values) {
            addCriterion("task_batch_id not in", values, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("task_batch_id between", value1, value2, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_batch_id not between", value1, value2, "taskBatchId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamIsNull() {
            addCriterion("marketing_team is null");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamIsNotNull() {
            addCriterion("marketing_team is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamEqualTo(Integer value) {
            addCriterion("marketing_team =", value, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamNotEqualTo(Integer value) {
            addCriterion("marketing_team <>", value, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamGreaterThan(Integer value) {
            addCriterion("marketing_team >", value, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("marketing_team >=", value, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamLessThan(Integer value) {
            addCriterion("marketing_team <", value, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamLessThanOrEqualTo(Integer value) {
            addCriterion("marketing_team <=", value, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamIn(List<Integer> values) {
            addCriterion("marketing_team in", values, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamNotIn(List<Integer> values) {
            addCriterion("marketing_team not in", values, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamBetween(Integer value1, Integer value2) {
            addCriterion("marketing_team between", value1, value2, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andMarketingTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("marketing_team not between", value1, value2, "marketingTeam");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserIsNull() {
            addCriterion("count_out_call_user is null");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserIsNotNull() {
            addCriterion("count_out_call_user is not null");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserEqualTo(Integer value) {
            addCriterion("count_out_call_user =", value, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserNotEqualTo(Integer value) {
            addCriterion("count_out_call_user <>", value, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserGreaterThan(Integer value) {
            addCriterion("count_out_call_user >", value, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_out_call_user >=", value, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserLessThan(Integer value) {
            addCriterion("count_out_call_user <", value, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserLessThanOrEqualTo(Integer value) {
            addCriterion("count_out_call_user <=", value, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserIn(List<Integer> values) {
            addCriterion("count_out_call_user in", values, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserNotIn(List<Integer> values) {
            addCriterion("count_out_call_user not in", values, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserBetween(Integer value1, Integer value2) {
            addCriterion("count_out_call_user between", value1, value2, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andCountOutCallUserNotBetween(Integer value1, Integer value2) {
            addCriterion("count_out_call_user not between", value1, value2, "countOutCallUser");
            return (Criteria) this;
        }

        public Criteria andTaskCountIsNull() {
            addCriterion("task_count is null");
            return (Criteria) this;
        }

        public Criteria andTaskCountIsNotNull() {
            addCriterion("task_count is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCountEqualTo(Integer value) {
            addCriterion("task_count =", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountNotEqualTo(Integer value) {
            addCriterion("task_count <>", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountGreaterThan(Integer value) {
            addCriterion("task_count >", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_count >=", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountLessThan(Integer value) {
            addCriterion("task_count <", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountLessThanOrEqualTo(Integer value) {
            addCriterion("task_count <=", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountIn(List<Integer> values) {
            addCriterion("task_count in", values, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountNotIn(List<Integer> values) {
            addCriterion("task_count not in", values, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountBetween(Integer value1, Integer value2) {
            addCriterion("task_count between", value1, value2, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountNotBetween(Integer value1, Integer value2) {
            addCriterion("task_count not between", value1, value2, "taskCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountIsNull() {
            addCriterion("invalid_count is null");
            return (Criteria) this;
        }

        public Criteria andInvalidCountIsNotNull() {
            addCriterion("invalid_count is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidCountEqualTo(Integer value) {
            addCriterion("invalid_count =", value, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountNotEqualTo(Integer value) {
            addCriterion("invalid_count <>", value, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountGreaterThan(Integer value) {
            addCriterion("invalid_count >", value, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("invalid_count >=", value, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountLessThan(Integer value) {
            addCriterion("invalid_count <", value, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountLessThanOrEqualTo(Integer value) {
            addCriterion("invalid_count <=", value, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountIn(List<Integer> values) {
            addCriterion("invalid_count in", values, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountNotIn(List<Integer> values) {
            addCriterion("invalid_count not in", values, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountBetween(Integer value1, Integer value2) {
            addCriterion("invalid_count between", value1, value2, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andInvalidCountNotBetween(Integer value1, Integer value2) {
            addCriterion("invalid_count not between", value1, value2, "invalidCount");
            return (Criteria) this;
        }

        public Criteria andValidCountIsNull() {
            addCriterion("valid_count is null");
            return (Criteria) this;
        }

        public Criteria andValidCountIsNotNull() {
            addCriterion("valid_count is not null");
            return (Criteria) this;
        }

        public Criteria andValidCountEqualTo(Integer value) {
            addCriterion("valid_count =", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountNotEqualTo(Integer value) {
            addCriterion("valid_count <>", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountGreaterThan(Integer value) {
            addCriterion("valid_count >", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_count >=", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountLessThan(Integer value) {
            addCriterion("valid_count <", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountLessThanOrEqualTo(Integer value) {
            addCriterion("valid_count <=", value, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountIn(List<Integer> values) {
            addCriterion("valid_count in", values, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountNotIn(List<Integer> values) {
            addCriterion("valid_count not in", values, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountBetween(Integer value1, Integer value2) {
            addCriterion("valid_count between", value1, value2, "validCount");
            return (Criteria) this;
        }

        public Criteria andValidCountNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_count not between", value1, value2, "validCount");
            return (Criteria) this;
        }

        public Criteria andStopCountIsNull() {
            addCriterion("stop_count is null");
            return (Criteria) this;
        }

        public Criteria andStopCountIsNotNull() {
            addCriterion("stop_count is not null");
            return (Criteria) this;
        }

        public Criteria andStopCountEqualTo(Integer value) {
            addCriterion("stop_count =", value, "stopCount");
            return (Criteria) this;
        }

        public Criteria andStopCountNotEqualTo(Integer value) {
            addCriterion("stop_count <>", value, "stopCount");
            return (Criteria) this;
        }

        public Criteria andStopCountGreaterThan(Integer value) {
            addCriterion("stop_count >", value, "stopCount");
            return (Criteria) this;
        }

        public Criteria andStopCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop_count >=", value, "stopCount");
            return (Criteria) this;
        }

        public Criteria andStopCountLessThan(Integer value) {
            addCriterion("stop_count <", value, "stopCount");
            return (Criteria) this;
        }

        public Criteria andStopCountLessThanOrEqualTo(Integer value) {
            addCriterion("stop_count <=", value, "stopCount");
            return (Criteria) this;
        }

        public Criteria andStopCountIn(List<Integer> values) {
            addCriterion("stop_count in", values, "stopCount");
            return (Criteria) this;
        }

        public Criteria andStopCountNotIn(List<Integer> values) {
            addCriterion("stop_count not in", values, "stopCount");
            return (Criteria) this;
        }

        public Criteria andStopCountBetween(Integer value1, Integer value2) {
            addCriterion("stop_count between", value1, value2, "stopCount");
            return (Criteria) this;
        }

        public Criteria andStopCountNotBetween(Integer value1, Integer value2) {
            addCriterion("stop_count not between", value1, value2, "stopCount");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(Integer value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(Integer value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(Integer value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(Integer value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(Integer value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<Integer> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<Integer> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(Integer value1, Integer value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andCallNumCountIsNull() {
            addCriterion("call_num_count is null");
            return (Criteria) this;
        }

        public Criteria andCallNumCountIsNotNull() {
            addCriterion("call_num_count is not null");
            return (Criteria) this;
        }

        public Criteria andCallNumCountEqualTo(Integer value) {
            addCriterion("call_num_count =", value, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCallNumCountNotEqualTo(Integer value) {
            addCriterion("call_num_count <>", value, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCallNumCountGreaterThan(Integer value) {
            addCriterion("call_num_count >", value, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCallNumCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_num_count >=", value, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCallNumCountLessThan(Integer value) {
            addCriterion("call_num_count <", value, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCallNumCountLessThanOrEqualTo(Integer value) {
            addCriterion("call_num_count <=", value, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCallNumCountIn(List<Integer> values) {
            addCriterion("call_num_count in", values, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCallNumCountNotIn(List<Integer> values) {
            addCriterion("call_num_count not in", values, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCallNumCountBetween(Integer value1, Integer value2) {
            addCriterion("call_num_count between", value1, value2, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCallNumCountNotBetween(Integer value1, Integer value2) {
            addCriterion("call_num_count not between", value1, value2, "callNumCount");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolIsNull() {
            addCriterion("count_data_pool is null");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolIsNotNull() {
            addCriterion("count_data_pool is not null");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolEqualTo(Integer value) {
            addCriterion("count_data_pool =", value, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolNotEqualTo(Integer value) {
            addCriterion("count_data_pool <>", value, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolGreaterThan(Integer value) {
            addCriterion("count_data_pool >", value, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_data_pool >=", value, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolLessThan(Integer value) {
            addCriterion("count_data_pool <", value, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolLessThanOrEqualTo(Integer value) {
            addCriterion("count_data_pool <=", value, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolIn(List<Integer> values) {
            addCriterion("count_data_pool in", values, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolNotIn(List<Integer> values) {
            addCriterion("count_data_pool not in", values, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolBetween(Integer value1, Integer value2) {
            addCriterion("count_data_pool between", value1, value2, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCountDataPoolNotBetween(Integer value1, Integer value2) {
            addCriterion("count_data_pool not between", value1, value2, "countDataPool");
            return (Criteria) this;
        }

        public Criteria andCoutCallIsNull() {
            addCriterion("cout_call is null");
            return (Criteria) this;
        }

        public Criteria andCoutCallIsNotNull() {
            addCriterion("cout_call is not null");
            return (Criteria) this;
        }

        public Criteria andCoutCallEqualTo(Integer value) {
            addCriterion("cout_call =", value, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutCallNotEqualTo(Integer value) {
            addCriterion("cout_call <>", value, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutCallGreaterThan(Integer value) {
            addCriterion("cout_call >", value, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutCallGreaterThanOrEqualTo(Integer value) {
            addCriterion("cout_call >=", value, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutCallLessThan(Integer value) {
            addCriterion("cout_call <", value, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutCallLessThanOrEqualTo(Integer value) {
            addCriterion("cout_call <=", value, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutCallIn(List<Integer> values) {
            addCriterion("cout_call in", values, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutCallNotIn(List<Integer> values) {
            addCriterion("cout_call not in", values, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutCallBetween(Integer value1, Integer value2) {
            addCriterion("cout_call between", value1, value2, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutCallNotBetween(Integer value1, Integer value2) {
            addCriterion("cout_call not between", value1, value2, "coutCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallIsNull() {
            addCriterion("cout_succeed_call is null");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallIsNotNull() {
            addCriterion("cout_succeed_call is not null");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallEqualTo(Integer value) {
            addCriterion("cout_succeed_call =", value, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallNotEqualTo(Integer value) {
            addCriterion("cout_succeed_call <>", value, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallGreaterThan(Integer value) {
            addCriterion("cout_succeed_call >", value, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallGreaterThanOrEqualTo(Integer value) {
            addCriterion("cout_succeed_call >=", value, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallLessThan(Integer value) {
            addCriterion("cout_succeed_call <", value, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallLessThanOrEqualTo(Integer value) {
            addCriterion("cout_succeed_call <=", value, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallIn(List<Integer> values) {
            addCriterion("cout_succeed_call in", values, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallNotIn(List<Integer> values) {
            addCriterion("cout_succeed_call not in", values, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallBetween(Integer value1, Integer value2) {
            addCriterion("cout_succeed_call between", value1, value2, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallNotBetween(Integer value1, Integer value2) {
            addCriterion("cout_succeed_call not between", value1, value2, "coutSucceedCall");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateIsNull() {
            addCriterion("cout_succeed_call_rate is null");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateIsNotNull() {
            addCriterion("cout_succeed_call_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateEqualTo(String value) {
            addCriterion("cout_succeed_call_rate =", value, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateNotEqualTo(String value) {
            addCriterion("cout_succeed_call_rate <>", value, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateGreaterThan(String value) {
            addCriterion("cout_succeed_call_rate >", value, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateGreaterThanOrEqualTo(String value) {
            addCriterion("cout_succeed_call_rate >=", value, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateLessThan(String value) {
            addCriterion("cout_succeed_call_rate <", value, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateLessThanOrEqualTo(String value) {
            addCriterion("cout_succeed_call_rate <=", value, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateLike(String value) {
            addCriterion("cout_succeed_call_rate like", value, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateNotLike(String value) {
            addCriterion("cout_succeed_call_rate not like", value, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateIn(List<String> values) {
            addCriterion("cout_succeed_call_rate in", values, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateNotIn(List<String> values) {
            addCriterion("cout_succeed_call_rate not in", values, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateBetween(String value1, String value2) {
            addCriterion("cout_succeed_call_rate between", value1, value2, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andCoutSucceedCallRateNotBetween(String value1, String value2) {
            addCriterion("cout_succeed_call_rate not between", value1, value2, "coutSucceedCallRate");
            return (Criteria) this;
        }

        public Criteria andOutCallCountIsNull() {
            addCriterion("out_call_count is null");
            return (Criteria) this;
        }

        public Criteria andOutCallCountIsNotNull() {
            addCriterion("out_call_count is not null");
            return (Criteria) this;
        }

        public Criteria andOutCallCountEqualTo(Integer value) {
            addCriterion("out_call_count =", value, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andOutCallCountNotEqualTo(Integer value) {
            addCriterion("out_call_count <>", value, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andOutCallCountGreaterThan(Integer value) {
            addCriterion("out_call_count >", value, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andOutCallCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_call_count >=", value, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andOutCallCountLessThan(Integer value) {
            addCriterion("out_call_count <", value, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andOutCallCountLessThanOrEqualTo(Integer value) {
            addCriterion("out_call_count <=", value, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andOutCallCountIn(List<Integer> values) {
            addCriterion("out_call_count in", values, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andOutCallCountNotIn(List<Integer> values) {
            addCriterion("out_call_count not in", values, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andOutCallCountBetween(Integer value1, Integer value2) {
            addCriterion("out_call_count between", value1, value2, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andOutCallCountNotBetween(Integer value1, Integer value2) {
            addCriterion("out_call_count not between", value1, value2, "outCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountIsNull() {
            addCriterion("Succeedout_call_count is null");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountIsNotNull() {
            addCriterion("Succeedout_call_count is not null");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountEqualTo(Integer value) {
            addCriterion("Succeedout_call_count =", value, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountNotEqualTo(Integer value) {
            addCriterion("Succeedout_call_count <>", value, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountGreaterThan(Integer value) {
            addCriterion("Succeedout_call_count >", value, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Succeedout_call_count >=", value, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountLessThan(Integer value) {
            addCriterion("Succeedout_call_count <", value, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountLessThanOrEqualTo(Integer value) {
            addCriterion("Succeedout_call_count <=", value, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountIn(List<Integer> values) {
            addCriterion("Succeedout_call_count in", values, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountNotIn(List<Integer> values) {
            addCriterion("Succeedout_call_count not in", values, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountBetween(Integer value1, Integer value2) {
            addCriterion("Succeedout_call_count between", value1, value2, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andSucceedoutCallCountNotBetween(Integer value1, Integer value2) {
            addCriterion("Succeedout_call_count not between", value1, value2, "succeedoutCallCount");
            return (Criteria) this;
        }

        public Criteria andGetCallRateIsNull() {
            addCriterion("get_call_rate is null");
            return (Criteria) this;
        }

        public Criteria andGetCallRateIsNotNull() {
            addCriterion("get_call_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGetCallRateEqualTo(String value) {
            addCriterion("get_call_rate =", value, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateNotEqualTo(String value) {
            addCriterion("get_call_rate <>", value, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateGreaterThan(String value) {
            addCriterion("get_call_rate >", value, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateGreaterThanOrEqualTo(String value) {
            addCriterion("get_call_rate >=", value, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateLessThan(String value) {
            addCriterion("get_call_rate <", value, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateLessThanOrEqualTo(String value) {
            addCriterion("get_call_rate <=", value, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateLike(String value) {
            addCriterion("get_call_rate like", value, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateNotLike(String value) {
            addCriterion("get_call_rate not like", value, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateIn(List<String> values) {
            addCriterion("get_call_rate in", values, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateNotIn(List<String> values) {
            addCriterion("get_call_rate not in", values, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateBetween(String value1, String value2) {
            addCriterion("get_call_rate between", value1, value2, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andGetCallRateNotBetween(String value1, String value2) {
            addCriterion("get_call_rate not between", value1, value2, "getCallRate");
            return (Criteria) this;
        }

        public Criteria andContactRateIsNull() {
            addCriterion("Contact_rate is null");
            return (Criteria) this;
        }

        public Criteria andContactRateIsNotNull() {
            addCriterion("Contact_rate is not null");
            return (Criteria) this;
        }

        public Criteria andContactRateEqualTo(String value) {
            addCriterion("Contact_rate =", value, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateNotEqualTo(String value) {
            addCriterion("Contact_rate <>", value, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateGreaterThan(String value) {
            addCriterion("Contact_rate >", value, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateGreaterThanOrEqualTo(String value) {
            addCriterion("Contact_rate >=", value, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateLessThan(String value) {
            addCriterion("Contact_rate <", value, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateLessThanOrEqualTo(String value) {
            addCriterion("Contact_rate <=", value, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateLike(String value) {
            addCriterion("Contact_rate like", value, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateNotLike(String value) {
            addCriterion("Contact_rate not like", value, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateIn(List<String> values) {
            addCriterion("Contact_rate in", values, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateNotIn(List<String> values) {
            addCriterion("Contact_rate not in", values, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateBetween(String value1, String value2) {
            addCriterion("Contact_rate between", value1, value2, "contactRate");
            return (Criteria) this;
        }

        public Criteria andContactRateNotBetween(String value1, String value2) {
            addCriterion("Contact_rate not between", value1, value2, "contactRate");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumIsNull() {
            addCriterion("count_intention_order_num is null");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumIsNotNull() {
            addCriterion("count_intention_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumEqualTo(Integer value) {
            addCriterion("count_intention_order_num =", value, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumNotEqualTo(Integer value) {
            addCriterion("count_intention_order_num <>", value, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumGreaterThan(Integer value) {
            addCriterion("count_intention_order_num >", value, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_intention_order_num >=", value, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumLessThan(Integer value) {
            addCriterion("count_intention_order_num <", value, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("count_intention_order_num <=", value, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumIn(List<Integer> values) {
            addCriterion("count_intention_order_num in", values, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumNotIn(List<Integer> values) {
            addCriterion("count_intention_order_num not in", values, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("count_intention_order_num between", value1, value2, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountIntentionOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("count_intention_order_num not between", value1, value2, "countIntentionOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumIsNull() {
            addCriterion("count_order_num is null");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumIsNotNull() {
            addCriterion("count_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumEqualTo(Integer value) {
            addCriterion("count_order_num =", value, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumNotEqualTo(Integer value) {
            addCriterion("count_order_num <>", value, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumGreaterThan(Integer value) {
            addCriterion("count_order_num >", value, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_order_num >=", value, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumLessThan(Integer value) {
            addCriterion("count_order_num <", value, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("count_order_num <=", value, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumIn(List<Integer> values) {
            addCriterion("count_order_num in", values, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumNotIn(List<Integer> values) {
            addCriterion("count_order_num not in", values, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("count_order_num between", value1, value2, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andCountOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("count_order_num not between", value1, value2, "countOrderNum");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateIsNull() {
            addCriterion("OnSucces_rate is null");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateIsNotNull() {
            addCriterion("OnSucces_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateEqualTo(String value) {
            addCriterion("OnSucces_rate =", value, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateNotEqualTo(String value) {
            addCriterion("OnSucces_rate <>", value, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateGreaterThan(String value) {
            addCriterion("OnSucces_rate >", value, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateGreaterThanOrEqualTo(String value) {
            addCriterion("OnSucces_rate >=", value, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateLessThan(String value) {
            addCriterion("OnSucces_rate <", value, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateLessThanOrEqualTo(String value) {
            addCriterion("OnSucces_rate <=", value, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateLike(String value) {
            addCriterion("OnSucces_rate like", value, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateNotLike(String value) {
            addCriterion("OnSucces_rate not like", value, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateIn(List<String> values) {
            addCriterion("OnSucces_rate in", values, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateNotIn(List<String> values) {
            addCriterion("OnSucces_rate not in", values, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateBetween(String value1, String value2) {
            addCriterion("OnSucces_rate between", value1, value2, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andOnsuccesRateNotBetween(String value1, String value2) {
            addCriterion("OnSucces_rate not between", value1, value2, "onsuccesRate");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityIsNull() {
            addCriterion("query_order_quantity is null");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityIsNotNull() {
            addCriterion("query_order_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityEqualTo(Integer value) {
            addCriterion("query_order_quantity =", value, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityNotEqualTo(Integer value) {
            addCriterion("query_order_quantity <>", value, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityGreaterThan(Integer value) {
            addCriterion("query_order_quantity >", value, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_order_quantity >=", value, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityLessThan(Integer value) {
            addCriterion("query_order_quantity <", value, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("query_order_quantity <=", value, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityIn(List<Integer> values) {
            addCriterion("query_order_quantity in", values, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityNotIn(List<Integer> values) {
            addCriterion("query_order_quantity not in", values, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityBetween(Integer value1, Integer value2) {
            addCriterion("query_order_quantity between", value1, value2, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andQueryOrderQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("query_order_quantity not between", value1, value2, "queryOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleIsNull() {
            addCriterion("Billing_schedule is null");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleIsNotNull() {
            addCriterion("Billing_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleEqualTo(String value) {
            addCriterion("Billing_schedule =", value, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleNotEqualTo(String value) {
            addCriterion("Billing_schedule <>", value, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleGreaterThan(String value) {
            addCriterion("Billing_schedule >", value, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("Billing_schedule >=", value, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleLessThan(String value) {
            addCriterion("Billing_schedule <", value, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleLessThanOrEqualTo(String value) {
            addCriterion("Billing_schedule <=", value, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleLike(String value) {
            addCriterion("Billing_schedule like", value, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleNotLike(String value) {
            addCriterion("Billing_schedule not like", value, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleIn(List<String> values) {
            addCriterion("Billing_schedule in", values, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleNotIn(List<String> values) {
            addCriterion("Billing_schedule not in", values, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleBetween(String value1, String value2) {
            addCriterion("Billing_schedule between", value1, value2, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andBillingScheduleNotBetween(String value1, String value2) {
            addCriterion("Billing_schedule not between", value1, value2, "billingSchedule");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessIsNull() {
            addCriterion("query_order_actual_success is null");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessIsNotNull() {
            addCriterion("query_order_actual_success is not null");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessEqualTo(Integer value) {
            addCriterion("query_order_actual_success =", value, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessNotEqualTo(Integer value) {
            addCriterion("query_order_actual_success <>", value, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessGreaterThan(Integer value) {
            addCriterion("query_order_actual_success >", value, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_order_actual_success >=", value, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessLessThan(Integer value) {
            addCriterion("query_order_actual_success <", value, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("query_order_actual_success <=", value, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessIn(List<Integer> values) {
            addCriterion("query_order_actual_success in", values, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessNotIn(List<Integer> values) {
            addCriterion("query_order_actual_success not in", values, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessBetween(Integer value1, Integer value2) {
            addCriterion("query_order_actual_success between", value1, value2, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderActualSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("query_order_actual_success not between", value1, value2, "queryOrderActualSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessIsNull() {
            addCriterion("query_order_amount_success is null");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessIsNotNull() {
            addCriterion("query_order_amount_success is not null");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessEqualTo(Integer value) {
            addCriterion("query_order_amount_success =", value, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessNotEqualTo(Integer value) {
            addCriterion("query_order_amount_success <>", value, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessGreaterThan(Integer value) {
            addCriterion("query_order_amount_success >", value, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_order_amount_success >=", value, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessLessThan(Integer value) {
            addCriterion("query_order_amount_success <", value, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("query_order_amount_success <=", value, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessIn(List<Integer> values) {
            addCriterion("query_order_amount_success in", values, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessNotIn(List<Integer> values) {
            addCriterion("query_order_amount_success not in", values, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessBetween(Integer value1, Integer value2) {
            addCriterion("query_order_amount_success between", value1, value2, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("query_order_amount_success not between", value1, value2, "queryOrderAmountSuccess");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingIsNull() {
            addCriterion("query_order_amount_failing is null");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingIsNotNull() {
            addCriterion("query_order_amount_failing is not null");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingEqualTo(Integer value) {
            addCriterion("query_order_amount_failing =", value, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingNotEqualTo(Integer value) {
            addCriterion("query_order_amount_failing <>", value, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingGreaterThan(Integer value) {
            addCriterion("query_order_amount_failing >", value, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_order_amount_failing >=", value, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingLessThan(Integer value) {
            addCriterion("query_order_amount_failing <", value, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingLessThanOrEqualTo(Integer value) {
            addCriterion("query_order_amount_failing <=", value, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingIn(List<Integer> values) {
            addCriterion("query_order_amount_failing in", values, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingNotIn(List<Integer> values) {
            addCriterion("query_order_amount_failing not in", values, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingBetween(Integer value1, Integer value2) {
            addCriterion("query_order_amount_failing between", value1, value2, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andQueryOrderAmountFailingNotBetween(Integer value1, Integer value2) {
            addCriterion("query_order_amount_failing not between", value1, value2, "queryOrderAmountFailing");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingIsNull() {
            addCriterion("Success_rate_of_billing is null");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingIsNotNull() {
            addCriterion("Success_rate_of_billing is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingEqualTo(String value) {
            addCriterion("Success_rate_of_billing =", value, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingNotEqualTo(String value) {
            addCriterion("Success_rate_of_billing <>", value, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingGreaterThan(String value) {
            addCriterion("Success_rate_of_billing >", value, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingGreaterThanOrEqualTo(String value) {
            addCriterion("Success_rate_of_billing >=", value, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingLessThan(String value) {
            addCriterion("Success_rate_of_billing <", value, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingLessThanOrEqualTo(String value) {
            addCriterion("Success_rate_of_billing <=", value, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingLike(String value) {
            addCriterion("Success_rate_of_billing like", value, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingNotLike(String value) {
            addCriterion("Success_rate_of_billing not like", value, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingIn(List<String> values) {
            addCriterion("Success_rate_of_billing in", values, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingNotIn(List<String> values) {
            addCriterion("Success_rate_of_billing not in", values, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingBetween(String value1, String value2) {
            addCriterion("Success_rate_of_billing between", value1, value2, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andSuccessRateOfBillingNotBetween(String value1, String value2) {
            addCriterion("Success_rate_of_billing not between", value1, value2, "successRateOfBilling");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusIsNull() {
            addCriterion("count_qc_status is null");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusIsNotNull() {
            addCriterion("count_qc_status is not null");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusEqualTo(Integer value) {
            addCriterion("count_qc_status =", value, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusNotEqualTo(Integer value) {
            addCriterion("count_qc_status <>", value, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusGreaterThan(Integer value) {
            addCriterion("count_qc_status >", value, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_qc_status >=", value, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusLessThan(Integer value) {
            addCriterion("count_qc_status <", value, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusLessThanOrEqualTo(Integer value) {
            addCriterion("count_qc_status <=", value, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusIn(List<Integer> values) {
            addCriterion("count_qc_status in", values, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusNotIn(List<Integer> values) {
            addCriterion("count_qc_status not in", values, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusBetween(Integer value1, Integer value2) {
            addCriterion("count_qc_status between", value1, value2, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountQcStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("count_qc_status not between", value1, value2, "countQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusIsNull() {
            addCriterion("count_true_qc_status is null");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusIsNotNull() {
            addCriterion("count_true_qc_status is not null");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusEqualTo(Integer value) {
            addCriterion("count_true_qc_status =", value, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusNotEqualTo(Integer value) {
            addCriterion("count_true_qc_status <>", value, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusGreaterThan(Integer value) {
            addCriterion("count_true_qc_status >", value, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_true_qc_status >=", value, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusLessThan(Integer value) {
            addCriterion("count_true_qc_status <", value, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusLessThanOrEqualTo(Integer value) {
            addCriterion("count_true_qc_status <=", value, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusIn(List<Integer> values) {
            addCriterion("count_true_qc_status in", values, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusNotIn(List<Integer> values) {
            addCriterion("count_true_qc_status not in", values, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusBetween(Integer value1, Integer value2) {
            addCriterion("count_true_qc_status between", value1, value2, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andCountTrueQcStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("count_true_qc_status not between", value1, value2, "countTrueQcStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionRateIsNull() {
            addCriterion("inspection_rate is null");
            return (Criteria) this;
        }

        public Criteria andInspectionRateIsNotNull() {
            addCriterion("inspection_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionRateEqualTo(String value) {
            addCriterion("inspection_rate =", value, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateNotEqualTo(String value) {
            addCriterion("inspection_rate <>", value, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateGreaterThan(String value) {
            addCriterion("inspection_rate >", value, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_rate >=", value, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateLessThan(String value) {
            addCriterion("inspection_rate <", value, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateLessThanOrEqualTo(String value) {
            addCriterion("inspection_rate <=", value, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateLike(String value) {
            addCriterion("inspection_rate like", value, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateNotLike(String value) {
            addCriterion("inspection_rate not like", value, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateIn(List<String> values) {
            addCriterion("inspection_rate in", values, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateNotIn(List<String> values) {
            addCriterion("inspection_rate not in", values, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateBetween(String value1, String value2) {
            addCriterion("inspection_rate between", value1, value2, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andInspectionRateNotBetween(String value1, String value2) {
            addCriterion("inspection_rate not between", value1, value2, "inspectionRate");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusIsNull() {
            addCriterion("query_two_qc_status is null");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusIsNotNull() {
            addCriterion("query_two_qc_status is not null");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusEqualTo(Integer value) {
            addCriterion("query_two_qc_status =", value, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusNotEqualTo(Integer value) {
            addCriterion("query_two_qc_status <>", value, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusGreaterThan(Integer value) {
            addCriterion("query_two_qc_status >", value, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_two_qc_status >=", value, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusLessThan(Integer value) {
            addCriterion("query_two_qc_status <", value, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusLessThanOrEqualTo(Integer value) {
            addCriterion("query_two_qc_status <=", value, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusIn(List<Integer> values) {
            addCriterion("query_two_qc_status in", values, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusNotIn(List<Integer> values) {
            addCriterion("query_two_qc_status not in", values, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusBetween(Integer value1, Integer value2) {
            addCriterion("query_two_qc_status between", value1, value2, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTwoQcStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("query_two_qc_status not between", value1, value2, "queryTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusIsNull() {
            addCriterion("query_true_two_qc_status is null");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusIsNotNull() {
            addCriterion("query_true_two_qc_status is not null");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusEqualTo(Integer value) {
            addCriterion("query_true_two_qc_status =", value, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusNotEqualTo(Integer value) {
            addCriterion("query_true_two_qc_status <>", value, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusGreaterThan(Integer value) {
            addCriterion("query_true_two_qc_status >", value, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_true_two_qc_status >=", value, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusLessThan(Integer value) {
            addCriterion("query_true_two_qc_status <", value, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusLessThanOrEqualTo(Integer value) {
            addCriterion("query_true_two_qc_status <=", value, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusIn(List<Integer> values) {
            addCriterion("query_true_two_qc_status in", values, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusNotIn(List<Integer> values) {
            addCriterion("query_true_two_qc_status not in", values, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusBetween(Integer value1, Integer value2) {
            addCriterion("query_true_two_qc_status between", value1, value2, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andQueryTrueTwoQcStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("query_true_two_qc_status not between", value1, value2, "queryTrueTwoQcStatus");
            return (Criteria) this;
        }

        public Criteria andInspection2RateIsNull() {
            addCriterion("inspection2_rate is null");
            return (Criteria) this;
        }

        public Criteria andInspection2RateIsNotNull() {
            addCriterion("inspection2_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInspection2RateEqualTo(String value) {
            addCriterion("inspection2_rate =", value, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateNotEqualTo(String value) {
            addCriterion("inspection2_rate <>", value, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateGreaterThan(String value) {
            addCriterion("inspection2_rate >", value, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateGreaterThanOrEqualTo(String value) {
            addCriterion("inspection2_rate >=", value, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateLessThan(String value) {
            addCriterion("inspection2_rate <", value, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateLessThanOrEqualTo(String value) {
            addCriterion("inspection2_rate <=", value, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateLike(String value) {
            addCriterion("inspection2_rate like", value, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateNotLike(String value) {
            addCriterion("inspection2_rate not like", value, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateIn(List<String> values) {
            addCriterion("inspection2_rate in", values, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateNotIn(List<String> values) {
            addCriterion("inspection2_rate not in", values, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateBetween(String value1, String value2) {
            addCriterion("inspection2_rate between", value1, value2, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andInspection2RateNotBetween(String value1, String value2) {
            addCriterion("inspection2_rate not between", value1, value2, "inspection2Rate");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameIsNull() {
            addCriterion("task_type_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameIsNotNull() {
            addCriterion("task_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameEqualTo(Integer value) {
            addCriterion("task_type_name =", value, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameNotEqualTo(Integer value) {
            addCriterion("task_type_name <>", value, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameGreaterThan(Integer value) {
            addCriterion("task_type_name >", value, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_type_name >=", value, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameLessThan(Integer value) {
            addCriterion("task_type_name <", value, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameLessThanOrEqualTo(Integer value) {
            addCriterion("task_type_name <=", value, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameIn(List<Integer> values) {
            addCriterion("task_type_name in", values, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameNotIn(List<Integer> values) {
            addCriterion("task_type_name not in", values, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameBetween(Integer value1, Integer value2) {
            addCriterion("task_type_name between", value1, value2, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNameNotBetween(Integer value1, Integer value2) {
            addCriterion("task_type_name not between", value1, value2, "taskTypeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
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

        public Criteria andDataTimeIsNull() {
            addCriterion("data_time is null");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNotNull() {
            addCriterion("data_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimeEqualTo(Date value) {
            addCriterion("data_time =", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotEqualTo(Date value) {
            addCriterion("data_time <>", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThan(Date value) {
            addCriterion("data_time >", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_time >=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThan(Date value) {
            addCriterion("data_time <", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_time <=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeIn(List<Date> values) {
            addCriterion("data_time in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotIn(List<Date> values) {
            addCriterion("data_time not in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeBetween(Date value1, Date value2) {
            addCriterion("data_time between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_time not between", value1, value2, "dataTime");
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