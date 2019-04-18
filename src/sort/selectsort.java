package sort;

/*1.初始时，数组a[0..n]全为无序，设i=0；
2从a[i..n]中选出最小值和a[i]交换，则a[0.i]有序
3重复2 直到i=n-1*/
public class selectsort {
    public void selectSort(int a[],int n){
    	int i, j, nMinIndex = 0;
    	for (i = 0; i < n; i++)
    	{
    		nMinIndex = i; //找最小元素的位置
    		for (j = i + 1; j < n; j++)
    			if (a[j] < a[nMinIndex])
    				nMinIndex = j; 
    		
    		 int	nub=a[nMinIndex];
 		    a[j]=a[i];
 		    a[i]=nub;
 		
    	}
    	 
    }
    public static void main(String[] args){
   	 int a[]={1,3,2,5,4};
		 insertsort ins=new insertsort();
		 ins.insertSort(a, 5);
		 for(int i=0;i<5;i++){
		 System.out.println(+a[i]);
   }
}
}
/*
 算法的时间复杂度为O(n^2)，最好O(n)，最坏O(n^2)
 稳定
 */