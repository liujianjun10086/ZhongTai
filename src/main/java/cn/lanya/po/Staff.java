package cn.lanya.po;

import java.io.Serializable;

public class Staff implements Serializable {
    private Integer staffId;

    private String staffJnum;

    private String staffPassword;

    private String staffName;

    private Integer staffAuthority;

    private Integer staffState;

    private static final long serialVersionUID = 1L;

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
        this.staffJnum = staffJnum == null ? null : staffJnum.trim();
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword == null ? null : staffPassword.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Integer getStaffAuthority() {
        return staffAuthority;
    }

    public void setStaffAuthority(Integer staffAuthority) {
        this.staffAuthority = staffAuthority;
    }

    public Integer getStaffState() {
        return staffState;
    }

    public void setStaffState(Integer staffState) {
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
        sb.append(", staffAuthority=").append(staffAuthority);
        sb.append(", staffState=").append(staffState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}