package com.dariaeld.school.controller;

import com.dariaeld.school.model.Lesson;
import com.dariaeld.school.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lesson")
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @PostMapping("/add")
    public Lesson add(@RequestBody Lesson lesson) {
        return lessonService.add(lesson);
    }

    @GetMapping("/next")
    public Lesson getNext(@RequestParam String teacherName) {
        return lessonService.getNext(teacherName);
    }

    @GetMapping("/find")
    public List<Lesson> find(@RequestParam String studentName, @RequestParam String subjectName) {
        return lessonService.find(studentName, studentName);
    }
}
