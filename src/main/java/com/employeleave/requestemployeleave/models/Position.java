package com.employeleave.requestemployeleave.models;

import javax.persistence.*;
import java.sql.Timestamp;


public class Position {

    private Long id;

    private Long positionId;
    private String positionName;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdDate;
    private Timestamp updatedDate;

}
