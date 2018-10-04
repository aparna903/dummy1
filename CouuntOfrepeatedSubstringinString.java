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
		String str,str1;
		int count=0;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        str1=sc.next();
        if(str.length()==0 && str==null){
        	System.out.print("no string to compare");
        }
        else{
        	int id=0;
        	
        	while((id=str.indexOf(str1,id))!=-1){
        		count++;
        		id=id+str1.length()-1;
        	}
        	System.out.print(count);
        }
      //  System.out.print(count);
	}
}
