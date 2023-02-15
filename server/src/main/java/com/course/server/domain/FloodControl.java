package com.course.server.domain;

public class FloodControl {
    private Integer id;

    private String hiddenDanger;

    private String responsibleUnit;

    private String contactPerson;

    private String contactPhone;

    private String selfCheck;

    private String leadership;

    private String leadershipPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHiddenDanger() {
        return hiddenDanger;
    }

    public void setHiddenDanger(String hiddenDanger) {
        this.hiddenDanger = hiddenDanger;
    }

    public String getResponsibleUnit() {
        return responsibleUnit;
    }

    public void setResponsibleUnit(String responsibleUnit) {
        this.responsibleUnit = responsibleUnit;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getSelfCheck() {
        return selfCheck;
    }

    public void setSelfCheck(String selfCheck) {
        this.selfCheck = selfCheck;
    }

    public String getLeadership() {
        return leadership;
    }

    public void setLeadership(String leadership) {
        this.leadership = leadership;
    }

    public String getLeadershipPhone() {
        return leadershipPhone;
    }

    public void setLeadershipPhone(String leadershipPhone) {
        this.leadershipPhone = leadershipPhone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hiddenDanger=").append(hiddenDanger);
        sb.append(", responsibleUnit=").append(responsibleUnit);
        sb.append(", contactPerson=").append(contactPerson);
        sb.append(", contactPhone=").append(contactPhone);
        sb.append(", selfCheck=").append(selfCheck);
        sb.append(", leadership=").append(leadership);
        sb.append(", leadershipPhone=").append(leadershipPhone);
        sb.append("]");
        return sb.toString();
    }
}