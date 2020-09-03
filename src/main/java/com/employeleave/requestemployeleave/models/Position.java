package com.employeleave.requestemployeleave.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "position",schema = "public")


public class Position  implements java.io.Serializable{
    private long positionId;
    private String positionName;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private Set<User> userses = new HashSet<User>(0);
    private Set<PositionLeave> positionLeaves = new HashSet<PositionLeave>(0);

    public Position() {
    }

    public Position(long positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public Position(long positionId, String positionName, String createdBy, Date createdDate, String updatedBy,
                     Date updatedDate, Set<User> userses, Set<PositionLeave> positionLeaves) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.userses = userses;
        this.positionLeaves = positionLeaves;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_position_id_seq")
    @SequenceGenerator(name = "generator_position_id_seq", sequenceName = "position_id_seq", schema = "public", allocationSize = 1)
    @Column(name = "position_id", unique = true, nullable = false)
    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }
    @Column(name = "position_name", nullable = false, length = 50)
    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
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
    @Column(name = "updated_by")
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
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
    public Set<User> getUserses() {
        return userses;
    }

    public void setUserses(Set<User> userses) {
        this.userses = userses;
    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
    public Set<PositionLeave> getPositionLeaves() {
        return positionLeaves;
    }

    public void setPositionLeaves(Set<PositionLeave> positionLeaves) {
        this.positionLeaves = positionLeaves;
    }
}
