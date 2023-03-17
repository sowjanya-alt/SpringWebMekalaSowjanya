package com.example.demo.dependencyinjection.model;

import java.util.Date;

public class Student
{
    private final String idStudent;

    private final int idType;

    private final String name;

    private final String lastName;

    private final String nationality;

    private String address;

    private Date birthDate;

    public Student( String idStudent, int idType, String name, String lastName, String nationality)
    {
        this.idStudent = idStudent;
        this.idType = idType;
        this.name = name;
        this.lastName = lastName;
        this.nationality = nationality;
       
        
    }
     
    public Student(String idStudent, int idType, String name, String lastName, String nationality, String address,
			Date birthDate) {
		super();
		this.idStudent = idStudent;
		this.idType = idType;
		this.name = name;
		this.lastName = lastName;
		this.nationality = nationality;
		this.address = address;
		this.birthDate = birthDate;
	}

	public void setAddress( String address )
    {
        this.address = address;
    }

    public void setBirthDate( Date birthDate )
    {
        this.birthDate = birthDate;
    }

    public String getIdStudent()
    {
        return idStudent;
    }

    public int getIdType()
    {
        return idType;
    }

    public String getName()
    {
        return name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getNationality()
    {
        return nationality;
    }

    public String getAddress()
    {
        return address;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }
}
