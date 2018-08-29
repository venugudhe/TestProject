package com.rajasri.employee;

public class Employee {
	public int i1=10;
	public static int i2=20;
   public static void main(String[] args) {
	
	Employee e1=new Employee();
	e1.i1=20;
	e1.i2=30;
	Employee e2=new Employee();
	e2.i1=30;
	e2.i2=40;
	System.out.println(e1.i1+","+e1.i2+","+e2.i1+","+e2.i2);
}
}
