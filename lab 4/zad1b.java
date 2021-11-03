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
		String str = "hahhehhhdeeghah";
		String sub  = "hah";
		System.out.println(countSubStr(str, sub));
		
	}


    static int countSubStr(String str, String subStr)
    {
        int tmp= 0;
        StringBuffer sb = new StringBuffer(str);
        if (subStr.length() > str.length())
        {
            return 0;
        }
        for (int i = 0 ;i <= sb.length()- 1 ; i++)
        {
            if((sb.length()-1) >= i + subStr.length()-1)
            {
                String s = sb.substring(i, i + subStr.length());
                if (s.equals(subStr))
                {
                    tmp++;
                }
            }
        }
        return tmp;
    }   
}