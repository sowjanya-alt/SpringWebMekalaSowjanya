package com.example.demo.dependencyinjection.services;

import java.util.List;

import com.example.demo.dependencyinjection.model.Student;

public interface StudentService {
         
	
	void add( Student student );

    void delete( Student student );

    List<Student> all();

    Student findById( String id );
}

