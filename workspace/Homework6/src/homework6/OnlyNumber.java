package homework6;
import java.io.*;
import java.util.Scanner;

public class OnlyNumber {
	public void onlynumber() {
		Scanner Input = new Scanner(System.in);
		int Array[] = new int[10];
		System.out.println("1 ~ 100 ������ ���ڸ� �Է��ϼ���.");
		int Num;
		
		//�� �Է¹ޱ�
		for (int i=0; i<10; i++){
			Num = Input.nextInt();
			Array[i]=Num;
			
			//�̹� �Է¹��� ������ Ȯ��
			//ó���Է¹����� ������������
			for (int j=0; j<i; j++){
				if(Array[j]==Num){
					System.out.println("�̹� �Է��� ���Դϴ�.");
					i--;
				}
			}
		}
		
		//�迭 ���
		for (int i=0; i<10; i++){
			System.out.printf("%d��° ���ڴ� %d �Դϴ�.\n",i+1,Array[i]);
		}
		
	}
}
