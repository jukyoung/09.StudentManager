package com.stdmanager.dto;

public class StudentDTO {
	// ��ȣ(no) �̸�(name) ����(age) ����(gender)
	
	private int no;
	private String name;
	private int age;
	private char gender;
	
	public StudentDTO() {}  
	// �� ������ shift + alt + s ������ generate getters and setters
	// generate constructor using field -> ������ �������.
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
 //generate tostring -> printAll �� ����
	@Override // <- ���������� �̸��� �ҷ��� toString ������� ����ȰͰ� �Ȱ��� ���´�.
	public String toString() {
		return  no + " : " + name + " : " + age + " : " + gender;
	}
	
}
