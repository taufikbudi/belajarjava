package com.employeleave.requestemployeleave.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "user_leave_request",schema = "public")
public class UserLeaveRequest {
    private Long id;
    private Long userLeaveRequestId;
    private Long userId;
    private User user;
    private Date leaveDateFrom;
    private Date leaveDateTo;
    private String description;
    private String status;
    private Date leaveRequestDate;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private Short leaveDayRemaining;
    private Set<BucketApproval> bucketApprovals = new HashSet<BucketApproval>(0);

    public UserLeaveRequest() {
    }

    public UserLeaveRequest(long userLeaveRequestId, User user) {
        this.userLeaveRequestId = userLeaveRequestId;
        this.user = user;
    }

    public UserLeaveRequest(long userLeaveRequestId, User user, Date leaveDateFrom, Date leaveDateTo,
                            String description, String status, Date leaveRequestDate, String createdBy, Timestamp createdDate,
                            String updatedBy, Date updatedDate, Short leaveDayRemaining, Set<BucketApproval> bucketApprovals) {
        this.userLeaveRequestId = userLeaveRequestId;
        this.user = user;
        this.leaveDateFrom = leaveDateFrom;
        this.leaveDateTo = leaveDateTo;
        this.description = description;
        this.status = status;
        this.leaveRequestDate = leaveRequestDate;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.leaveDayRemaining = leaveDayRemaining;
        this.bucketApprovals = bucketApprovals;
    }
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_user_leave_request_id_seq")
    @SequenceGenerator(name = "generator_user_leave_request_id_seq", sequenceName = "user_leave_request_id_seq", schema = "public", allocationSize = 1)
    @Column(name = "user_leave_request_id", unique = true, nullable = false)
    public Long getUserLeaveRequestId() {
        return userLeaveRequestId;
    }

    public void setUserLeaveRequestId(Long userLeaveRequestId) {
        this.userLeaveRequestId = userLeaveRequestId;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Temporal(TemporalType.DATE)
    @Column(name = "leave_date_from", length = 13)
    public Date getLeaveDateFrom() {
        return leaveDateFrom;
    }

    public void setLeaveDateFrom(Date leaveDateFrom) {
        this.leaveDateFrom = leaveDateFrom;
    }
    @Temporal(TemporalType.DATE)
    @Column(name = "leave_date_to", length = 13)
    public Date getLeaveDateTo() {
        return leaveDateTo;
    }

    public void setLeaveDateTo(Date leaveDateTo) {
        this.leaveDateTo = leaveDateTo;
    }
    @Column(name = "description", length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "status", length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "leave_request_date", length = 13)
    public Date getLeaveRequestDate() {
        return leaveRequestDate;
    }

    public void setLeaveRequestDate(Date leaveRequestDate) {
        this.leaveRequestDate = leaveRequestDate;
    }

    @Column(name = "created_by", length = 50)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    @Temporal(TemporalType.DATE)
    @Column(name = "created_date", length = 13)
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    @Column(name = "updated_by", length = 255)
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date", length = 13)
    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Column(name = "leave_day_remaining")
    public Short getLeaveDayRemaining() {
        return leaveDayRemaining;
    }

    public void setLeaveDayRemaining(Short leaveDayRemaining) {
        this.leaveDayRemaining = leaveDayRemaining;
    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userLeaveRequest")
    public Set<BucketApproval> getBucketApprovals() {
        return bucketApprovals;
    }

    public void setBucketApprovals(Set<BucketApproval> bucketApprovals) {
        this.bucketApprovals = bucketApprovals;
    }
}
