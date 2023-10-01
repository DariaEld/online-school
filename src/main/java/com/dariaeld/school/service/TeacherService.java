package com.dariaeld.school.service;

import com.dariaeld.school.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    Teacher addTeacher(Teacher teacher);

    Teacher getLessonsByTeacher(String id);
}
