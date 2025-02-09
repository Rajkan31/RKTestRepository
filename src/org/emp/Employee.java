package org.emp;

public class Employee {
	private void empId() {
		System.out.println("1");
	}
	private void empName() {
		System.out.println("Rajesh Kannan T");
	}
	private void empDob() {
	    System.out.println("31-10-1993");
	}
	private void empPhone() {
		System.out.println("8124032050");
	}
	private void empEmail() {
		System.out.println("XXX@infor.com");
	}
	private void empAddress() {
		System.out.println("Hyderabad");
		System.out.println("Changes done by Rajesh");
	}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.empId();
		obj.empName();
		obj.empDob();
		obj.empPhone();
		obj.empEmail();
		obj.empAddress();
	}
}

