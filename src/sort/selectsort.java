package sort;

/*1.��ʼʱ������a[0..n]ȫΪ������i=0��
2��a[i..n]��ѡ����Сֵ��a[i]��������a[0.i]����
3�ظ�2 ֱ��i=n-1*/
public class selectsort {
    public void selectSort(int a[],int n){
    	int i, j, nMinIndex = 0;
    	for (i = 0; i < n; i++)
    	{
    		nMinIndex = i; //����СԪ�ص�λ��
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
 �㷨��ʱ�临�Ӷ�ΪO(n^2)�����O(n)���O(n^2)
 �ȶ�
 */