package Homework4;

import java.io.*;
import java.util.Scanner;

public class ExamForWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("*************");
		System.out.println("�ݺ��� �����ϱ�");
		System.out.println("*************");
		System.out.println("1. 1���� �Է��� ������ ���ϱ�");
		System.out.println("2. �ִ밪/�ּҰ� ���ϱ�");
		System.out.println("3. �Է¹��������� �հ�� ��� ���ϱ�");
		System.out.println("4. ���ϴ� ������ ����ϱ�");
		System.out.println("5. ¦����/Ȧ���� ����ϱ�");
		System.out.println("6. �����ϱ�");
		System.out.print("�޴� ���� : ");
		
		int menu = input.nextInt();
		
		switch (menu) {
		case 1:
			System.out.print("������ ���� �Է�(Q:����) >> ");
			String menu2 = input.next();
			if (menu2.equals("Q")) {
				System.out.println("�����ϼ̽��ϴ�");
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
			System.out.println("�����Ͽ����ϴ�.");
			break;
		}
	}

}