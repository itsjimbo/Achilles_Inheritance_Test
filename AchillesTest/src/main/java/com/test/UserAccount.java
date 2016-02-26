package com.test;

import info.archinnov.achilles.annotations.Column;
import info.archinnov.achilles.annotations.PartitionKey;
import info.archinnov.achilles.annotations.Table;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by jimbo on 2/25/16.
 */

@Table
public class UserAccount  extends AbstractEntity implements Serializable {

    @PartitionKey
    private UUID userid;

    @Column
    private String name;


    public UUID getUserid() {
        return userid;
    }

    public void setUserid(UUID userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
