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
    System.out.println(change("KONOnowicz"));
	}

    static String change(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        StringBuffer sbchanged = new StringBuffer();
        for (int i = 0; i <= sb.length() - 1; i++) 
        {
            if (isLowerCase(sb.charAt(i)))
            {
                sbchanged.append(toUpperCase(sb.charAt((i))));
            }
            if(isUpperCase(sb.charAt(i)))
            {
                sbchanged.append(toLowerCase(sb.charAt(i)));
            }
        }
        return sbchanged.toString();
    
    }
    
  
}  