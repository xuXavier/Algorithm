package mima;

import java.util.ArrayList;
import java.util.List;

public class RSA {
	static List listsu = new ArrayList();//������������
	static List listlenum = new ArrayList();//������������
	static int publicKey[]=new int[2];
	static int privateKey[]=new int[2];
    static char[] letternum=new char[100];
    static char[] zimu=new char[100];
    static char[] zimu1=new char[100];
    static int a[]=new int[100];
    static String su="";
    /**
     * 
     */
	public void searchPrime() {//�õ�����������
		List list = new ArrayList();
		int m, n;
		int h = 1;

		int suinum = (int) (1001 + Math.random() * 1000);// �õ���1000��2000���������
		A: for (n = 1000; n <= suinum; n++) {
			for (m = 2; m < n; m++) {
				if (n % m == 0) {
					continue A;
				}
			}
			if (m >= n) {
				list.add(m);
			}
		}
		listsu.add((int) list.get((int) (Math.random() * list.size())));// �õ���������
		while (listsu.size() != 2) {
			int sushu = (int) list.get((int) (Math.random() * list.size()));
			if ((int) listsu.get(0) != sushu) {
				listsu.add(sushu);
			}
		}
//		System.out.println(list.get(0));
//		System.out.println(listsu.get(1));
	}
    public void createSeretKey(){//��ù�Կ��˽Կ
    	int primeCheNum;
    	int olNum;
    	int e=0,d;
    	int i=1;
    	
    	RSA rs=new RSA();
    	primeCheNum=(int)(listsu.get(0))*(int)(listsu.get(1));
    	olNum=((int)(listsu.get(0))-1)*((int)(listsu.get(1))-1);//����ŷ��ֵ

    	for(int k=100;k<olNum;k++) {//����������e
    		if(rs.gcd(k, olNum)==1) {
    			e=k;
//    			System.out.println("create����"+k);
    			break;
    		}
    	}
    
    	d=(olNum-1)/e;
    	rs.publicKey[0]=e;//��ù�Կ
    	rs.publicKey[1]=primeCheNum;
    	rs.privateKey[0]=d;//���˽Կ
    	rs.privateKey[1]=primeCheNum;
//    	System.out.println(rs.publicKey[0]+"create����"+rs.privateKey[0]+"ce"+primeCheNum);
    	
    	
    }
    int gcd(int x, int y)//�����Լ��
    {
        if(y == 0) return x;    
        if(x < y)      return gcd(y,x);    
         else        return gcd(y, x%y); 
    } 
	public int encryption(int m) {// ��������
		RSA rs = new RSA();
		int seretTe;// ����
//		System.out.println("�����ܵ�����Ϊ"+m);
		seretTe = (rs.publicKey[1] - rs.publicKey[0]) / m;// �������
		su=""+su+seretTe;
		return seretTe;
	}

	public int deciphering(int serwen) {// ��������
		RSA rs = new RSA();
          int miwen;

          miwen=(rs.publicKey[1]-rs.privateKey[0])/serwen+1;

		return miwen;
	}
	public void stringtoint(String s) {//�ַ���תΪ����
   	 letternum = s.toCharArray();
	        //ת������Ӧ��ASCLL
	        for (char c : letternum) {
	        	listlenum.add( Integer.valueOf(c)-10);
	        	
	        }
   }
	public void intTOoString() {//����ת�ַ���
		String s = "";
	   	for(int j=0;j<listlenum.size();j++) {
	   		
	   		zimu[j]=((char)(((int)listlenum.get(j))+10));
	   		 s=s+""+zimu[j];
//	   		System.out.println("�����������Ϊ"+((int)listlenum.get(j))+" "+10);
//	   		System.out.println("���������ĸ"+zimu[j]);
	   	}
	   	System.out.println("�������Ϊ"+s);
	}
	public static void main(String[] args) {
		int a[]=new int[100];
		int b[]=new int[100];
		RSA rs = new RSA();
		rs.searchPrime();
		rs.createSeretKey();
		String s="xyzXYZ";//��������
//		int m=rs.encryption(15);//��������
		rs.stringtoint(s);

//		rs.deciphering(m);
        for(int i=0;i<listlenum.size();i++) {//�����Ľ��м���
        	a[i]=rs.encryption((int)(listlenum.get(i)));
        }
        System.out.println("���ܺ������Ϊ"+su);
         for(int j=0;j<listlenum.size();j++) {//�����Ľ���
        	 b[j]=rs.deciphering(a[j]);
         }
         rs.intTOoString();//�õ�������ĸ

//     	System.out.println("����"+(char)65);
	}

}
