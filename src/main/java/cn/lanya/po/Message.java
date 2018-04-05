package cn.lanya.po;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private Integer messageId;

    private String messageName;

    private String messageContent;

    private Integer messageDepart;

    private Date messageDatetime;

    private static final long serialVersionUID = 1L;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName == null ? null : messageName.trim();
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public Integer getMessageDepart() {
        return messageDepart;
    }

    public void setMessageDepart(Integer messageDepart) {
        this.messageDepart = messageDepart;
    }

    public Date getMessageDatetime() {
        return messageDatetime;
    }

    public void setMessageDatetime(Date messageDatetime) {
        this.messageDatetime = messageDatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageId=").append(messageId);
        sb.append(", messageName=").append(messageName);
        sb.append(", messageContent=").append(messageContent);
        sb.append(", messageDepart=").append(messageDepart);
        sb.append(", messageDatetime=").append(messageDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}