package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the line and column of matrix:\n");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matrix = new int[m][n];
		
		System.out.print("\nEnter the elements of matrix:\n");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.print("\nEnter the element to find your position and your neighbors:\n");
		int x = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j <n; j++) {
				if (matrix[i][j] == x) {
					System.out.print("\nPosition " + i + "," + j + ":\n");
					
					if (j > 0) {
						System.out.println("Left neighbor: " + matrix[i][j - 1]);
					} else {
						System.out.println("Left neighbor: not have");
					}
					
					if (j < n - 1) {					
						System.out.println("Right neighbor: " + matrix[i][j + 1]);
					} else {
						System.out.println("Right neighbor: not have");
					}
					
					if (i > 0) {
						System.out.println("Up neighbor: " + matrix[i - 1][j]);
					} else {
						System.out.println("Up neighbor: not have");
					}
					
					if (i < m - 1) {
						System.out.println("Down neighbor: " + matrix[i + 1][j]);
					} else {
						System.out.println("Down neighbor: not have");
					}
				}
			}
		}
		
		sc.close();
		}
		
}