/**
 * 
 */
/**
 * @author Administrator
 *
 */
package sort;

/*1 将数组内元素两两比较，大者后移
2 从0到n-1个元素遍历
3 把n-1赋值给n，n不为0重复步骤*/

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
 * 算法的时间复杂度为O(n^2)，最好O(n)，最坏O(n^2)
 * 稳定
 * 缺点：效率低下，小规模数据可用*/

/*冒泡排序优化，100个数，前10个数无序后90个有序且大于前10个，*/
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
