package homework6;
import java.io.*;
import java.util.Scanner;

public abstract class ExamVariousArray {
    public static void main(String[] args) {
        ////
        Scanner input = new Scanner(System.in);
        System.out.println("*************");
        System.out.println("배열 사용하기");
        System.out.println("*************");
        System.out.println("1. 두번째로 큰 수 찾기");
        System.out.println("2. 심사 점수 계산");
        System.out.println("3. 학생 총점, 평균값 구하기");
        System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
        System.out.println("5. 겹치지 않는 숫자 10개 입력받기");
        System.out.println("6. 종료하기");
        System.out.print("원하는 메뉴는? >> ");
        
        int menu = input.nextInt();
        
        while (menu!=6){
            switch (menu){                
            case 1:
                System.out.println("==================");
                System.out.println("10개의 숫자를 입력받아 배열에 저장하고");
                System.out.printf("두번째로 큰 수를 출력하라.\n");
                new SecondMax().secondmax();
                
                menu=0;
                break;
                
            case 2:
                System.out.println("==================");
                System.out.println("심사점수계산");
                System.out.printf("가장 큰 점수와 가장작은점수제외\n");
                new AvgScore().avgscore();
                
                menu=0;
                break;
                
            case 3:
                System.out.println("==================");
                System.out.printf("5명의 국어, 영어, 수학 점수의 과목별총점 및 평균 구하기\n");
                new StudentScore().studentscore();
                menu=0;
                break;
            
            case 4:
                System.out.println("==================");
                System.out.printf("5층아파트 거주자인원 파악하기\n");
                new AptPersonCount().aptpersoncount();
                menu=0;
                break;
                
            case 5:
                System.out.println("==================");
                System.out.printf("겹치지 않는 10개 숫자 입력받기\n");
                new OnlyNumber().onlynumber();
                menu=0;
                break;
                
            default :
                System.out.print("원하는 메뉴는? >> ");
                menu = input.nextInt();
                break;
            }
        }
        
        System.out.println("프로그램 종료");
        
    }
}