package com.employeleave.requestemployeleave.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

//test
@Entity
@Table(name = "bucket_approval",schema = "public")
public class BucketApproval {
    private long bucketApprovalId;
    private UserLeaveRequest userLeaveRequest;
    private String resolverReason;
    private String resolvedBy;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;

    public BucketApproval() {
    }

    public BucketApproval(long bucketApprovalId, UserLeaveRequest userLeaveRequest) {
        this.bucketApprovalId = bucketApprovalId;
        this.userLeaveRequest = userLeaveRequest;
    }

    public BucketApproval(long bucketApprovalId, UserLeaveRequest userLeaveRequest, String resolverReason,
                          String resolvedBy, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
        this.bucketApprovalId = bucketApprovalId;
        this.userLeaveRequest = userLeaveRequest;
        this.resolverReason = resolverReason;
        this.resolvedBy = resolvedBy;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_bucket_approval_id_seq")
    @SequenceGenerator(name = "generator_bucket_approval_id_seq", sequenceName = "bucket_approval_id_seq", schema = "public", allocationSize = 1)
    @Column(name = "bucket_approval_id", unique = true, nullable = false)
    public long getBucketApprovalId() {
        return bucketApprovalId;
    }

    public void setBucketApprovalId(long bucketApprovalId) {
        this.bucketApprovalId = bucketApprovalId;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_leave_request_id", nullable = false)
    public UserLeaveRequest getUserLeaveRequest() {
        return userLeaveRequest;
    }

    public void setUserLeaveRequest(UserLeaveRequest userLeaveRequest) {
        this.userLeaveRequest = userLeaveRequest;
    }
    @Column(name = "resolver_reason", length = 100)
    public String getResolverReason() {
        return resolverReason;
    }

    public void setResolverReason(String resolverReason) {
        this.resolverReason = resolverReason;
    }
    @Column(name = "resolved_by", length = 100)
    public String getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }
    @Column(name = "created_by", length = 100)
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
    @Column(name = "updated_by", length = 100)
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
    @Column(name = "status", length = 100)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
