package homework6;
import java.io.*;
import java.util.Scanner;

public class AptPersonCount {
	public void aptpersoncount() {
		
		Scanner Input = new Scanner(System.in);
		int Array[][] = new int[5][3];
		int Sum=0,Count;
		
		//�� �Է�
		for (int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				
			System.out.printf("%d0%d�� ����ִ� ��� �� : ",i+1,j+1);
			Count=Input.nextInt();
			Array[i][j]=Count;
			Sum+=Count;			
			}
		}
		
		System.out.printf("�� ����Ʈ�� ��� ����� �� %d �� �Դϴ�.\n",Sum);
		
		//������ ���
		Sum=0;
		for (int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				Sum+=Array[i][j];
			}
			System.out.printf("%d���� ����ִ� ��� �� : %d\n",i+1,Sum);
			Sum=0;
		}
		
		//ȣ���� ���
		for(int j=0; j<3; j++){
			for (int i=0; i<5; i++){
				Sum+=Array[i][j];
			}
			System.out.printf("%d���ο� ����ִ� ��� �� : %d\n",j+1,Sum);
			Sum=0;
		}
		
	}
	
}
