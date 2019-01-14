package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insert the amount of lines: ");
		int lines = sc.nextInt();
		System.out.print("Insert the amount of colums: ");
		int colums = sc.nextInt();

		int[][] matrix = new int[lines][colums];

		System.out.println("Insert the elements: ");
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < colums; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.print("What number to look for? ");
		int number = sc.nextInt();
		System.out.println();

		// pass trough all places of the matrix
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < colums; j++) {
				if (number == matrix[i][j]) {
					System.out.println("Position: " + i + ", " + j + ": ");
					// check the possibility to read the neighbors numbers
					if (j >= 1) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					if (j <= colums - 2) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
					if (i >= 1) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}
					if (i <= lines - 2) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
					System.out.println();
				}
			}

		}

		sc.close();
	}

}
