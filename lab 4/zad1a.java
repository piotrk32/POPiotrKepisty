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
		String s = "hahhehhhdeeg";
		char c = 'e';
		System.out.println("w napisie " + s+ " znak " + c + " wystepuje tyle razy: " + countChar(s, c));
		
	}


    static int countChar(String str, char c)
    {
        int tmp= 0;
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0 ;i<= sb.length()- 1 ; i++)
        {
            if (sb.charAt(i) == c)
            {
                tmp++;
            }
        }
        return tmp;
    }   
}