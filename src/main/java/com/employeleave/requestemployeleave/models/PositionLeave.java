package com.employeleave.requestemployeleave.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "position_leave", schema = "public")
public class PositionLeave {
    private long positionLeaveId;
    private Position position;
    private Short maxLeaveDay;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

    public PositionLeave() {
    }

    public PositionLeave(long positionLeaveId, Position position) {
        this.positionLeaveId = positionLeaveId;
        this.position = position;
    }

    public PositionLeave(long positionLeaveId, Position position, Short maxLeaveDay, String createdBy,
                         Date createdDate, String updatedBy, Date updatedDate) {
        this.positionLeaveId = positionLeaveId;
        this.position = position;
        this.maxLeaveDay = maxLeaveDay;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_position_leave_id_seq")
    @SequenceGenerator(name = "generator_position_leave_id_seq", sequenceName = "position_leave_id_seq", schema = "public", allocationSize = 1)
    @Column(name = "position_leave_id", unique = true, nullable = false)
    public long getPositionLeaveId() {
        return positionLeaveId;
    }

    public void setPositionLeaveId(long positionLeaveId) {
        this.positionLeaveId = positionLeaveId;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id", nullable = false)
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    @Column(name = "max_leave_day")
    public Short getMaxLeaveDay() {
        return maxLeaveDay;
    }

    public void setMaxLeaveDay(Short maxLeaveDay) {
        this.maxLeaveDay = maxLeaveDay;
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
    @Column(name = "updated_by", length = 50)
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
}
