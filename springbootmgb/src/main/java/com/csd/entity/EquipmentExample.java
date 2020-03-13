package com.csd.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNull() {
            addCriterion("equip_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNotNull() {
            addCriterion("equip_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipNameEqualTo(String value) {
            addCriterion("equip_name =", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotEqualTo(String value) {
            addCriterion("equip_name <>", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThan(String value) {
            addCriterion("equip_name >", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThanOrEqualTo(String value) {
            addCriterion("equip_name >=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThan(String value) {
            addCriterion("equip_name <", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThanOrEqualTo(String value) {
            addCriterion("equip_name <=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLike(String value) {
            addCriterion("equip_name like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotLike(String value) {
            addCriterion("equip_name not like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameIn(List<String> values) {
            addCriterion("equip_name in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotIn(List<String> values) {
            addCriterion("equip_name not in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameBetween(String value1, String value2) {
            addCriterion("equip_name between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotBetween(String value1, String value2) {
            addCriterion("equip_name not between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameIsNull() {
            addCriterion("equip_type_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameIsNotNull() {
            addCriterion("equip_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameEqualTo(String value) {
            addCriterion("equip_type_name =", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameNotEqualTo(String value) {
            addCriterion("equip_type_name <>", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameGreaterThan(String value) {
            addCriterion("equip_type_name >", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("equip_type_name >=", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameLessThan(String value) {
            addCriterion("equip_type_name <", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameLessThanOrEqualTo(String value) {
            addCriterion("equip_type_name <=", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameLike(String value) {
            addCriterion("equip_type_name like", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameNotLike(String value) {
            addCriterion("equip_type_name not like", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameIn(List<String> values) {
            addCriterion("equip_type_name in", values, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameNotIn(List<String> values) {
            addCriterion("equip_type_name not in", values, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameBetween(String value1, String value2) {
            addCriterion("equip_type_name between", value1, value2, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameNotBetween(String value1, String value2) {
            addCriterion("equip_type_name not between", value1, value2, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipDescIsNull() {
            addCriterion("equip_desc is null");
            return (Criteria) this;
        }

        public Criteria andEquipDescIsNotNull() {
            addCriterion("equip_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEquipDescEqualTo(String value) {
            addCriterion("equip_desc =", value, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescNotEqualTo(String value) {
            addCriterion("equip_desc <>", value, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescGreaterThan(String value) {
            addCriterion("equip_desc >", value, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescGreaterThanOrEqualTo(String value) {
            addCriterion("equip_desc >=", value, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescLessThan(String value) {
            addCriterion("equip_desc <", value, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescLessThanOrEqualTo(String value) {
            addCriterion("equip_desc <=", value, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescLike(String value) {
            addCriterion("equip_desc like", value, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescNotLike(String value) {
            addCriterion("equip_desc not like", value, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescIn(List<String> values) {
            addCriterion("equip_desc in", values, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescNotIn(List<String> values) {
            addCriterion("equip_desc not in", values, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescBetween(String value1, String value2) {
            addCriterion("equip_desc between", value1, value2, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipDescNotBetween(String value1, String value2) {
            addCriterion("equip_desc not between", value1, value2, "equipDesc");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateIsNull() {
            addCriterion("equip_storage_date is null");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateIsNotNull() {
            addCriterion("equip_storage_date is not null");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateEqualTo(String value) {
            addCriterion("equip_storage_date =", value, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateNotEqualTo(String value) {
            addCriterion("equip_storage_date <>", value, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateGreaterThan(String value) {
            addCriterion("equip_storage_date >", value, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateGreaterThanOrEqualTo(String value) {
            addCriterion("equip_storage_date >=", value, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateLessThan(String value) {
            addCriterion("equip_storage_date <", value, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateLessThanOrEqualTo(String value) {
            addCriterion("equip_storage_date <=", value, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateLike(String value) {
            addCriterion("equip_storage_date like", value, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateNotLike(String value) {
            addCriterion("equip_storage_date not like", value, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateIn(List<String> values) {
            addCriterion("equip_storage_date in", values, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateNotIn(List<String> values) {
            addCriterion("equip_storage_date not in", values, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateBetween(String value1, String value2) {
            addCriterion("equip_storage_date between", value1, value2, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipStorageDateNotBetween(String value1, String value2) {
            addCriterion("equip_storage_date not between", value1, value2, "equipStorageDate");
            return (Criteria) this;
        }

        public Criteria andEquipCountIsNull() {
            addCriterion("equip_count is null");
            return (Criteria) this;
        }

        public Criteria andEquipCountIsNotNull() {
            addCriterion("equip_count is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCountEqualTo(Integer value) {
            addCriterion("equip_count =", value, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipCountNotEqualTo(Integer value) {
            addCriterion("equip_count <>", value, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipCountGreaterThan(Integer value) {
            addCriterion("equip_count >", value, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_count >=", value, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipCountLessThan(Integer value) {
            addCriterion("equip_count <", value, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipCountLessThanOrEqualTo(Integer value) {
            addCriterion("equip_count <=", value, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipCountIn(List<Integer> values) {
            addCriterion("equip_count in", values, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipCountNotIn(List<Integer> values) {
            addCriterion("equip_count not in", values, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipCountBetween(Integer value1, Integer value2) {
            addCriterion("equip_count between", value1, value2, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipCountNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_count not between", value1, value2, "equipCount");
            return (Criteria) this;
        }

        public Criteria andEquipPriceIsNull() {
            addCriterion("equip_price is null");
            return (Criteria) this;
        }

        public Criteria andEquipPriceIsNotNull() {
            addCriterion("equip_price is not null");
            return (Criteria) this;
        }

        public Criteria andEquipPriceEqualTo(BigDecimal value) {
            addCriterion("equip_price =", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceNotEqualTo(BigDecimal value) {
            addCriterion("equip_price <>", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceGreaterThan(BigDecimal value) {
            addCriterion("equip_price >", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("equip_price >=", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceLessThan(BigDecimal value) {
            addCriterion("equip_price <", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("equip_price <=", value, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceIn(List<BigDecimal> values) {
            addCriterion("equip_price in", values, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceNotIn(List<BigDecimal> values) {
            addCriterion("equip_price not in", values, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equip_price between", value1, value2, "equipPrice");
            return (Criteria) this;
        }

        public Criteria andEquipPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equip_price not between", value1, value2, "equipPrice");
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