package cn.lanya.po;

import java.io.Serializable;
import java.util.Date;

public class Record implements Serializable {
    private Integer recordId;

    private String recordCustomerName;

    private String recordCustomerPhone;

    private String recordCustomerNum;

    private Integer recordOrganize;

    private Organize organize;

    private Double recordApply;

    private Integer recordProgress;

    private Progress progress;

    private Double recordGranted;

    private Double recordCommision;

    private String recordStaff;

    private String recordReferee;

    private Date recordDatetime;

    private static final long serialVersionUID = 1L;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordCustomerName() {
        return recordCustomerName;
    }

    public void setRecordCustomerName(String recordCustomerName) {
        this.recordCustomerName = recordCustomerName == null ? null : recordCustomerName.trim();
    }

    public String getRecordCustomerPhone() {
        return recordCustomerPhone;
    }

    public void setRecordCustomerPhone(String recordCustomerPhone) {
        this.recordCustomerPhone = recordCustomerPhone == null ? null : recordCustomerPhone.trim();
    }

    public String getRecordCustomerNum() {
        return recordCustomerNum;
    }

    public void setRecordCustomerNum(String recordCustomerNum) {
        this.recordCustomerNum = recordCustomerNum == null ? null : recordCustomerNum.trim();
    }

    public Integer getRecordOrganize() {
        return recordOrganize;
    }

    public void setRecordOrganize(Integer recordOrganize) {
        this.recordOrganize = recordOrganize;
    }

    public cn.lanya.po.Organize getorganize() {
        return organize;
    }

    public void setOrganize(cn.lanya.po.Organize organize) {
        this.organize = organize;
    }

    public Double getRecordApply() {
        return recordApply;
    }

    public void setRecordApply(Double recordApply) {
        this.recordApply = recordApply;
    }

    public Integer getRecordProgress() {
        return recordProgress;
    }

    public void setRecordProgress(Integer recordProgress) {
        this.recordProgress = recordProgress;
    }

    public cn.lanya.po.Progress getprogress() {
        return progress;
    }

    public void setProgress(cn.lanya.po.Progress progress) {
       this.progress = progress;
    }

    public Double getRecordGranted() {
        return recordGranted;
    }

    public void setRecordGranted(Double recordGranted) {
        this.recordGranted = recordGranted;
    }

    public Double getRecordCommision() {
        return recordCommision;
    }

    public void setRecordCommision(Double recordCommision) {
        this.recordCommision = recordCommision;
    }

    public String getRecordStaff() {
        return recordStaff;
    }

    public void setRecordStaff(String recordStaff) {
        this.recordStaff = recordStaff == null ? null : recordStaff.trim();
    }

    public String getRecordReferee() {
        return recordReferee;
    }

    public void setRecordReferee(String recordReferee) {
        this.recordReferee = recordReferee == null ? null : recordReferee.trim();
    }

    public Date getRecordDatetime() {
        return recordDatetime;
    }

    public void setRecordDatetime(Date recordDatetime) {
        this.recordDatetime = recordDatetime;
    }


    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", recordCustomerName='" + recordCustomerName + '\'' +
                ", recordCustomerPhone='" + recordCustomerPhone + '\'' +
                ", recordCustomerNum='" + recordCustomerNum + '\'' +
                ", recordOrganize=" + recordOrganize +
                ", Organize=" + organize +
                ", recordApply=" + recordApply +
                ", recordProgress=" + recordProgress +
                ", Progress=" + progress +
                ", recordGranted=" + recordGranted +
                ", recordCommision=" + recordCommision +
                ", recordStaff='" + recordStaff + '\'' +
                ", recordReferee='" + recordReferee + '\'' +
                ", recordDatetime=" + recordDatetime +
                '}';
    }
}