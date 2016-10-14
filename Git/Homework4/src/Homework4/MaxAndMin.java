package Homework4;

import java.util.Scanner;

public class MaxAndMin {

	public void Maxandmin() {
		int max = 0, min = 0, temp = 0;
		String num = "";

		while (true) {
			num = pri();
			if (num.equals("Q")) {
				break;
			} else {
				temp = Integer.parseInt(num);
			}

			if (temp >= max) {
				max = temp;
				System.out.printf("Max : %d , Min : %d\n", max, min);
			} else {
				min = temp;
				System.out.printf("Max : %d , Min : %d\n", max, min);
			}

		}
		System.out.printf("Max : %d , Min : %d", max, min);
	}

	public String pri() {
		Scanner input = new Scanner(System.in);

		System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
		String B = input.next();

		return B;
	}
}