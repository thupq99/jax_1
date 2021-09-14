package service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import exception.StudentAlreadyExists;
import exception.StudentNotFound;
import model.Student;

@WebService
public interface StudentService {

	@WebMethod
	Student getStudent(int id) throws StudentNotFound;
	
	@WebMethod
	List<Student> getAllStudents();
	
	@WebMethod
	Student addStudent(int id, String username, String password, String name, int age, String code, String className,
			String address, float mark) throws StudentAlreadyExists;
	
	@WebMethod
    boolean deleteStudent(int id) throws StudentNotFound;
}
