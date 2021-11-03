/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
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
    System.out.println(repeat(s, 15));
	}

    static String repeat(String s, int n)
    {
        StringBuffer sb = new StringBuffer();
        String tmp = s;
        for (int i = 0 ; i <= n-1 ; i++)
        {
            sb.append(tmp);
        }
        return sb.toString();

    }
}   