package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andTelephonePwdIsNull() {
            addCriterion("telephone_pwd is null");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdIsNotNull() {
            addCriterion("telephone_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdEqualTo(String value) {
            addCriterion("telephone_pwd =", value, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdNotEqualTo(String value) {
            addCriterion("telephone_pwd <>", value, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdGreaterThan(String value) {
            addCriterion("telephone_pwd >", value, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdGreaterThanOrEqualTo(String value) {
            addCriterion("telephone_pwd >=", value, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdLessThan(String value) {
            addCriterion("telephone_pwd <", value, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdLessThanOrEqualTo(String value) {
            addCriterion("telephone_pwd <=", value, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdLike(String value) {
            addCriterion("telephone_pwd like", value, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdNotLike(String value) {
            addCriterion("telephone_pwd not like", value, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdIn(List<String> values) {
            addCriterion("telephone_pwd in", values, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdNotIn(List<String> values) {
            addCriterion("telephone_pwd not in", values, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdBetween(String value1, String value2) {
            addCriterion("telephone_pwd between", value1, value2, "telephonePwd");
            return (Criteria) this;
        }

        public Criteria andTelephonePwdNotBetween(String value1, String value2) {
            addCriterion("telephone_pwd not between", value1, value2, "telephonePwd");
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Byte value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Byte value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Byte value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Byte value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Byte value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Byte> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Byte> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Byte value1, Byte value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIsNull() {
            addCriterion("identity_num is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIsNotNull() {
            addCriterion("identity_num is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumEqualTo(String value) {
            addCriterion("identity_num =", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotEqualTo(String value) {
            addCriterion("identity_num <>", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThan(String value) {
            addCriterion("identity_num >", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThanOrEqualTo(String value) {
            addCriterion("identity_num >=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThan(String value) {
            addCriterion("identity_num <", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThanOrEqualTo(String value) {
            addCriterion("identity_num <=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLike(String value) {
            addCriterion("identity_num like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotLike(String value) {
            addCriterion("identity_num not like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIn(List<String> values) {
            addCriterion("identity_num in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotIn(List<String> values) {
            addCriterion("identity_num not in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumBetween(String value1, String value2) {
            addCriterion("identity_num between", value1, value2, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotBetween(String value1, String value2) {
            addCriterion("identity_num not between", value1, value2, "identityNum");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andCallPatternIsNull() {
            addCriterion("call_pattern is null");
            return (Criteria) this;
        }

        public Criteria andCallPatternIsNotNull() {
            addCriterion("call_pattern is not null");
            return (Criteria) this;
        }

        public Criteria andCallPatternEqualTo(Byte value) {
            addCriterion("call_pattern =", value, "callPattern");
            return (Criteria) this;
        }

        public Criteria andCallPatternNotEqualTo(Byte value) {
            addCriterion("call_pattern <>", value, "callPattern");
            return (Criteria) this;
        }

        public Criteria andCallPatternGreaterThan(Byte value) {
            addCriterion("call_pattern >", value, "callPattern");
            return (Criteria) this;
        }

        public Criteria andCallPatternGreaterThanOrEqualTo(Byte value) {
            addCriterion("call_pattern >=", value, "callPattern");
            return (Criteria) this;
        }

        public Criteria andCallPatternLessThan(Byte value) {
            addCriterion("call_pattern <", value, "callPattern");
            return (Criteria) this;
        }

        public Criteria andCallPatternLessThanOrEqualTo(Byte value) {
            addCriterion("call_pattern <=", value, "callPattern");
            return (Criteria) this;
        }

        public Criteria andCallPatternIn(List<Byte> values) {
            addCriterion("call_pattern in", values, "callPattern");
            return (Criteria) this;
        }

        public Criteria andCallPatternNotIn(List<Byte> values) {
            addCriterion("call_pattern not in", values, "callPattern");
            return (Criteria) this;
        }

        public Criteria andCallPatternBetween(Byte value1, Byte value2) {
            addCriterion("call_pattern between", value1, value2, "callPattern");
            return (Criteria) this;
        }

        public Criteria andCallPatternNotBetween(Byte value1, Byte value2) {
            addCriterion("call_pattern not between", value1, value2, "callPattern");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneIsNull() {
            addCriterion("exterior_phone is null");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneIsNotNull() {
            addCriterion("exterior_phone is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneEqualTo(String value) {
            addCriterion("exterior_phone =", value, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneNotEqualTo(String value) {
            addCriterion("exterior_phone <>", value, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneGreaterThan(String value) {
            addCriterion("exterior_phone >", value, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("exterior_phone >=", value, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneLessThan(String value) {
            addCriterion("exterior_phone <", value, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneLessThanOrEqualTo(String value) {
            addCriterion("exterior_phone <=", value, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneLike(String value) {
            addCriterion("exterior_phone like", value, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneNotLike(String value) {
            addCriterion("exterior_phone not like", value, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneIn(List<String> values) {
            addCriterion("exterior_phone in", values, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneNotIn(List<String> values) {
            addCriterion("exterior_phone not in", values, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneBetween(String value1, String value2) {
            addCriterion("exterior_phone between", value1, value2, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andExteriorPhoneNotBetween(String value1, String value2) {
            addCriterion("exterior_phone not between", value1, value2, "exteriorPhone");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerIsNull() {
            addCriterion("auto_answer is null");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerIsNotNull() {
            addCriterion("auto_answer is not null");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerEqualTo(Boolean value) {
            addCriterion("auto_answer =", value, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerNotEqualTo(Boolean value) {
            addCriterion("auto_answer <>", value, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerGreaterThan(Boolean value) {
            addCriterion("auto_answer >", value, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("auto_answer >=", value, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerLessThan(Boolean value) {
            addCriterion("auto_answer <", value, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerLessThanOrEqualTo(Boolean value) {
            addCriterion("auto_answer <=", value, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerIn(List<Boolean> values) {
            addCriterion("auto_answer in", values, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerNotIn(List<Boolean> values) {
            addCriterion("auto_answer not in", values, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_answer between", value1, value2, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andAutoAnswerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_answer not between", value1, value2, "autoAnswer");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Boolean value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Boolean value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Boolean value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Boolean value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Boolean> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Boolean> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("phone_num is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phone_num =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phone_num <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phone_num >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phone_num >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phone_num <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phone_num <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phone_num like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phone_num not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phone_num in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phone_num not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phone_num between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phone_num not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("is_online is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("is_online is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Boolean value) {
            addCriterion("is_online =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Boolean value) {
            addCriterion("is_online <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Boolean value) {
            addCriterion("is_online >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_online >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Boolean value) {
            addCriterion("is_online <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Boolean value) {
            addCriterion("is_online <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Boolean> values) {
            addCriterion("is_online in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Boolean> values) {
            addCriterion("is_online not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Boolean value1, Boolean value2) {
            addCriterion("is_online between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_online not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("utime not between", value1, value2, "utime");
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

        public Criteria andIsUseDialpadIsNull() {
            addCriterion("is_use_dialpad is null");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadIsNotNull() {
            addCriterion("is_use_dialpad is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadEqualTo(Integer value) {
            addCriterion("is_use_dialpad =", value, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadNotEqualTo(Integer value) {
            addCriterion("is_use_dialpad <>", value, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadGreaterThan(Integer value) {
            addCriterion("is_use_dialpad >", value, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_use_dialpad >=", value, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadLessThan(Integer value) {
            addCriterion("is_use_dialpad <", value, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadLessThanOrEqualTo(Integer value) {
            addCriterion("is_use_dialpad <=", value, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadIn(List<Integer> values) {
            addCriterion("is_use_dialpad in", values, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadNotIn(List<Integer> values) {
            addCriterion("is_use_dialpad not in", values, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadBetween(Integer value1, Integer value2) {
            addCriterion("is_use_dialpad between", value1, value2, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andIsUseDialpadNotBetween(Integer value1, Integer value2) {
            addCriterion("is_use_dialpad not between", value1, value2, "isUseDialpad");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNull() {
            addCriterion("is_first_login is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNotNull() {
            addCriterion("is_first_login is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginEqualTo(Integer value) {
            addCriterion("is_first_login =", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotEqualTo(Integer value) {
            addCriterion("is_first_login <>", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThan(Integer value) {
            addCriterion("is_first_login >", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_first_login >=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThan(Integer value) {
            addCriterion("is_first_login <", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThanOrEqualTo(Integer value) {
            addCriterion("is_first_login <=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIn(List<Integer> values) {
            addCriterion("is_first_login in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotIn(List<Integer> values) {
            addCriterion("is_first_login not in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginBetween(Integer value1, Integer value2) {
            addCriterion("is_first_login between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("is_first_login not between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallIsNull() {
            addCriterion("is_auto_call is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallIsNotNull() {
            addCriterion("is_auto_call is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallEqualTo(Byte value) {
            addCriterion("is_auto_call =", value, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallNotEqualTo(Byte value) {
            addCriterion("is_auto_call <>", value, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallGreaterThan(Byte value) {
            addCriterion("is_auto_call >", value, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_auto_call >=", value, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallLessThan(Byte value) {
            addCriterion("is_auto_call <", value, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallLessThanOrEqualTo(Byte value) {
            addCriterion("is_auto_call <=", value, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallIn(List<Byte> values) {
            addCriterion("is_auto_call in", values, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallNotIn(List<Byte> values) {
            addCriterion("is_auto_call not in", values, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallBetween(Byte value1, Byte value2) {
            addCriterion("is_auto_call between", value1, value2, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andIsAutoCallNotBetween(Byte value1, Byte value2) {
            addCriterion("is_auto_call not between", value1, value2, "isAutoCall");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNull() {
            addCriterion("LoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("LoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("LoginIP =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("LoginIP <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("LoginIP >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("LoginIP >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("LoginIP <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("LoginIP <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("LoginIP like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("LoginIP not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("LoginIP in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("LoginIP not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("LoginIP between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("LoginIP not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNull() {
            addCriterion("is_verify is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNotNull() {
            addCriterion("is_verify is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyEqualTo(Byte value) {
            addCriterion("is_verify =", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotEqualTo(Byte value) {
            addCriterion("is_verify <>", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThan(Byte value) {
            addCriterion("is_verify >", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_verify >=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThan(Byte value) {
            addCriterion("is_verify <", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("is_verify <=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIn(List<Byte> values) {
            addCriterion("is_verify in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotIn(List<Byte> values) {
            addCriterion("is_verify not in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyBetween(Byte value1, Byte value2) {
            addCriterion("is_verify between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_verify not between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressIsNull() {
            addCriterion("veriface_address is null");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressIsNotNull() {
            addCriterion("veriface_address is not null");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressEqualTo(String value) {
            addCriterion("veriface_address =", value, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressNotEqualTo(String value) {
            addCriterion("veriface_address <>", value, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressGreaterThan(String value) {
            addCriterion("veriface_address >", value, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("veriface_address >=", value, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressLessThan(String value) {
            addCriterion("veriface_address <", value, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressLessThanOrEqualTo(String value) {
            addCriterion("veriface_address <=", value, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressLike(String value) {
            addCriterion("veriface_address like", value, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressNotLike(String value) {
            addCriterion("veriface_address not like", value, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressIn(List<String> values) {
            addCriterion("veriface_address in", values, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressNotIn(List<String> values) {
            addCriterion("veriface_address not in", values, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressBetween(String value1, String value2) {
            addCriterion("veriface_address between", value1, value2, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andVerifaceAddressNotBetween(String value1, String value2) {
            addCriterion("veriface_address not between", value1, value2, "verifaceAddress");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectIsNull() {
            addCriterion("is_face_collect is null");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectIsNotNull() {
            addCriterion("is_face_collect is not null");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectEqualTo(Byte value) {
            addCriterion("is_face_collect =", value, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectNotEqualTo(Byte value) {
            addCriterion("is_face_collect <>", value, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectGreaterThan(Byte value) {
            addCriterion("is_face_collect >", value, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_face_collect >=", value, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectLessThan(Byte value) {
            addCriterion("is_face_collect <", value, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectLessThanOrEqualTo(Byte value) {
            addCriterion("is_face_collect <=", value, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectIn(List<Byte> values) {
            addCriterion("is_face_collect in", values, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectNotIn(List<Byte> values) {
            addCriterion("is_face_collect not in", values, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectBetween(Byte value1, Byte value2) {
            addCriterion("is_face_collect between", value1, value2, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andIsFaceCollectNotBetween(Byte value1, Byte value2) {
            addCriterion("is_face_collect not between", value1, value2, "isFaceCollect");
            return (Criteria) this;
        }

        public Criteria andFaceAuditIsNull() {
            addCriterion("face_audit is null");
            return (Criteria) this;
        }

        public Criteria andFaceAuditIsNotNull() {
            addCriterion("face_audit is not null");
            return (Criteria) this;
        }

        public Criteria andFaceAuditEqualTo(Byte value) {
            addCriterion("face_audit =", value, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andFaceAuditNotEqualTo(Byte value) {
            addCriterion("face_audit <>", value, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andFaceAuditGreaterThan(Byte value) {
            addCriterion("face_audit >", value, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andFaceAuditGreaterThanOrEqualTo(Byte value) {
            addCriterion("face_audit >=", value, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andFaceAuditLessThan(Byte value) {
            addCriterion("face_audit <", value, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andFaceAuditLessThanOrEqualTo(Byte value) {
            addCriterion("face_audit <=", value, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andFaceAuditIn(List<Byte> values) {
            addCriterion("face_audit in", values, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andFaceAuditNotIn(List<Byte> values) {
            addCriterion("face_audit not in", values, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andFaceAuditBetween(Byte value1, Byte value2) {
            addCriterion("face_audit between", value1, value2, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andFaceAuditNotBetween(Byte value1, Byte value2) {
            addCriterion("face_audit not between", value1, value2, "faceAudit");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
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