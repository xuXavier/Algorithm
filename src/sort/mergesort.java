package sort;
/*1 ��n���ȵ����鿴��n���ź��򳤶�Ϊ1������
2 �����鲢���飬�õ��ź����n/2������Ϊ2������
3 �Դ����ƣ�ֱ���õ�����Ϊn������*/
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
			mergesort(a, first, mid, temp);    //�������
			mergesort(a, mid + 1, last, temp); //�ұ�����
			mergearray(a, first, mid, last, temp); //�ٽ������������кϲ�
		}
		
	}
	 
	  public static void main(String[] args){
	    	 int a[]={1,3,2,5,4},b[]={6,1,4,5,2};
			 mergesort ins=new mergesort();
			 ins.mergesort(a, 0, 4,b);
			
	  }
	
}
/*�㷨��ʱ�临�Ӷ�ΪO(nlog2n)�����O(nlog2n)���O(nlog2n)
 * �ȶ�
 * */
