package com.course.server.domain;

import java.util.ArrayList;
import java.util.List;

public class FloodControlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FloodControlExample() {
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

        public Criteria andHiddenDangerIsNull() {
            addCriterion("hidden_danger is null");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerIsNotNull() {
            addCriterion("hidden_danger is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerEqualTo(String value) {
            addCriterion("hidden_danger =", value, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerNotEqualTo(String value) {
            addCriterion("hidden_danger <>", value, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerGreaterThan(String value) {
            addCriterion("hidden_danger >", value, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerGreaterThanOrEqualTo(String value) {
            addCriterion("hidden_danger >=", value, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerLessThan(String value) {
            addCriterion("hidden_danger <", value, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerLessThanOrEqualTo(String value) {
            addCriterion("hidden_danger <=", value, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerLike(String value) {
            addCriterion("hidden_danger like", value, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerNotLike(String value) {
            addCriterion("hidden_danger not like", value, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerIn(List<String> values) {
            addCriterion("hidden_danger in", values, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerNotIn(List<String> values) {
            addCriterion("hidden_danger not in", values, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerBetween(String value1, String value2) {
            addCriterion("hidden_danger between", value1, value2, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andHiddenDangerNotBetween(String value1, String value2) {
            addCriterion("hidden_danger not between", value1, value2, "hiddenDanger");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitIsNull() {
            addCriterion("responsible_unit is null");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitIsNotNull() {
            addCriterion("responsible_unit is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitEqualTo(String value) {
            addCriterion("responsible_unit =", value, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitNotEqualTo(String value) {
            addCriterion("responsible_unit <>", value, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitGreaterThan(String value) {
            addCriterion("responsible_unit >", value, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_unit >=", value, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitLessThan(String value) {
            addCriterion("responsible_unit <", value, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitLessThanOrEqualTo(String value) {
            addCriterion("responsible_unit <=", value, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitLike(String value) {
            addCriterion("responsible_unit like", value, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitNotLike(String value) {
            addCriterion("responsible_unit not like", value, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitIn(List<String> values) {
            addCriterion("responsible_unit in", values, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitNotIn(List<String> values) {
            addCriterion("responsible_unit not in", values, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitBetween(String value1, String value2) {
            addCriterion("responsible_unit between", value1, value2, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andResponsibleUnitNotBetween(String value1, String value2) {
            addCriterion("responsible_unit not between", value1, value2, "responsibleUnit");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNull() {
            addCriterion("contact_person is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("contact_person =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("contact_person <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("contact_person >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("contact_person <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("contact_person <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("contact_person like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("contact_person not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("contact_person in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("contact_person not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("contact_person between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("contact_person not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andSelfCheckIsNull() {
            addCriterion("self_check is null");
            return (Criteria) this;
        }

        public Criteria andSelfCheckIsNotNull() {
            addCriterion("self_check is not null");
            return (Criteria) this;
        }

        public Criteria andSelfCheckEqualTo(String value) {
            addCriterion("self_check =", value, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckNotEqualTo(String value) {
            addCriterion("self_check <>", value, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckGreaterThan(String value) {
            addCriterion("self_check >", value, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckGreaterThanOrEqualTo(String value) {
            addCriterion("self_check >=", value, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckLessThan(String value) {
            addCriterion("self_check <", value, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckLessThanOrEqualTo(String value) {
            addCriterion("self_check <=", value, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckLike(String value) {
            addCriterion("self_check like", value, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckNotLike(String value) {
            addCriterion("self_check not like", value, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckIn(List<String> values) {
            addCriterion("self_check in", values, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckNotIn(List<String> values) {
            addCriterion("self_check not in", values, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckBetween(String value1, String value2) {
            addCriterion("self_check between", value1, value2, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andSelfCheckNotBetween(String value1, String value2) {
            addCriterion("self_check not between", value1, value2, "selfCheck");
            return (Criteria) this;
        }

        public Criteria andLeadershipIsNull() {
            addCriterion("leadership is null");
            return (Criteria) this;
        }

        public Criteria andLeadershipIsNotNull() {
            addCriterion("leadership is not null");
            return (Criteria) this;
        }

        public Criteria andLeadershipEqualTo(String value) {
            addCriterion("leadership =", value, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipNotEqualTo(String value) {
            addCriterion("leadership <>", value, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipGreaterThan(String value) {
            addCriterion("leadership >", value, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipGreaterThanOrEqualTo(String value) {
            addCriterion("leadership >=", value, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipLessThan(String value) {
            addCriterion("leadership <", value, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipLessThanOrEqualTo(String value) {
            addCriterion("leadership <=", value, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipLike(String value) {
            addCriterion("leadership like", value, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipNotLike(String value) {
            addCriterion("leadership not like", value, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipIn(List<String> values) {
            addCriterion("leadership in", values, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipNotIn(List<String> values) {
            addCriterion("leadership not in", values, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipBetween(String value1, String value2) {
            addCriterion("leadership between", value1, value2, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipNotBetween(String value1, String value2) {
            addCriterion("leadership not between", value1, value2, "leadership");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneIsNull() {
            addCriterion("leadership_phone is null");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneIsNotNull() {
            addCriterion("leadership_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneEqualTo(String value) {
            addCriterion("leadership_phone =", value, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneNotEqualTo(String value) {
            addCriterion("leadership_phone <>", value, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneGreaterThan(String value) {
            addCriterion("leadership_phone >", value, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("leadership_phone >=", value, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneLessThan(String value) {
            addCriterion("leadership_phone <", value, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneLessThanOrEqualTo(String value) {
            addCriterion("leadership_phone <=", value, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneLike(String value) {
            addCriterion("leadership_phone like", value, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneNotLike(String value) {
            addCriterion("leadership_phone not like", value, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneIn(List<String> values) {
            addCriterion("leadership_phone in", values, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneNotIn(List<String> values) {
            addCriterion("leadership_phone not in", values, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneBetween(String value1, String value2) {
            addCriterion("leadership_phone between", value1, value2, "leadershipPhone");
            return (Criteria) this;
        }

        public Criteria andLeadershipPhoneNotBetween(String value1, String value2) {
            addCriterion("leadership_phone not between", value1, value2, "leadershipPhone");
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