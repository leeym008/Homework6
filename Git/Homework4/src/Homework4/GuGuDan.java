package Homework4;
import java.util.Scanner;

public class GuGuDan {
	public void Gugudan(){
		
		Scanner input = new Scanner(System.in);
		System.out.print("����� ���� �Է��ϼ��� : ");
		int i = input.nextInt();
		
		for (int j=1; j<10; j+=2){
			System.out.printf("%d * %d = %d  %d * %d = %d\n",i,j,i*j,i,j+1,i*(j+1));
		
		}
	}
}
