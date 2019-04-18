package niuke;

import java.util.Scanner;

/*
 * [编程题]末尾0的个数
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 */
 //https://www.nowcoder.com/questionTerminal/6ffdd7e4197c403e88c6a8aa3e7a332a
public class number1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int res = 0;
	        for(int i = n; i >= 5; i--) {
	            int tmp = i;
	            while(tmp % 5 == 0) {
	                res++;
	                tmp /= 5;
	            }
	        }
	        System.out.println(res);
	    }
}
