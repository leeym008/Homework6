package homework6;
import java.io.*;
import java.util.Scanner;

public class StudentScore {
	public void studentscore(){
		
		Scanner Input = new Scanner(System.in);
		float Array[][] = new float[5][5];
		float Sum=0, Jumsu;
		
		//���� �Է�
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if (j==0){
					System.out.printf("%d��° ���� : ",i+1);
					Jumsu = Input.nextFloat();
					Array[i][j]=Jumsu;
				}
				else if (j==1){
					System.out.printf("%d��° ���� : ",i+1);
					Jumsu = Input.nextFloat();
					Array[i][j]=Jumsu;
				}
				else if (j==2){
					System.out.printf("%d��° ���� : ",i+1);
					Jumsu = Input.nextFloat();
					Array[i][j]=Jumsu;
				}
			}
		}
		
		// ����,��� ���
		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				Sum+=Array[i][j];
			}
			Array[i][3]=Sum;
			Array[i][4]=Sum/3;
			Sum=0;
		}
		
		//���
		for(int i=0; i<5; i++){
				System.out.printf("%d ��° �л��� ������ %.2f, ����� %.2f �Դϴ�.\n", i, Array[i][3], Array[i][4]);
		}
		
	}
}
