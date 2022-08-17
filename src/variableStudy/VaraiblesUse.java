package variableStudy;

public class VaraiblesUse 
{
	//Variables--->it is used to stored information.
	//         --->variables are the piece of memory amd one variable can store one information at a one time.
	//        ----> to reuse the information.
	//        ----->in programming, if we directly deal with the  information is not good practice-->to overcome this we use varaibles
	//        ----->there are 3 steps for utilize variables
	//              1.varaible declaration(allocate memory,name,datatype to variable)
	//              2.variable initialization(assigning value to variable)
	//              3.Usage(printing stmnt and other operation)
	// Types --->
	// 1.global variable-->global variable are declared inside class and outside method/block/constructor.the scope of global variable is remains throughout class.it is called permanant variable
	//                  1.static-->class varaible--->call in same class -->varaiblename
	 //                                           --->call from another class-->classname.variablename
	//          (call in static and non static method)
	//                  2.non static-->instant variable --->call in same class-->create obj of class-->obj name.variable
	 //                                                 --->call from another class-->create obj of class-->obj name.variable
	//          (call in only non static method)
	//          we can not call non static global variable in static method becz static is singlr replica(we can not give static reference to non static field/varaible  )
	// 2.local variable--->local variable are declared inside method/block/constructor.the scope of local variable is remains within method/block/constructor.it is called temporary variable
	
	
	
	int d=20; //non static global variable
	int a=20; //
	static int b=30;   //static global variable
	
	static int c=60;
	 

	public static void main(String[] args) 
	{
       VaraiblesUse vu=new VaraiblesUse();   //create a object of class
       vu.add();                             //call non static method
       sub();
       
       System.out.println(" non static global variable is:"+vu.a);
       System.out.println(" static global variable is:"+b);
       
       int sum1=10+vu.a;
       int sub1=40-b;
       System.out.println("addition of non static global variable is:"+sum1);
       System.out.println("substraction is of static global variable is:"+sub1);
       
       Test t=new Test();
       System.out.println("non ststic global variable(p) from another class:"+t.p);
       System.out.println("static global variable(m) from another class:"+Test.m);
       
	}
	
	public void add()   //non static method
	{
		int a=10;   //local variable
		int sum=a+100;
		System.out.println("\nthe addition of local variable is :"+sum);
		
		System.out.println("\n non static global variable(d) in non static method "+d);
		
		System.out.println("\nstatic global variable in non sttaic method "+b);
		
		System.out.println("\nstatic global variable in non sttaic method "+c);

	}
	
	
	public static void sub()   //static method
	{
		int a=40;
		int diff=100-a;
		System.out.println("\nthe substraction is:"+diff);
		
		System.out.println("\nstatic global variable in static method "+b);
		
		System.out.println("\nstatic global variable in sttaic method "+c);
		
		//System.out.println("\nstatic global variable(d) in sttaic method "+d);
		
	}

}
