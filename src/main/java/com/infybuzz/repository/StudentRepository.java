package com.infybuzz.repository;

import com.infybuzz.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dcaric on 10/04/2022
 * @project spring-boot-app
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
