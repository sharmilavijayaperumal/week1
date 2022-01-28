package week1.day1;

public class mobile {
	
	public void sendMessage()
	{
		System.out.println("Hi");
	}
	public int makecall()
	{
		int phonenumber = 98564321;
		return phonenumber;
	}
	public void savecontact()
	{
		String name = "SHE";
		int phonenumber = 98564321;
		System.out.println("contact saved:"+name +phonenumber);
		
		;
	}
	public static void main(String[]args)
	{
		mobile objMobile = new mobile();
		objMobile.sendMessage();
		objMobile.makecall();
		int makecall = objMobile.makecall();
		System.out.println(makecall);
		objMobile.savecontact();
		
		
	}

}
