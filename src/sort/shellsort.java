package sort;

//希尔排序
/*1 取一个整数increment n/2 每隔n/2个插入排序,相当于左边和右边排好序
2 n=n/2  继续插入排序
3 知道n=1，插入排序*/
public class shellsort {
	public void shellSort(int a[], int n){

{
	int i, j, gap;
 
	for (gap = n / 2; gap > 0; gap /= 2) //步长
		for (i = 0; i < gap; i++)        //直接插入排序
		{
			for (j = i + gap; j < n; j ++) 
				if (a[j] < a[j - gap])
				{
					int temp = a[j];
					/*int k = j - gap;
					while (k >= 0 && a[k] > temp)
					{
						a[k + gap] = a[k];
						k -= gap;
					}*/
					a[j]=a[j-gap];
					a[j-gap] = temp;
				}
		}
}}

	

    public static void main(String[] args){
    	int  b=3,c=4;
    	 b-=c;
    	System.out.println(b);
   	 int a[]={1,3,2,5,4,9,7,4};
		 insertsort ins=new insertsort();
		 ins.insertSort(a, 8);
		 for(int i=0;i<8;i++){
		 System.out.println(+a[i]);
     }
  }
}
/*
 * 时间复杂度为O(n^1.3)，最好O(n)，最坏O(n^2)
 * 不稳定
 */