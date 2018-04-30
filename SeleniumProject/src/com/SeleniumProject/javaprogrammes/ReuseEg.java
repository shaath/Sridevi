package com.SeleniumProject.javaprogrammes;

public class ReuseEg {

	public static void main(String[] args) 
	{
//		MethodsEg m=new MethodsEg();
//		
//		double res=m.sum(60.44, 40.44, 50.55);
//		System.out.println(res);
		
		
		InterfaceImpl inter=new InterfaceImpl();
		inter.UnImp2();
		
		InterfaceImp2 inter2=new InterfaceImp2();
		inter2.UnImp1();
	}

}
