package com.dariaeld.school.controller;

import com.dariaeld.school.model.Subject;
import com.dariaeld.school.model.Teacher;
import com.dariaeld.school.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/all")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/{id}/teachers")
    public List<Teacher> getTeachersBySubject(@PathVariable String id) {
        return subjectService.getTeachersBySubject(id);
    }
}
