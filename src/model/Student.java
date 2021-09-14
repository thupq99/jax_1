package model;

public class Student {

	private int id;
    private String username;
    private String password;
    private String name;
    private int age;
    private String code;
    private String className;
    private String address;
    private float mark;
	public Student() {
		super();
	}
	public Student(int id, String username, String password, String name, int age, String code, String className,
			String address, float mark) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.age = age;
		this.code = code;
		this.className = className;
		this.address = address;
		this.mark = mark;
	}
	public Student(String username, String password, String name, int age, String code, String className,
			String address, float mark) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.age = age;
		this.code = code;
		this.className = className;
		this.address = address;
		this.mark = mark;
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCode() {
		return code;
	}
	public String getClassName() {
		return className;
	}
	public String getAddress() {
		return address;
	}
	public float getMark() {
		return mark;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
    
    
    
}
