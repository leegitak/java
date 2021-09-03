package class03;

import java.util.Scanner;


public class Exercise1_5 {

	public static void main(String[] args) {
		
		  
		  //거스름돈 계산
		  
		 while (true) {
			 int value;
			  int money;
			  int change;
			  int count;

			  Scanner sc = new Scanner(System.in);
			  
			  System.out.print("물건값 입력하세요: ");
			  value = sc.nextInt();

			  System.out.print("손님이 지불한 돈 입럭 하세요: ");
			  money = sc.nextInt();
			  change = money - value;
			 if(value>money) {
				 System.out.println(change*-1+"원이 부족합니다");
			 }else {
				 //천원짜리 갯수 계산
				 count = change/1000;
				 //거스름돈에 포함된 천원짜리를 뺀 나머지 돈 저장
				 change = change % 1000;
				 System.out.println("1000원 : " + count + "개");
				 
				 //500원짜리 갯수 계산
				 count = change/500;
				 //거스름돈에 포함된 500원짜리를 뺀 나머지 돈 저장
				 change = change % 500;
				 System.out.println("500원 : " + count + "개");
				 
				 //100원짜리 갯수 계산
				 count = change/100;
				 //거스름돈에 포함된 100원짜리를 뺀 나머지 돈 저장
				 change = change % 100;
				 System.out.println("100원 : " + count + "개");
				 
				 //50원짜리 갯수 계산
				 count = change/50;
				 //거스름돈에 포함된 50원짜리를 뺀 나머지 돈 저장
				 change = change % 50;
				 System.out.println("50원 : " + count + "개");
				 
				 //10원짜리 갯수 계산
				 count = change/10;
				 System.out.println("10원 : " + count + "개");
			 }
			
			
		}
		  
		  
	}

}
