package com.practice.collections;

public class Student {


	/*
	 * two private fields with their getter and setters
	 * and one public parameterized constructor
	 */
	
	private String name;
	private int rollno;	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 * toString method convert the object into string
	 */

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}

	
	/*
	 * alt+shift+S -- generate hashcode() and equals()
	 */
	
	/*
	 * here we overrides the { .equals() } method along with hashcode()
	 * -- these two are auto-generated
	 */
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	
//---------------------------------------------------------------------------------------------------

	/*
	 * hash Code generation
	 */
	public static void main(String[] args) {
		Student obj=new Student("sh", 33);	
		Student obj1=new Student("sh", 66);	
		System.out.println("hashCode of 33 : "+obj.hashCode());	
		System.out.println("hashCode of 66 : "+obj1.hashCode());
		}
	
//---------------------------------------------------------------------------------------------------
}

