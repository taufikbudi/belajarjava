package com.employeleave.requestemployeleave.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "position_leave", schema = "public")
public class PositionLeave {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "position_leave_id_seq")
    private Long Id;
    @Column(name = "position_leave_id")
    private Long positionLeaveId;
    @Column(name = "position_id")
    private Long positionId;
    @Column(name = "max_leave_day")
    private Long maxLeaveDay;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "updated_date")
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
