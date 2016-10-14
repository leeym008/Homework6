package Homework4;

import java.util.Scanner;

public class SumAndAvg {
	int Count = 0;
	
	public void Sumandavg(){		
			int Total = 0;
			Scanner input_s = new Scanner(System.in);
			while (true) {
				System.out.print("숫자를 입력(Q:종료) >> ");
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
			System.out.printf("합계는 %d 이고, 평균은 %.2f입니다.", Total, Avg);

	}
}
