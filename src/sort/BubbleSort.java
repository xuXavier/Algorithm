/**
 * 
 */
/**
 * @author Administrator
 *
 */
package sort;

/*1 ��������Ԫ�������Ƚϣ����ߺ���
2 ��0��n-1��Ԫ�ر���
3 ��n-1��ֵ��n��n��Ϊ0�ظ�����*/

/*public class BubbleSort{
	public void  bubbleSort(int a[],int n){
		int nub = 0;
		System.out.println(a[1]);
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if(a[j-1]>a[j]){
					nub=a[j];
				    a[j]=a[j-1];
				    a[j-1]=nub;
				    System.out.println(a[1]);
			}
			}}
	}

	public static void  main(String[] args){
		 int a[]={1,3,2,5,4};
		 BubbleSort so=new  BubbleSort();
		 so.bubbleSort(a, 5);
		 for(int i=0;i<5;i++){
		 System.out.println("f"+a[i]);
		 }
	}
}*/

/*
 * �㷨��ʱ�临�Ӷ�ΪO(n^2)�����O(n)���O(n^2)
 * �ȶ�
 * ȱ�㣺Ч�ʵ��£�С��ģ���ݿ���*/

/*ð�������Ż���100������ǰ10���������90�������Ҵ���ǰ10����*/
public class BubbleSort {
	public void bubbleSort(int a[], int n) {
		int nub = 0;
		boolean flag = true;
		System.out.println(a[1]);

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (a[j - 1] > a[j]) {
					nub = a[j];
					a[j] = a[j - 1];
					a[j - 1] = nub;

				}

			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 5, 4 };
		BubbleSort so = new BubbleSort();
		so.bubbleSort(a, 5);
		for (int i = 0; i < 5; i++) {
			System.out.println("f" + a[i]);
		}
	}
}
