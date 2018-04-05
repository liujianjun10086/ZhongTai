package cn.lanya.po;

import java.io.Serializable;

public class Staff_power implements Serializable {
    private Integer staffPowerId;

    private String staffPowerJnum;

    private Integer staffPowerNum;

    private static final long serialVersionUID = 1L;

    public Integer getStaffPowerId() {
        return staffPowerId;
    }

    public void setStaffPowerId(Integer staffPowerId) {
        this.staffPowerId = staffPowerId;
    }

    public String getStaffPowerJnum() {
        return staffPowerJnum;
    }

    public void setStaffPowerJnum(String staffPowerJnum) {
        this.staffPowerJnum = staffPowerJnum == null ? null : staffPowerJnum.trim();
    }

    public Integer getStaffPowerNum() {
        return staffPowerNum;
    }

    public void setStaffPowerNum(Integer staffPowerNum) {
        this.staffPowerNum = staffPowerNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", staffPowerId=").append(staffPowerId);
        sb.append(", staffPowerJnum=").append(staffPowerJnum);
        sb.append(", staffPowerNum=").append(staffPowerNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}