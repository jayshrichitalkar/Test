package ControlStatmentStudy;

public class ElseIfUse {

	public static void main(String[] args) 
   {
		int marks=45;
		
		if(marks>=75)
		{
			System.out.println("I am pass with destinction");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("i am pass with first class");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("i am pass with higher second class");
		}
		else if(marks>=40 && marks<50)
		{
			System.out.println("i am pass ");
		}
		else
		{
			System.out.println("I am fail");
		}

	}

}
