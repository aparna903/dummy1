import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,a=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<n;i++){
		
			if(n%i==0){
				a++;
				
			}
		}
		if(a==0){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}
