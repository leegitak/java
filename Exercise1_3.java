package class03;

import java.util.Scanner;

public class Exercise1_3 {
	public static void arithmetic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.println("덧셈결과=> "+(num1+num2));
		System.out.println("빼기결과=> "+(num1-num2));
		System.out.println("곱셈결과=> "+(num1*num2));
		System.out.println("나누기몫=> "+(num1/num2));
		System.out.println("나눗셈 나머지=> "+(num1%num2));
}
	public static void main(String[] args) {
		arithmetic();
	}
}
