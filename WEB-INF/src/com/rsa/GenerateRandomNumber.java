

package com.rsa;
import java.util.Random;

public class GenerateRandomNumber 
{
	public static int generate3digitNumber() throws Exception 
	{  
		Random generator = new Random();  
		generator.setSeed(System.currentTimeMillis());  
		   
		int num = generator.nextInt(99) + 99;  
		if (num < 100 || num > 999) 
		{  
			num = generator.nextInt(99) + 99;  
			if (num < 100 || num > 999) 
			{  
				throw new Exception("Unable to generate PIN at this time..");  
			}  
		}  
		return num;  
   }
	
  
	public static void main(String[] args) throws Exception
	{
		System.out.println("3 Digit Random Number : " + generate3digitNumber());
		
	}
}
