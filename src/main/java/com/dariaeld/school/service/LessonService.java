package com.dariaeld.school.service;

import com.dariaeld.school.model.Lesson;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface LessonService {
    Lesson add(@RequestBody Lesson lesson);

    Lesson getNext(@RequestParam String teacherName);

    List<Lesson> find(@RequestParam String studentName, String subjectName);
}
