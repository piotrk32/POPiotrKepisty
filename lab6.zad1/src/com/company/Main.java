package com.company;

public class Main {

    public static void main(String[] args)
    {
	RachunekBankowy saver1 = new RachunekBankowy(2000);
    RachunekBankowy saver2 = new RachunekBankowy(10000);
    saver1.setRocznaStopaProcentowa(0.04);
    saver2.setRocznaStopaProcentowa(0.04);
    System.out.println(saver1.obliczMiesieczneOdsetki((saver1.extract())));
    System.out.println(saver1.obliczMiesieczneOdsetki((saver2.extract())));



    }
}
