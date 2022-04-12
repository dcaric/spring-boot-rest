package com.infybuzz.repository;

import com.infybuzz.entity.SubjectsLearning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dcaric on 12/04/2022
 * @project spring-boot-app
 */
@Repository
public interface SubjectLearningRepository extends JpaRepository<SubjectsLearning, Long> {
}
