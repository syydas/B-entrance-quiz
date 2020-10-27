package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Students;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {
    private final StudentsService studentsService;

    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @GetMapping("/students")
    public List<Students> getAllStudents() {
        return studentsService.getStudentsList();
    }

}
