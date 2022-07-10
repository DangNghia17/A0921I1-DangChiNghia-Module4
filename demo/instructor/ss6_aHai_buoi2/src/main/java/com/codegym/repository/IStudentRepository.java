package com.codegym.repository;

import com.codegym.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IStudentRepository extends JpaRepository<Student, Integer> {

    //    @Modifying
    @Query(value = "select student.code_student, student.name_student, student.point, student.gender, student.id_class,classroom.id, classroom.name_class from student inner join classroom on student.id_class = classroom.id where name_student like :nameStudent", nativeQuery = true)
    List<Student> findAllByName(@Param("nameStudent") String name);


    List<Student> findAllByNameStudentContaining(String name);

}
