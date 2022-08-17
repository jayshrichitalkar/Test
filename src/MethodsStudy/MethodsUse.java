package MethodsStudy;

public class MethodsUse {

	public static void main(String[] args) 
	{
	   MethodsUse mu=new MethodsUse();
		mu.test2();	  //calling non static regular method  
		
		test1();     //calling static regular method
		
		Sample.add(); //calling static method of another class (Sample)
		Sample s =new Sample(); //crate object of another class(Sample)
		s.add1();   //calling non static method of another class(Sample)

	}
	
	//method--->Two types
	//          1.Mian method----->Two types
	//               1.public static void test();  // Incomplete method/ Method declaration
	//	             2. public static void test() { };  Complete method/ Method definition
	//          2.Regular methods---->Two types
	//               1.static regular method
	//               2.non static regular method
	
	
	public static void test1()  //static regular method
	{
		System.out.println("Helloooooo");
		
	}
	
	public void test2()  //non static regular method
	{
		System.out.println("Welcome to world");
		
	}
	
	

}
