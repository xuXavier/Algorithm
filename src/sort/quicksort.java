package sort;
/*1 i=L,j=R,�ڳ���һ����׼��a[i]
2 j--�ɺ���ǰ�ҵ�����С��������a[i]
3 i--��ǰ�����ҵ��������������a[j]
4 �ظ�������ֱ��i==j����׼������a[i]��*/
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
/*�㷨��ʱ�临�Ӷ�ΪO(nlog2n)�����O(nlog2n)���O(n^2)
 * ���ȶ�
 * */
