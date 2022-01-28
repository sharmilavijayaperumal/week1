package week1.day2;

import java.util.Arrays;

public class learn1 {
	
	public static void main(String[] args) {
		String test = "I am a software tester";
		
		String[] split = test.split(" ");
		System.out.println(Arrays.toString(split));
		for(int i=1;i<=split.length ;i++)
		{
			
		  if(i%2!=0) 
			 {
				char [] charArray=split[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--)
				
				{
					System.out.println("\t" + charArray[j]);
				}
					
			}
		
	          
		
	}
          
	}
}

