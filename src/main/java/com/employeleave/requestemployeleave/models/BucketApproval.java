package com.employeleave.requestemployeleave.models;

import javax.persistence.*;
import java.sql.Timestamp;

//test
@Entity
@Table(name = "bucket_approval",schema = "public")
public class BucketApproval {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "bucket_approval_id_seq")
    private Long id;
    @Column(name = "bucket_approval_id")
    private Long bucketApprovalId;
    @Column(name = "user_leave_request_id")
    private Long userLeaveRequestId;
    @Column(name = "resolver_reason")
    private String resolverReason;
    @Column(name = "resolved_by")
    private String resolvedBy;
    @Column(name = "resolved_date")
    private Timestamp resolvedDate;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "updated_by")
    private  String updatedBy;
    @Column(name = "updated_date")
    private  Timestamp updatedDate;
    @Column(name = "status")
    private  String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBucketApprovalId() {
        return bucketApprovalId;
    }

    public void setBucketApprovalId(Long bucketApprovalId) {
        this.bucketApprovalId = bucketApprovalId;
    }

    public Long getUserLeaveRequestId() {
        return userLeaveRequestId;
    }

    public void setUserLeaveRequestId(Long userLeaveRequestId) {
        this.userLeaveRequestId = userLeaveRequestId;
    }

    public String getResolverReason() {
        return resolverReason;
    }

    public void setResolverReason(String resolverReason) {
        this.resolverReason = resolverReason;
    }

    public String getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public Timestamp getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Timestamp resolvedDate) {
        this.resolvedDate = resolvedDate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
