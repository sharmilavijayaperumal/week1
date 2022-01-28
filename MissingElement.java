package week1.day2;

public class MissingElement {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,7,6,8};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum +arr[i];
		}
		
		int sum1=0;
		for(int i=1;i<=6;i++)
			
		{
			sum1= sum1+i;
		}
		
		System.out.println("Missing Number is" + (sum1-sum));
	}
	

}
