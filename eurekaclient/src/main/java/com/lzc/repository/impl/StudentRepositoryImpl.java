package com.lzc.repository.impl;

import com.lzc.entity.Student;
import com.lzc.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liu zicheng
 * @date 2019/8/21 11:40
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"LZC",22));
        studentMap.put(2L,new Student(2L,"SZZ",23));
        studentMap.put(3L,new Student(3L,"KMM",25));
        studentMap.put(4L,new Student(4L,"DHH",24));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
