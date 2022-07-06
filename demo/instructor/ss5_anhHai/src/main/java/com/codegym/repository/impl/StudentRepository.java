package com.codegym.repository.impl;

import com.codegym.model.Student;
import com.codegym.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {

    @Override
    public List<Student> getAll() {
        List<Student> students = BaseRepository.entityManager.createQuery("select s from Student s", Student.class).getResultList();
        return students;
    }

    @Override
    public void save(Student student) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(student);
        entityTransaction.commit();
    }

    @Override
    public Student findById(Integer codeStudent) {
        Student student = BaseRepository.entityManager.createQuery("select s from Student s where code_student = :code", Student.class).setParameter("code", codeStudent).getSingleResult();
        return student;
    }
}
