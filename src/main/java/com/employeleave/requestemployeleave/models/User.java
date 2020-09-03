package com.employeleave.requestemployeleave.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.jboss.logging.Field;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users",schema = "public")
public class User implements java.io.Serializable {

    private Long id;
    private Long userId;
    private String name;
    private String gender;
    private Long positionId;
    private Position position;
    private String address;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private Date birthDate;
    private Long leaveBalance;

    private Set<UserLeaveRequest> userLeaveRequests = new HashSet<UserLeaveRequest>(0);

    public User() {
    }

    public User(long userId, Position position, String name) {
        this.userId = userId;
        this.position = position;
        this.name = name;
    }

    public User (long userId, Position position, String name, Date birthDate, String address, String gender,
                 String createdBy, Date createdDate, String updatedBy, Date updateDate, Long leaveBalance,
                 Set<UserLeaveRequest> userLeaveRequests) {
        this.userId = userId;
        this.position = position;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.gender = gender;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updateDate;
        this.leaveBalance = leaveBalance;
        this.userLeaveRequests = userLeaveRequests;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "user_id_seq")
    @SequenceGenerator(name = "generator_users_id_seq", sequenceName = "users_id_seq", schema = "public", allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Column(name = "user_id", nullable = false, length = 100)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "gender", length = 10)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id", nullable = false)
    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    @Column(name = "address", length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date", length = 13)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }
    @Column(name = "leave_balance")
    public Long getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(Long leaveBalance) {
        this.leaveBalance = leaveBalance;
    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<UserLeaveRequest> getUserLeaveRequests() {
        return this.userLeaveRequests;
    }

    public void setUserLeaveRequests(Set<UserLeaveRequest> userLeaveRequests) {
        this.userLeaveRequests = userLeaveRequests;
    }
}
