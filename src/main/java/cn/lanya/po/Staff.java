package cn.lanya.po;

import java.io.Serializable;

public class Staff implements Serializable {
    private Integer staffId;

    private String staffJnum;

    private String staffPassword;

    private String staffName;

    private Integer staffAuthorityid;

    private Authority staffAuthority;

    private Integer staffStateid;

    private State staffState;

    private Integer staffGroupid;

    private Groups staffGroup;

    private static final long serialVersionUID = 1L;

    public Integer getStaffGroupid() {
        return staffGroupid;
    }

    public void setStaffGroupid(Integer staffGroupid) {
        this.staffGroupid = staffGroupid;
    }

    public Groups getStaffGroup() {
        return staffGroup;
    }

    public void setStaffGroup(Groups staffGroup) {
        this.staffGroup = staffGroup;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffJnum() {
        return staffJnum;
    }

    public void setStaffJnum(String staffJnum) {
        this.staffJnum = staffJnum;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getStaffAuthorityid() {
        return staffAuthorityid;
    }

    public void setStaffAuthorityid(Integer staffAuthorityid) {
        this.staffAuthorityid = staffAuthorityid;
    }

    public Authority getStaffAuthority() {
        return staffAuthority;
    }

    public void setStaffAuthority(Authority staffAuthority) {
        this.staffAuthority = staffAuthority;
    }

    public Integer getStaffStateid() {
        return staffStateid;
    }

    public void setStaffStateid(Integer staffStateid) {
        this.staffStateid = staffStateid;
    }

    public State getStaffState() {
        return staffState;
    }

    public void setStaffState(State staffState) {
        this.staffState = staffState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", staffId=").append(staffId);
        sb.append(", staffJnum=").append(staffJnum);
        sb.append(", staffPassword=").append(staffPassword);
        sb.append(", staffName=").append(staffName);
        sb.append(", staffAuthorityid=").append(staffAuthorityid);
        sb.append(", staffStateid=").append(staffStateid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}