package com.wx.whatever.pojo;

import java.util.ArrayList;
import java.util.List;

public class MyfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyfileExample() {
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

        public Criteria andOriginalnameIsNull() {
            addCriterion("originalname is null");
            return (Criteria) this;
        }

        public Criteria andOriginalnameIsNotNull() {
            addCriterion("originalname is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalnameEqualTo(String value) {
            addCriterion("originalname =", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotEqualTo(String value) {
            addCriterion("originalname <>", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameGreaterThan(String value) {
            addCriterion("originalname >", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameGreaterThanOrEqualTo(String value) {
            addCriterion("originalname >=", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameLessThan(String value) {
            addCriterion("originalname <", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameLessThanOrEqualTo(String value) {
            addCriterion("originalname <=", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameLike(String value) {
            addCriterion("originalname like", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotLike(String value) {
            addCriterion("originalname not like", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameIn(List<String> values) {
            addCriterion("originalname in", values, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotIn(List<String> values) {
            addCriterion("originalname not in", values, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameBetween(String value1, String value2) {
            addCriterion("originalname between", value1, value2, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotBetween(String value1, String value2) {
            addCriterion("originalname not between", value1, value2, "originalname");
            return (Criteria) this;
        }

        public Criteria andNewnameIsNull() {
            addCriterion("newname is null");
            return (Criteria) this;
        }

        public Criteria andNewnameIsNotNull() {
            addCriterion("newname is not null");
            return (Criteria) this;
        }

        public Criteria andNewnameEqualTo(String value) {
            addCriterion("newname =", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotEqualTo(String value) {
            addCriterion("newname <>", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameGreaterThan(String value) {
            addCriterion("newname >", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameGreaterThanOrEqualTo(String value) {
            addCriterion("newname >=", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameLessThan(String value) {
            addCriterion("newname <", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameLessThanOrEqualTo(String value) {
            addCriterion("newname <=", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameLike(String value) {
            addCriterion("newname like", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotLike(String value) {
            addCriterion("newname not like", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameIn(List<String> values) {
            addCriterion("newname in", values, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotIn(List<String> values) {
            addCriterion("newname not in", values, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameBetween(String value1, String value2) {
            addCriterion("newname between", value1, value2, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotBetween(String value1, String value2) {
            addCriterion("newname not between", value1, value2, "newname");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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