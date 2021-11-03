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
    String s = "troolololololo";
    String sub = "lo";
    int[] tab = where(s, sub);
    for(int i = 0; i <= tab.length-1; i++)
    {
        System.out.println(tab[i]);
	}
	
	}

    static int[] where(String str, String subStr)
    {
        StringBuffer sb = new StringBuffer(str);
        int n = countSubStr(str, subStr);
        int[] where = new int[n];
        int j = 0;
        for(int i = 0; i <= sb.length()-1; i++)
        {
            if((sb.length()-1) >= i + subStr.length() - 1)
            {
                String s = sb.substring(i, i + subStr.length());
                if(s.equals(subStr)) 
                {
                    where[j] = i;
                    j++;

                }
            }
        }
        return where;
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