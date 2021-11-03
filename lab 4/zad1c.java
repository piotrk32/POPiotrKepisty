/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.lang.StringBuffer;
import java.io.*;
import java.math.*;
import java.util.Scanner;
import static java.lang.Character.*;

public class Main
{
	public static void main(String[] args) 
	{
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(middle(s));
		
	}


    static String middle(String s)
    {
        int tmp= 0;
        StringBuffer sb = new StringBuffer(s);
        StringBuffer str = new StringBuffer();
        if (sb.length() % 2 == 0)
        {
            str.append(sb.charAt(sb.length()/2 - 1)).append(sb.charAt(sb.length() /2));
        }
        if(s.length() % 2 != 0)
        {
            str.append(sb.charAt(sb.length() / 2));
        }
        return str.toString();
    }
}   
