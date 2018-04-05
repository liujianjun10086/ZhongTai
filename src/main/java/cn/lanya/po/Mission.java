package cn.lanya.po;

import java.io.Serializable;

public class Mission implements Serializable {
    private Integer missionId;

    private Integer missionRecord;

    private Integer missionType;

    private Integer missionOrder;

    private static final long serialVersionUID = 1L;

    public Integer getMissionId() {
        return missionId;
    }

    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    public Integer getMissionRecord() {
        return missionRecord;
    }

    public void setMissionRecord(Integer missionRecord) {
        this.missionRecord = missionRecord;
    }

    public Integer getMissionType() {
        return missionType;
    }

    public void setMissionType(Integer missionType) {
        this.missionType = missionType;
    }

    public Integer getMissionOrder() {
        return missionOrder;
    }

    public void setMissionOrder(Integer missionOrder) {
        this.missionOrder = missionOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", missionId=").append(missionId);
        sb.append(", missionRecord=").append(missionRecord);
        sb.append(", missionType=").append(missionType);
        sb.append(", missionOrder=").append(missionOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}