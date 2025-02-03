package org.emp;

public class Employee {
	private void empId() {
		System.out.println("100");
	}
	private void empName() {
		System.out.println("Rajesh Kannan");
	}
	private void empDob() {
	    System.out.println("31-10-1993");
	}
	private void empPhone() {
		System.out.println("8124032050");
	}
	private void empEmail() {
		System.out.println("ABC@infor.com");
	}
	private void empAddress() {
		System.out.println("Hyderabad");
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

