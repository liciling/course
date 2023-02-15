package com.course.server.domain;

import java.util.ArrayList;
import java.util.List;

public class RealtyManagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RealtyManagementExample() {
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

        public Criteria andProjectEntryNameIsNull() {
            addCriterion("project_entry_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameIsNotNull() {
            addCriterion("project_entry_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameEqualTo(String value) {
            addCriterion("project_entry_name =", value, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameNotEqualTo(String value) {
            addCriterion("project_entry_name <>", value, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameGreaterThan(String value) {
            addCriterion("project_entry_name >", value, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_entry_name >=", value, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameLessThan(String value) {
            addCriterion("project_entry_name <", value, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameLessThanOrEqualTo(String value) {
            addCriterion("project_entry_name <=", value, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameLike(String value) {
            addCriterion("project_entry_name like", value, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameNotLike(String value) {
            addCriterion("project_entry_name not like", value, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameIn(List<String> values) {
            addCriterion("project_entry_name in", values, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameNotIn(List<String> values) {
            addCriterion("project_entry_name not in", values, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameBetween(String value1, String value2) {
            addCriterion("project_entry_name between", value1, value2, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectEntryNameNotBetween(String value1, String value2) {
            addCriterion("project_entry_name not between", value1, value2, "projectEntryName");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectIsNull() {
            addCriterion("project_detailed_address_project is null");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectIsNotNull() {
            addCriterion("project_detailed_address_project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectEqualTo(String value) {
            addCriterion("project_detailed_address_project =", value, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectNotEqualTo(String value) {
            addCriterion("project_detailed_address_project <>", value, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectGreaterThan(String value) {
            addCriterion("project_detailed_address_project >", value, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectGreaterThanOrEqualTo(String value) {
            addCriterion("project_detailed_address_project >=", value, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectLessThan(String value) {
            addCriterion("project_detailed_address_project <", value, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectLessThanOrEqualTo(String value) {
            addCriterion("project_detailed_address_project <=", value, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectLike(String value) {
            addCriterion("project_detailed_address_project like", value, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectNotLike(String value) {
            addCriterion("project_detailed_address_project not like", value, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectIn(List<String> values) {
            addCriterion("project_detailed_address_project in", values, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectNotIn(List<String> values) {
            addCriterion("project_detailed_address_project not in", values, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectBetween(String value1, String value2) {
            addCriterion("project_detailed_address_project between", value1, value2, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectDetailedAddressProjectNotBetween(String value1, String value2) {
            addCriterion("project_detailed_address_project not between", value1, value2, "projectDetailedAddressProject");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseIsNull() {
            addCriterion("project_property_management_enterprise is null");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseIsNotNull() {
            addCriterion("project_property_management_enterprise is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseEqualTo(String value) {
            addCriterion("project_property_management_enterprise =", value, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseNotEqualTo(String value) {
            addCriterion("project_property_management_enterprise <>", value, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseGreaterThan(String value) {
            addCriterion("project_property_management_enterprise >", value, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("project_property_management_enterprise >=", value, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseLessThan(String value) {
            addCriterion("project_property_management_enterprise <", value, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseLessThanOrEqualTo(String value) {
            addCriterion("project_property_management_enterprise <=", value, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseLike(String value) {
            addCriterion("project_property_management_enterprise like", value, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseNotLike(String value) {
            addCriterion("project_property_management_enterprise not like", value, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseIn(List<String> values) {
            addCriterion("project_property_management_enterprise in", values, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseNotIn(List<String> values) {
            addCriterion("project_property_management_enterprise not in", values, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseBetween(String value1, String value2) {
            addCriterion("project_property_management_enterprise between", value1, value2, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyManagementEnterpriseNotBetween(String value1, String value2) {
            addCriterion("project_property_management_enterprise not between", value1, value2, "projectPropertyManagementEnterprise");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastIsNull() {
            addCriterion("project_area_east is null");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastIsNotNull() {
            addCriterion("project_area_east is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastEqualTo(String value) {
            addCriterion("project_area_east =", value, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastNotEqualTo(String value) {
            addCriterion("project_area_east <>", value, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastGreaterThan(String value) {
            addCriterion("project_area_east >", value, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastGreaterThanOrEqualTo(String value) {
            addCriterion("project_area_east >=", value, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastLessThan(String value) {
            addCriterion("project_area_east <", value, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastLessThanOrEqualTo(String value) {
            addCriterion("project_area_east <=", value, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastLike(String value) {
            addCriterion("project_area_east like", value, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastNotLike(String value) {
            addCriterion("project_area_east not like", value, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastIn(List<String> values) {
            addCriterion("project_area_east in", values, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastNotIn(List<String> values) {
            addCriterion("project_area_east not in", values, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastBetween(String value1, String value2) {
            addCriterion("project_area_east between", value1, value2, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaEastNotBetween(String value1, String value2) {
            addCriterion("project_area_east not between", value1, value2, "projectAreaEast");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthIsNull() {
            addCriterion("project_area_south is null");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthIsNotNull() {
            addCriterion("project_area_south is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthEqualTo(String value) {
            addCriterion("project_area_south =", value, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthNotEqualTo(String value) {
            addCriterion("project_area_south <>", value, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthGreaterThan(String value) {
            addCriterion("project_area_south >", value, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthGreaterThanOrEqualTo(String value) {
            addCriterion("project_area_south >=", value, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthLessThan(String value) {
            addCriterion("project_area_south <", value, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthLessThanOrEqualTo(String value) {
            addCriterion("project_area_south <=", value, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthLike(String value) {
            addCriterion("project_area_south like", value, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthNotLike(String value) {
            addCriterion("project_area_south not like", value, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthIn(List<String> values) {
            addCriterion("project_area_south in", values, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthNotIn(List<String> values) {
            addCriterion("project_area_south not in", values, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthBetween(String value1, String value2) {
            addCriterion("project_area_south between", value1, value2, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaSouthNotBetween(String value1, String value2) {
            addCriterion("project_area_south not between", value1, value2, "projectAreaSouth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestIsNull() {
            addCriterion("project_area_west is null");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestIsNotNull() {
            addCriterion("project_area_west is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestEqualTo(String value) {
            addCriterion("project_area_west =", value, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestNotEqualTo(String value) {
            addCriterion("project_area_west <>", value, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestGreaterThan(String value) {
            addCriterion("project_area_west >", value, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestGreaterThanOrEqualTo(String value) {
            addCriterion("project_area_west >=", value, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestLessThan(String value) {
            addCriterion("project_area_west <", value, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestLessThanOrEqualTo(String value) {
            addCriterion("project_area_west <=", value, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestLike(String value) {
            addCriterion("project_area_west like", value, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestNotLike(String value) {
            addCriterion("project_area_west not like", value, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestIn(List<String> values) {
            addCriterion("project_area_west in", values, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestNotIn(List<String> values) {
            addCriterion("project_area_west not in", values, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestBetween(String value1, String value2) {
            addCriterion("project_area_west between", value1, value2, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaWestNotBetween(String value1, String value2) {
            addCriterion("project_area_west not between", value1, value2, "projectAreaWest");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthIsNull() {
            addCriterion("project_area_north is null");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthIsNotNull() {
            addCriterion("project_area_north is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthEqualTo(String value) {
            addCriterion("project_area_north =", value, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthNotEqualTo(String value) {
            addCriterion("project_area_north <>", value, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthGreaterThan(String value) {
            addCriterion("project_area_north >", value, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthGreaterThanOrEqualTo(String value) {
            addCriterion("project_area_north >=", value, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthLessThan(String value) {
            addCriterion("project_area_north <", value, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthLessThanOrEqualTo(String value) {
            addCriterion("project_area_north <=", value, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthLike(String value) {
            addCriterion("project_area_north like", value, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthNotLike(String value) {
            addCriterion("project_area_north not like", value, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthIn(List<String> values) {
            addCriterion("project_area_north in", values, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthNotIn(List<String> values) {
            addCriterion("project_area_north not in", values, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthBetween(String value1, String value2) {
            addCriterion("project_area_north between", value1, value2, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectAreaNorthNotBetween(String value1, String value2) {
            addCriterion("project_area_north not between", value1, value2, "projectAreaNorth");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitIsNull() {
            addCriterion("project_development_unit is null");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitIsNotNull() {
            addCriterion("project_development_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitEqualTo(String value) {
            addCriterion("project_development_unit =", value, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitNotEqualTo(String value) {
            addCriterion("project_development_unit <>", value, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitGreaterThan(String value) {
            addCriterion("project_development_unit >", value, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitGreaterThanOrEqualTo(String value) {
            addCriterion("project_development_unit >=", value, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitLessThan(String value) {
            addCriterion("project_development_unit <", value, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitLessThanOrEqualTo(String value) {
            addCriterion("project_development_unit <=", value, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitLike(String value) {
            addCriterion("project_development_unit like", value, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitNotLike(String value) {
            addCriterion("project_development_unit not like", value, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitIn(List<String> values) {
            addCriterion("project_development_unit in", values, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitNotIn(List<String> values) {
            addCriterion("project_development_unit not in", values, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitBetween(String value1, String value2) {
            addCriterion("project_development_unit between", value1, value2, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectDevelopmentUnitNotBetween(String value1, String value2) {
            addCriterion("project_development_unit not between", value1, value2, "projectDevelopmentUnit");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearIsNull() {
            addCriterion("project_completion_year is null");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearIsNotNull() {
            addCriterion("project_completion_year is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearEqualTo(String value) {
            addCriterion("project_completion_year =", value, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearNotEqualTo(String value) {
            addCriterion("project_completion_year <>", value, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearGreaterThan(String value) {
            addCriterion("project_completion_year >", value, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearGreaterThanOrEqualTo(String value) {
            addCriterion("project_completion_year >=", value, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearLessThan(String value) {
            addCriterion("project_completion_year <", value, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearLessThanOrEqualTo(String value) {
            addCriterion("project_completion_year <=", value, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearLike(String value) {
            addCriterion("project_completion_year like", value, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearNotLike(String value) {
            addCriterion("project_completion_year not like", value, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearIn(List<String> values) {
            addCriterion("project_completion_year in", values, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearNotIn(List<String> values) {
            addCriterion("project_completion_year not in", values, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearBetween(String value1, String value2) {
            addCriterion("project_completion_year between", value1, value2, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionYearNotBetween(String value1, String value2) {
            addCriterion("project_completion_year not between", value1, value2, "projectCompletionYear");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaIsNull() {
            addCriterion("project_floor_area is null");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaIsNotNull() {
            addCriterion("project_floor_area is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaEqualTo(String value) {
            addCriterion("project_floor_area =", value, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaNotEqualTo(String value) {
            addCriterion("project_floor_area <>", value, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaGreaterThan(String value) {
            addCriterion("project_floor_area >", value, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaGreaterThanOrEqualTo(String value) {
            addCriterion("project_floor_area >=", value, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaLessThan(String value) {
            addCriterion("project_floor_area <", value, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaLessThanOrEqualTo(String value) {
            addCriterion("project_floor_area <=", value, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaLike(String value) {
            addCriterion("project_floor_area like", value, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaNotLike(String value) {
            addCriterion("project_floor_area not like", value, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaIn(List<String> values) {
            addCriterion("project_floor_area in", values, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaNotIn(List<String> values) {
            addCriterion("project_floor_area not in", values, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaBetween(String value1, String value2) {
            addCriterion("project_floor_area between", value1, value2, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectFloorAreaNotBetween(String value1, String value2) {
            addCriterion("project_floor_area not between", value1, value2, "projectFloorArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaIsNull() {
            addCriterion("project_building_area is null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaIsNotNull() {
            addCriterion("project_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaEqualTo(String value) {
            addCriterion("project_building_area =", value, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaNotEqualTo(String value) {
            addCriterion("project_building_area <>", value, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaGreaterThan(String value) {
            addCriterion("project_building_area >", value, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaGreaterThanOrEqualTo(String value) {
            addCriterion("project_building_area >=", value, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaLessThan(String value) {
            addCriterion("project_building_area <", value, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaLessThanOrEqualTo(String value) {
            addCriterion("project_building_area <=", value, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaLike(String value) {
            addCriterion("project_building_area like", value, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaNotLike(String value) {
            addCriterion("project_building_area not like", value, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaIn(List<String> values) {
            addCriterion("project_building_area in", values, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaNotIn(List<String> values) {
            addCriterion("project_building_area not in", values, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaBetween(String value1, String value2) {
            addCriterion("project_building_area between", value1, value2, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingAreaNotBetween(String value1, String value2) {
            addCriterion("project_building_area not between", value1, value2, "projectBuildingArea");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(String value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(String value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(String value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(String value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLike(String value) {
            addCriterion("project_type like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotLike(String value) {
            addCriterion("project_type not like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<String> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<String> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(String value1, String value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(String value1, String value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceIsNull() {
            addCriterion("project_including_residence is null");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceIsNotNull() {
            addCriterion("project_including_residence is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceEqualTo(String value) {
            addCriterion("project_including_residence =", value, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceNotEqualTo(String value) {
            addCriterion("project_including_residence <>", value, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceGreaterThan(String value) {
            addCriterion("project_including_residence >", value, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("project_including_residence >=", value, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceLessThan(String value) {
            addCriterion("project_including_residence <", value, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceLessThanOrEqualTo(String value) {
            addCriterion("project_including_residence <=", value, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceLike(String value) {
            addCriterion("project_including_residence like", value, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceNotLike(String value) {
            addCriterion("project_including_residence not like", value, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceIn(List<String> values) {
            addCriterion("project_including_residence in", values, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceNotIn(List<String> values) {
            addCriterion("project_including_residence not in", values, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceBetween(String value1, String value2) {
            addCriterion("project_including_residence between", value1, value2, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectIncludingResidenceNotBetween(String value1, String value2) {
            addCriterion("project_including_residence not between", value1, value2, "projectIncludingResidence");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberIsNull() {
            addCriterion("project_buildings_number is null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberIsNotNull() {
            addCriterion("project_buildings_number is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberEqualTo(String value) {
            addCriterion("project_buildings_number =", value, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberNotEqualTo(String value) {
            addCriterion("project_buildings_number <>", value, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberGreaterThan(String value) {
            addCriterion("project_buildings_number >", value, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("project_buildings_number >=", value, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberLessThan(String value) {
            addCriterion("project_buildings_number <", value, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberLessThanOrEqualTo(String value) {
            addCriterion("project_buildings_number <=", value, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberLike(String value) {
            addCriterion("project_buildings_number like", value, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberNotLike(String value) {
            addCriterion("project_buildings_number not like", value, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberIn(List<String> values) {
            addCriterion("project_buildings_number in", values, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberNotIn(List<String> values) {
            addCriterion("project_buildings_number not in", values, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberBetween(String value1, String value2) {
            addCriterion("project_buildings_number between", value1, value2, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectBuildingsNumberNotBetween(String value1, String value2) {
            addCriterion("project_buildings_number not between", value1, value2, "projectBuildingsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberIsNull() {
            addCriterion("project_units_number is null");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberIsNotNull() {
            addCriterion("project_units_number is not null");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberEqualTo(String value) {
            addCriterion("project_units_number =", value, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberNotEqualTo(String value) {
            addCriterion("project_units_number <>", value, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberGreaterThan(String value) {
            addCriterion("project_units_number >", value, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("project_units_number >=", value, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberLessThan(String value) {
            addCriterion("project_units_number <", value, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberLessThanOrEqualTo(String value) {
            addCriterion("project_units_number <=", value, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberLike(String value) {
            addCriterion("project_units_number like", value, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberNotLike(String value) {
            addCriterion("project_units_number not like", value, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberIn(List<String> values) {
            addCriterion("project_units_number in", values, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberNotIn(List<String> values) {
            addCriterion("project_units_number not in", values, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberBetween(String value1, String value2) {
            addCriterion("project_units_number between", value1, value2, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectUnitsNumberNotBetween(String value1, String value2) {
            addCriterion("project_units_number not between", value1, value2, "projectUnitsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberIsNull() {
            addCriterion("project_households_number is null");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberIsNotNull() {
            addCriterion("project_households_number is not null");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberEqualTo(String value) {
            addCriterion("project_households_number =", value, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberNotEqualTo(String value) {
            addCriterion("project_households_number <>", value, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberGreaterThan(String value) {
            addCriterion("project_households_number >", value, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("project_households_number >=", value, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberLessThan(String value) {
            addCriterion("project_households_number <", value, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberLessThanOrEqualTo(String value) {
            addCriterion("project_households_number <=", value, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberLike(String value) {
            addCriterion("project_households_number like", value, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberNotLike(String value) {
            addCriterion("project_households_number not like", value, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberIn(List<String> values) {
            addCriterion("project_households_number in", values, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberNotIn(List<String> values) {
            addCriterion("project_households_number not in", values, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberBetween(String value1, String value2) {
            addCriterion("project_households_number between", value1, value2, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectHouseholdsNumberNotBetween(String value1, String value2) {
            addCriterion("project_households_number not between", value1, value2, "projectHouseholdsNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyIsNull() {
            addCriterion("project_occupancy is null");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyIsNotNull() {
            addCriterion("project_occupancy is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyEqualTo(String value) {
            addCriterion("project_occupancy =", value, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyNotEqualTo(String value) {
            addCriterion("project_occupancy <>", value, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyGreaterThan(String value) {
            addCriterion("project_occupancy >", value, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyGreaterThanOrEqualTo(String value) {
            addCriterion("project_occupancy >=", value, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyLessThan(String value) {
            addCriterion("project_occupancy <", value, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyLessThanOrEqualTo(String value) {
            addCriterion("project_occupancy <=", value, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyLike(String value) {
            addCriterion("project_occupancy like", value, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyNotLike(String value) {
            addCriterion("project_occupancy not like", value, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyIn(List<String> values) {
            addCriterion("project_occupancy in", values, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyNotIn(List<String> values) {
            addCriterion("project_occupancy not in", values, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyBetween(String value1, String value2) {
            addCriterion("project_occupancy between", value1, value2, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOccupancyNotBetween(String value1, String value2) {
            addCriterion("project_occupancy not between", value1, value2, "projectOccupancy");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberIsNull() {
            addCriterion("project_owners_number is null");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberIsNotNull() {
            addCriterion("project_owners_number is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberEqualTo(String value) {
            addCriterion("project_owners_number =", value, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberNotEqualTo(String value) {
            addCriterion("project_owners_number <>", value, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberGreaterThan(String value) {
            addCriterion("project_owners_number >", value, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberGreaterThanOrEqualTo(String value) {
            addCriterion("project_owners_number >=", value, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberLessThan(String value) {
            addCriterion("project_owners_number <", value, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberLessThanOrEqualTo(String value) {
            addCriterion("project_owners_number <=", value, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberLike(String value) {
            addCriterion("project_owners_number like", value, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberNotLike(String value) {
            addCriterion("project_owners_number not like", value, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberIn(List<String> values) {
            addCriterion("project_owners_number in", values, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberNotIn(List<String> values) {
            addCriterion("project_owners_number not in", values, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberBetween(String value1, String value2) {
            addCriterion("project_owners_number between", value1, value2, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectOwnersNumberNotBetween(String value1, String value2) {
            addCriterion("project_owners_number not between", value1, value2, "projectOwnersNumber");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedIsNull() {
            addCriterion("project_isClosed is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedIsNotNull() {
            addCriterion("project_isClosed is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedEqualTo(String value) {
            addCriterion("project_isClosed =", value, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedNotEqualTo(String value) {
            addCriterion("project_isClosed <>", value, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedGreaterThan(String value) {
            addCriterion("project_isClosed >", value, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedGreaterThanOrEqualTo(String value) {
            addCriterion("project_isClosed >=", value, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedLessThan(String value) {
            addCriterion("project_isClosed <", value, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedLessThanOrEqualTo(String value) {
            addCriterion("project_isClosed <=", value, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedLike(String value) {
            addCriterion("project_isClosed like", value, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedNotLike(String value) {
            addCriterion("project_isClosed not like", value, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedIn(List<String> values) {
            addCriterion("project_isClosed in", values, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedNotIn(List<String> values) {
            addCriterion("project_isClosed not in", values, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedBetween(String value1, String value2) {
            addCriterion("project_isClosed between", value1, value2, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectIsclosedNotBetween(String value1, String value2) {
            addCriterion("project_isClosed not between", value1, value2, "projectIsclosed");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeIsNull() {
            addCriterion("project_belong_office is null");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeIsNotNull() {
            addCriterion("project_belong_office is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeEqualTo(String value) {
            addCriterion("project_belong_office =", value, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeNotEqualTo(String value) {
            addCriterion("project_belong_office <>", value, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeGreaterThan(String value) {
            addCriterion("project_belong_office >", value, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("project_belong_office >=", value, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeLessThan(String value) {
            addCriterion("project_belong_office <", value, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeLessThanOrEqualTo(String value) {
            addCriterion("project_belong_office <=", value, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeLike(String value) {
            addCriterion("project_belong_office like", value, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeNotLike(String value) {
            addCriterion("project_belong_office not like", value, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeIn(List<String> values) {
            addCriterion("project_belong_office in", values, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeNotIn(List<String> values) {
            addCriterion("project_belong_office not in", values, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeBetween(String value1, String value2) {
            addCriterion("project_belong_office between", value1, value2, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongOfficeNotBetween(String value1, String value2) {
            addCriterion("project_belong_office not between", value1, value2, "projectBelongOffice");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityIsNull() {
            addCriterion("project_belong_community is null");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityIsNotNull() {
            addCriterion("project_belong_community is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityEqualTo(String value) {
            addCriterion("project_belong_community =", value, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityNotEqualTo(String value) {
            addCriterion("project_belong_community <>", value, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityGreaterThan(String value) {
            addCriterion("project_belong_community >", value, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("project_belong_community >=", value, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityLessThan(String value) {
            addCriterion("project_belong_community <", value, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityLessThanOrEqualTo(String value) {
            addCriterion("project_belong_community <=", value, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityLike(String value) {
            addCriterion("project_belong_community like", value, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityNotLike(String value) {
            addCriterion("project_belong_community not like", value, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityIn(List<String> values) {
            addCriterion("project_belong_community in", values, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityNotIn(List<String> values) {
            addCriterion("project_belong_community not in", values, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityBetween(String value1, String value2) {
            addCriterion("project_belong_community between", value1, value2, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommunityNotBetween(String value1, String value2) {
            addCriterion("project_belong_community not between", value1, value2, "projectBelongCommunity");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeIsNull() {
            addCriterion("project_belong_committee is null");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeIsNotNull() {
            addCriterion("project_belong_committee is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeEqualTo(String value) {
            addCriterion("project_belong_committee =", value, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeNotEqualTo(String value) {
            addCriterion("project_belong_committee <>", value, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeGreaterThan(String value) {
            addCriterion("project_belong_committee >", value, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeGreaterThanOrEqualTo(String value) {
            addCriterion("project_belong_committee >=", value, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeLessThan(String value) {
            addCriterion("project_belong_committee <", value, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeLessThanOrEqualTo(String value) {
            addCriterion("project_belong_committee <=", value, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeLike(String value) {
            addCriterion("project_belong_committee like", value, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeNotLike(String value) {
            addCriterion("project_belong_committee not like", value, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeIn(List<String> values) {
            addCriterion("project_belong_committee in", values, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeNotIn(List<String> values) {
            addCriterion("project_belong_committee not in", values, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeBetween(String value1, String value2) {
            addCriterion("project_belong_committee between", value1, value2, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andProjectBelongCommitteeNotBetween(String value1, String value2) {
            addCriterion("project_belong_committee not between", value1, value2, "projectBelongCommittee");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerIsNull() {
            addCriterion("people_manager is null");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerIsNotNull() {
            addCriterion("people_manager is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerEqualTo(String value) {
            addCriterion("people_manager =", value, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerNotEqualTo(String value) {
            addCriterion("people_manager <>", value, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerGreaterThan(String value) {
            addCriterion("people_manager >", value, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerGreaterThanOrEqualTo(String value) {
            addCriterion("people_manager >=", value, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerLessThan(String value) {
            addCriterion("people_manager <", value, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerLessThanOrEqualTo(String value) {
            addCriterion("people_manager <=", value, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerLike(String value) {
            addCriterion("people_manager like", value, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerNotLike(String value) {
            addCriterion("people_manager not like", value, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerIn(List<String> values) {
            addCriterion("people_manager in", values, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerNotIn(List<String> values) {
            addCriterion("people_manager not in", values, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerBetween(String value1, String value2) {
            addCriterion("people_manager between", value1, value2, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerNotBetween(String value1, String value2) {
            addCriterion("people_manager not between", value1, value2, "peopleManager");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneIsNull() {
            addCriterion("people_manager_phone is null");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneIsNotNull() {
            addCriterion("people_manager_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneEqualTo(String value) {
            addCriterion("people_manager_phone =", value, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneNotEqualTo(String value) {
            addCriterion("people_manager_phone <>", value, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneGreaterThan(String value) {
            addCriterion("people_manager_phone >", value, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("people_manager_phone >=", value, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneLessThan(String value) {
            addCriterion("people_manager_phone <", value, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("people_manager_phone <=", value, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneLike(String value) {
            addCriterion("people_manager_phone like", value, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneNotLike(String value) {
            addCriterion("people_manager_phone not like", value, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneIn(List<String> values) {
            addCriterion("people_manager_phone in", values, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneNotIn(List<String> values) {
            addCriterion("people_manager_phone not in", values, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneBetween(String value1, String value2) {
            addCriterion("people_manager_phone between", value1, value2, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("people_manager_phone not between", value1, value2, "peopleManagerPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberIsNull() {
            addCriterion("people_customers_number is null");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberIsNotNull() {
            addCriterion("people_customers_number is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberEqualTo(Integer value) {
            addCriterion("people_customers_number =", value, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberNotEqualTo(Integer value) {
            addCriterion("people_customers_number <>", value, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberGreaterThan(Integer value) {
            addCriterion("people_customers_number >", value, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("people_customers_number >=", value, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberLessThan(Integer value) {
            addCriterion("people_customers_number <", value, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberLessThanOrEqualTo(Integer value) {
            addCriterion("people_customers_number <=", value, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberIn(List<Integer> values) {
            addCriterion("people_customers_number in", values, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberNotIn(List<Integer> values) {
            addCriterion("people_customers_number not in", values, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberBetween(Integer value1, Integer value2) {
            addCriterion("people_customers_number between", value1, value2, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCustomersNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("people_customers_number not between", value1, value2, "peopleCustomersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberIsNull() {
            addCriterion("people_order_number is null");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberIsNotNull() {
            addCriterion("people_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberEqualTo(String value) {
            addCriterion("people_order_number =", value, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberNotEqualTo(String value) {
            addCriterion("people_order_number <>", value, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberGreaterThan(String value) {
            addCriterion("people_order_number >", value, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("people_order_number >=", value, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberLessThan(String value) {
            addCriterion("people_order_number <", value, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("people_order_number <=", value, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberLike(String value) {
            addCriterion("people_order_number like", value, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberNotLike(String value) {
            addCriterion("people_order_number not like", value, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberIn(List<String> values) {
            addCriterion("people_order_number in", values, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberNotIn(List<String> values) {
            addCriterion("people_order_number not in", values, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberBetween(String value1, String value2) {
            addCriterion("people_order_number between", value1, value2, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOrderNumberNotBetween(String value1, String value2) {
            addCriterion("people_order_number not between", value1, value2, "peopleOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberIsNull() {
            addCriterion("people_cleaning_number is null");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberIsNotNull() {
            addCriterion("people_cleaning_number is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberEqualTo(String value) {
            addCriterion("people_cleaning_number =", value, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberNotEqualTo(String value) {
            addCriterion("people_cleaning_number <>", value, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberGreaterThan(String value) {
            addCriterion("people_cleaning_number >", value, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberGreaterThanOrEqualTo(String value) {
            addCriterion("people_cleaning_number >=", value, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberLessThan(String value) {
            addCriterion("people_cleaning_number <", value, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberLessThanOrEqualTo(String value) {
            addCriterion("people_cleaning_number <=", value, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberLike(String value) {
            addCriterion("people_cleaning_number like", value, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberNotLike(String value) {
            addCriterion("people_cleaning_number not like", value, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberIn(List<String> values) {
            addCriterion("people_cleaning_number in", values, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberNotIn(List<String> values) {
            addCriterion("people_cleaning_number not in", values, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberBetween(String value1, String value2) {
            addCriterion("people_cleaning_number between", value1, value2, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleCleaningNumberNotBetween(String value1, String value2) {
            addCriterion("people_cleaning_number not between", value1, value2, "peopleCleaningNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberIsNull() {
            addCriterion("people_workers_number is null");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberIsNotNull() {
            addCriterion("people_workers_number is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberEqualTo(String value) {
            addCriterion("people_workers_number =", value, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberNotEqualTo(String value) {
            addCriterion("people_workers_number <>", value, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberGreaterThan(String value) {
            addCriterion("people_workers_number >", value, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberGreaterThanOrEqualTo(String value) {
            addCriterion("people_workers_number >=", value, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberLessThan(String value) {
            addCriterion("people_workers_number <", value, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberLessThanOrEqualTo(String value) {
            addCriterion("people_workers_number <=", value, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberLike(String value) {
            addCriterion("people_workers_number like", value, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberNotLike(String value) {
            addCriterion("people_workers_number not like", value, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberIn(List<String> values) {
            addCriterion("people_workers_number in", values, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberNotIn(List<String> values) {
            addCriterion("people_workers_number not in", values, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberBetween(String value1, String value2) {
            addCriterion("people_workers_number between", value1, value2, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleWorkersNumberNotBetween(String value1, String value2) {
            addCriterion("people_workers_number not between", value1, value2, "peopleWorkersNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberIsNull() {
            addCriterion("people_other_number is null");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberIsNotNull() {
            addCriterion("people_other_number is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberEqualTo(String value) {
            addCriterion("people_other_number =", value, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberNotEqualTo(String value) {
            addCriterion("people_other_number <>", value, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberGreaterThan(String value) {
            addCriterion("people_other_number >", value, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberGreaterThanOrEqualTo(String value) {
            addCriterion("people_other_number >=", value, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberLessThan(String value) {
            addCriterion("people_other_number <", value, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberLessThanOrEqualTo(String value) {
            addCriterion("people_other_number <=", value, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberLike(String value) {
            addCriterion("people_other_number like", value, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberNotLike(String value) {
            addCriterion("people_other_number not like", value, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberIn(List<String> values) {
            addCriterion("people_other_number in", values, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberNotIn(List<String> values) {
            addCriterion("people_other_number not in", values, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberBetween(String value1, String value2) {
            addCriterion("people_other_number between", value1, value2, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleOtherNumberNotBetween(String value1, String value2) {
            addCriterion("people_other_number not between", value1, value2, "peopleOtherNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneIsNull() {
            addCriterion("people_daytime_phone is null");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneIsNotNull() {
            addCriterion("people_daytime_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneEqualTo(String value) {
            addCriterion("people_daytime_phone =", value, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneNotEqualTo(String value) {
            addCriterion("people_daytime_phone <>", value, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneGreaterThan(String value) {
            addCriterion("people_daytime_phone >", value, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("people_daytime_phone >=", value, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneLessThan(String value) {
            addCriterion("people_daytime_phone <", value, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneLessThanOrEqualTo(String value) {
            addCriterion("people_daytime_phone <=", value, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneLike(String value) {
            addCriterion("people_daytime_phone like", value, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneNotLike(String value) {
            addCriterion("people_daytime_phone not like", value, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneIn(List<String> values) {
            addCriterion("people_daytime_phone in", values, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneNotIn(List<String> values) {
            addCriterion("people_daytime_phone not in", values, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneBetween(String value1, String value2) {
            addCriterion("people_daytime_phone between", value1, value2, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleDaytimePhoneNotBetween(String value1, String value2) {
            addCriterion("people_daytime_phone not between", value1, value2, "peopleDaytimePhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneIsNull() {
            addCriterion("people_night_phone is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneIsNotNull() {
            addCriterion("people_night_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneEqualTo(String value) {
            addCriterion("people_night_phone =", value, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneNotEqualTo(String value) {
            addCriterion("people_night_phone <>", value, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneGreaterThan(String value) {
            addCriterion("people_night_phone >", value, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("people_night_phone >=", value, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneLessThan(String value) {
            addCriterion("people_night_phone <", value, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneLessThanOrEqualTo(String value) {
            addCriterion("people_night_phone <=", value, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneLike(String value) {
            addCriterion("people_night_phone like", value, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneNotLike(String value) {
            addCriterion("people_night_phone not like", value, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneIn(List<String> values) {
            addCriterion("people_night_phone in", values, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneNotIn(List<String> values) {
            addCriterion("people_night_phone not in", values, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneBetween(String value1, String value2) {
            addCriterion("people_night_phone between", value1, value2, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleNightPhoneNotBetween(String value1, String value2) {
            addCriterion("people_night_phone not between", value1, value2, "peopleNightPhone");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardIsNull() {
            addCriterion("cost_fee_standard is null");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardIsNotNull() {
            addCriterion("cost_fee_standard is not null");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardEqualTo(String value) {
            addCriterion("cost_fee_standard =", value, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardNotEqualTo(String value) {
            addCriterion("cost_fee_standard <>", value, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardGreaterThan(String value) {
            addCriterion("cost_fee_standard >", value, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardGreaterThanOrEqualTo(String value) {
            addCriterion("cost_fee_standard >=", value, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardLessThan(String value) {
            addCriterion("cost_fee_standard <", value, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardLessThanOrEqualTo(String value) {
            addCriterion("cost_fee_standard <=", value, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardLike(String value) {
            addCriterion("cost_fee_standard like", value, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardNotLike(String value) {
            addCriterion("cost_fee_standard not like", value, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardIn(List<String> values) {
            addCriterion("cost_fee_standard in", values, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardNotIn(List<String> values) {
            addCriterion("cost_fee_standard not in", values, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardBetween(String value1, String value2) {
            addCriterion("cost_fee_standard between", value1, value2, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostFeeStandardNotBetween(String value1, String value2) {
            addCriterion("cost_fee_standard not between", value1, value2, "costFeeStandard");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentIsNull() {
            addCriterion("cost_services_content is null");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentIsNotNull() {
            addCriterion("cost_services_content is not null");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentEqualTo(String value) {
            addCriterion("cost_services_content =", value, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentNotEqualTo(String value) {
            addCriterion("cost_services_content <>", value, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentGreaterThan(String value) {
            addCriterion("cost_services_content >", value, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentGreaterThanOrEqualTo(String value) {
            addCriterion("cost_services_content >=", value, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentLessThan(String value) {
            addCriterion("cost_services_content <", value, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentLessThanOrEqualTo(String value) {
            addCriterion("cost_services_content <=", value, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentLike(String value) {
            addCriterion("cost_services_content like", value, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentNotLike(String value) {
            addCriterion("cost_services_content not like", value, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentIn(List<String> values) {
            addCriterion("cost_services_content in", values, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentNotIn(List<String> values) {
            addCriterion("cost_services_content not in", values, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentBetween(String value1, String value2) {
            addCriterion("cost_services_content between", value1, value2, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesContentNotBetween(String value1, String value2) {
            addCriterion("cost_services_content not between", value1, value2, "costServicesContent");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceIsNull() {
            addCriterion("cost_services_price is null");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceIsNotNull() {
            addCriterion("cost_services_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceEqualTo(String value) {
            addCriterion("cost_services_price =", value, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceNotEqualTo(String value) {
            addCriterion("cost_services_price <>", value, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceGreaterThan(String value) {
            addCriterion("cost_services_price >", value, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceGreaterThanOrEqualTo(String value) {
            addCriterion("cost_services_price >=", value, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceLessThan(String value) {
            addCriterion("cost_services_price <", value, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceLessThanOrEqualTo(String value) {
            addCriterion("cost_services_price <=", value, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceLike(String value) {
            addCriterion("cost_services_price like", value, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceNotLike(String value) {
            addCriterion("cost_services_price not like", value, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceIn(List<String> values) {
            addCriterion("cost_services_price in", values, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceNotIn(List<String> values) {
            addCriterion("cost_services_price not in", values, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceBetween(String value1, String value2) {
            addCriterion("cost_services_price between", value1, value2, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostServicesPriceNotBetween(String value1, String value2) {
            addCriterion("cost_services_price not between", value1, value2, "costServicesPrice");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardIsNull() {
            addCriterion("cost_provincial_standard is null");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardIsNotNull() {
            addCriterion("cost_provincial_standard is not null");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardEqualTo(String value) {
            addCriterion("cost_provincial_standard =", value, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardNotEqualTo(String value) {
            addCriterion("cost_provincial_standard <>", value, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardGreaterThan(String value) {
            addCriterion("cost_provincial_standard >", value, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardGreaterThanOrEqualTo(String value) {
            addCriterion("cost_provincial_standard >=", value, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardLessThan(String value) {
            addCriterion("cost_provincial_standard <", value, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardLessThanOrEqualTo(String value) {
            addCriterion("cost_provincial_standard <=", value, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardLike(String value) {
            addCriterion("cost_provincial_standard like", value, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardNotLike(String value) {
            addCriterion("cost_provincial_standard not like", value, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardIn(List<String> values) {
            addCriterion("cost_provincial_standard in", values, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardNotIn(List<String> values) {
            addCriterion("cost_provincial_standard not in", values, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardBetween(String value1, String value2) {
            addCriterion("cost_provincial_standard between", value1, value2, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostProvincialStandardNotBetween(String value1, String value2) {
            addCriterion("cost_provincial_standard not between", value1, value2, "costProvincialStandard");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalIsNull() {
            addCriterion("cost_current_municipal is null");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalIsNotNull() {
            addCriterion("cost_current_municipal is not null");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalEqualTo(String value) {
            addCriterion("cost_current_municipal =", value, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalNotEqualTo(String value) {
            addCriterion("cost_current_municipal <>", value, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalGreaterThan(String value) {
            addCriterion("cost_current_municipal >", value, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalGreaterThanOrEqualTo(String value) {
            addCriterion("cost_current_municipal >=", value, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalLessThan(String value) {
            addCriterion("cost_current_municipal <", value, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalLessThanOrEqualTo(String value) {
            addCriterion("cost_current_municipal <=", value, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalLike(String value) {
            addCriterion("cost_current_municipal like", value, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalNotLike(String value) {
            addCriterion("cost_current_municipal not like", value, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalIn(List<String> values) {
            addCriterion("cost_current_municipal in", values, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalNotIn(List<String> values) {
            addCriterion("cost_current_municipal not in", values, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalBetween(String value1, String value2) {
            addCriterion("cost_current_municipal between", value1, value2, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andCostCurrentMunicipalNotBetween(String value1, String value2) {
            addCriterion("cost_current_municipal not between", value1, value2, "costCurrentMunicipal");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaIsNull() {
            addCriterion("serve_room_area is null");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaIsNotNull() {
            addCriterion("serve_room_area is not null");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaEqualTo(String value) {
            addCriterion("serve_room_area =", value, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaNotEqualTo(String value) {
            addCriterion("serve_room_area <>", value, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaGreaterThan(String value) {
            addCriterion("serve_room_area >", value, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaGreaterThanOrEqualTo(String value) {
            addCriterion("serve_room_area >=", value, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaLessThan(String value) {
            addCriterion("serve_room_area <", value, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaLessThanOrEqualTo(String value) {
            addCriterion("serve_room_area <=", value, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaLike(String value) {
            addCriterion("serve_room_area like", value, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaNotLike(String value) {
            addCriterion("serve_room_area not like", value, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaIn(List<String> values) {
            addCriterion("serve_room_area in", values, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaNotIn(List<String> values) {
            addCriterion("serve_room_area not in", values, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaBetween(String value1, String value2) {
            addCriterion("serve_room_area between", value1, value2, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeRoomAreaNotBetween(String value1, String value2) {
            addCriterion("serve_room_area not between", value1, value2, "serveRoomArea");
            return (Criteria) this;
        }

        public Criteria andServeIshaveIsNull() {
            addCriterion("serve_isHave is null");
            return (Criteria) this;
        }

        public Criteria andServeIshaveIsNotNull() {
            addCriterion("serve_isHave is not null");
            return (Criteria) this;
        }

        public Criteria andServeIshaveEqualTo(String value) {
            addCriterion("serve_isHave =", value, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveNotEqualTo(String value) {
            addCriterion("serve_isHave <>", value, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveGreaterThan(String value) {
            addCriterion("serve_isHave >", value, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveGreaterThanOrEqualTo(String value) {
            addCriterion("serve_isHave >=", value, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveLessThan(String value) {
            addCriterion("serve_isHave <", value, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveLessThanOrEqualTo(String value) {
            addCriterion("serve_isHave <=", value, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveLike(String value) {
            addCriterion("serve_isHave like", value, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveNotLike(String value) {
            addCriterion("serve_isHave not like", value, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveIn(List<String> values) {
            addCriterion("serve_isHave in", values, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveNotIn(List<String> values) {
            addCriterion("serve_isHave not in", values, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveBetween(String value1, String value2) {
            addCriterion("serve_isHave between", value1, value2, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andServeIshaveNotBetween(String value1, String value2) {
            addCriterion("serve_isHave not between", value1, value2, "serveIshave");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberIsNull() {
            addCriterion("park_ground_number is null");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberIsNotNull() {
            addCriterion("park_ground_number is not null");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberEqualTo(String value) {
            addCriterion("park_ground_number =", value, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberNotEqualTo(String value) {
            addCriterion("park_ground_number <>", value, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberGreaterThan(String value) {
            addCriterion("park_ground_number >", value, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberGreaterThanOrEqualTo(String value) {
            addCriterion("park_ground_number >=", value, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberLessThan(String value) {
            addCriterion("park_ground_number <", value, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberLessThanOrEqualTo(String value) {
            addCriterion("park_ground_number <=", value, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberLike(String value) {
            addCriterion("park_ground_number like", value, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberNotLike(String value) {
            addCriterion("park_ground_number not like", value, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberIn(List<String> values) {
            addCriterion("park_ground_number in", values, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberNotIn(List<String> values) {
            addCriterion("park_ground_number not in", values, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberBetween(String value1, String value2) {
            addCriterion("park_ground_number between", value1, value2, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkGroundNumberNotBetween(String value1, String value2) {
            addCriterion("park_ground_number not between", value1, value2, "parkGroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberIsNull() {
            addCriterion("park_underground_number is null");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberIsNotNull() {
            addCriterion("park_underground_number is not null");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberEqualTo(String value) {
            addCriterion("park_underground_number =", value, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberNotEqualTo(String value) {
            addCriterion("park_underground_number <>", value, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberGreaterThan(String value) {
            addCriterion("park_underground_number >", value, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberGreaterThanOrEqualTo(String value) {
            addCriterion("park_underground_number >=", value, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberLessThan(String value) {
            addCriterion("park_underground_number <", value, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberLessThanOrEqualTo(String value) {
            addCriterion("park_underground_number <=", value, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberLike(String value) {
            addCriterion("park_underground_number like", value, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberNotLike(String value) {
            addCriterion("park_underground_number not like", value, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberIn(List<String> values) {
            addCriterion("park_underground_number in", values, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberNotIn(List<String> values) {
            addCriterion("park_underground_number not in", values, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberBetween(String value1, String value2) {
            addCriterion("park_underground_number between", value1, value2, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkUndergroundNumberNotBetween(String value1, String value2) {
            addCriterion("park_underground_number not between", value1, value2, "parkUndergroundNumber");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingIsNull() {
            addCriterion("park_defense_parking is null");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingIsNotNull() {
            addCriterion("park_defense_parking is not null");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingEqualTo(String value) {
            addCriterion("park_defense_parking =", value, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingNotEqualTo(String value) {
            addCriterion("park_defense_parking <>", value, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingGreaterThan(String value) {
            addCriterion("park_defense_parking >", value, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingGreaterThanOrEqualTo(String value) {
            addCriterion("park_defense_parking >=", value, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingLessThan(String value) {
            addCriterion("park_defense_parking <", value, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingLessThanOrEqualTo(String value) {
            addCriterion("park_defense_parking <=", value, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingLike(String value) {
            addCriterion("park_defense_parking like", value, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingNotLike(String value) {
            addCriterion("park_defense_parking not like", value, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingIn(List<String> values) {
            addCriterion("park_defense_parking in", values, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingNotIn(List<String> values) {
            addCriterion("park_defense_parking not in", values, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingBetween(String value1, String value2) {
            addCriterion("park_defense_parking between", value1, value2, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andParkDefenseParkingNotBetween(String value1, String value2) {
            addCriterion("park_defense_parking not between", value1, value2, "parkDefenseParking");
            return (Criteria) this;
        }

        public Criteria andPreIstwoIsNull() {
            addCriterion("pre_isTwo is null");
            return (Criteria) this;
        }

        public Criteria andPreIstwoIsNotNull() {
            addCriterion("pre_isTwo is not null");
            return (Criteria) this;
        }

        public Criteria andPreIstwoEqualTo(String value) {
            addCriterion("pre_isTwo =", value, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoNotEqualTo(String value) {
            addCriterion("pre_isTwo <>", value, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoGreaterThan(String value) {
            addCriterion("pre_isTwo >", value, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoGreaterThanOrEqualTo(String value) {
            addCriterion("pre_isTwo >=", value, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoLessThan(String value) {
            addCriterion("pre_isTwo <", value, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoLessThanOrEqualTo(String value) {
            addCriterion("pre_isTwo <=", value, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoLike(String value) {
            addCriterion("pre_isTwo like", value, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoNotLike(String value) {
            addCriterion("pre_isTwo not like", value, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoIn(List<String> values) {
            addCriterion("pre_isTwo in", values, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoNotIn(List<String> values) {
            addCriterion("pre_isTwo not in", values, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoBetween(String value1, String value2) {
            addCriterion("pre_isTwo between", value1, value2, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreIstwoNotBetween(String value1, String value2) {
            addCriterion("pre_isTwo not between", value1, value2, "preIstwo");
            return (Criteria) this;
        }

        public Criteria andPreActualYearIsNull() {
            addCriterion("pre_actual_year is null");
            return (Criteria) this;
        }

        public Criteria andPreActualYearIsNotNull() {
            addCriterion("pre_actual_year is not null");
            return (Criteria) this;
        }

        public Criteria andPreActualYearEqualTo(String value) {
            addCriterion("pre_actual_year =", value, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearNotEqualTo(String value) {
            addCriterion("pre_actual_year <>", value, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearGreaterThan(String value) {
            addCriterion("pre_actual_year >", value, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearGreaterThanOrEqualTo(String value) {
            addCriterion("pre_actual_year >=", value, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearLessThan(String value) {
            addCriterion("pre_actual_year <", value, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearLessThanOrEqualTo(String value) {
            addCriterion("pre_actual_year <=", value, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearLike(String value) {
            addCriterion("pre_actual_year like", value, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearNotLike(String value) {
            addCriterion("pre_actual_year not like", value, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearIn(List<String> values) {
            addCriterion("pre_actual_year in", values, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearNotIn(List<String> values) {
            addCriterion("pre_actual_year not in", values, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearBetween(String value1, String value2) {
            addCriterion("pre_actual_year between", value1, value2, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreActualYearNotBetween(String value1, String value2) {
            addCriterion("pre_actual_year not between", value1, value2, "preActualYear");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeIsNull() {
            addCriterion("pre_service_type is null");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeIsNotNull() {
            addCriterion("pre_service_type is not null");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeEqualTo(String value) {
            addCriterion("pre_service_type =", value, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeNotEqualTo(String value) {
            addCriterion("pre_service_type <>", value, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeGreaterThan(String value) {
            addCriterion("pre_service_type >", value, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pre_service_type >=", value, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeLessThan(String value) {
            addCriterion("pre_service_type <", value, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("pre_service_type <=", value, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeLike(String value) {
            addCriterion("pre_service_type like", value, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeNotLike(String value) {
            addCriterion("pre_service_type not like", value, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeIn(List<String> values) {
            addCriterion("pre_service_type in", values, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeNotIn(List<String> values) {
            addCriterion("pre_service_type not in", values, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeBetween(String value1, String value2) {
            addCriterion("pre_service_type between", value1, value2, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPreServiceTypeNotBetween(String value1, String value2) {
            addCriterion("pre_service_type not between", value1, value2, "preServiceType");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberIsNull() {
            addCriterion("pub_elevators_number is null");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberIsNotNull() {
            addCriterion("pub_elevators_number is not null");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberEqualTo(String value) {
            addCriterion("pub_elevators_number =", value, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberNotEqualTo(String value) {
            addCriterion("pub_elevators_number <>", value, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberGreaterThan(String value) {
            addCriterion("pub_elevators_number >", value, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pub_elevators_number >=", value, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberLessThan(String value) {
            addCriterion("pub_elevators_number <", value, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberLessThanOrEqualTo(String value) {
            addCriterion("pub_elevators_number <=", value, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberLike(String value) {
            addCriterion("pub_elevators_number like", value, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberNotLike(String value) {
            addCriterion("pub_elevators_number not like", value, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberIn(List<String> values) {
            addCriterion("pub_elevators_number in", values, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberNotIn(List<String> values) {
            addCriterion("pub_elevators_number not in", values, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberBetween(String value1, String value2) {
            addCriterion("pub_elevators_number between", value1, value2, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubElevatorsNumberNotBetween(String value1, String value2) {
            addCriterion("pub_elevators_number not between", value1, value2, "pubElevatorsNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberIsNull() {
            addCriterion("pub_monitoring_number is null");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberIsNotNull() {
            addCriterion("pub_monitoring_number is not null");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberEqualTo(String value) {
            addCriterion("pub_monitoring_number =", value, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberNotEqualTo(String value) {
            addCriterion("pub_monitoring_number <>", value, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberGreaterThan(String value) {
            addCriterion("pub_monitoring_number >", value, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pub_monitoring_number >=", value, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberLessThan(String value) {
            addCriterion("pub_monitoring_number <", value, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberLessThanOrEqualTo(String value) {
            addCriterion("pub_monitoring_number <=", value, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberLike(String value) {
            addCriterion("pub_monitoring_number like", value, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberNotLike(String value) {
            addCriterion("pub_monitoring_number not like", value, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberIn(List<String> values) {
            addCriterion("pub_monitoring_number in", values, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberNotIn(List<String> values) {
            addCriterion("pub_monitoring_number not in", values, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberBetween(String value1, String value2) {
            addCriterion("pub_monitoring_number between", value1, value2, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubMonitoringNumberNotBetween(String value1, String value2) {
            addCriterion("pub_monitoring_number not between", value1, value2, "pubMonitoringNumber");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleIsNull() {
            addCriterion("pub_wheelchair_accessible is null");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleIsNotNull() {
            addCriterion("pub_wheelchair_accessible is not null");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleEqualTo(String value) {
            addCriterion("pub_wheelchair_accessible =", value, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleNotEqualTo(String value) {
            addCriterion("pub_wheelchair_accessible <>", value, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleGreaterThan(String value) {
            addCriterion("pub_wheelchair_accessible >", value, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleGreaterThanOrEqualTo(String value) {
            addCriterion("pub_wheelchair_accessible >=", value, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleLessThan(String value) {
            addCriterion("pub_wheelchair_accessible <", value, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleLessThanOrEqualTo(String value) {
            addCriterion("pub_wheelchair_accessible <=", value, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleLike(String value) {
            addCriterion("pub_wheelchair_accessible like", value, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleNotLike(String value) {
            addCriterion("pub_wheelchair_accessible not like", value, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleIn(List<String> values) {
            addCriterion("pub_wheelchair_accessible in", values, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleNotIn(List<String> values) {
            addCriterion("pub_wheelchair_accessible not in", values, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleBetween(String value1, String value2) {
            addCriterion("pub_wheelchair_accessible between", value1, value2, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubWheelchairAccessibleNotBetween(String value1, String value2) {
            addCriterion("pub_wheelchair_accessible not between", value1, value2, "pubWheelchairAccessible");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentIsNull() {
            addCriterion("pub_other_equipment is null");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentIsNotNull() {
            addCriterion("pub_other_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentEqualTo(String value) {
            addCriterion("pub_other_equipment =", value, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentNotEqualTo(String value) {
            addCriterion("pub_other_equipment <>", value, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentGreaterThan(String value) {
            addCriterion("pub_other_equipment >", value, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("pub_other_equipment >=", value, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentLessThan(String value) {
            addCriterion("pub_other_equipment <", value, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentLessThanOrEqualTo(String value) {
            addCriterion("pub_other_equipment <=", value, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentLike(String value) {
            addCriterion("pub_other_equipment like", value, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentNotLike(String value) {
            addCriterion("pub_other_equipment not like", value, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentIn(List<String> values) {
            addCriterion("pub_other_equipment in", values, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentNotIn(List<String> values) {
            addCriterion("pub_other_equipment not in", values, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentBetween(String value1, String value2) {
            addCriterion("pub_other_equipment between", value1, value2, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubOtherEquipmentNotBetween(String value1, String value2) {
            addCriterion("pub_other_equipment not between", value1, value2, "pubOtherEquipment");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberIsNull() {
            addCriterion("pub_water_number is null");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberIsNotNull() {
            addCriterion("pub_water_number is not null");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberEqualTo(String value) {
            addCriterion("pub_water_number =", value, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberNotEqualTo(String value) {
            addCriterion("pub_water_number <>", value, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberGreaterThan(String value) {
            addCriterion("pub_water_number >", value, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pub_water_number >=", value, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberLessThan(String value) {
            addCriterion("pub_water_number <", value, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberLessThanOrEqualTo(String value) {
            addCriterion("pub_water_number <=", value, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberLike(String value) {
            addCriterion("pub_water_number like", value, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberNotLike(String value) {
            addCriterion("pub_water_number not like", value, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberIn(List<String> values) {
            addCriterion("pub_water_number in", values, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberNotIn(List<String> values) {
            addCriterion("pub_water_number not in", values, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberBetween(String value1, String value2) {
            addCriterion("pub_water_number between", value1, value2, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubWaterNumberNotBetween(String value1, String value2) {
            addCriterion("pub_water_number not between", value1, value2, "pubWaterNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberIsNull() {
            addCriterion("pub_reservoirs_number is null");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberIsNotNull() {
            addCriterion("pub_reservoirs_number is not null");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberEqualTo(String value) {
            addCriterion("pub_reservoirs_number =", value, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberNotEqualTo(String value) {
            addCriterion("pub_reservoirs_number <>", value, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberGreaterThan(String value) {
            addCriterion("pub_reservoirs_number >", value, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pub_reservoirs_number >=", value, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberLessThan(String value) {
            addCriterion("pub_reservoirs_number <", value, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberLessThanOrEqualTo(String value) {
            addCriterion("pub_reservoirs_number <=", value, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberLike(String value) {
            addCriterion("pub_reservoirs_number like", value, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberNotLike(String value) {
            addCriterion("pub_reservoirs_number not like", value, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberIn(List<String> values) {
            addCriterion("pub_reservoirs_number in", values, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberNotIn(List<String> values) {
            addCriterion("pub_reservoirs_number not in", values, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberBetween(String value1, String value2) {
            addCriterion("pub_reservoirs_number between", value1, value2, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubReservoirsNumberNotBetween(String value1, String value2) {
            addCriterion("pub_reservoirs_number not between", value1, value2, "pubReservoirsNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberIsNull() {
            addCriterion("pub_fire_number is null");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberIsNotNull() {
            addCriterion("pub_fire_number is not null");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberEqualTo(String value) {
            addCriterion("pub_fire_number =", value, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberNotEqualTo(String value) {
            addCriterion("pub_fire_number <>", value, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberGreaterThan(String value) {
            addCriterion("pub_fire_number >", value, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pub_fire_number >=", value, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberLessThan(String value) {
            addCriterion("pub_fire_number <", value, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberLessThanOrEqualTo(String value) {
            addCriterion("pub_fire_number <=", value, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberLike(String value) {
            addCriterion("pub_fire_number like", value, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberNotLike(String value) {
            addCriterion("pub_fire_number not like", value, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberIn(List<String> values) {
            addCriterion("pub_fire_number in", values, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberNotIn(List<String> values) {
            addCriterion("pub_fire_number not in", values, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberBetween(String value1, String value2) {
            addCriterion("pub_fire_number between", value1, value2, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubFireNumberNotBetween(String value1, String value2) {
            addCriterion("pub_fire_number not between", value1, value2, "pubFireNumber");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaIsNull() {
            addCriterion("pub_afforested_area is null");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaIsNotNull() {
            addCriterion("pub_afforested_area is not null");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaEqualTo(String value) {
            addCriterion("pub_afforested_area =", value, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaNotEqualTo(String value) {
            addCriterion("pub_afforested_area <>", value, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaGreaterThan(String value) {
            addCriterion("pub_afforested_area >", value, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaGreaterThanOrEqualTo(String value) {
            addCriterion("pub_afforested_area >=", value, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaLessThan(String value) {
            addCriterion("pub_afforested_area <", value, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaLessThanOrEqualTo(String value) {
            addCriterion("pub_afforested_area <=", value, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaLike(String value) {
            addCriterion("pub_afforested_area like", value, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaNotLike(String value) {
            addCriterion("pub_afforested_area not like", value, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaIn(List<String> values) {
            addCriterion("pub_afforested_area in", values, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaNotIn(List<String> values) {
            addCriterion("pub_afforested_area not in", values, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaBetween(String value1, String value2) {
            addCriterion("pub_afforested_area between", value1, value2, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubAfforestedAreaNotBetween(String value1, String value2) {
            addCriterion("pub_afforested_area not between", value1, value2, "pubAfforestedArea");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberIsNull() {
            addCriterion("pub_life_number is null");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberIsNotNull() {
            addCriterion("pub_life_number is not null");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberEqualTo(String value) {
            addCriterion("pub_life_number =", value, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberNotEqualTo(String value) {
            addCriterion("pub_life_number <>", value, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberGreaterThan(String value) {
            addCriterion("pub_life_number >", value, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pub_life_number >=", value, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberLessThan(String value) {
            addCriterion("pub_life_number <", value, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberLessThanOrEqualTo(String value) {
            addCriterion("pub_life_number <=", value, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberLike(String value) {
            addCriterion("pub_life_number like", value, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberNotLike(String value) {
            addCriterion("pub_life_number not like", value, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberIn(List<String> values) {
            addCriterion("pub_life_number in", values, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberNotIn(List<String> values) {
            addCriterion("pub_life_number not in", values, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberBetween(String value1, String value2) {
            addCriterion("pub_life_number between", value1, value2, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubLifeNumberNotBetween(String value1, String value2) {
            addCriterion("pub_life_number not between", value1, value2, "pubLifeNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberIsNull() {
            addCriterion("pub_hydrants_number is null");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberIsNotNull() {
            addCriterion("pub_hydrants_number is not null");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberEqualTo(String value) {
            addCriterion("pub_hydrants_number =", value, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberNotEqualTo(String value) {
            addCriterion("pub_hydrants_number <>", value, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberGreaterThan(String value) {
            addCriterion("pub_hydrants_number >", value, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pub_hydrants_number >=", value, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberLessThan(String value) {
            addCriterion("pub_hydrants_number <", value, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberLessThanOrEqualTo(String value) {
            addCriterion("pub_hydrants_number <=", value, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberLike(String value) {
            addCriterion("pub_hydrants_number like", value, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberNotLike(String value) {
            addCriterion("pub_hydrants_number not like", value, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberIn(List<String> values) {
            addCriterion("pub_hydrants_number in", values, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberNotIn(List<String> values) {
            addCriterion("pub_hydrants_number not in", values, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberBetween(String value1, String value2) {
            addCriterion("pub_hydrants_number between", value1, value2, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubHydrantsNumberNotBetween(String value1, String value2) {
            addCriterion("pub_hydrants_number not between", value1, value2, "pubHydrantsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberIsNull() {
            addCriterion("pub_exits_number is null");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberIsNotNull() {
            addCriterion("pub_exits_number is not null");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberEqualTo(String value) {
            addCriterion("pub_exits_number =", value, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberNotEqualTo(String value) {
            addCriterion("pub_exits_number <>", value, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberGreaterThan(String value) {
            addCriterion("pub_exits_number >", value, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pub_exits_number >=", value, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberLessThan(String value) {
            addCriterion("pub_exits_number <", value, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberLessThanOrEqualTo(String value) {
            addCriterion("pub_exits_number <=", value, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberLike(String value) {
            addCriterion("pub_exits_number like", value, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberNotLike(String value) {
            addCriterion("pub_exits_number not like", value, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberIn(List<String> values) {
            addCriterion("pub_exits_number in", values, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberNotIn(List<String> values) {
            addCriterion("pub_exits_number not in", values, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberBetween(String value1, String value2) {
            addCriterion("pub_exits_number between", value1, value2, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andPubExitsNumberNotBetween(String value1, String value2) {
            addCriterion("pub_exits_number not between", value1, value2, "pubExitsNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveIsNull() {
            addCriterion("committee_isHave is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveIsNotNull() {
            addCriterion("committee_isHave is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveEqualTo(String value) {
            addCriterion("committee_isHave =", value, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveNotEqualTo(String value) {
            addCriterion("committee_isHave <>", value, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveGreaterThan(String value) {
            addCriterion("committee_isHave >", value, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveGreaterThanOrEqualTo(String value) {
            addCriterion("committee_isHave >=", value, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveLessThan(String value) {
            addCriterion("committee_isHave <", value, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveLessThanOrEqualTo(String value) {
            addCriterion("committee_isHave <=", value, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveLike(String value) {
            addCriterion("committee_isHave like", value, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveNotLike(String value) {
            addCriterion("committee_isHave not like", value, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveIn(List<String> values) {
            addCriterion("committee_isHave in", values, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveNotIn(List<String> values) {
            addCriterion("committee_isHave not in", values, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveBetween(String value1, String value2) {
            addCriterion("committee_isHave between", value1, value2, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeIshaveNotBetween(String value1, String value2) {
            addCriterion("committee_isHave not between", value1, value2, "committeeIshave");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanIsNull() {
            addCriterion("committee_chairman is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanIsNotNull() {
            addCriterion("committee_chairman is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanEqualTo(String value) {
            addCriterion("committee_chairman =", value, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanNotEqualTo(String value) {
            addCriterion("committee_chairman <>", value, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanGreaterThan(String value) {
            addCriterion("committee_chairman >", value, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanGreaterThanOrEqualTo(String value) {
            addCriterion("committee_chairman >=", value, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanLessThan(String value) {
            addCriterion("committee_chairman <", value, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanLessThanOrEqualTo(String value) {
            addCriterion("committee_chairman <=", value, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanLike(String value) {
            addCriterion("committee_chairman like", value, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanNotLike(String value) {
            addCriterion("committee_chairman not like", value, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanIn(List<String> values) {
            addCriterion("committee_chairman in", values, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanNotIn(List<String> values) {
            addCriterion("committee_chairman not in", values, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanBetween(String value1, String value2) {
            addCriterion("committee_chairman between", value1, value2, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanNotBetween(String value1, String value2) {
            addCriterion("committee_chairman not between", value1, value2, "committeeChairman");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneIsNull() {
            addCriterion("committee_chairman_phone is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneIsNotNull() {
            addCriterion("committee_chairman_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneEqualTo(String value) {
            addCriterion("committee_chairman_phone =", value, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneNotEqualTo(String value) {
            addCriterion("committee_chairman_phone <>", value, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneGreaterThan(String value) {
            addCriterion("committee_chairman_phone >", value, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("committee_chairman_phone >=", value, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneLessThan(String value) {
            addCriterion("committee_chairman_phone <", value, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneLessThanOrEqualTo(String value) {
            addCriterion("committee_chairman_phone <=", value, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneLike(String value) {
            addCriterion("committee_chairman_phone like", value, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneNotLike(String value) {
            addCriterion("committee_chairman_phone not like", value, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneIn(List<String> values) {
            addCriterion("committee_chairman_phone in", values, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneNotIn(List<String> values) {
            addCriterion("committee_chairman_phone not in", values, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneBetween(String value1, String value2) {
            addCriterion("committee_chairman_phone between", value1, value2, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeChairmanPhoneNotBetween(String value1, String value2) {
            addCriterion("committee_chairman_phone not between", value1, value2, "committeeChairmanPhone");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionIsNull() {
            addCriterion("committee_which_session is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionIsNotNull() {
            addCriterion("committee_which_session is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionEqualTo(String value) {
            addCriterion("committee_which_session =", value, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionNotEqualTo(String value) {
            addCriterion("committee_which_session <>", value, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionGreaterThan(String value) {
            addCriterion("committee_which_session >", value, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionGreaterThanOrEqualTo(String value) {
            addCriterion("committee_which_session >=", value, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionLessThan(String value) {
            addCriterion("committee_which_session <", value, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionLessThanOrEqualTo(String value) {
            addCriterion("committee_which_session <=", value, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionLike(String value) {
            addCriterion("committee_which_session like", value, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionNotLike(String value) {
            addCriterion("committee_which_session not like", value, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionIn(List<String> values) {
            addCriterion("committee_which_session in", values, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionNotIn(List<String> values) {
            addCriterion("committee_which_session not in", values, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionBetween(String value1, String value2) {
            addCriterion("committee_which_session between", value1, value2, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeWhichSessionNotBetween(String value1, String value2) {
            addCriterion("committee_which_session not between", value1, value2, "committeeWhichSession");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateIsNull() {
            addCriterion("committee_establishment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateIsNotNull() {
            addCriterion("committee_establishment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateEqualTo(String value) {
            addCriterion("committee_establishment_date =", value, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateNotEqualTo(String value) {
            addCriterion("committee_establishment_date <>", value, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateGreaterThan(String value) {
            addCriterion("committee_establishment_date >", value, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateGreaterThanOrEqualTo(String value) {
            addCriterion("committee_establishment_date >=", value, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateLessThan(String value) {
            addCriterion("committee_establishment_date <", value, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateLessThanOrEqualTo(String value) {
            addCriterion("committee_establishment_date <=", value, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateLike(String value) {
            addCriterion("committee_establishment_date like", value, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateNotLike(String value) {
            addCriterion("committee_establishment_date not like", value, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateIn(List<String> values) {
            addCriterion("committee_establishment_date in", values, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateNotIn(List<String> values) {
            addCriterion("committee_establishment_date not in", values, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateBetween(String value1, String value2) {
            addCriterion("committee_establishment_date between", value1, value2, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeEstablishmentDateNotBetween(String value1, String value2) {
            addCriterion("committee_establishment_date not between", value1, value2, "committeeEstablishmentDate");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeIsNull() {
            addCriterion("committee_change_time is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeIsNotNull() {
            addCriterion("committee_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeEqualTo(String value) {
            addCriterion("committee_change_time =", value, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeNotEqualTo(String value) {
            addCriterion("committee_change_time <>", value, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeGreaterThan(String value) {
            addCriterion("committee_change_time >", value, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("committee_change_time >=", value, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeLessThan(String value) {
            addCriterion("committee_change_time <", value, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeLessThanOrEqualTo(String value) {
            addCriterion("committee_change_time <=", value, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeLike(String value) {
            addCriterion("committee_change_time like", value, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeNotLike(String value) {
            addCriterion("committee_change_time not like", value, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeIn(List<String> values) {
            addCriterion("committee_change_time in", values, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeNotIn(List<String> values) {
            addCriterion("committee_change_time not in", values, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeBetween(String value1, String value2) {
            addCriterion("committee_change_time between", value1, value2, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeChangeTimeNotBetween(String value1, String value2) {
            addCriterion("committee_change_time not between", value1, value2, "committeeChangeTime");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberIsNull() {
            addCriterion("committee_members_number is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberIsNotNull() {
            addCriterion("committee_members_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberEqualTo(String value) {
            addCriterion("committee_members_number =", value, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberNotEqualTo(String value) {
            addCriterion("committee_members_number <>", value, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberGreaterThan(String value) {
            addCriterion("committee_members_number >", value, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberGreaterThanOrEqualTo(String value) {
            addCriterion("committee_members_number >=", value, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberLessThan(String value) {
            addCriterion("committee_members_number <", value, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberLessThanOrEqualTo(String value) {
            addCriterion("committee_members_number <=", value, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberLike(String value) {
            addCriterion("committee_members_number like", value, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberNotLike(String value) {
            addCriterion("committee_members_number not like", value, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberIn(List<String> values) {
            addCriterion("committee_members_number in", values, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberNotIn(List<String> values) {
            addCriterion("committee_members_number not in", values, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberBetween(String value1, String value2) {
            addCriterion("committee_members_number between", value1, value2, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeMembersNumberNotBetween(String value1, String value2) {
            addCriterion("committee_members_number not between", value1, value2, "committeeMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberIsNull() {
            addCriterion("committee_party_number is null");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberIsNotNull() {
            addCriterion("committee_party_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberEqualTo(String value) {
            addCriterion("committee_party_number =", value, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberNotEqualTo(String value) {
            addCriterion("committee_party_number <>", value, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberGreaterThan(String value) {
            addCriterion("committee_party_number >", value, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("committee_party_number >=", value, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberLessThan(String value) {
            addCriterion("committee_party_number <", value, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberLessThanOrEqualTo(String value) {
            addCriterion("committee_party_number <=", value, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberLike(String value) {
            addCriterion("committee_party_number like", value, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberNotLike(String value) {
            addCriterion("committee_party_number not like", value, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberIn(List<String> values) {
            addCriterion("committee_party_number in", values, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberNotIn(List<String> values) {
            addCriterion("committee_party_number not in", values, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberBetween(String value1, String value2) {
            addCriterion("committee_party_number between", value1, value2, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteePartyNumberNotBetween(String value1, String value2) {
            addCriterion("committee_party_number not between", value1, value2, "committeePartyNumber");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyIsNull() {
            addCriterion("committee_isAgency is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyIsNotNull() {
            addCriterion("committee_isAgency is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyEqualTo(String value) {
            addCriterion("committee_isAgency =", value, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyNotEqualTo(String value) {
            addCriterion("committee_isAgency <>", value, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyGreaterThan(String value) {
            addCriterion("committee_isAgency >", value, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyGreaterThanOrEqualTo(String value) {
            addCriterion("committee_isAgency >=", value, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyLessThan(String value) {
            addCriterion("committee_isAgency <", value, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyLessThanOrEqualTo(String value) {
            addCriterion("committee_isAgency <=", value, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyLike(String value) {
            addCriterion("committee_isAgency like", value, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyNotLike(String value) {
            addCriterion("committee_isAgency not like", value, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyIn(List<String> values) {
            addCriterion("committee_isAgency in", values, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyNotIn(List<String> values) {
            addCriterion("committee_isAgency not in", values, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyBetween(String value1, String value2) {
            addCriterion("committee_isAgency between", value1, value2, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andCommitteeIsagencyNotBetween(String value1, String value2) {
            addCriterion("committee_isAgency not between", value1, value2, "committeeIsagency");
            return (Criteria) this;
        }

        public Criteria andFundIshaveIsNull() {
            addCriterion("fund_isHave is null");
            return (Criteria) this;
        }

        public Criteria andFundIshaveIsNotNull() {
            addCriterion("fund_isHave is not null");
            return (Criteria) this;
        }

        public Criteria andFundIshaveEqualTo(String value) {
            addCriterion("fund_isHave =", value, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveNotEqualTo(String value) {
            addCriterion("fund_isHave <>", value, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveGreaterThan(String value) {
            addCriterion("fund_isHave >", value, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveGreaterThanOrEqualTo(String value) {
            addCriterion("fund_isHave >=", value, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveLessThan(String value) {
            addCriterion("fund_isHave <", value, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveLessThanOrEqualTo(String value) {
            addCriterion("fund_isHave <=", value, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveLike(String value) {
            addCriterion("fund_isHave like", value, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveNotLike(String value) {
            addCriterion("fund_isHave not like", value, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveIn(List<String> values) {
            addCriterion("fund_isHave in", values, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveNotIn(List<String> values) {
            addCriterion("fund_isHave not in", values, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveBetween(String value1, String value2) {
            addCriterion("fund_isHave between", value1, value2, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundIshaveNotBetween(String value1, String value2) {
            addCriterion("fund_isHave not between", value1, value2, "fundIshave");
            return (Criteria) this;
        }

        public Criteria andFundTotalIsNull() {
            addCriterion("fund_total is null");
            return (Criteria) this;
        }

        public Criteria andFundTotalIsNotNull() {
            addCriterion("fund_total is not null");
            return (Criteria) this;
        }

        public Criteria andFundTotalEqualTo(String value) {
            addCriterion("fund_total =", value, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalNotEqualTo(String value) {
            addCriterion("fund_total <>", value, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalGreaterThan(String value) {
            addCriterion("fund_total >", value, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalGreaterThanOrEqualTo(String value) {
            addCriterion("fund_total >=", value, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalLessThan(String value) {
            addCriterion("fund_total <", value, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalLessThanOrEqualTo(String value) {
            addCriterion("fund_total <=", value, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalLike(String value) {
            addCriterion("fund_total like", value, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalNotLike(String value) {
            addCriterion("fund_total not like", value, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalIn(List<String> values) {
            addCriterion("fund_total in", values, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalNotIn(List<String> values) {
            addCriterion("fund_total not in", values, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalBetween(String value1, String value2) {
            addCriterion("fund_total between", value1, value2, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundTotalNotBetween(String value1, String value2) {
            addCriterion("fund_total not between", value1, value2, "fundTotal");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedIsNull() {
            addCriterion("fund_amount_disbursed is null");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedIsNotNull() {
            addCriterion("fund_amount_disbursed is not null");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedEqualTo(String value) {
            addCriterion("fund_amount_disbursed =", value, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedNotEqualTo(String value) {
            addCriterion("fund_amount_disbursed <>", value, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedGreaterThan(String value) {
            addCriterion("fund_amount_disbursed >", value, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedGreaterThanOrEqualTo(String value) {
            addCriterion("fund_amount_disbursed >=", value, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedLessThan(String value) {
            addCriterion("fund_amount_disbursed <", value, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedLessThanOrEqualTo(String value) {
            addCriterion("fund_amount_disbursed <=", value, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedLike(String value) {
            addCriterion("fund_amount_disbursed like", value, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedNotLike(String value) {
            addCriterion("fund_amount_disbursed not like", value, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedIn(List<String> values) {
            addCriterion("fund_amount_disbursed in", values, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedNotIn(List<String> values) {
            addCriterion("fund_amount_disbursed not in", values, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedBetween(String value1, String value2) {
            addCriterion("fund_amount_disbursed between", value1, value2, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAmountDisbursedNotBetween(String value1, String value2) {
            addCriterion("fund_amount_disbursed not between", value1, value2, "fundAmountDisbursed");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowIsNull() {
            addCriterion("fund_agency_now is null");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowIsNotNull() {
            addCriterion("fund_agency_now is not null");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowEqualTo(String value) {
            addCriterion("fund_agency_now =", value, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowNotEqualTo(String value) {
            addCriterion("fund_agency_now <>", value, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowGreaterThan(String value) {
            addCriterion("fund_agency_now >", value, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowGreaterThanOrEqualTo(String value) {
            addCriterion("fund_agency_now >=", value, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowLessThan(String value) {
            addCriterion("fund_agency_now <", value, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowLessThanOrEqualTo(String value) {
            addCriterion("fund_agency_now <=", value, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowLike(String value) {
            addCriterion("fund_agency_now like", value, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowNotLike(String value) {
            addCriterion("fund_agency_now not like", value, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowIn(List<String> values) {
            addCriterion("fund_agency_now in", values, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowNotIn(List<String> values) {
            addCriterion("fund_agency_now not in", values, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowBetween(String value1, String value2) {
            addCriterion("fund_agency_now between", value1, value2, "fundAgencyNow");
            return (Criteria) this;
        }

        public Criteria andFundAgencyNowNotBetween(String value1, String value2) {
            addCriterion("fund_agency_now not between", value1, value2, "fundAgencyNow");
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