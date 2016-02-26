package com.test;

import info.archinnov.achilles.annotations.Column;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jimbo on 2/25/16.
 */
public class AbstractEntity implements Serializable {


    @Column
    @NotNull
    private Date dateCreated;


    @Column
    @NotNull
    private Date dateModified;


    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}
