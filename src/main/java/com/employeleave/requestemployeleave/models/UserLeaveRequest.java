package com.employeleave.requestemployeleave.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "user_leave_request",schema = "public")
public class UserLeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "user_leave_request_id_seq")
    @Column(name = "id")
    private Long id;
    @Column(name = "user_leave_request_id")

    private Long userLeaveRequestId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "leave_date_from")
    private Timestamp leaveDateFrom;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "leave_date_to")
    private Timestamp leaveDateTo;

    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private String status;


    @Temporal(TemporalType.DATE)
    @Column(name = "leave_request_date", length = 13)
    private java.util.Date leaveRequestDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name="created_date", nullable=true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private java.sql.Timestamp createdDate;

    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "leave_day_remaining")
    private Long leaveDayRemaining;

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

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
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

    public java.util.Date getLeaveRequestDate() {
        return leaveRequestDate;
    }

    public void setLeaveRequestDate(java.util.Date leaveRequestDate) {
        this.leaveRequestDate = leaveRequestDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss", timezone="UTC")
    public java.sql.Timestamp getCreatedDate() {
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

    public Long getLeaveDayRemaining() {
        return leaveDayRemaining;
    }

    public void setLeaveDayRemaining(Long leaveDayRemaining) {
        this.leaveDayRemaining = leaveDayRemaining;
    }
}
