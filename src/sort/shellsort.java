package sort;

//ϣ������
/*1 ȡһ������increment n/2 ÿ��n/2����������,�൱����ߺ��ұ��ź���
2 n=n/2  ������������
3 ֪��n=1����������*/
public class shellsort {
	public void shellSort(int a[], int n){

{
	int i, j, gap;
 
	for (gap = n / 2; gap > 0; gap /= 2) //����
		for (i = 0; i < gap; i++)        //ֱ�Ӳ�������
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
 * ʱ�临�Ӷ�ΪO(n^1.3)�����O(n)���O(n^2)
 * ���ȶ�
 */