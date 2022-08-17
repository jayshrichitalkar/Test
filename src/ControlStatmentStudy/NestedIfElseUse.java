package ControlStatmentStudy;

public class NestedIfElseUse {

	public static void main(String[] args)
	{
		String username = "Jayshri Hajare";
		String password = "1234abcd";
		
		if(username=="Jayshri Hajare")
		{
			System.out.println("\nuser name is correct,plz enter password");
			 
			if(password=="1234abcd")
			{
				System.out.println("\n password is correct. login successfully");
				
			}
			else
			{
				System.out.println("plz enter valid password");
			}
			
		}
		else
		{
			System.out.println("\nusername is invalid");
		}
		
	}
}
