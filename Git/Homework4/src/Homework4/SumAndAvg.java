package Homework4;

import java.util.Scanner;

public class SumAndAvg {
	int Count = 0;
	
	public void Sumandavg(){		
			int Total = 0;
			Scanner input_s = new Scanner(System.in);
			while (true) {
				System.out.print("���ڸ� �Է�(Q:����) >> ");
				String s = input_s.next();

				if (s.equals("Q")) {
					break;
				} else {
					double Num = Double.parseDouble(s);
					Total += Num;
					Count++;
				}
			}
			double Avg = Total / Count;
			System.out.printf("�հ�� %d �̰�, ����� %.2f�Դϴ�.", Total, Avg);

	}
}
