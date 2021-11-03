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
    System.out.println(countFile2("C:\Users\Ja\Desktop\lab4\zad2", 'd'));
	}

        public static int countFile2(String file, String word) throws FileNotFoundException 
        {
        int tmp = 0;
        Scanner scan = new Scanner(new File(file));
        while(scan.hasNext())
        {
            String compare = scan.next();
            if (compare.equalsIgnoreCase(word))
            {
                tmp++;
            }
        }

        return tmp;
    }

    
    