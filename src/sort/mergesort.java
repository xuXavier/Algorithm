package sort;
/*1 将n长度的数组看成n个排好序长度为1的数组
2 两两归并数组，得到排好序的n/2个长度为2的数组
3 以此类推，直到得到长度为n的数组*/
public class mergesort {
  /*  void mergeArray(int a[],int b[],int c[]){
    	int j = 0,k=0;
    	int lengtha=a.length;
    	int lengthb=b.length;
    	int lengthc=lengtha+lengthb;
    	for(int i=0;i<lengthc;i++){
    		if(a[j]<b[k])
    			c[i]=a[j++];
    		else
    			c[i]=b[k++];
    	}
    }*/
	void mergearray(int a[], int first, int mid, int last, int temp[])
	{
		int i = first, j = mid + 1;
		int m = mid,   n = last;
		int k = 0;
		
		while (i <= m && j <= n)
		{
			if (a[i] <= a[j])
				temp[k++] = a[i++];
			else
				temp[k++] = a[j++];
		}
		
		while (i <= m)
			temp[k++] = a[i++];
		
		while (j <= n)
			temp[k++] = a[j++];
		
		for (i = 0; i < k; i++)
			a[first + i] = temp[i];
	}
	void mergesort(int a[], int first, int last, int temp[])
	{
		if (first < last)
		{
			int mid = (first + last) / 2;
			mergesort(a, first, mid, temp);    //左边有序
			mergesort(a, mid + 1, last, temp); //右边有序
			mergearray(a, first, mid, last, temp); //再将二个有序数列合并
		}
		
	}
	 
	  public static void main(String[] args){
	    	 int a[]={1,3,2,5,4},b[]={6,1,4,5,2};
			 mergesort ins=new mergesort();
			 ins.mergesort(a, 0, 4,b);
			
	  }
	
}
/*算法的时间复杂度为O(nlog2n)，最好O(nlog2n)，最坏O(nlog2n)
 * 稳定
 * */
