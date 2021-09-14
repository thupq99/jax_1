package service;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import exception.StudentAlreadyExists;
import exception.StudentNotFound;
import model.Student;
import repository.StudentRepository;

@WebService(serviceName = "StudentService", endpointInterface = "service.StudentService")
public class StudentServiceImpl implements StudentService{
	
	@Inject
    private StudentRepository studentRepository;

	@WebMethod
	public Student getStudent(int id) throws StudentNotFound {
		// TODO Auto-generated method stub
		return studentRepository.getStudent(id);
	}

	@WebMethod
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.getAllStudent();
	}

	@WebMethod
	public Student addStudent(int id, String username, String password, String name, int age, String code,
			String className, String address, float mark) throws StudentAlreadyExists {
		// TODO Auto-generated method stub
		System.out.println("start!");
		return studentRepository.addStudent(id, username, password, name, age, code, className, address, mark);
	}

	@WebMethod
	public boolean deleteStudent(int id) throws StudentNotFound {
		// TODO Auto-generated method stub
		return studentRepository.deleteStudent(id);
	}

}
