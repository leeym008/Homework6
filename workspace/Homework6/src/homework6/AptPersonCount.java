package homework6;
import java.io.*;
import java.util.Scanner;

public class AptPersonCount {
	public void aptpersoncount() {
		
		Scanner Input = new Scanner(System.in);
		int Array[][] = new int[5][3];
		int Sum=0,Count;
		
		//수 입력
		for (int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				
			System.out.printf("%d0%d에 살고있는 사람 수 : ",i+1,j+1);
			Count=Input.nextInt();
			Array[i][j]=Count;
			Sum+=Count;			
			}
		}
		
		System.out.printf("이 아파트에 사는 사람은 총 %d 명 입니다.\n",Sum);
		
		//층마다 계산
		Sum=0;
		for (int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				Sum+=Array[i][j];
			}
			System.out.printf("%d층에 살고있는 사람 수 : %d\n",i+1,Sum);
			Sum=0;
		}
		
		//호마다 계산
		for(int j=0; j<3; j++){
			for (int i=0; i<5; i++){
				Sum+=Array[i][j];
			}
			System.out.printf("%d라인에 살고있는 사람 수 : %d\n",j+1,Sum);
			Sum=0;
		}
		
	}
	
}
