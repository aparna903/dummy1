/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int l,w,h,res;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		res=(2*((l*w)+(w*h)+(h*l)));
		System.out.print(res);
		System.out.print(" "+l*w*h);

	}
}
