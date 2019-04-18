package sort;
/*1 初始时，a[0]自成有序区，无序a[1]到a[n],另i=1
2 将a[i]并入a[1到i-1]中，形成a[0..i]的有序区
3 重复2知道i==n-1*/

public class insertsort {
	public void  insertSort(int a[],int n){
		for(int i=1;i<n;i++){
			int tem=a[i];
			for(int j=i;j>0;j--){
				if(tem<a[j-1]){				
				    a[j]=a[j-1];
				    a[j-1]=tem;
				}
			}
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


/*算法的时间复杂度为O(n^2)，最好O(n)，最坏O(n^2)
 *稳定
 *  
 *  */
