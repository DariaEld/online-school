package com.dariaeld.school.repository;

import com.dariaeld.school.model.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {

    @Query(value = "select l.* from lesson l join teacher t on l.teacher_id = t.id where t.name = ?1 and " +
            " l.lesson_time > now() order by lesson_time limit 1", nativeQuery = true)
    Lesson findNext(String teacherName);
}
