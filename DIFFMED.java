/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void Solve(int n){
        int low=1;
        int high=n;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                System.out.print(high +" ");
                high--;
                continue;
            }
            System.out.print(low +" ");
            low++;
        }
        System.out.println();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here'
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int num=sc.nextInt();
		    Solve(num);
		}
	}
}
