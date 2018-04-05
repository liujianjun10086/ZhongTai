package cn.lanya.po;

import java.io.Serializable;

public class Organize implements Serializable {
    private Integer organizeId;

    private String organizeName;

    private Double organizeRation;

    private static final long serialVersionUID = 1L;

    public Integer getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(Integer organizeId) {
        this.organizeId = organizeId;
    }

    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName == null ? null : organizeName.trim();
    }

    public Double getOrganizeRation() {
        return organizeRation;
    }

    public void setOrganizeRation(Double organizeRation) {
        this.organizeRation = organizeRation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", organizeId=").append(organizeId);
        sb.append(", organizeName=").append(organizeName);
        sb.append(", organizeRation=").append(organizeRation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}