import java.io.*;
import java.util.Scanner;
////
public abstract class ExamForWhileStars {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		System.out.println("*************");
        System.out.println("반복문 연습하기2");
        System.out.println("*************");
        System.out.println("1. 정사각형 별찍기");
        System.out.println("2. 직각삼각 별찍기");
        System.out.println("3. 이등변삼각형 별찍기");
        System.out.println("4. 다이아몬드 별찍기");
        System.out.println("5. 종료하기");
        System.out.print("원하는 메뉴는? >> ");
        
        int menu = input.nextInt();
        
        while (menu!=5){
        	switch (menu){        		
        	case 1:
        		System.out.println("==================");
        		System.out.printf("정사각형 크기입력(짝수만) : ");
        		RectangleStars A = new RectangleStars();
        		A.rectangleStars();
        		menu=0;
        		break;
        		
        	case 2:
        		System.out.println("==================");
        		System.out.printf("직각삼각형 여백 입력 : ");
        		TriangleStars B = new TriangleStars();
        		B.triangleStars();
        		menu=0;
        		break;
        		
        	case 3:
        		System.out.println("==================");
        		System.out.printf("이등변삼각형 높이 입력 : ");
        		IsoscelsTriangleStars C = new IsoscelsTriangleStars();
        		C.isoscelsTrinaestars();
        		menu=0;
        		break;
        	
        	case 4:
        		System.out.println("==================");
        		System.out.printf("다이아몬드의 크기입력 : ");
        		menu=0;
        		DiamondStars D = new DiamondStars();
        		D.diamondstars();
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
