package com.course.server.domain;

public class FsRoad {
    private Integer id;

    private String street;

    private String roadSection;

    private String sanitationGrade;

    private String roadWidth;

    private String roadLength;

    private String roadwayArea;

    private String sidewalkArea;

    private String spaceArea;

    private String greenBeltArea;

    private String greenArea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRoadSection() {
        return roadSection;
    }

    public void setRoadSection(String roadSection) {
        this.roadSection = roadSection;
    }

    public String getSanitationGrade() {
        return sanitationGrade;
    }

    public void setSanitationGrade(String sanitationGrade) {
        this.sanitationGrade = sanitationGrade;
    }

    public String getRoadWidth() {
        return roadWidth;
    }

    public void setRoadWidth(String roadWidth) {
        this.roadWidth = roadWidth;
    }

    public String getRoadLength() {
        return roadLength;
    }

    public void setRoadLength(String roadLength) {
        this.roadLength = roadLength;
    }

    public String getRoadwayArea() {
        return roadwayArea;
    }

    public void setRoadwayArea(String roadwayArea) {
        this.roadwayArea = roadwayArea;
    }

    public String getSidewalkArea() {
        return sidewalkArea;
    }

    public void setSidewalkArea(String sidewalkArea) {
        this.sidewalkArea = sidewalkArea;
    }

    public String getSpaceArea() {
        return spaceArea;
    }

    public void setSpaceArea(String spaceArea) {
        this.spaceArea = spaceArea;
    }

    public String getGreenBeltArea() {
        return greenBeltArea;
    }

    public void setGreenBeltArea(String greenBeltArea) {
        this.greenBeltArea = greenBeltArea;
    }

    public String getGreenArea() {
        return greenArea;
    }

    public void setGreenArea(String greenArea) {
        this.greenArea = greenArea;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", street=").append(street);
        sb.append(", roadSection=").append(roadSection);
        sb.append(", sanitationGrade=").append(sanitationGrade);
        sb.append(", roadWidth=").append(roadWidth);
        sb.append(", roadLength=").append(roadLength);
        sb.append(", roadwayArea=").append(roadwayArea);
        sb.append(", sidewalkArea=").append(sidewalkArea);
        sb.append(", spaceArea=").append(spaceArea);
        sb.append(", greenBeltArea=").append(greenBeltArea);
        sb.append(", greenArea=").append(greenArea);
        sb.append("]");
        return sb.toString();
    }
}