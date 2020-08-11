package com.employeleave.requestemployeleave.dto;

import java.sql.Timestamp;

public class PositionLeaveDTO {
    private Long Id;
    private Long positionLeaveId;
    private Long positionId;
    private Long maxLeaveDay;
    private String createdBy;
    private Timestamp createdDate;
    private String updatedBy;
    private Timestamp updatedDate;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getPositionLeaveId() {
        return positionLeaveId;
    }

    public void setPositionLeaveId(Long positionLeaveId) {
        this.positionLeaveId = positionLeaveId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getMaxLeaveDay() {
        return maxLeaveDay;
    }

    public void setMaxLeaveDay(Long maxLeaveDay) {
        this.maxLeaveDay = maxLeaveDay;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }
}
