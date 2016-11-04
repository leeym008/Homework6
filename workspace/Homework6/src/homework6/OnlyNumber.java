package homework6;
import java.io.*;
import java.util.Scanner;

public class OnlyNumber {
	public void onlynumber() {
		Scanner Input = new Scanner(System.in);
		int Array[] = new int[10];
		System.out.println("1 ~ 100 사이의 숫자를 입력하세요.");
		int Num;
		
		//수 입력받기
		for (int i=0; i<10; i++){
			Num = Input.nextInt();
			Array[i]=Num;
			
			//이미 입력받은 수인지 확인
			//처음입력받을시 실행하지않음
			for (int j=0; j<i; j++){
				if(Array[j]==Num){
					System.out.println("이미 입력한 수입니다.");
					i--;
				}
			}
		}
		
		//배열 출력
		for (int i=0; i<10; i++){
			System.out.printf("%d번째 숫자는 %d 입니다.\n",i+1,Array[i]);
		}
		
	}
}
