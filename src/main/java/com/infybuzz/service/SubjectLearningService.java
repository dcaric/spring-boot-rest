package com.infybuzz.service;

import com.infybuzz.repository.SubjectLearningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dcaric on 12/04/2022
 * @project spring-boot-app
 */
@Service
public class SubjectLearningService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private SubjectLearningRepository subjectLearningRepository;

}
