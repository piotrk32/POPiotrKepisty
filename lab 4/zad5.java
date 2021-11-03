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
    System.out.println(odsetki(300, 10, 10));
	}

    public static BigDecimal odsetki(double k, double p, int n)
    {
    BigDecimal odsetki = new BigDecimal("1.0");
    odsetki = odsetki.add(new BigDecimal(""+ p/100)).pow(n).multiply(new BigDecimal(""+ k)).multiply(new BigDecimal(""+ k)).multiply(new BigDecimal("0.001"));
    return odsetki;
    }
    
    
       
}

    
    