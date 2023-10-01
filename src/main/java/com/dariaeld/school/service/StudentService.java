package com.dariaeld.school.service;

import com.dariaeld.school.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student addStudent(Student student);
}
