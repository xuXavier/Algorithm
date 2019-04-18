package niuke;

import java.util.Scanner;

public class number0{
	 public static void main(String[] args){
	        int numb=1;
	        int shu=0;
	        Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        for(int i=num;i>0;i--){
	            numb*=i;
	        }
	        numb=Math.abs(numb);
	        System.out.println(numb);
	        String a= numb+"";
	        
	        for(int j=a.length()-1;j>0;j--){
	           if( '0'==a.charAt(j)){
	               shu++;
	           }else{
	               break;
	           }
	        }
	        System.out.println(shu);
	    }
}