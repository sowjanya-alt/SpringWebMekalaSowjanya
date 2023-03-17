package com.example.demo.dependencyinjection.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.dependencyinjection.model.Student;
@Service
public class StudentServiceImplMap implements StudentService {

    private Map<String, Student> students;

    public StudentServiceImplMap() {
        students = new HashMap<>();
    }

    @Override
    public void add(Student student) {
        students.put(student.getIdStudent(), student);
    }

    @Override
    public void delete(Student student) {
        students.remove(student.getIdStudent());
    }

    @Override
    public List<Student> all() {
        return new ArrayList<>(students.values());
    }

    @Override
    public Student findById(String id) {
        return students.get(id);
    }
}
