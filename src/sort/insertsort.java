package sort;
/*1 ��ʼʱ��a[0]�Գ�������������a[1]��a[n],��i=1
2 ��a[i]����a[1��i-1]�У��γ�a[0..i]��������
3 �ظ�2֪��i==n-1*/

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


/*�㷨��ʱ�临�Ӷ�ΪO(n^2)�����O(n)���O(n^2)
 *�ȶ�
 *  
 *  */
