package homework6;
import java.io.*;
import java.util.Scanner;
public abstract class ExamVariousArray {
    public static void main(String[] args) {
        ////
        Scanner input = new Scanner(System.in);
        System.out.println("*************");
        System.out.println("�迭 ����ϱ�");
        System.out.println("*************");
        System.out.println("1. �ι�°�� ū �� ã��");
        System.out.println("2. �ɻ� ���� ���");
        System.out.println("3. �л� ����, ��հ� ���ϱ�");
        System.out.println("4. 5�� ����Ʈ�� ������ ���� ���ϱ�");
        System.out.println("5. ��ġ�� �ʴ� ���� 10�� �Է¹ޱ�");
        System.out.println("6. �����ϱ�");
        System.out.print("���ϴ� �޴���? >> ");
        
        int menu = input.nextInt();
        
        while (menu!=6){
            switch (menu){                
            case 1:
                System.out.println("==================");
                System.out.println("10���� ���ڸ� �Է¹޾� �迭�� �����ϰ�");
                System.out.printf("�ι�°�� ū ���� ����϶�.");
                /*new RectangleStars(rectangleStars(););*/
                
                menu=0;
                break;
                
            case 2:
                System.out.println("==================");
                System.out.println("�ɻ��������");
                System.out.printf("���� ū ������ ����������������");
                /*TriangleStars B = new TriangleStars();
                B.triangleStars();*/
                menu=0;
                break;
                
            case 3:
                System.out.println("==================");
                System.out.printf("5���� ����, ����, ���� ������ �������� �� ��� ���ϱ�");
                /*IsoscelsTriangleStars C = new IsoscelsTriangleStars();
                C.isoscelsTrinaestars();*/
                menu=0;
                break;
            
            case 4:
                System.out.println("==================");
                System.out.printf("5������Ʈ �������ο� �ľ��ϱ�");
                menu=0;
                /*DiamondStars D = new DiamondStars();
                D.diamondstars();*/
                break;
                
            case 5:
                System.out.println("==================");
                System.out.printf("��ġ�� �ʴ� 10�� ���� �Է¹ޱ�");
                menu=0;
                /*DiamondStars D = new DiamondStars();
                D.diamondstars();*/
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