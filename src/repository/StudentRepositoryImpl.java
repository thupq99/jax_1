package repository;

import java.util.ArrayList;
import java.util.List;

import exception.StudentAlreadyExists;
import exception.StudentNotFound;
import model.Student;

public class StudentRepositoryImpl implements StudentRepository{

	private List<Student> StudentList;
	
	public StudentRepositoryImpl() {
		StudentList = new ArrayList<Student>();
		StudentList.add(new Student(1,"thupq", "1234", "thu", 22, "11s", "12a", "tb", 8));
		StudentList.add(new Student(2,"thupq2", "1234", "thu2", 22, "11s", "12a", "tb", 8));
		StudentList.add(new Student(3,"thupq3", "1234", "thu3", 22, "11s", "12a", "tb", 8));
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return StudentList;
	}

	@Override
	public Student getStudent(int id) throws StudentNotFound {
		for(Student st:StudentList) {
			if(id==st.getId()) return st;
		}
		throw new StudentNotFound();
	}

	@Override
	public boolean deleteStudent(int id) throws StudentNotFound {
		for(Student st:StudentList) {
			if(id==st.getId()) {
				StudentList.remove(st);
				return true;
			}
		}
		throw new StudentNotFound();
	}

	@Override
	public Student addStudent(int id, String username, String password, String name, int age, String code,
			String className, String address, float mark) throws StudentAlreadyExists {
		System.out.println("Size: "+StudentList.size());
		for(Student st:StudentList) {
			if(id==st.getId()) {
				throw new StudentAlreadyExists();
			}
		}
		Student st = new Student(id, username, password, name, age, code, className, address, mark);
		StudentList.add(st)
;
		return st;}

}
