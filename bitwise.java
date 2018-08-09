import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int c,n;
		n=str.length();
		c=0;
		for(int i=0;i<n;i++){
			if((str.charAt(i)=='1')||(str.charAt(i)=='0')){
				
			}
			else{
				c++;
			}
		}
		
		if(c==0){
		
			System.out.print("yes");
	
		}
		else{
					
			System.out.print("no");
		}
	
		
		
	}
	
}
