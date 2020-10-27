package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.dataservice.DataService;
import com.thoughtworks.capability.gtb.entrancequiz.model.Students;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentsRepository {
    private final List<Students> studentsList = DataService.studentsList;

    public List<Students> getStudentsList() {
        return studentsList;
    }

}
