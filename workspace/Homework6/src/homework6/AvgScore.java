package homework6;
import java.io.*;
import java.util.Scanner;

public class AvgScore {
	public void avgscore() {
		
		Scanner Input = new Scanner(System.in);
		
		float Array[] = new float[10];
		float Avg, Max=0,Min=0,Sum=0,Num;
		
		for (int i=0; i<10; i++){
			System.out.printf("%d�� �ɻ����� �Է� : ",i+1);
			Num=Input.nextFloat();
			Array[i]=Num;
			
			if (i==0){
				Max=Num;
				Min=Num;
			}
			
			if (Array[i] > Max)
				Max = Array[i];
			if (Array[i] < Min)
				Min = Array[i];
			Sum+=Array[i];
		}
		
		Sum-=Min;
		Sum-=Max;
		Avg=Sum;
		System.out.printf("8���� ��������� ū ���� %.2f �Դϴ�.\n",Avg/8);	
		
	}
	
}
