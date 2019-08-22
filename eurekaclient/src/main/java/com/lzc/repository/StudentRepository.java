package com.lzc.repository;

import com.lzc.entity.Student;

import java.util.Collection;

/**
 * @author liu zicheng
 * @date 2019/8/21 11:37
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
