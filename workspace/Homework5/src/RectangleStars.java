import java.io.*;
import java.util.Scanner;

public class RectangleStars {
	public void rectangleStars() {
	Scanner input = new Scanner(System.in);
	int Star = input.nextInt();
	
	for (int i=0; i<Star/2; i++){
		for (int j=0; j<Star; j++){
			System.out.printf("*");
		}
		System.out.printf("\n");
		}
	}
}
