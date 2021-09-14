package repository;

import java.util.List;

import exception.StudentAlreadyExists;
import exception.StudentNotFound;
import model.Student;

public interface StudentRepository {

	List<Student> getAllStudent();

	Student getStudent(int id) throws StudentNotFound;

    boolean deleteStudent(int id) throws StudentNotFound;

    Student addStudent(int id, String username, String password, String name, int age, String code, String className,
			String address, float mark) throws StudentAlreadyExists;
}
