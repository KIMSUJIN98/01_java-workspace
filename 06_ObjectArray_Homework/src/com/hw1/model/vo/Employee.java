package com.hw1.model.vo;

public class Employee { 		// 클래스 시작
	// 필드부
	private int empNo; 			// 사번
	private String empName; 	// 사원명
	private String dept; 		// 소속부서
	private String job; 		// 직급
	private int age; 			// 나이
	private char gender; 		// 성별
	private int salary; 		// 급여
	private double bonusPoint; 	// 보너스포인트
	private String phone; 		// 전화번호
	private String address; 	// 주소
	
	
	// 생성자부
	// 기본생성자
	public Employee() {}
	
	// 사번, 사원명, 나이, 성별, 전화번호, 주소
	public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}

	
	// 전체 매개변수 생성자
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		this(empNo, empName, age, gender, phone, address);
		this.dept = dept;
		this.job = job;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
	}

	
	
	// 메소드부
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 모든 필드 한 문자열로 합친 후 반환시켜주는 information 메소드
	public String information() {
		return empNo + ", " + empName + ", " + dept + ", " + job + ", " + age
				+ ", " + gender + ", " + salary + ", " + bonusPoint + ", " + phone
				+ ", " + address;
	}
	
	
	
} 	// 클래스 끝
