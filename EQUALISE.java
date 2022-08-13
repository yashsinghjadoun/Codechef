/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static void Solve(int a,int b){
        if(a==b)System.out.println("YES");
        else{
            if(a<b){
                while(a<b){
                    a=a*2;
                }
            }
            else{
                while(a>b){
                    b=b*2;
                }
            }
            if(a==b)System.out.println("YES");
            else System.out.println("NO");
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int num=sc.nextInt();
		    int nu=sc.nextInt();
		    Solve(num,nu);   
		}
	}
}