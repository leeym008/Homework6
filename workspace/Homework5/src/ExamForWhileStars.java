import java.io.*;
import java.util.Scanner;
////
public abstract class ExamForWhileStars {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		System.out.println("*************");
        System.out.println("�ݺ��� �����ϱ�2");
        System.out.println("*************");
        System.out.println("1. ���簢�� �����");
        System.out.println("2. �����ﰢ �����");
        System.out.println("3. �̵�ﰢ�� �����");
        System.out.println("4. ���̾Ƹ�� �����");
        System.out.println("5. �����ϱ�");
        System.out.print("���ϴ� �޴���? >> ");
        
        int menu = input.nextInt();
        
        while (menu!=5){
        	switch (menu){        		
        	case 1:
        		System.out.println("==================");
        		System.out.printf("���簢�� ũ���Է�(¦����) : ");
        		RectangleStars A = new RectangleStars();
        		A.rectangleStars();
        		menu=0;
        		break;
        		
        	case 2:
        		System.out.println("==================");
        		System.out.printf("�����ﰢ�� ���� �Է� : ");
        		TriangleStars B = new TriangleStars();
        		B.triangleStars();
        		menu=0;
        		break;
        		
        	case 3:
        		System.out.println("==================");
        		System.out.printf("�̵�ﰢ�� ���� �Է� : ");
        		IsoscelsTriangleStars C = new IsoscelsTriangleStars();
        		C.isoscelsTrinaestars();
        		menu=0;
        		break;
        	
        	case 4:
        		System.out.println("==================");
        		System.out.printf("���̾Ƹ���� ũ���Է� : ");
        		menu=0;
        		DiamondStars D = new DiamondStars();
        		D.diamondstars();
        		break;
        		
        	default :
        		System.out.print("���ϴ� �޴���? >> ");
        		menu = input.nextInt();
        		break;
        	}
        }
        
        System.out.println("���α׷� ����");
        
	}
}
