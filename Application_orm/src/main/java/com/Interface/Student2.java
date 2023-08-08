package com.Interface;

import java.util.List;

import com.entity.Student;

public interface Student2 {
	abstract public void insertStudent(Student s);

	abstract public void updateById(Student s);

	abstract public Student getStdById(int id);

	abstract public List<Student> getAllStudent();

	abstract public void deleteStudetById(int id);
}
