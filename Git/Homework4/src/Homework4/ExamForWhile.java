package Homework4;

import java.io.*;
import java.util.Scanner;

public class ExamForWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("*************");
		System.out.println("반복문 연습하기");
		System.out.println("*************");
		System.out.println("1. 1부터 입력한 수까지 더하기");
		System.out.println("2. 최대값/최소값 구하기");
		System.out.println("3. 입력받은숫자의 합계와 평균 구하기");
		System.out.println("4. 원하는 구구단 출력하기");
		System.out.println("5. 짝수단/홀수단 출력하기");
		System.out.println("6. 종료하기");
		System.out.print("메뉴 선택 : ");
		
		int menu = input.nextInt();
		
		switch (menu) {
		case 1:
			System.out.print("마지막 수를 입력(Q:종료) >> ");
			String menu2 = input.next();
			if (menu2.equals("Q")) {
				System.out.println("종료하셨습니다");
				break;
			}else{
				int Number = Integer.parseInt(menu2);
				SumOfNumbers A = new SumOfNumbers();
				A.Sumofnumbers(Number);
			}

			
		case 2:
			MaxAndMin B = new MaxAndMin();
			B.Maxandmin();
			break;
			
		case 3:
			SumAndAvg C = new SumAndAvg();
			C.Sumandavg();
			break;
			
		case 4:
			GuGuDan D = new GuGuDan();
			D.Gugudan();
			break;
			
		case 5:
			GuGuDan2 E = new GuGuDan2();
			E.Gugudan2();
			break;

		case 6:
			System.out.println("종료하였습니다.");
			break;
		}
	}

}