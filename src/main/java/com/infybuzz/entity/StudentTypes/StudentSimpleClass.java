package com.infybuzz.entity.StudentTypes;

/**
 * @author dcaric on 12/04/2022
 * @project spring-boot-app
 */
public class StudentSimpleClass {

    private Long id;
    private String firstName;

    public StudentSimpleClass(Long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
}
