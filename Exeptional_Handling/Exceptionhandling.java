                                     #  Exception Handling   #

#Exception:- It is an event,that terminates the program abnormally and remaining code of the application is not
             executed.

- There are three types of keywords used in exception handling 
 1)try 2)catch 3)finally 4)throw 5) throws

- There are two ways to handle the exception
1) by using trycatch block 2) by using throws keyword.

# Types of Exceptions(3):

  A)unchecked exception B)checked excetion C) error

  A)unchecked Exception:- The exceptions which are not checked by compiler those exceptions are called unchecked
                           exceptions.
						   (ie. at compile time it will compile but runtime not execute).
-To handle runtime exceptions use trycatch block otherwise use throws keyword to handle exception.

  
 Examples:-
  
  public class A  // Unchecked Exception 
{
	public static void main(String args[])
	{
		/*
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println(10/0); // Arithematic Exception
		System.out.println("Hello");
		System.out.println("Hello");
		*/

		/*
		int a[]={10,20,30};

		System.out.println(a[0]);
		System.out.println(a[10]); // Array index out of Bond Exception
		System.out.println(a[2]);
		*/

		String str = "Akshay";

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(8));// String index out of Bond Exception
		System.out.println(str.charAt(3));


	}
}


B) Checked Exception:- The exceptions which are checked by compiler is called checked exceptions.

-If the application contains checked exception code will not compile.
-To handle checked exception we are having two approches a)Trycatch block b)throws keyword

Example:- 

public class A  // Checked exception
{
	public static void main(String args[])
	{
		System.out.println("checked Exception");
		Thread.sleep(1000);  // error: unreported exception InterruptedException;
		System.out.println("rest of the app");
	}
}


					  