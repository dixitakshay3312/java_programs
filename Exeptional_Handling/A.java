/*
public class A  // Unchecked Exception 
{
	public static void main(String args[])
	{
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println(10/0); // Arithematic Exception
		System.out.println("Hello");
		System.out.println("Hello");
		

		
		int a[]={10,20,30};

		System.out.println(a[0]);
		System.out.println(a[10]); // Array index out of Bond Exception
		System.out.println(a[2]);
		

		String str = "Akshay";

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(8));// String index out of Bond Exception
		System.out.println(str.charAt(3));


	}
}

*/


public class A  // Checked exception
{
	public static void main(String args[])
	{
		System.out.println("checked Exception");
		Thread.sleep(1000);  // error: unreported exception InterruptedException;
		System.out.println("rest of the app");
	}
}


