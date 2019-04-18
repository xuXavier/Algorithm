package zuosheng.basic;

public class test1 {
	public static void mergeSort(int arr[]) {
		if(arr==null||arr.length<2) {
			return;
		}
		mergerSort(arr,0,arr.length-1);
	}
	
	public static void mergerSort(int arr[],int l,int r ) {
		if(l==r) {
			return ;
		}
		int m=l+(l-r)>>1;
		mergerSort(arr,l,m);
		mergerSort(arr,m+1,r);
		merger(arr,l,m,r);	
	}
	
	public static void merger(int arr[],int l,int m,int r) {
		int[] help=new int [r-l+1];
		int i=0;
		int p=l;
		int p1=m+1;
		while(p1<=r&&p<=m) {
			help[i++]=arr[p]>arr[p1] ? arr[p1++] : arr[p++];
		}
		while(p<=m) {
			help[i++]=arr[p++];
		}
		while(p<=r) {
			help[i++]=arr[p1++];
		}
		for(i=0;i<help.length;i++) {
			arr[l+i]=help[i];
		}
	}
}
