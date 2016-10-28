import java.io.*;
import java.util.Scanner;

public class IsoscelsTriangleStars {
	public void isoscelsTrinaestars() {
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		int i, j;
		for(i=1; i<=height; i++){
			for(j=1; j<=height-i; j++){
				System.out.printf(" ");
			}
			for(j=1; j<=i*2-1; j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
