package com.dariaeld.school.repository;

import com.dariaeld.school.model.Lesson;
import com.dariaeld.school.model.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
