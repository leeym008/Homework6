package Homework4;
import java.util.Scanner;

public class GuGuDan2 {
	public void Gugudan2(){
		
		Scanner input_s = new Scanner(System.in);
		System.out.println("¦���� / Ȧ���� ���");
		System.out.printf("E : ¦���� / O :Ȧ���� ���\n(Q:����)");
		
		String input = input_s.next();
		int a=2,b=4,c=6;
		int A=3,B=5,C=7;
		if (input.equals("E")){		
		for (int i=1; i<5; i++){
			System.out.printf("%d*%d=%d  %d*%d=%d  %d*%d=%d\n",a,i,a*i,b,i,b*i,c,i,c*i);			
			}
		}
		
		else if (input.equals("O")){
			for (int i=1; i<5; i++) {
			System.out.printf("%d*%d=%d  %d*%d=%d  %d*%d=%d\n",A,i,A*i,B,i,B*i,C,i,C*i);
			}
		}
		
		else if (input.equals("Q")){
			System.out.println("4�� �޴� ����");
		}
		else{
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		
	}
}
