package class03;

import java.util.Scanner;

public class Exercise1_3 {
	public static void arithmetic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		System.out.println("�������=> "+(num1+num2));
		System.out.println("������=> "+(num1-num2));
		System.out.println("�������=> "+(num1*num2));
		System.out.println("�������=> "+(num1/num2));
		System.out.println("������ ������=> "+(num1%num2));
}
	public static void main(String[] args) {
		arithmetic();
	}
}
