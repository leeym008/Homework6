package homework6;
import java.io.*;
import java.util.Scanner;

public class SecondMax {
	public void secondmax(){
		
		Scanner Input = new Scanner(System.in);
		
		int Array[] = new int[10];
		int Max=0,Max2=0,Num,i;
		
		for(i=0; i<10; i++){
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ",i+1);
			Num=Input.nextInt();
			if (i==0)
				Max=Num;
			else if(i==1)
				Max2=Num;
			
			if (Array[i] > Max) {
				Max2=Max;
				Max=Array[i];
			}
		}
		
		System.out.printf("2��°�� ū ���� %d �Դϴ�.\n",Max2);
		
	}	
}
