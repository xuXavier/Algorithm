package sort;
/*1 i=L,j=R,挖出第一个基准数a[i]
2 j--由后往前找到比它小的数填入a[i]
3 i--由前往后找到比它大的数填入a[j]
4 重复二三步直到i==j将基准数填入a[i]中*/
public class quicksort {
	public void quick_sort(int a[],int l,int r){
	    if(l<r){
			int i=l,j=r,x=a[l];
			while(i<j){
				while(i<j&&a[j]>=x)
					j--;
				if(i<j)
					a[i++]=a[j];
				while(i<j&&a[i]<=x)
					i++;
				if(i<j)
					a[j--]=a[i];			
			}
			a[i]=x;
			quick_sort(a,l,i-1);
			quick_sort(a,i+1,r);
	   }
	}
	 public static void main(String[] args){
    	 int a[]={1,3,2,5,4};
		 quicksort qu=new quicksort();
		 qu.quick_sort(a, 0, 4);
		 for(int i=0;i<5;i++){
		 System.out.println(a[i]);
    }
  }
}
/*算法的时间复杂度为O(nlog2n)，最好O(nlog2n)，最坏O(n^2)
 * 不稳定
 * */
