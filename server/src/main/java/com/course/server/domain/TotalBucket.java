package com.course.server.domain;

public class TotalBucket {
    private Integer id;

    private String subdistrictOffice;

    private String communityName;

    private String households;

    private String villageName;

    private String buildingAttribute;

    private String regularRelease;

    private String regularCollection;

    private String daytimeCollection;

    private String redBlack;

    private String bonusPoints;

    private String specificAddress;

    private String bucketPointsNumber;

    private String bucketPointsType;

    private String bucketPointsId;

    private String bucketPointsPosition;

    private String recyclableCollection;

    private String harmfulCollection;

    private String otherCollection;

    private String kitchenCollection;

    private String bigCollection;

    private String weighingFun;

    private String videoSurveillance;

    private String integralFun;

    private String storageRoom;

    private String restroom;

    private String bucketRoom;

    private String indicatorBar;

    private String billboard;

    private String publicityColumn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubdistrictOffice() {
        return subdistrictOffice;
    }

    public void setSubdistrictOffice(String subdistrictOffice) {
        this.subdistrictOffice = subdistrictOffice;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getHouseholds() {
        return households;
    }

    public void setHouseholds(String households) {
        this.households = households;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getBuildingAttribute() {
        return buildingAttribute;
    }

    public void setBuildingAttribute(String buildingAttribute) {
        this.buildingAttribute = buildingAttribute;
    }

    public String getRegularRelease() {
        return regularRelease;
    }

    public void setRegularRelease(String regularRelease) {
        this.regularRelease = regularRelease;
    }

    public String getRegularCollection() {
        return regularCollection;
    }

    public void setRegularCollection(String regularCollection) {
        this.regularCollection = regularCollection;
    }

    public String getDaytimeCollection() {
        return daytimeCollection;
    }

    public void setDaytimeCollection(String daytimeCollection) {
        this.daytimeCollection = daytimeCollection;
    }

    public String getRedBlack() {
        return redBlack;
    }

    public void setRedBlack(String redBlack) {
        this.redBlack = redBlack;
    }

    public String getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(String bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public String getSpecificAddress() {
        return specificAddress;
    }

    public void setSpecificAddress(String specificAddress) {
        this.specificAddress = specificAddress;
    }

    public String getBucketPointsNumber() {
        return bucketPointsNumber;
    }

    public void setBucketPointsNumber(String bucketPointsNumber) {
        this.bucketPointsNumber = bucketPointsNumber;
    }

    public String getBucketPointsType() {
        return bucketPointsType;
    }

    public void setBucketPointsType(String bucketPointsType) {
        this.bucketPointsType = bucketPointsType;
    }

    public String getBucketPointsId() {
        return bucketPointsId;
    }

    public void setBucketPointsId(String bucketPointsId) {
        this.bucketPointsId = bucketPointsId;
    }

    public String getBucketPointsPosition() {
        return bucketPointsPosition;
    }

    public void setBucketPointsPosition(String bucketPointsPosition) {
        this.bucketPointsPosition = bucketPointsPosition;
    }

    public String getRecyclableCollection() {
        return recyclableCollection;
    }

    public void setRecyclableCollection(String recyclableCollection) {
        this.recyclableCollection = recyclableCollection;
    }

    public String getHarmfulCollection() {
        return harmfulCollection;
    }

    public void setHarmfulCollection(String harmfulCollection) {
        this.harmfulCollection = harmfulCollection;
    }

    public String getOtherCollection() {
        return otherCollection;
    }

    public void setOtherCollection(String otherCollection) {
        this.otherCollection = otherCollection;
    }

    public String getKitchenCollection() {
        return kitchenCollection;
    }

    public void setKitchenCollection(String kitchenCollection) {
        this.kitchenCollection = kitchenCollection;
    }

    public String getBigCollection() {
        return bigCollection;
    }

    public void setBigCollection(String bigCollection) {
        this.bigCollection = bigCollection;
    }

    public String getWeighingFun() {
        return weighingFun;
    }

    public void setWeighingFun(String weighingFun) {
        this.weighingFun = weighingFun;
    }

    public String getVideoSurveillance() {
        return videoSurveillance;
    }

    public void setVideoSurveillance(String videoSurveillance) {
        this.videoSurveillance = videoSurveillance;
    }

    public String getIntegralFun() {
        return integralFun;
    }

    public void setIntegralFun(String integralFun) {
        this.integralFun = integralFun;
    }

    public String getStorageRoom() {
        return storageRoom;
    }

    public void setStorageRoom(String storageRoom) {
        this.storageRoom = storageRoom;
    }

    public String getRestroom() {
        return restroom;
    }

    public void setRestroom(String restroom) {
        this.restroom = restroom;
    }

    public String getBucketRoom() {
        return bucketRoom;
    }

    public void setBucketRoom(String bucketRoom) {
        this.bucketRoom = bucketRoom;
    }

    public String getIndicatorBar() {
        return indicatorBar;
    }

    public void setIndicatorBar(String indicatorBar) {
        this.indicatorBar = indicatorBar;
    }

    public String getBillboard() {
        return billboard;
    }

    public void setBillboard(String billboard) {
        this.billboard = billboard;
    }

    public String getPublicityColumn() {
        return publicityColumn;
    }

    public void setPublicityColumn(String publicityColumn) {
        this.publicityColumn = publicityColumn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subdistrictOffice=").append(subdistrictOffice);
        sb.append(", communityName=").append(communityName);
        sb.append(", households=").append(households);
        sb.append(", villageName=").append(villageName);
        sb.append(", buildingAttribute=").append(buildingAttribute);
        sb.append(", regularRelease=").append(regularRelease);
        sb.append(", regularCollection=").append(regularCollection);
        sb.append(", daytimeCollection=").append(daytimeCollection);
        sb.append(", redBlack=").append(redBlack);
        sb.append(", bonusPoints=").append(bonusPoints);
        sb.append(", specificAddress=").append(specificAddress);
        sb.append(", bucketPointsNumber=").append(bucketPointsNumber);
        sb.append(", bucketPointsType=").append(bucketPointsType);
        sb.append(", bucketPointsId=").append(bucketPointsId);
        sb.append(", bucketPointsPosition=").append(bucketPointsPosition);
        sb.append(", recyclableCollection=").append(recyclableCollection);
        sb.append(", harmfulCollection=").append(harmfulCollection);
        sb.append(", otherCollection=").append(otherCollection);
        sb.append(", kitchenCollection=").append(kitchenCollection);
        sb.append(", bigCollection=").append(bigCollection);
        sb.append(", weighingFun=").append(weighingFun);
        sb.append(", videoSurveillance=").append(videoSurveillance);
        sb.append(", integralFun=").append(integralFun);
        sb.append(", storageRoom=").append(storageRoom);
        sb.append(", restroom=").append(restroom);
        sb.append(", bucketRoom=").append(bucketRoom);
        sb.append(", indicatorBar=").append(indicatorBar);
        sb.append(", billboard=").append(billboard);
        sb.append(", publicityColumn=").append(publicityColumn);
        sb.append("]");
        return sb.toString();
    }
}