package ConstructorStudy;

public class ConstructorUse {

	public static void main(String[] args)
	{
		ConstructorUse cu=new ConstructorUse();
		cu.add();
		ConstructorUse cu1=new ConstructorUse(25,35);
		cu1.add();
		ConstructorUse cu2=new ConstructorUse(15,17,18);
		cu2.add();
	
	}
	
	int a;  //global non static variable
	int b;
	int c;
	
	
	/*ConstructorUse() //deafult constructor
	{
		
	}*/
	
	ConstructorUse() //user defined constructor  --->without parameter
	{
		 a=10;  //local variable
		 b=20;
		 c=30;
	}
	
	ConstructorUse(int x,int y)
	{
		a=x;
		b=y;
		
			
	}
	ConstructorUse(int x,int y,int z)
	{
		
		a=x;
		b=y;
		c=z;
		
		
			
	}
	public void add()
	{
		int q=30;
		int p=40;
		int sum =q+p;
		System.out.println("add is: "+sum);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

	
}
