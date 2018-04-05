package cn.lanya.po;

import java.io.Serializable;

public class Application implements Serializable {
    private Integer applicationId;

    private String applicationUsername;

    private String applicationPhone;

    private String applicationNumber;

    private Double applicationMoney;

    private static final long serialVersionUID = 1L;

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationUsername() {
        return applicationUsername;
    }

    public void setApplicationUsername(String applicationUsername) {
        this.applicationUsername = applicationUsername == null ? null : applicationUsername.trim();
    }

    public String getApplicationPhone() {
        return applicationPhone;
    }

    public void setApplicationPhone(String applicationPhone) {
        this.applicationPhone = applicationPhone == null ? null : applicationPhone.trim();
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber == null ? null : applicationNumber.trim();
    }

    public Double getApplicationMoney() {
        return applicationMoney;
    }

    public void setApplicationMoney(Double applicationMoney) {
        this.applicationMoney = applicationMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applicationId=").append(applicationId);
        sb.append(", applicationUsername=").append(applicationUsername);
        sb.append(", applicationPhone=").append(applicationPhone);
        sb.append(", applicationNumber=").append(applicationNumber);
        sb.append(", applicationMoney=").append(applicationMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}