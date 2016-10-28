import java.io.*;
import java.util.Scanner;

public class TriangleStars {
	public void triangleStars() {
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		int i, j;
		for(i=1; i<=height; i++){
			for(j=1; j<=height-i; j++){
				System.out.printf(" ");
			}
			for(j=1; j<=height-i; j++){
			}
			for(j=1; j<=i; j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
