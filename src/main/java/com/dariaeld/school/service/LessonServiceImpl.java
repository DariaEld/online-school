package com.dariaeld.school.service;

import com.dariaeld.school.model.Lesson;
import com.dariaeld.school.model.Student;
import com.dariaeld.school.model.Subject;
import com.dariaeld.school.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public Lesson add(Lesson lesson) {
        Lesson newLesson = null;
        Subject teacherSubject = lesson.getTeacher().getSubject();
        if (checkSubject(teacherSubject, lesson.getStudents())) {
            newLesson = lessonRepository.save(lesson);
        }
        return newLesson;
    }

    private boolean checkSubject(Subject teacherSubject, Set<Student> students) {
        boolean allow = true;
        for (Student student : students) {
            if (!student.getSubjects().contains(teacherSubject)) {
                allow = false;
            }
        }
        return allow;
    }

    @Override
    public Lesson getNext(String teacherName) {
        return null;
    }

    @Override
    public List<Lesson> find(String studentName, String subjectName) {
        return null;
    }
}
