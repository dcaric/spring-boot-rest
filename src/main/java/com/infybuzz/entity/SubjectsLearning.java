package com.infybuzz.entity;

import javax.persistence.*;

/**
 * @author dcaric on 11/04/2022
 * @project spring-data-res
 */
@Entity
@Table(name = "subject_learning")
public class SubjectsLearning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sub_name")
    private String subName;

    @Column(name = "marks_obtained")
    private Integer marksObtained;

    @JoinColumn(name = "student_id")
    @ManyToOne
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Integer getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(Integer marksObtained) {
        this.marksObtained = marksObtained;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
