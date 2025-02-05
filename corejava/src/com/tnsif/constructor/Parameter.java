package com.tnsif.constructor;

public class Parameter{
	Parameter()
	{
		System.out.println("default");
	}
	Parameter(int a){
		System.out.println("1 parameter" + a);
	}
Parameter(int a,String name){
	System.out.println("2 parameters "+a+"name :"+name);
}
public static void main(String[] args) {
	Parameter obj1 = new Parameter();
	Parameter obj2 = new Parameter (1);
	Parameter obj3 = new Parameter(1,"sai");
}
}
