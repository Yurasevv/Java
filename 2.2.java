package erat;

public class general {
	public static void main(String args[]) {
		
	int a, b, c, d;
	
	a = 10;
	b = 20;
	c = 30;
	d = 5;
	
	int MinAB = 0, MinCD = 0;
	
//����������� ����������, ����� ����� ����������
	
	if( a==b || b == c || c == d || a == d || a == c) {
		System.out.print("������� ������ �����");
	}
//����, ���� ��� ��������� ���������� ��������� �������� ���������,
//������ �� ������ ����� ��������� ���������
	
	if( a > b) {
		MinAB = b;
	} else {
		MinAB = a;
	}
	if( c > d) {
		MinCD = d;
	} else {
		MinCD = c;
	}
	
	if (MinAB > MinCD) {
		System.out.print("MAX = " + MinAB);
	} else {
		System.out.print("MAX = " + MinCD);
	}
	
	}
}
