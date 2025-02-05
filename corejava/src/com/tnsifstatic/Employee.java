package com.tnsifstatic;

public class Employee {
	int eid;
	String name;
	static String companyname="ORACLE";
			Employee(int r,String n){
		eid=r;
		name=n;
	}
        void display() {
        	System.out.println(eid+ "  "+name+ " " +companyname);
        }
        public static void main(String[] args) {
        	Employee e1 = new Employee(14,"sai");
        	Employee e2 = new Employee(15,"nishith");
        	Employee e3 = new Employee(16,"mandeep");
        	e1.display();
        	e2.display();
        	e3.display();
        }
        	
        }




