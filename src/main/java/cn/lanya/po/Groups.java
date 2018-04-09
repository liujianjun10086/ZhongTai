package cn.lanya.po;

import java.io.Serializable;

public class Groups implements Serializable {
    private Integer groupId;

    private String groupName;

    private Integer groupDepartid;

    private Depart groupDepart;

    private static final long serialVersionUID = 1L;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupDepartid() {
        return groupDepartid;
    }

    public void setGroupDepartid(Integer groupDepartid) {
        this.groupDepartid = groupDepartid;
    }

    public Depart getGroupDepart() {
        return groupDepart;
    }

    public void setGroupDepart(Depart groupDepart) {
        this.groupDepart = groupDepart;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", groupDepart=").append(groupDepart);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}