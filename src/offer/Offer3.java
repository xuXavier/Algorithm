package offer;

import sort.insertsort;

/*	��Ŀ3�� 
	��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�
	����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��Ĵ��������ҳ�����������һ����
	�������֡�����������볤��Ϊ7������{2,3,1,0,2,5,3},��ô��Ӧ���������
	��������2����3��*/

/*	���ֽ��
	1.����������ɨ��
	2.��ϣ��
	3.�����±�*/

public class Offer3 {
	static int re;
	public int repeat(int a[]){
		int tem=0;
		for(int j=0;j<a.length;j++){	
			tem=a[j];
			 while(j!=tem){
		    if(tem==a[tem]){
		    	return tem;
		    }
	         int num=a[tem];
		     a[tem]=tem;
		     a[j]=num;
		}
		}
	return 0;
	}
	public static void main(String[] args){
		 int a[]={2,3,1,2,4};
		 Offer3 ins=new Offer3();
		
		 System.out.println("�ظ�ֵ"+ins.repeat(a));
		 for(int i=0;i<5;i++){
		 System.out.println(+a[i]);
		
	}
}
}
