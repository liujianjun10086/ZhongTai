package cn.lanya.po;

import java.io.Serializable;

public class Power implements Serializable {
    private Integer powerId;

    private Integer powerNum;

    private String powerItem;

    private String powerUrl;

    private Module module;

    private Integer moduleid;

    private static final long serialVersionUID = 1L;

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public Integer getPowerNum() {
        return powerNum;
    }

    public void setPowerNum(Integer powerNum) {
        this.powerNum = powerNum;
    }

    public String getPowerItem() {
        return powerItem;
    }

    public void setPowerItem(String powerItem) {
        this.powerItem = powerItem == null ? null : powerItem.trim();
    }

    public String getPowerUrl() {
        return powerUrl;
    }

    public void setPowerUrl(String powerUrl) {
        this.powerUrl = powerUrl == null ? null : powerUrl.trim();
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", powerId=").append(powerId);
        sb.append(", powerNum=").append(powerNum);
        sb.append(", powerItem=").append(powerItem);
        sb.append(", powerUrl=").append(powerUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}