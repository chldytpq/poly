package Hello.java;

import java.util.Scanner;

public class Hello019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int a=0;
		int b=0;
		
		while (true) {
			System.out.println("ù��° �Է� ��: ");
			a = s.nextInt();
			System.out.println("�ι�° �Է� ��: ");
			b = s.nextInt();

			System.out.println("�հ�:" + (a + b));

			// �հ谡 10���� ũ�� ������
			if ((a + b) > 10) {
				break;
			}

		}

	}
	

}
