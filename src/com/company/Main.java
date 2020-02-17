package com.company;

public class Main {

    public static void main(String[] args) {
	   Employee emp1 = new Employee();
	   emp1.setEmpid(101);
	   emp1.setLname("Peter");
	   emp1.setFname("Jane");
	   emp1.setEmail("janepe89@gmail.com");
        System.out.println(emp1.toString());
    }
}
