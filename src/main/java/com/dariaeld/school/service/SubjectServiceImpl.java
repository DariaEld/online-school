package com.dariaeld.school.service;

import com.dariaeld.school.model.Subject;
import com.dariaeld.school.model.Teacher;
import com.dariaeld.school.repository.StudentRepository;
import com.dariaeld.school.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubjects() {
        return (List<Subject>) subjectRepository.findAll();
    }

    @Override
    public List<Teacher> getTeachersBySubject(String subjectId) {
        return null;
    }
}
