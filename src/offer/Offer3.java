package offer;

import sort.insertsort;

/*	题目3： 
	在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，
	但不知道有几个数字重复了，也不知道每个数字重复的次数。请找出数组中任意一个重
	复的数字。例如如果输入长度为7的数组{2,3,1,0,2,5,3},那么对应的输出是重
	复的数字2或者3。*/

/*	三种解决
	1.排序数组再扫描
	2.哈希表
	3.利用下标*/

public class Offer3 {
	static int re;
	public int repeat(int a[]){
		int tem=0;
		for(int j=0;j<a.length;j++){	
			tem=a[j];
			 while(j!=tem){
		    if(tem==a[tem]){
		    	return tem;
		    }
	         int num=a[tem];
		     a[tem]=tem;
		     a[j]=num;
		}
		}
	return 0;
	}
	public static void main(String[] args){
		 int a[]={2,3,1,2,4};
		 Offer3 ins=new Offer3();
		
		 System.out.println("重复值"+ins.repeat(a));
		 for(int i=0;i<5;i++){
		 System.out.println(+a[i]);
		
	}
}
}
