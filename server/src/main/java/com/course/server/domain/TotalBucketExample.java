package com.course.server.domain;

import java.util.ArrayList;
import java.util.List;

public class TotalBucketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalBucketExample() {
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

        public Criteria andSubdistrictOfficeIsNull() {
            addCriterion("subdistrict_office is null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeIsNotNull() {
            addCriterion("subdistrict_office is not null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeEqualTo(String value) {
            addCriterion("subdistrict_office =", value, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeNotEqualTo(String value) {
            addCriterion("subdistrict_office <>", value, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeGreaterThan(String value) {
            addCriterion("subdistrict_office >", value, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("subdistrict_office >=", value, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeLessThan(String value) {
            addCriterion("subdistrict_office <", value, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeLessThanOrEqualTo(String value) {
            addCriterion("subdistrict_office <=", value, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeLike(String value) {
            addCriterion("subdistrict_office like", value, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeNotLike(String value) {
            addCriterion("subdistrict_office not like", value, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeIn(List<String> values) {
            addCriterion("subdistrict_office in", values, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeNotIn(List<String> values) {
            addCriterion("subdistrict_office not in", values, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeBetween(String value1, String value2) {
            addCriterion("subdistrict_office between", value1, value2, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andSubdistrictOfficeNotBetween(String value1, String value2) {
            addCriterion("subdistrict_office not between", value1, value2, "subdistrictOffice");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIsNull() {
            addCriterion("community_name is null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIsNotNull() {
            addCriterion("community_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameEqualTo(String value) {
            addCriterion("community_name =", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotEqualTo(String value) {
            addCriterion("community_name <>", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThan(String value) {
            addCriterion("community_name >", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThanOrEqualTo(String value) {
            addCriterion("community_name >=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThan(String value) {
            addCriterion("community_name <", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThanOrEqualTo(String value) {
            addCriterion("community_name <=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLike(String value) {
            addCriterion("community_name like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotLike(String value) {
            addCriterion("community_name not like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIn(List<String> values) {
            addCriterion("community_name in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotIn(List<String> values) {
            addCriterion("community_name not in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameBetween(String value1, String value2) {
            addCriterion("community_name between", value1, value2, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotBetween(String value1, String value2) {
            addCriterion("community_name not between", value1, value2, "communityName");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIsNull() {
            addCriterion("households is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIsNotNull() {
            addCriterion("households is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdsEqualTo(String value) {
            addCriterion("households =", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsNotEqualTo(String value) {
            addCriterion("households <>", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsGreaterThan(String value) {
            addCriterion("households >", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsGreaterThanOrEqualTo(String value) {
            addCriterion("households >=", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsLessThan(String value) {
            addCriterion("households <", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsLessThanOrEqualTo(String value) {
            addCriterion("households <=", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsLike(String value) {
            addCriterion("households like", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsNotLike(String value) {
            addCriterion("households not like", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIn(List<String> values) {
            addCriterion("households in", values, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsNotIn(List<String> values) {
            addCriterion("households not in", values, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsBetween(String value1, String value2) {
            addCriterion("households between", value1, value2, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsNotBetween(String value1, String value2) {
            addCriterion("households not between", value1, value2, "households");
            return (Criteria) this;
        }

        public Criteria andVillageNameIsNull() {
            addCriterion("village_name is null");
            return (Criteria) this;
        }

        public Criteria andVillageNameIsNotNull() {
            addCriterion("village_name is not null");
            return (Criteria) this;
        }

        public Criteria andVillageNameEqualTo(String value) {
            addCriterion("village_name =", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotEqualTo(String value) {
            addCriterion("village_name <>", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameGreaterThan(String value) {
            addCriterion("village_name >", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameGreaterThanOrEqualTo(String value) {
            addCriterion("village_name >=", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLessThan(String value) {
            addCriterion("village_name <", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLessThanOrEqualTo(String value) {
            addCriterion("village_name <=", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLike(String value) {
            addCriterion("village_name like", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotLike(String value) {
            addCriterion("village_name not like", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameIn(List<String> values) {
            addCriterion("village_name in", values, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotIn(List<String> values) {
            addCriterion("village_name not in", values, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameBetween(String value1, String value2) {
            addCriterion("village_name between", value1, value2, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotBetween(String value1, String value2) {
            addCriterion("village_name not between", value1, value2, "villageName");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeIsNull() {
            addCriterion("building_attribute is null");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeIsNotNull() {
            addCriterion("building_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeEqualTo(String value) {
            addCriterion("building_attribute =", value, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeNotEqualTo(String value) {
            addCriterion("building_attribute <>", value, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeGreaterThan(String value) {
            addCriterion("building_attribute >", value, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("building_attribute >=", value, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeLessThan(String value) {
            addCriterion("building_attribute <", value, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeLessThanOrEqualTo(String value) {
            addCriterion("building_attribute <=", value, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeLike(String value) {
            addCriterion("building_attribute like", value, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeNotLike(String value) {
            addCriterion("building_attribute not like", value, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeIn(List<String> values) {
            addCriterion("building_attribute in", values, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeNotIn(List<String> values) {
            addCriterion("building_attribute not in", values, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeBetween(String value1, String value2) {
            addCriterion("building_attribute between", value1, value2, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andBuildingAttributeNotBetween(String value1, String value2) {
            addCriterion("building_attribute not between", value1, value2, "buildingAttribute");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseIsNull() {
            addCriterion("regular_release is null");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseIsNotNull() {
            addCriterion("regular_release is not null");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseEqualTo(String value) {
            addCriterion("regular_release =", value, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseNotEqualTo(String value) {
            addCriterion("regular_release <>", value, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseGreaterThan(String value) {
            addCriterion("regular_release >", value, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseGreaterThanOrEqualTo(String value) {
            addCriterion("regular_release >=", value, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseLessThan(String value) {
            addCriterion("regular_release <", value, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseLessThanOrEqualTo(String value) {
            addCriterion("regular_release <=", value, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseLike(String value) {
            addCriterion("regular_release like", value, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseNotLike(String value) {
            addCriterion("regular_release not like", value, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseIn(List<String> values) {
            addCriterion("regular_release in", values, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseNotIn(List<String> values) {
            addCriterion("regular_release not in", values, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseBetween(String value1, String value2) {
            addCriterion("regular_release between", value1, value2, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularReleaseNotBetween(String value1, String value2) {
            addCriterion("regular_release not between", value1, value2, "regularRelease");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionIsNull() {
            addCriterion("regular_collection is null");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionIsNotNull() {
            addCriterion("regular_collection is not null");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionEqualTo(String value) {
            addCriterion("regular_collection =", value, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionNotEqualTo(String value) {
            addCriterion("regular_collection <>", value, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionGreaterThan(String value) {
            addCriterion("regular_collection >", value, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("regular_collection >=", value, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionLessThan(String value) {
            addCriterion("regular_collection <", value, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionLessThanOrEqualTo(String value) {
            addCriterion("regular_collection <=", value, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionLike(String value) {
            addCriterion("regular_collection like", value, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionNotLike(String value) {
            addCriterion("regular_collection not like", value, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionIn(List<String> values) {
            addCriterion("regular_collection in", values, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionNotIn(List<String> values) {
            addCriterion("regular_collection not in", values, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionBetween(String value1, String value2) {
            addCriterion("regular_collection between", value1, value2, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andRegularCollectionNotBetween(String value1, String value2) {
            addCriterion("regular_collection not between", value1, value2, "regularCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionIsNull() {
            addCriterion("daytime_collection is null");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionIsNotNull() {
            addCriterion("daytime_collection is not null");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionEqualTo(String value) {
            addCriterion("daytime_collection =", value, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionNotEqualTo(String value) {
            addCriterion("daytime_collection <>", value, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionGreaterThan(String value) {
            addCriterion("daytime_collection >", value, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("daytime_collection >=", value, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionLessThan(String value) {
            addCriterion("daytime_collection <", value, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionLessThanOrEqualTo(String value) {
            addCriterion("daytime_collection <=", value, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionLike(String value) {
            addCriterion("daytime_collection like", value, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionNotLike(String value) {
            addCriterion("daytime_collection not like", value, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionIn(List<String> values) {
            addCriterion("daytime_collection in", values, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionNotIn(List<String> values) {
            addCriterion("daytime_collection not in", values, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionBetween(String value1, String value2) {
            addCriterion("daytime_collection between", value1, value2, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andDaytimeCollectionNotBetween(String value1, String value2) {
            addCriterion("daytime_collection not between", value1, value2, "daytimeCollection");
            return (Criteria) this;
        }

        public Criteria andRedBlackIsNull() {
            addCriterion("red_black is null");
            return (Criteria) this;
        }

        public Criteria andRedBlackIsNotNull() {
            addCriterion("red_black is not null");
            return (Criteria) this;
        }

        public Criteria andRedBlackEqualTo(String value) {
            addCriterion("red_black =", value, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackNotEqualTo(String value) {
            addCriterion("red_black <>", value, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackGreaterThan(String value) {
            addCriterion("red_black >", value, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackGreaterThanOrEqualTo(String value) {
            addCriterion("red_black >=", value, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackLessThan(String value) {
            addCriterion("red_black <", value, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackLessThanOrEqualTo(String value) {
            addCriterion("red_black <=", value, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackLike(String value) {
            addCriterion("red_black like", value, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackNotLike(String value) {
            addCriterion("red_black not like", value, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackIn(List<String> values) {
            addCriterion("red_black in", values, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackNotIn(List<String> values) {
            addCriterion("red_black not in", values, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackBetween(String value1, String value2) {
            addCriterion("red_black between", value1, value2, "redBlack");
            return (Criteria) this;
        }

        public Criteria andRedBlackNotBetween(String value1, String value2) {
            addCriterion("red_black not between", value1, value2, "redBlack");
            return (Criteria) this;
        }

        public Criteria andBonusPointsIsNull() {
            addCriterion("bonus_points is null");
            return (Criteria) this;
        }

        public Criteria andBonusPointsIsNotNull() {
            addCriterion("bonus_points is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPointsEqualTo(String value) {
            addCriterion("bonus_points =", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsNotEqualTo(String value) {
            addCriterion("bonus_points <>", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsGreaterThan(String value) {
            addCriterion("bonus_points >", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsGreaterThanOrEqualTo(String value) {
            addCriterion("bonus_points >=", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsLessThan(String value) {
            addCriterion("bonus_points <", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsLessThanOrEqualTo(String value) {
            addCriterion("bonus_points <=", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsLike(String value) {
            addCriterion("bonus_points like", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsNotLike(String value) {
            addCriterion("bonus_points not like", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsIn(List<String> values) {
            addCriterion("bonus_points in", values, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsNotIn(List<String> values) {
            addCriterion("bonus_points not in", values, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsBetween(String value1, String value2) {
            addCriterion("bonus_points between", value1, value2, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsNotBetween(String value1, String value2) {
            addCriterion("bonus_points not between", value1, value2, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressIsNull() {
            addCriterion("specific_address is null");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressIsNotNull() {
            addCriterion("specific_address is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressEqualTo(String value) {
            addCriterion("specific_address =", value, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressNotEqualTo(String value) {
            addCriterion("specific_address <>", value, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressGreaterThan(String value) {
            addCriterion("specific_address >", value, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressGreaterThanOrEqualTo(String value) {
            addCriterion("specific_address >=", value, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressLessThan(String value) {
            addCriterion("specific_address <", value, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressLessThanOrEqualTo(String value) {
            addCriterion("specific_address <=", value, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressLike(String value) {
            addCriterion("specific_address like", value, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressNotLike(String value) {
            addCriterion("specific_address not like", value, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressIn(List<String> values) {
            addCriterion("specific_address in", values, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressNotIn(List<String> values) {
            addCriterion("specific_address not in", values, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressBetween(String value1, String value2) {
            addCriterion("specific_address between", value1, value2, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andSpecificAddressNotBetween(String value1, String value2) {
            addCriterion("specific_address not between", value1, value2, "specificAddress");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberIsNull() {
            addCriterion("bucket_points_number is null");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberIsNotNull() {
            addCriterion("bucket_points_number is not null");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberEqualTo(String value) {
            addCriterion("bucket_points_number =", value, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberNotEqualTo(String value) {
            addCriterion("bucket_points_number <>", value, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberGreaterThan(String value) {
            addCriterion("bucket_points_number >", value, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bucket_points_number >=", value, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberLessThan(String value) {
            addCriterion("bucket_points_number <", value, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberLessThanOrEqualTo(String value) {
            addCriterion("bucket_points_number <=", value, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberLike(String value) {
            addCriterion("bucket_points_number like", value, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberNotLike(String value) {
            addCriterion("bucket_points_number not like", value, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberIn(List<String> values) {
            addCriterion("bucket_points_number in", values, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberNotIn(List<String> values) {
            addCriterion("bucket_points_number not in", values, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberBetween(String value1, String value2) {
            addCriterion("bucket_points_number between", value1, value2, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsNumberNotBetween(String value1, String value2) {
            addCriterion("bucket_points_number not between", value1, value2, "bucketPointsNumber");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeIsNull() {
            addCriterion("bucket_points_type is null");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeIsNotNull() {
            addCriterion("bucket_points_type is not null");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeEqualTo(String value) {
            addCriterion("bucket_points_type =", value, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeNotEqualTo(String value) {
            addCriterion("bucket_points_type <>", value, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeGreaterThan(String value) {
            addCriterion("bucket_points_type >", value, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bucket_points_type >=", value, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeLessThan(String value) {
            addCriterion("bucket_points_type <", value, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeLessThanOrEqualTo(String value) {
            addCriterion("bucket_points_type <=", value, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeLike(String value) {
            addCriterion("bucket_points_type like", value, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeNotLike(String value) {
            addCriterion("bucket_points_type not like", value, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeIn(List<String> values) {
            addCriterion("bucket_points_type in", values, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeNotIn(List<String> values) {
            addCriterion("bucket_points_type not in", values, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeBetween(String value1, String value2) {
            addCriterion("bucket_points_type between", value1, value2, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsTypeNotBetween(String value1, String value2) {
            addCriterion("bucket_points_type not between", value1, value2, "bucketPointsType");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdIsNull() {
            addCriterion("bucket_points_id is null");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdIsNotNull() {
            addCriterion("bucket_points_id is not null");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdEqualTo(String value) {
            addCriterion("bucket_points_id =", value, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdNotEqualTo(String value) {
            addCriterion("bucket_points_id <>", value, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdGreaterThan(String value) {
            addCriterion("bucket_points_id >", value, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdGreaterThanOrEqualTo(String value) {
            addCriterion("bucket_points_id >=", value, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdLessThan(String value) {
            addCriterion("bucket_points_id <", value, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdLessThanOrEqualTo(String value) {
            addCriterion("bucket_points_id <=", value, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdLike(String value) {
            addCriterion("bucket_points_id like", value, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdNotLike(String value) {
            addCriterion("bucket_points_id not like", value, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdIn(List<String> values) {
            addCriterion("bucket_points_id in", values, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdNotIn(List<String> values) {
            addCriterion("bucket_points_id not in", values, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdBetween(String value1, String value2) {
            addCriterion("bucket_points_id between", value1, value2, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsIdNotBetween(String value1, String value2) {
            addCriterion("bucket_points_id not between", value1, value2, "bucketPointsId");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionIsNull() {
            addCriterion("bucket_points_position is null");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionIsNotNull() {
            addCriterion("bucket_points_position is not null");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionEqualTo(String value) {
            addCriterion("bucket_points_position =", value, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionNotEqualTo(String value) {
            addCriterion("bucket_points_position <>", value, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionGreaterThan(String value) {
            addCriterion("bucket_points_position >", value, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionGreaterThanOrEqualTo(String value) {
            addCriterion("bucket_points_position >=", value, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionLessThan(String value) {
            addCriterion("bucket_points_position <", value, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionLessThanOrEqualTo(String value) {
            addCriterion("bucket_points_position <=", value, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionLike(String value) {
            addCriterion("bucket_points_position like", value, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionNotLike(String value) {
            addCriterion("bucket_points_position not like", value, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionIn(List<String> values) {
            addCriterion("bucket_points_position in", values, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionNotIn(List<String> values) {
            addCriterion("bucket_points_position not in", values, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionBetween(String value1, String value2) {
            addCriterion("bucket_points_position between", value1, value2, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andBucketPointsPositionNotBetween(String value1, String value2) {
            addCriterion("bucket_points_position not between", value1, value2, "bucketPointsPosition");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionIsNull() {
            addCriterion("recyclable_collection is null");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionIsNotNull() {
            addCriterion("recyclable_collection is not null");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionEqualTo(String value) {
            addCriterion("recyclable_collection =", value, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionNotEqualTo(String value) {
            addCriterion("recyclable_collection <>", value, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionGreaterThan(String value) {
            addCriterion("recyclable_collection >", value, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("recyclable_collection >=", value, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionLessThan(String value) {
            addCriterion("recyclable_collection <", value, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionLessThanOrEqualTo(String value) {
            addCriterion("recyclable_collection <=", value, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionLike(String value) {
            addCriterion("recyclable_collection like", value, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionNotLike(String value) {
            addCriterion("recyclable_collection not like", value, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionIn(List<String> values) {
            addCriterion("recyclable_collection in", values, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionNotIn(List<String> values) {
            addCriterion("recyclable_collection not in", values, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionBetween(String value1, String value2) {
            addCriterion("recyclable_collection between", value1, value2, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andRecyclableCollectionNotBetween(String value1, String value2) {
            addCriterion("recyclable_collection not between", value1, value2, "recyclableCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionIsNull() {
            addCriterion("harmful_collection is null");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionIsNotNull() {
            addCriterion("harmful_collection is not null");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionEqualTo(String value) {
            addCriterion("harmful_collection =", value, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionNotEqualTo(String value) {
            addCriterion("harmful_collection <>", value, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionGreaterThan(String value) {
            addCriterion("harmful_collection >", value, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("harmful_collection >=", value, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionLessThan(String value) {
            addCriterion("harmful_collection <", value, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionLessThanOrEqualTo(String value) {
            addCriterion("harmful_collection <=", value, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionLike(String value) {
            addCriterion("harmful_collection like", value, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionNotLike(String value) {
            addCriterion("harmful_collection not like", value, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionIn(List<String> values) {
            addCriterion("harmful_collection in", values, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionNotIn(List<String> values) {
            addCriterion("harmful_collection not in", values, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionBetween(String value1, String value2) {
            addCriterion("harmful_collection between", value1, value2, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andHarmfulCollectionNotBetween(String value1, String value2) {
            addCriterion("harmful_collection not between", value1, value2, "harmfulCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionIsNull() {
            addCriterion("other_collection is null");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionIsNotNull() {
            addCriterion("other_collection is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionEqualTo(String value) {
            addCriterion("other_collection =", value, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionNotEqualTo(String value) {
            addCriterion("other_collection <>", value, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionGreaterThan(String value) {
            addCriterion("other_collection >", value, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("other_collection >=", value, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionLessThan(String value) {
            addCriterion("other_collection <", value, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionLessThanOrEqualTo(String value) {
            addCriterion("other_collection <=", value, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionLike(String value) {
            addCriterion("other_collection like", value, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionNotLike(String value) {
            addCriterion("other_collection not like", value, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionIn(List<String> values) {
            addCriterion("other_collection in", values, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionNotIn(List<String> values) {
            addCriterion("other_collection not in", values, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionBetween(String value1, String value2) {
            addCriterion("other_collection between", value1, value2, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andOtherCollectionNotBetween(String value1, String value2) {
            addCriterion("other_collection not between", value1, value2, "otherCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionIsNull() {
            addCriterion("kitchen_collection is null");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionIsNotNull() {
            addCriterion("kitchen_collection is not null");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionEqualTo(String value) {
            addCriterion("kitchen_collection =", value, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionNotEqualTo(String value) {
            addCriterion("kitchen_collection <>", value, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionGreaterThan(String value) {
            addCriterion("kitchen_collection >", value, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("kitchen_collection >=", value, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionLessThan(String value) {
            addCriterion("kitchen_collection <", value, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionLessThanOrEqualTo(String value) {
            addCriterion("kitchen_collection <=", value, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionLike(String value) {
            addCriterion("kitchen_collection like", value, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionNotLike(String value) {
            addCriterion("kitchen_collection not like", value, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionIn(List<String> values) {
            addCriterion("kitchen_collection in", values, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionNotIn(List<String> values) {
            addCriterion("kitchen_collection not in", values, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionBetween(String value1, String value2) {
            addCriterion("kitchen_collection between", value1, value2, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andKitchenCollectionNotBetween(String value1, String value2) {
            addCriterion("kitchen_collection not between", value1, value2, "kitchenCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionIsNull() {
            addCriterion("big_collection is null");
            return (Criteria) this;
        }

        public Criteria andBigCollectionIsNotNull() {
            addCriterion("big_collection is not null");
            return (Criteria) this;
        }

        public Criteria andBigCollectionEqualTo(String value) {
            addCriterion("big_collection =", value, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionNotEqualTo(String value) {
            addCriterion("big_collection <>", value, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionGreaterThan(String value) {
            addCriterion("big_collection >", value, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("big_collection >=", value, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionLessThan(String value) {
            addCriterion("big_collection <", value, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionLessThanOrEqualTo(String value) {
            addCriterion("big_collection <=", value, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionLike(String value) {
            addCriterion("big_collection like", value, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionNotLike(String value) {
            addCriterion("big_collection not like", value, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionIn(List<String> values) {
            addCriterion("big_collection in", values, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionNotIn(List<String> values) {
            addCriterion("big_collection not in", values, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionBetween(String value1, String value2) {
            addCriterion("big_collection between", value1, value2, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andBigCollectionNotBetween(String value1, String value2) {
            addCriterion("big_collection not between", value1, value2, "bigCollection");
            return (Criteria) this;
        }

        public Criteria andWeighingFunIsNull() {
            addCriterion("weighing_fun is null");
            return (Criteria) this;
        }

        public Criteria andWeighingFunIsNotNull() {
            addCriterion("weighing_fun is not null");
            return (Criteria) this;
        }

        public Criteria andWeighingFunEqualTo(String value) {
            addCriterion("weighing_fun =", value, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunNotEqualTo(String value) {
            addCriterion("weighing_fun <>", value, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunGreaterThan(String value) {
            addCriterion("weighing_fun >", value, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunGreaterThanOrEqualTo(String value) {
            addCriterion("weighing_fun >=", value, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunLessThan(String value) {
            addCriterion("weighing_fun <", value, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunLessThanOrEqualTo(String value) {
            addCriterion("weighing_fun <=", value, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunLike(String value) {
            addCriterion("weighing_fun like", value, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunNotLike(String value) {
            addCriterion("weighing_fun not like", value, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunIn(List<String> values) {
            addCriterion("weighing_fun in", values, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunNotIn(List<String> values) {
            addCriterion("weighing_fun not in", values, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunBetween(String value1, String value2) {
            addCriterion("weighing_fun between", value1, value2, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andWeighingFunNotBetween(String value1, String value2) {
            addCriterion("weighing_fun not between", value1, value2, "weighingFun");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceIsNull() {
            addCriterion("video_surveillance is null");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceIsNotNull() {
            addCriterion("video_surveillance is not null");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceEqualTo(String value) {
            addCriterion("video_surveillance =", value, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceNotEqualTo(String value) {
            addCriterion("video_surveillance <>", value, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceGreaterThan(String value) {
            addCriterion("video_surveillance >", value, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceGreaterThanOrEqualTo(String value) {
            addCriterion("video_surveillance >=", value, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceLessThan(String value) {
            addCriterion("video_surveillance <", value, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceLessThanOrEqualTo(String value) {
            addCriterion("video_surveillance <=", value, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceLike(String value) {
            addCriterion("video_surveillance like", value, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceNotLike(String value) {
            addCriterion("video_surveillance not like", value, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceIn(List<String> values) {
            addCriterion("video_surveillance in", values, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceNotIn(List<String> values) {
            addCriterion("video_surveillance not in", values, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceBetween(String value1, String value2) {
            addCriterion("video_surveillance between", value1, value2, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andVideoSurveillanceNotBetween(String value1, String value2) {
            addCriterion("video_surveillance not between", value1, value2, "videoSurveillance");
            return (Criteria) this;
        }

        public Criteria andIntegralFunIsNull() {
            addCriterion("integral_fun is null");
            return (Criteria) this;
        }

        public Criteria andIntegralFunIsNotNull() {
            addCriterion("integral_fun is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralFunEqualTo(String value) {
            addCriterion("integral_fun =", value, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunNotEqualTo(String value) {
            addCriterion("integral_fun <>", value, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunGreaterThan(String value) {
            addCriterion("integral_fun >", value, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunGreaterThanOrEqualTo(String value) {
            addCriterion("integral_fun >=", value, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunLessThan(String value) {
            addCriterion("integral_fun <", value, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunLessThanOrEqualTo(String value) {
            addCriterion("integral_fun <=", value, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunLike(String value) {
            addCriterion("integral_fun like", value, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunNotLike(String value) {
            addCriterion("integral_fun not like", value, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunIn(List<String> values) {
            addCriterion("integral_fun in", values, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunNotIn(List<String> values) {
            addCriterion("integral_fun not in", values, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunBetween(String value1, String value2) {
            addCriterion("integral_fun between", value1, value2, "integralFun");
            return (Criteria) this;
        }

        public Criteria andIntegralFunNotBetween(String value1, String value2) {
            addCriterion("integral_fun not between", value1, value2, "integralFun");
            return (Criteria) this;
        }

        public Criteria andStorageRoomIsNull() {
            addCriterion("storage_room is null");
            return (Criteria) this;
        }

        public Criteria andStorageRoomIsNotNull() {
            addCriterion("storage_room is not null");
            return (Criteria) this;
        }

        public Criteria andStorageRoomEqualTo(String value) {
            addCriterion("storage_room =", value, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomNotEqualTo(String value) {
            addCriterion("storage_room <>", value, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomGreaterThan(String value) {
            addCriterion("storage_room >", value, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomGreaterThanOrEqualTo(String value) {
            addCriterion("storage_room >=", value, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomLessThan(String value) {
            addCriterion("storage_room <", value, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomLessThanOrEqualTo(String value) {
            addCriterion("storage_room <=", value, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomLike(String value) {
            addCriterion("storage_room like", value, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomNotLike(String value) {
            addCriterion("storage_room not like", value, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomIn(List<String> values) {
            addCriterion("storage_room in", values, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomNotIn(List<String> values) {
            addCriterion("storage_room not in", values, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomBetween(String value1, String value2) {
            addCriterion("storage_room between", value1, value2, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andStorageRoomNotBetween(String value1, String value2) {
            addCriterion("storage_room not between", value1, value2, "storageRoom");
            return (Criteria) this;
        }

        public Criteria andRestroomIsNull() {
            addCriterion("restroom is null");
            return (Criteria) this;
        }

        public Criteria andRestroomIsNotNull() {
            addCriterion("restroom is not null");
            return (Criteria) this;
        }

        public Criteria andRestroomEqualTo(String value) {
            addCriterion("restroom =", value, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomNotEqualTo(String value) {
            addCriterion("restroom <>", value, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomGreaterThan(String value) {
            addCriterion("restroom >", value, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomGreaterThanOrEqualTo(String value) {
            addCriterion("restroom >=", value, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomLessThan(String value) {
            addCriterion("restroom <", value, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomLessThanOrEqualTo(String value) {
            addCriterion("restroom <=", value, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomLike(String value) {
            addCriterion("restroom like", value, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomNotLike(String value) {
            addCriterion("restroom not like", value, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomIn(List<String> values) {
            addCriterion("restroom in", values, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomNotIn(List<String> values) {
            addCriterion("restroom not in", values, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomBetween(String value1, String value2) {
            addCriterion("restroom between", value1, value2, "restroom");
            return (Criteria) this;
        }

        public Criteria andRestroomNotBetween(String value1, String value2) {
            addCriterion("restroom not between", value1, value2, "restroom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomIsNull() {
            addCriterion("bucket_room is null");
            return (Criteria) this;
        }

        public Criteria andBucketRoomIsNotNull() {
            addCriterion("bucket_room is not null");
            return (Criteria) this;
        }

        public Criteria andBucketRoomEqualTo(String value) {
            addCriterion("bucket_room =", value, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomNotEqualTo(String value) {
            addCriterion("bucket_room <>", value, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomGreaterThan(String value) {
            addCriterion("bucket_room >", value, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomGreaterThanOrEqualTo(String value) {
            addCriterion("bucket_room >=", value, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomLessThan(String value) {
            addCriterion("bucket_room <", value, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomLessThanOrEqualTo(String value) {
            addCriterion("bucket_room <=", value, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomLike(String value) {
            addCriterion("bucket_room like", value, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomNotLike(String value) {
            addCriterion("bucket_room not like", value, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomIn(List<String> values) {
            addCriterion("bucket_room in", values, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomNotIn(List<String> values) {
            addCriterion("bucket_room not in", values, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomBetween(String value1, String value2) {
            addCriterion("bucket_room between", value1, value2, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andBucketRoomNotBetween(String value1, String value2) {
            addCriterion("bucket_room not between", value1, value2, "bucketRoom");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarIsNull() {
            addCriterion("indicator_bar is null");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarIsNotNull() {
            addCriterion("indicator_bar is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarEqualTo(String value) {
            addCriterion("indicator_bar =", value, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarNotEqualTo(String value) {
            addCriterion("indicator_bar <>", value, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarGreaterThan(String value) {
            addCriterion("indicator_bar >", value, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarGreaterThanOrEqualTo(String value) {
            addCriterion("indicator_bar >=", value, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarLessThan(String value) {
            addCriterion("indicator_bar <", value, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarLessThanOrEqualTo(String value) {
            addCriterion("indicator_bar <=", value, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarLike(String value) {
            addCriterion("indicator_bar like", value, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarNotLike(String value) {
            addCriterion("indicator_bar not like", value, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarIn(List<String> values) {
            addCriterion("indicator_bar in", values, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarNotIn(List<String> values) {
            addCriterion("indicator_bar not in", values, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarBetween(String value1, String value2) {
            addCriterion("indicator_bar between", value1, value2, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andIndicatorBarNotBetween(String value1, String value2) {
            addCriterion("indicator_bar not between", value1, value2, "indicatorBar");
            return (Criteria) this;
        }

        public Criteria andBillboardIsNull() {
            addCriterion("Billboard is null");
            return (Criteria) this;
        }

        public Criteria andBillboardIsNotNull() {
            addCriterion("Billboard is not null");
            return (Criteria) this;
        }

        public Criteria andBillboardEqualTo(String value) {
            addCriterion("Billboard =", value, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardNotEqualTo(String value) {
            addCriterion("Billboard <>", value, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardGreaterThan(String value) {
            addCriterion("Billboard >", value, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardGreaterThanOrEqualTo(String value) {
            addCriterion("Billboard >=", value, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardLessThan(String value) {
            addCriterion("Billboard <", value, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardLessThanOrEqualTo(String value) {
            addCriterion("Billboard <=", value, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardLike(String value) {
            addCriterion("Billboard like", value, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardNotLike(String value) {
            addCriterion("Billboard not like", value, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardIn(List<String> values) {
            addCriterion("Billboard in", values, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardNotIn(List<String> values) {
            addCriterion("Billboard not in", values, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardBetween(String value1, String value2) {
            addCriterion("Billboard between", value1, value2, "billboard");
            return (Criteria) this;
        }

        public Criteria andBillboardNotBetween(String value1, String value2) {
            addCriterion("Billboard not between", value1, value2, "billboard");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnIsNull() {
            addCriterion("publicity_column is null");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnIsNotNull() {
            addCriterion("publicity_column is not null");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnEqualTo(String value) {
            addCriterion("publicity_column =", value, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnNotEqualTo(String value) {
            addCriterion("publicity_column <>", value, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnGreaterThan(String value) {
            addCriterion("publicity_column >", value, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnGreaterThanOrEqualTo(String value) {
            addCriterion("publicity_column >=", value, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnLessThan(String value) {
            addCriterion("publicity_column <", value, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnLessThanOrEqualTo(String value) {
            addCriterion("publicity_column <=", value, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnLike(String value) {
            addCriterion("publicity_column like", value, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnNotLike(String value) {
            addCriterion("publicity_column not like", value, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnIn(List<String> values) {
            addCriterion("publicity_column in", values, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnNotIn(List<String> values) {
            addCriterion("publicity_column not in", values, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnBetween(String value1, String value2) {
            addCriterion("publicity_column between", value1, value2, "publicityColumn");
            return (Criteria) this;
        }

        public Criteria andPublicityColumnNotBetween(String value1, String value2) {
            addCriterion("publicity_column not between", value1, value2, "publicityColumn");
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