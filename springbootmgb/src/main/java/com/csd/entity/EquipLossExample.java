package com.csd.entity;

import java.util.ArrayList;
import java.util.List;

public class EquipLossExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipLossExample() {
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

        public Criteria andEquipLossIdIsNull() {
            addCriterion("equip_loss_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdIsNotNull() {
            addCriterion("equip_loss_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdEqualTo(String value) {
            addCriterion("equip_loss_id =", value, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdNotEqualTo(String value) {
            addCriterion("equip_loss_id <>", value, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdGreaterThan(String value) {
            addCriterion("equip_loss_id >", value, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdGreaterThanOrEqualTo(String value) {
            addCriterion("equip_loss_id >=", value, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdLessThan(String value) {
            addCriterion("equip_loss_id <", value, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdLessThanOrEqualTo(String value) {
            addCriterion("equip_loss_id <=", value, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdLike(String value) {
            addCriterion("equip_loss_id like", value, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdNotLike(String value) {
            addCriterion("equip_loss_id not like", value, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdIn(List<String> values) {
            addCriterion("equip_loss_id in", values, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdNotIn(List<String> values) {
            addCriterion("equip_loss_id not in", values, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdBetween(String value1, String value2) {
            addCriterion("equip_loss_id between", value1, value2, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipLossIdNotBetween(String value1, String value2) {
            addCriterion("equip_loss_id not between", value1, value2, "equipLossId");
            return (Criteria) this;
        }

        public Criteria andEquipIdIsNull() {
            addCriterion("equip_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipIdIsNotNull() {
            addCriterion("equip_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipIdEqualTo(Integer value) {
            addCriterion("equip_id =", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotEqualTo(Integer value) {
            addCriterion("equip_id <>", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdGreaterThan(Integer value) {
            addCriterion("equip_id >", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_id >=", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdLessThan(Integer value) {
            addCriterion("equip_id <", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdLessThanOrEqualTo(Integer value) {
            addCriterion("equip_id <=", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdIn(List<Integer> values) {
            addCriterion("equip_id in", values, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotIn(List<Integer> values) {
            addCriterion("equip_id not in", values, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdBetween(Integer value1, Integer value2) {
            addCriterion("equip_id between", value1, value2, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_id not between", value1, value2, "equipId");
            return (Criteria) this;
        }

        public Criteria andLossDescIsNull() {
            addCriterion("loss_desc is null");
            return (Criteria) this;
        }

        public Criteria andLossDescIsNotNull() {
            addCriterion("loss_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLossDescEqualTo(String value) {
            addCriterion("loss_desc =", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescNotEqualTo(String value) {
            addCriterion("loss_desc <>", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescGreaterThan(String value) {
            addCriterion("loss_desc >", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescGreaterThanOrEqualTo(String value) {
            addCriterion("loss_desc >=", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescLessThan(String value) {
            addCriterion("loss_desc <", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescLessThanOrEqualTo(String value) {
            addCriterion("loss_desc <=", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescLike(String value) {
            addCriterion("loss_desc like", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescNotLike(String value) {
            addCriterion("loss_desc not like", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescIn(List<String> values) {
            addCriterion("loss_desc in", values, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescNotIn(List<String> values) {
            addCriterion("loss_desc not in", values, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescBetween(String value1, String value2) {
            addCriterion("loss_desc between", value1, value2, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescNotBetween(String value1, String value2) {
            addCriterion("loss_desc not between", value1, value2, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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