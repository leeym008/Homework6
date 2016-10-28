import java.io.*;
import java.util.Scanner;

public class DiamondStars {
		public void diamondstars() {
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		for (int i = 1; i <= height; i++) {
			for (int j = height; j > i; j--) {
				System.out.printf(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		} 
		for (int i = 1; i < height; i++) {
			for (int j = 1; j <= i; j++) {
			System.out.printf(" ");
			} 
		for (int j = height* 2 - 1; j > i * 2; j--) {
			System.out.printf("*"); 
		}
		System.out.printf("\n");
		}	
	}
}
