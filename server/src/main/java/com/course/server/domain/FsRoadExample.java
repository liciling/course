package com.course.server.domain;

import java.util.ArrayList;
import java.util.List;

public class FsRoadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FsRoadExample() {
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

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andRoadSectionIsNull() {
            addCriterion("road_section is null");
            return (Criteria) this;
        }

        public Criteria andRoadSectionIsNotNull() {
            addCriterion("road_section is not null");
            return (Criteria) this;
        }

        public Criteria andRoadSectionEqualTo(String value) {
            addCriterion("road_section =", value, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionNotEqualTo(String value) {
            addCriterion("road_section <>", value, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionGreaterThan(String value) {
            addCriterion("road_section >", value, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionGreaterThanOrEqualTo(String value) {
            addCriterion("road_section >=", value, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionLessThan(String value) {
            addCriterion("road_section <", value, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionLessThanOrEqualTo(String value) {
            addCriterion("road_section <=", value, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionLike(String value) {
            addCriterion("road_section like", value, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionNotLike(String value) {
            addCriterion("road_section not like", value, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionIn(List<String> values) {
            addCriterion("road_section in", values, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionNotIn(List<String> values) {
            addCriterion("road_section not in", values, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionBetween(String value1, String value2) {
            addCriterion("road_section between", value1, value2, "roadSection");
            return (Criteria) this;
        }

        public Criteria andRoadSectionNotBetween(String value1, String value2) {
            addCriterion("road_section not between", value1, value2, "roadSection");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeIsNull() {
            addCriterion("sanitation_grade is null");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeIsNotNull() {
            addCriterion("sanitation_grade is not null");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeEqualTo(String value) {
            addCriterion("sanitation_grade =", value, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeNotEqualTo(String value) {
            addCriterion("sanitation_grade <>", value, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeGreaterThan(String value) {
            addCriterion("sanitation_grade >", value, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeGreaterThanOrEqualTo(String value) {
            addCriterion("sanitation_grade >=", value, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeLessThan(String value) {
            addCriterion("sanitation_grade <", value, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeLessThanOrEqualTo(String value) {
            addCriterion("sanitation_grade <=", value, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeLike(String value) {
            addCriterion("sanitation_grade like", value, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeNotLike(String value) {
            addCriterion("sanitation_grade not like", value, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeIn(List<String> values) {
            addCriterion("sanitation_grade in", values, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeNotIn(List<String> values) {
            addCriterion("sanitation_grade not in", values, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeBetween(String value1, String value2) {
            addCriterion("sanitation_grade between", value1, value2, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andSanitationGradeNotBetween(String value1, String value2) {
            addCriterion("sanitation_grade not between", value1, value2, "sanitationGrade");
            return (Criteria) this;
        }

        public Criteria andRoadWidthIsNull() {
            addCriterion("road_width is null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthIsNotNull() {
            addCriterion("road_width is not null");
            return (Criteria) this;
        }

        public Criteria andRoadWidthEqualTo(String value) {
            addCriterion("road_width =", value, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNotEqualTo(String value) {
            addCriterion("road_width <>", value, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthGreaterThan(String value) {
            addCriterion("road_width >", value, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthGreaterThanOrEqualTo(String value) {
            addCriterion("road_width >=", value, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthLessThan(String value) {
            addCriterion("road_width <", value, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthLessThanOrEqualTo(String value) {
            addCriterion("road_width <=", value, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthLike(String value) {
            addCriterion("road_width like", value, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNotLike(String value) {
            addCriterion("road_width not like", value, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthIn(List<String> values) {
            addCriterion("road_width in", values, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNotIn(List<String> values) {
            addCriterion("road_width not in", values, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthBetween(String value1, String value2) {
            addCriterion("road_width between", value1, value2, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadWidthNotBetween(String value1, String value2) {
            addCriterion("road_width not between", value1, value2, "roadWidth");
            return (Criteria) this;
        }

        public Criteria andRoadLengthIsNull() {
            addCriterion("road_length is null");
            return (Criteria) this;
        }

        public Criteria andRoadLengthIsNotNull() {
            addCriterion("road_length is not null");
            return (Criteria) this;
        }

        public Criteria andRoadLengthEqualTo(String value) {
            addCriterion("road_length =", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthNotEqualTo(String value) {
            addCriterion("road_length <>", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthGreaterThan(String value) {
            addCriterion("road_length >", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthGreaterThanOrEqualTo(String value) {
            addCriterion("road_length >=", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthLessThan(String value) {
            addCriterion("road_length <", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthLessThanOrEqualTo(String value) {
            addCriterion("road_length <=", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthLike(String value) {
            addCriterion("road_length like", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthNotLike(String value) {
            addCriterion("road_length not like", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthIn(List<String> values) {
            addCriterion("road_length in", values, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthNotIn(List<String> values) {
            addCriterion("road_length not in", values, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthBetween(String value1, String value2) {
            addCriterion("road_length between", value1, value2, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthNotBetween(String value1, String value2) {
            addCriterion("road_length not between", value1, value2, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaIsNull() {
            addCriterion("roadway_area is null");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaIsNotNull() {
            addCriterion("roadway_area is not null");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaEqualTo(String value) {
            addCriterion("roadway_area =", value, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaNotEqualTo(String value) {
            addCriterion("roadway_area <>", value, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaGreaterThan(String value) {
            addCriterion("roadway_area >", value, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaGreaterThanOrEqualTo(String value) {
            addCriterion("roadway_area >=", value, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaLessThan(String value) {
            addCriterion("roadway_area <", value, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaLessThanOrEqualTo(String value) {
            addCriterion("roadway_area <=", value, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaLike(String value) {
            addCriterion("roadway_area like", value, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaNotLike(String value) {
            addCriterion("roadway_area not like", value, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaIn(List<String> values) {
            addCriterion("roadway_area in", values, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaNotIn(List<String> values) {
            addCriterion("roadway_area not in", values, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaBetween(String value1, String value2) {
            addCriterion("roadway_area between", value1, value2, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andRoadwayAreaNotBetween(String value1, String value2) {
            addCriterion("roadway_area not between", value1, value2, "roadwayArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaIsNull() {
            addCriterion("sidewalk_area is null");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaIsNotNull() {
            addCriterion("sidewalk_area is not null");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaEqualTo(String value) {
            addCriterion("sidewalk_area =", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaNotEqualTo(String value) {
            addCriterion("sidewalk_area <>", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaGreaterThan(String value) {
            addCriterion("sidewalk_area >", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaGreaterThanOrEqualTo(String value) {
            addCriterion("sidewalk_area >=", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaLessThan(String value) {
            addCriterion("sidewalk_area <", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaLessThanOrEqualTo(String value) {
            addCriterion("sidewalk_area <=", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaLike(String value) {
            addCriterion("sidewalk_area like", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaNotLike(String value) {
            addCriterion("sidewalk_area not like", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaIn(List<String> values) {
            addCriterion("sidewalk_area in", values, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaNotIn(List<String> values) {
            addCriterion("sidewalk_area not in", values, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaBetween(String value1, String value2) {
            addCriterion("sidewalk_area between", value1, value2, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaNotBetween(String value1, String value2) {
            addCriterion("sidewalk_area not between", value1, value2, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaIsNull() {
            addCriterion("space_area is null");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaIsNotNull() {
            addCriterion("space_area is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaEqualTo(String value) {
            addCriterion("space_area =", value, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaNotEqualTo(String value) {
            addCriterion("space_area <>", value, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaGreaterThan(String value) {
            addCriterion("space_area >", value, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaGreaterThanOrEqualTo(String value) {
            addCriterion("space_area >=", value, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaLessThan(String value) {
            addCriterion("space_area <", value, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaLessThanOrEqualTo(String value) {
            addCriterion("space_area <=", value, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaLike(String value) {
            addCriterion("space_area like", value, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaNotLike(String value) {
            addCriterion("space_area not like", value, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaIn(List<String> values) {
            addCriterion("space_area in", values, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaNotIn(List<String> values) {
            addCriterion("space_area not in", values, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaBetween(String value1, String value2) {
            addCriterion("space_area between", value1, value2, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andSpaceAreaNotBetween(String value1, String value2) {
            addCriterion("space_area not between", value1, value2, "spaceArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaIsNull() {
            addCriterion("green_belt_area is null");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaIsNotNull() {
            addCriterion("green_belt_area is not null");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaEqualTo(String value) {
            addCriterion("green_belt_area =", value, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaNotEqualTo(String value) {
            addCriterion("green_belt_area <>", value, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaGreaterThan(String value) {
            addCriterion("green_belt_area >", value, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaGreaterThanOrEqualTo(String value) {
            addCriterion("green_belt_area >=", value, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaLessThan(String value) {
            addCriterion("green_belt_area <", value, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaLessThanOrEqualTo(String value) {
            addCriterion("green_belt_area <=", value, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaLike(String value) {
            addCriterion("green_belt_area like", value, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaNotLike(String value) {
            addCriterion("green_belt_area not like", value, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaIn(List<String> values) {
            addCriterion("green_belt_area in", values, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaNotIn(List<String> values) {
            addCriterion("green_belt_area not in", values, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaBetween(String value1, String value2) {
            addCriterion("green_belt_area between", value1, value2, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenBeltAreaNotBetween(String value1, String value2) {
            addCriterion("green_belt_area not between", value1, value2, "greenBeltArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaIsNull() {
            addCriterion("green_area is null");
            return (Criteria) this;
        }

        public Criteria andGreenAreaIsNotNull() {
            addCriterion("green_area is not null");
            return (Criteria) this;
        }

        public Criteria andGreenAreaEqualTo(String value) {
            addCriterion("green_area =", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaNotEqualTo(String value) {
            addCriterion("green_area <>", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaGreaterThan(String value) {
            addCriterion("green_area >", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaGreaterThanOrEqualTo(String value) {
            addCriterion("green_area >=", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaLessThan(String value) {
            addCriterion("green_area <", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaLessThanOrEqualTo(String value) {
            addCriterion("green_area <=", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaLike(String value) {
            addCriterion("green_area like", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaNotLike(String value) {
            addCriterion("green_area not like", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaIn(List<String> values) {
            addCriterion("green_area in", values, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaNotIn(List<String> values) {
            addCriterion("green_area not in", values, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaBetween(String value1, String value2) {
            addCriterion("green_area between", value1, value2, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaNotBetween(String value1, String value2) {
            addCriterion("green_area not between", value1, value2, "greenArea");
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