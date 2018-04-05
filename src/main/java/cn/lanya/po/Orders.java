package cn.lanya.po;

import java.io.Serializable;

public class Orders implements Serializable {
    private Integer orderId;

    private String orderPublisher;

    private String orderSendee;

    private Integer orderNum;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderPublisher() {
        return orderPublisher;
    }

    public void setOrderPublisher(String orderPublisher) {
        this.orderPublisher = orderPublisher == null ? null : orderPublisher.trim();
    }

    public String getOrderSendee() {
        return orderSendee;
    }

    public void setOrderSendee(String orderSendee) {
        this.orderSendee = orderSendee == null ? null : orderSendee.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderPublisher=").append(orderPublisher);
        sb.append(", orderSendee=").append(orderSendee);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}