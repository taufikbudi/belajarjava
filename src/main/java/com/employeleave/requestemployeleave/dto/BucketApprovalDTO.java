package com.employeleave.requestemployeleave.dto;

import java.sql.Timestamp;

public class BucketApprovalDTO {
    private Long id;
    private Long bucketApprovalId;
    private Long userLeaveRequestId;
    private String resolverReason;
    private String resolvedBy;
    private Timestamp resolvedDate;
    private String createdBy;
    private Timestamp createdDate;
    private  String updatedBy;
    private  Timestamp updatedDate;
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
