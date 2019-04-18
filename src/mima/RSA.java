package mima;

import java.util.ArrayList;
import java.util.List;

public class RSA {
	static List listsu = new ArrayList();//保存两个素数
	static List listlenum = new ArrayList();//保存两个素数
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
	public void searchPrime() {//得到两个大素数
		List list = new ArrayList();
		int m, n;
		int h = 1;

		int suinum = (int) (1001 + Math.random() * 1000);// 得到从1000到2000的随机质数
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
		listsu.add((int) list.get((int) (Math.random() * list.size())));// 得到两个素数
		while (listsu.size() != 2) {
			int sushu = (int) list.get((int) (Math.random() * list.size()));
			if ((int) listsu.get(0) != sushu) {
				listsu.add(sushu);
			}
		}
//		System.out.println(list.get(0));
//		System.out.println(listsu.get(1));
	}
    public void createSeretKey(){//求得公钥和私钥
    	int primeCheNum;
    	int olNum;
    	int e=0,d;
    	int i=1;
    	
    	RSA rs=new RSA();
    	primeCheNum=(int)(listsu.get(0))*(int)(listsu.get(1));
    	olNum=((int)(listsu.get(0))-1)*((int)(listsu.get(1))-1);//计算欧拉值

    	for(int k=100;k<olNum;k++) {//获得随机整数e
    		if(rs.gcd(k, olNum)==1) {
    			e=k;
//    			System.out.println("create测试"+k);
    			break;
    		}
    	}
    
    	d=(olNum-1)/e;
    	rs.publicKey[0]=e;//获得公钥
    	rs.publicKey[1]=primeCheNum;
    	rs.privateKey[0]=d;//获得私钥
    	rs.privateKey[1]=primeCheNum;
//    	System.out.println(rs.publicKey[0]+"create测试"+rs.privateKey[0]+"ce"+primeCheNum);
    	
    	
    }
    int gcd(int x, int y)//求最大公约数
    {
        if(y == 0) return x;    
        if(x < y)      return gcd(y,x);    
         else        return gcd(y, x%y); 
    } 
	public int encryption(int m) {// 加密明文
		RSA rs = new RSA();
		int seretTe;// 密文
//		System.out.println("被加密的明文为"+m);
		seretTe = (rs.publicKey[1] - rs.publicKey[0]) / m;// 获得密文
		su=""+su+seretTe;
		return seretTe;
	}

	public int deciphering(int serwen) {// 解密密文
		RSA rs = new RSA();
          int miwen;

          miwen=(rs.publicKey[1]-rs.privateKey[0])/serwen+1;

		return miwen;
	}
	public void stringtoint(String s) {//字符串转为数字
   	 letternum = s.toCharArray();
	        //转换成响应的ASCLL
	        for (char c : letternum) {
	        	listlenum.add( Integer.valueOf(c)-10);
	        	
	        }
   }
	public void intTOoString() {//数字转字符串
		String s = "";
	   	for(int j=0;j<listlenum.size();j++) {
	   		
	   		zimu[j]=((char)(((int)listlenum.get(j))+10));
	   		 s=s+""+zimu[j];
//	   		System.out.println("解得明文数字为"+((int)listlenum.get(j))+" "+10);
//	   		System.out.println("解得明文字母"+zimu[j]);
	   	}
	   	System.out.println("解得明文为"+s);
	}
	public static void main(String[] args) {
		int a[]=new int[100];
		int b[]=new int[100];
		RSA rs = new RSA();
		rs.searchPrime();
		rs.createSeretKey();
		String s="xyzXYZ";//输入明文
//		int m=rs.encryption(15);//加密密文
		rs.stringtoint(s);

//		rs.deciphering(m);
        for(int i=0;i<listlenum.size();i++) {//对明文进行加密
        	a[i]=rs.encryption((int)(listlenum.get(i)));
        }
        System.out.println("加密后的密文为"+su);
         for(int j=0;j<listlenum.size();j++) {//对密文解密
        	 b[j]=rs.deciphering(a[j]);
         }
         rs.intTOoString();//得到明文字母

//     	System.out.println("测试"+(char)65);
	}

}
