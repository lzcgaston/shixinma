package com.lzc.controller;

import com.lzc.entity.Student;
import com.lzc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author liu zicheng
 * @date 2019/8/21 11:47
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }
    @PostMapping("/save")
    public void  save(Student student){
        studentRepository.saveOrUpdate(student);
    }
    @PutMapping("/update")
    public void  update(Student student){
        studentRepository.saveOrUpdate(student);
    }
    @DeleteMapping("/deleteById{id}")
    public void deleteById(@PathVariable("id")long id){
        studentRepository.deleteById(id);
    }
    @GetMapping("/index")
    private String index(){
        return "当前端口: " + this.port;
    }
}
