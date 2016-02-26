package com.test;

import info.archinnov.achilles.schema.SchemaGenerator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jimbo on 2/25/16.
 */
public class TestGenerateCQL {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Test
    public void test(){

        String cqlSchema = SchemaGenerator.builder()
                .withKeyspace("default_keyspace_name")
                .generateCustomTypes(true) //default = true
                .generateIndices(true) //default = true
                .generate();

        System.out.println(cqlSchema);


    }

}
