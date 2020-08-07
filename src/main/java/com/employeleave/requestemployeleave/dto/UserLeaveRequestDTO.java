package com.employeleave.requestemployeleave.dto;

import java.sql.Timestamp;
import java.util.Date;

public class UserLeaveRequestDTO {
    private Long id;
    private Long userLeaveRequestId;
    private Long userId;
    private Timestamp leaveDateFrom;
    private Timestamp leaveDateTo;
    private String description;
    private String status;
    private Timestamp leaveRequestDate;
    private String createdBy;
    private Timestamp createdDate;
    private String updatedBy;
    private Integer leaveDayRemaining;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserLeaveRequestId() {
        return userLeaveRequestId;
    }

    public void setUserLeaveRequestId(Long userLeaveRequestId) {
        this.userLeaveRequestId = userLeaveRequestId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Timestamp getLeaveDateFrom() {
        return leaveDateFrom;
    }

    public void setLeaveDateFrom(Timestamp leaveDateFrom) {
        this.leaveDateFrom = leaveDateFrom;
    }

    public Timestamp getLeaveDateTo() {
        return leaveDateTo;
    }

    public void setLeaveDateTo(Timestamp leaveDateTo) {
        this.leaveDateTo = leaveDateTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getLeaveRequestDate() {
        return leaveRequestDate;
    }

    public void setLeaveRequestDate(Timestamp leaveRequestDate) {
        this.leaveRequestDate = leaveRequestDate;
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

    public Integer getLeaveDayRemaining() {
        return leaveDayRemaining;
    }

    public void setLeaveDayRemaining(Integer leaveDayRemaining) {
        this.leaveDayRemaining = leaveDayRemaining;
    }
}
