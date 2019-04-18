package zuosheng.basic;

public class test {
	static int he;
	public void add(int arr[],int l,int r) {
		if(arr==null&&arr.length<2)
		{
			return ;
		}
		merge(arr,0,arr.length-1);
	}
	public void merge(int arr[],int l,int r) {
		int m=l+(l-r)>>1;
		if(l==r) {
			return ;
		}
		
		merge(arr,l,m);
		merge(arr,m+1,r);
		merge(arr,l,m,r);
		
	}
	public void merge(int[] arr,int l,int m,int r) {
		int[] help=new int[r-l+1];
		int p=l;
	    int p1=m+1;
	    int i = 0;
	    while(p<=m&&p1<=r) {
	    	 he+=arr[p]>arr[p1] ? 0 :arr[p]*(r-p1+1);
	    	help[i++]=(arr[p]>arr[p1]) ? arr[p1++] :arr[p++];	
	    
	    }
		while(p<=m) {
			help[i++]=arr[p++];
		}
		while(p1<=m) {
			help[i++]=arr[p1++];
		}
		for(int j=0;j<help.length;j++) {
			arr[j]=help[j];
		}
	}
		


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * void heapsort(int arr[]) { for(int i=0;i<arr.length;i++) { insertHeap(arr,i);
	 * } int size=arr.length; swap(arr,0,size-1); while(size>0) {
	 * sortHeap(arr,0,size); swap(arr,0,size-1);
	 * 
	 * } } void sortHeap(int arr[],int index,int size) { int leaf=index*2+1;
	 * while(index<size) { int largest=arr[leaf+1]>arr[leaf]&&leaf+1<size ? leaf+1 :
	 * leaf; largest=arr[index]>arr[largest] ? index : largest; if(index==largest) {
	 * break; } swap(arr,largest,index);
	 * 
	 * index=largest; leaf=index*2+1; } } void insertHeap(int arr[],int index) {
	 * while(arr[index]>arr[(index-1)/2]) { swap(arr,index,index-1/2);
	 * index=(index-1)/2; } } void swap(int arr[],int i,int j) {
	 * 
	 * }
	 */
	
	
	
	
	

	
	
	//堆排序
	/*
	 * void heapsort(int arr[]) { if(arr==null&&arr.length<2) { return; } for(int
	 * i=0;i<arr.length;i++) { heapInsert(arr,i); } int size=arr.length;
	 * heapify(arr,0,--size); while(size>0) { heapify(arr,0,--size);
	 * swap(arr,0,size); }
	 * 
	 * } void heapInsert(int arr[], int index) { while(arr[index]>arr[(index-1)/2])
	 * { swap(arr,index,(index-1)/2); index=(index-1)/2; }
	 * 
	 * } public void heapify(int arr[],int index,int size) { int leaf=index*2+1;
	 * while(leaf<size) { int largest=arr[leaf+1]>arr[leaf]&&leaf+2<size ?leaf+1 :
	 * leaf; largest=arr[largest]>arr[index] ? largest:index; if(largest==index) {
	 * break; } swap(arr,largest,index); index=largest; leaf=index*2+1; } } public
	 * void swap(int[] arr, int i, int j) {
	 * 
	 * int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp; }
	 */
	public static void main(String[] args) {
		int arr[]= {11,2};
	

	}

}
