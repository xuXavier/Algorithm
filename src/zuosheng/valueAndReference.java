package zuosheng;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.Test;

public class valueAndReference {
	private String num="gggg";
	private int num2;
	private static int num1;
	public void add(int   a1) {
		a1=6;
		
	}
	public  void add1(int[][] a1) {
		a1[0][0]=2;
		System.out.println();
	}
	public  void addbshuzu(int[] a1) {
		a1[0]=8;
		System.out.println();
	}
	public static void add2(String a1) {
		a1="f";
	}
	@Test
	public  void test() {
		int [][] a={{1}};
		add1(a);
	    System.out.println(a[0][0]);
	}
	public static void main(String[] args) {
		valueAndReference te=new valueAndReference();
		String a1="fsffsfsfsf";
		int [][] a={{1}};
		int[] bshuzu= {5};
		te.add2(a1);
		te.add1(a);
		te.addbshuzu(bshuzu);
	    System.out.println(a1);
	    System.out.println(a[0][0]);
	    System.out.println(bshuzu[0]);
	    
	}
}
