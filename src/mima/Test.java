package mima;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

	public static void main(String[] args) {
		ThreadLocalRandom th=ThreadLocalRandom.current();
		System.out.println(th.nextFloat());
		Calendar ca=Calendar.getInstance();
		System.out.println(ca.get(Calendar.YEAR));	
		System.out.println(ca.getTime());	
		}

}

