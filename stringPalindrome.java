import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		String str,rev;
		int n;
		rev="";
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		n=str.length();
		for(int i=n-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.print("yes");
			
		}
		else{
			System.out.print("no");
		}
	}
}
