package com.infybuzz.service;

import com.infybuzz.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dcaric on 12/04/2022
 * @project spring-boot-app
 */
@Service
public class DepartmentService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private DepartmentRepository departmentRepository;
}
