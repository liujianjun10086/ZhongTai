package cn.lanya.po;

import java.io.Serializable;

public class Customer implements Serializable {
    private Integer customerId;

    private String customerName;

    private String customerNumber;

    private String customerPhone;

    private String customerQrcode;

    private Integer customerReferee;

    private Integer customerState;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber == null ? null : customerNumber.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerQrcode() {
        return customerQrcode;
    }

    public void setCustomerQrcode(String customerQrcode) {
        this.customerQrcode = customerQrcode == null ? null : customerQrcode.trim();
    }

    public Integer getCustomerReferee() {
        return customerReferee;
    }

    public void setCustomerReferee(Integer customerReferee) {
        this.customerReferee = customerReferee;
    }

    public Integer getCustomerState() {
        return customerState;
    }

    public void setCustomerState(Integer customerState) {
        this.customerState = customerState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerNumber=").append(customerNumber);
        sb.append(", customerPhone=").append(customerPhone);
        sb.append(", customerQrcode=").append(customerQrcode);
        sb.append(", customerReferee=").append(customerReferee);
        sb.append(", customerState=").append(customerState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}