package niuke;

import java.util.Scanner;

public class Main {
	public static int maxGap(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		int len = nums.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			Math.min(min, nums[i]);
			Math.max(max, nums[i]);
		}
		if (min == max) {
			return 0;
		}
		boolean[] hasNum = new boolean[len + 1];
		int[] maxs = new int[len + 1];
		int[] mix=new int[len+1];
		int bid=0;
		for(int i=0;i<len;i++) {
			
		}
		return 0;

	}
	public static  int bucket(long num,long len,long min,long max) {
		return (int)((num-min)*len/(max-min));
		
	}

	public static void main(String[] args) {

	}
}