package class03;

import java.util.Scanner;


public class Exercise1_5 {

	public static void main(String[] args) {
		
		  
		  //�Ž����� ���
		  
		 while (true) {
			 int value;
			  int money;
			  int change;
			  int count;

			  Scanner sc = new Scanner(System.in);
			  
			  System.out.print("���ǰ� �Է��ϼ���: ");
			  value = sc.nextInt();

			  System.out.print("�մ��� ������ �� �Է� �ϼ���: ");
			  money = sc.nextInt();
			  change = money - value;
			 if(value>money) {
				 System.out.println(change*-1+"���� �����մϴ�");
			 }else {
				 //õ��¥�� ���� ���
				 count = change/1000;
				 //�Ž������� ���Ե� õ��¥���� �� ������ �� ����
				 change = change % 1000;
				 System.out.println("1000�� : " + count + "��");
				 
				 //500��¥�� ���� ���
				 count = change/500;
				 //�Ž������� ���Ե� 500��¥���� �� ������ �� ����
				 change = change % 500;
				 System.out.println("500�� : " + count + "��");
				 
				 //100��¥�� ���� ���
				 count = change/100;
				 //�Ž������� ���Ե� 100��¥���� �� ������ �� ����
				 change = change % 100;
				 System.out.println("100�� : " + count + "��");
				 
				 //50��¥�� ���� ���
				 count = change/50;
				 //�Ž������� ���Ե� 50��¥���� �� ������ �� ����
				 change = change % 50;
				 System.out.println("50�� : " + count + "��");
				 
				 //10��¥�� ���� ���
				 count = change/10;
				 System.out.println("10�� : " + count + "��");
			 }
			
			
		}
		  
		  
	}

}
