import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n,count=0;
	Scanner Sc=new Scanner(System.in);
	n=Sc.nextInt();
	while(n!=0)
	{
		n=n/10;
		++count;
		}
		System.out.println(count);// your code goes here
	}
}
