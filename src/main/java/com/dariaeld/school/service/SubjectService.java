package com.dariaeld.school.service;

import com.dariaeld.school.model.Subject;
import com.dariaeld.school.model.Teacher;

import java.util.List;

public interface SubjectService {
    List<Subject> getAllSubjects();

    List<Teacher> getTeachersBySubject(String subjectId);
}
