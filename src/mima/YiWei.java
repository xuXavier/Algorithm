package mima;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YiWei {// ��λ�㷨
	static List list = new ArrayList();
	static List listNumSetSer = new ArrayList();
	static List listNumSetmin = new ArrayList();
	static List listNumZimu = new ArrayList();

	public int createSeret(int minwen, int serkey) {// ����
		int serte = 0;
//     System.out.println(minwen);
		if (minwen + serkey < 26) {
			serte = minwen + serkey;
		}
		if (minwen + serkey >= 26 && minwen + serkey <= 28) {
			serte = minwen - 23;
		}
		if (minwen + serkey >= 32 && minwen + serkey < 58)
			serte = minwen + serkey;
		if (minwen + serkey >= 58 && minwen + serkey <= 60)
			serte = minwen - 23;
//		  System.out.println(serte);
		return serte;
	}

	public int createMoreSeret(String minwen, int serkey) {
		YiWei yw = new YiWei();
		yw.stringtoint(minwen);
		for (int i = 0; i < list.size(); i++) {// ��ü��ܺ���������ִ���listNumSetSer
			listNumSetSer.add(yw.createSeret((int) list.get(i), serkey));
		}
		yw.intTOoStringser();
		return 0;
	}

	public int getminwen(int c, int serkey) {// ����
		int minwen = 0;
		if (c - serkey < 3) {
			minwen = c + 23;
		}
		if (c - serkey >= 3 && c - serkey <= 25) {
			minwen = (c - serkey);
		}

		if (c - serkey >= 32 && c - serkey <= 34) {
			minwen = c + 23;
		}
		if (c - serkey >= 35 && c - serkey <= 57) {
			minwen = (c - serkey);
		}
		return minwen;
	}

	public void decipheringMore(int serkey) {// ��������
		YiWei yw = new YiWei();
		int miwen;
		for (int i = 0; i < listNumSetSer.size(); i++) {
			yw.getminwen((int) listNumSetSer.get(i), serkey);
		}
		yw.intTOoString();

	}

	public void stringtoint(String s) {// �ַ���תΪ����
		char num[] = new char[100];
		num = s.toCharArray();

		for (char c : num) {
			list.add(Integer.valueOf(c) - 65);

		}
	}

	public void intTOoString() {// ����ת�ַ���
		String s = "";
		for (int j = 0; j < list.size(); j++) {

			s = s + "" + (char) (((int) list.get(j)) + 65);
//			System.out.println("�����������Ϊ" + "" + (char) (((int) list.get(j)) + 65));
		}
		System.out.println("�����������Ϊ" + s);
	}

	public void intTOoStringser() {// ��������ת������ĸ
		String s = "";
		for (int j = 0; j < listNumSetSer.size(); j++) {

			s = s + "" + ((char) ((((int) listNumSetSer.get(j)) + 65)));
//			System.out.println( ((((int) listNumSetSer.get(j)) + 65)));
		}
		System.out.println("�������Ϊ" + s);
	}

	public static void main(String[] args) {
		YiWei yw = new YiWei();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		yw.createMoreSeret(s, 3);// ��������
		yw.decipheringMore(3);// ��������

	}

}
