package org.sunhk.meweb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TaskExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andTaskidIsNull() {
            addCriterion("taskid is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Long value) {
            addCriterion("taskid =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Long value) {
            addCriterion("taskid <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Long value) {
            addCriterion("taskid >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Long value) {
            addCriterion("taskid >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Long value) {
            addCriterion("taskid <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Long value) {
            addCriterion("taskid <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Long> values) {
            addCriterion("taskid in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Long> values) {
            addCriterion("taskid not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Long value1, Long value2) {
            addCriterion("taskid between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Long value1, Long value2) {
            addCriterion("taskid not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNull() {
            addCriterion("taskname is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskname is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskname =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskname <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskname >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskname >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskname <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskname <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskname like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskname not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskname in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskname not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskname between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskname not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andSchstartdateIsNull() {
            addCriterion("schstartdate is null");
            return (Criteria) this;
        }

        public Criteria andSchstartdateIsNotNull() {
            addCriterion("schstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andSchstartdateEqualTo(Date value) {
            addCriterion("schstartdate =", value, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchstartdateNotEqualTo(Date value) {
            addCriterion("schstartdate <>", value, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchstartdateGreaterThan(Date value) {
            addCriterion("schstartdate >", value, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("schstartdate >=", value, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchstartdateLessThan(Date value) {
            addCriterion("schstartdate <", value, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchstartdateLessThanOrEqualTo(Date value) {
            addCriterion("schstartdate <=", value, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchstartdateIn(List<Date> values) {
            addCriterion("schstartdate in", values, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchstartdateNotIn(List<Date> values) {
            addCriterion("schstartdate not in", values, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchstartdateBetween(Date value1, Date value2) {
            addCriterion("schstartdate between", value1, value2, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchstartdateNotBetween(Date value1, Date value2) {
            addCriterion("schstartdate not between", value1, value2, "schstartdate");
            return (Criteria) this;
        }

        public Criteria andSchenddateIsNull() {
            addCriterion("schenddate is null");
            return (Criteria) this;
        }

        public Criteria andSchenddateIsNotNull() {
            addCriterion("schenddate is not null");
            return (Criteria) this;
        }

        public Criteria andSchenddateEqualTo(Date value) {
            addCriterion("schenddate =", value, "schenddate");
            return (Criteria) this;
        }

        public Criteria andSchenddateNotEqualTo(Date value) {
            addCriterion("schenddate <>", value, "schenddate");
            return (Criteria) this;
        }

        public Criteria andSchenddateGreaterThan(Date value) {
            addCriterion("schenddate >", value, "schenddate");
            return (Criteria) this;
        }

        public Criteria andSchenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("schenddate >=", value, "schenddate");
            return (Criteria) this;
        }

        public Criteria andSchenddateLessThan(Date value) {
            addCriterion("schenddate <", value, "schenddate");
            return (Criteria) this;
        }

        public Criteria andSchenddateLessThanOrEqualTo(Date value) {
            addCriterion("schenddate <=", value, "schenddate");
            return (Criteria) this;
        }

        public Criteria andSchenddateIn(List<Date> values) {
            addCriterion("schenddate in", values, "schenddate");
            return (Criteria) this;
        }

        public Criteria andSchenddateNotIn(List<Date> values) {
            addCriterion("schenddate not in", values, "schenddate");
            return (Criteria) this;
        }

        public Criteria andSchenddateBetween(Date value1, Date value2) {
            addCriterion("schenddate between", value1, value2, "schenddate");
            return (Criteria) this;
        }

        public Criteria andSchenddateNotBetween(Date value1, Date value2) {
            addCriterion("schenddate not between", value1, value2, "schenddate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andFzrIsNull() {
            addCriterion("fzr is null");
            return (Criteria) this;
        }

        public Criteria andFzrIsNotNull() {
            addCriterion("fzr is not null");
            return (Criteria) this;
        }

        public Criteria andFzrEqualTo(Long value) {
            addCriterion("fzr =", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotEqualTo(Long value) {
            addCriterion("fzr <>", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThan(Long value) {
            addCriterion("fzr >", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThanOrEqualTo(Long value) {
            addCriterion("fzr >=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThan(Long value) {
            addCriterion("fzr <", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThanOrEqualTo(Long value) {
            addCriterion("fzr <=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrIn(List<Long> values) {
            addCriterion("fzr in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotIn(List<Long> values) {
            addCriterion("fzr not in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrBetween(Long value1, Long value2) {
            addCriterion("fzr between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotBetween(Long value1, Long value2) {
            addCriterion("fzr not between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrnameIsNull() {
            addCriterion("fzrname is null");
            return (Criteria) this;
        }

        public Criteria andFzrnameIsNotNull() {
            addCriterion("fzrname is not null");
            return (Criteria) this;
        }

        public Criteria andFzrnameEqualTo(String value) {
            addCriterion("fzrname =", value, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameNotEqualTo(String value) {
            addCriterion("fzrname <>", value, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameGreaterThan(String value) {
            addCriterion("fzrname >", value, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameGreaterThanOrEqualTo(String value) {
            addCriterion("fzrname >=", value, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameLessThan(String value) {
            addCriterion("fzrname <", value, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameLessThanOrEqualTo(String value) {
            addCriterion("fzrname <=", value, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameLike(String value) {
            addCriterion("fzrname like", value, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameNotLike(String value) {
            addCriterion("fzrname not like", value, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameIn(List<String> values) {
            addCriterion("fzrname in", values, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameNotIn(List<String> values) {
            addCriterion("fzrname not in", values, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameBetween(String value1, String value2) {
            addCriterion("fzrname between", value1, value2, "fzrname");
            return (Criteria) this;
        }

        public Criteria andFzrnameNotBetween(String value1, String value2) {
            addCriterion("fzrname not between", value1, value2, "fzrname");
            return (Criteria) this;
        }

        public Criteria andPersonsIsNull() {
            addCriterion("persons is null");
            return (Criteria) this;
        }

        public Criteria andPersonsIsNotNull() {
            addCriterion("persons is not null");
            return (Criteria) this;
        }

        public Criteria andPersonsEqualTo(String value) {
            addCriterion("persons =", value, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsNotEqualTo(String value) {
            addCriterion("persons <>", value, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsGreaterThan(String value) {
            addCriterion("persons >", value, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsGreaterThanOrEqualTo(String value) {
            addCriterion("persons >=", value, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsLessThan(String value) {
            addCriterion("persons <", value, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsLessThanOrEqualTo(String value) {
            addCriterion("persons <=", value, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsLike(String value) {
            addCriterion("persons like", value, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsNotLike(String value) {
            addCriterion("persons not like", value, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsIn(List<String> values) {
            addCriterion("persons in", values, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsNotIn(List<String> values) {
            addCriterion("persons not in", values, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsBetween(String value1, String value2) {
            addCriterion("persons between", value1, value2, "persons");
            return (Criteria) this;
        }

        public Criteria andPersonsNotBetween(String value1, String value2) {
            addCriterion("persons not between", value1, value2, "persons");
            return (Criteria) this;
        }
    }

    /**
     */
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