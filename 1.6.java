package erat;

public class general {
	public static void main(String args[]) {
		
		int x = -5, y = -2;
		boolean bool = true;
		
		if (x == 0 && y == -1 || x > 4 || x < -4 || y > 4 || y < -3 ) {
			bool = false;
			System.out.println(bool);
		}
		else if( x > 2 && y > 0 || x < -2 && y > 0) {
			bool = false;
			System.out.println( bool);
		}
		else {
		System.out.println(bool);
		}
	}
}

//��� ��� ������� ������, �������� ���. ����� ���, ��� �� ������ � true.

//��� ��� ��������� ����������. � && ��������� ����, ��� � ||, ������� �����
//������� ���������� ���������� � ����� (0; -1).
