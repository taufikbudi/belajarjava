package com.employeleave.requestemployeleave.models;

import javax.persistence.*;
import java.sql.Timestamp;
//ini models position
@Entity
@Table(name = "position",schema = "public")
public class Position {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "position_id_seq")
    private Long id;
    @Column
    private Long positionId;
    private String positionName;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdDate;
    private Timestamp updatedDate;

}
