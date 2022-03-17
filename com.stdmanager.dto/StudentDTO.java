package com.stdmanager.dto;

public class StudentDTO {
	// 번호(no) 이름(name) 나이(age) 성별(gender)
	
	private int no;
	private String name;
	private int age;
	private char gender;
	
	public StudentDTO() {}  
	// 빈 공간에 shift + alt + s 누르면 generate getters and setters
	// generate constructor using field -> 생성자 만들어줌.
	public StudentDTO(int no, String name, int age, char gender) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public int getNo() {
		return this.no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return this.gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
 //generate tostring -> printAll 과 같은
	@Override // <- 참조변수의 이름을 불러도 toString 결과값이 실행된것과 똑같이 나온다.
	public String toString() {
		return  no + " : " + name + " : " + age + " : " + gender;
	}
	
}
