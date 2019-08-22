package com.lzc.controller;

import com.lzc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author liu zicheng
 * @date 2019/8/21 13:44
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }
    @GetMapping("/findById")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
    }
    @GetMapping("/findById2")
    public Student findById2(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }
    @GetMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save", student, null).getBody();
    }
    @GetMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save", student, null);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update", student);
    }
    @DeleteMapping("/deleteById")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.put("http://localhost:8010/student/daleteById/{id}", id);
    }
}
