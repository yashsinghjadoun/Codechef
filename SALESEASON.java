/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static void Solve(int n){
        if(n<=100)System.out.println(n);
        else if(n<=1000)System.out.println(n-25);
        else if(n<=5000)System.out.println(n-100);
        else System.out.println(n-500);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int num=sc.nextInt();
		    Solve(num);   
		}
	}
}
