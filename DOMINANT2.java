/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int num=sc.nextInt();
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int j=0;j<num;j++)
		    {
		        int a=sc.nextInt();
		        if(map.containsKey(a))map.put(a,map.get(a)+1);
		        else map.put(a,1);
		    }
		    int ii=0;
		    int arr[]=new int[map.size()];
            for(int key:map.keySet())arr[ii++]=map.get(key); 
            Arrays.sort(arr);
            //for(int kkk:arr)System.out.println(kkk);
            if(arr.length==1)System.out.println("Yes");
            else
            {
                if(arr[map.size()-1]==arr[map.size()-2])System.out.println("No");
                else System.out.println("Yes");
            }
		}
	}
}
