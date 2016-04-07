package day5Labs;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		printNumbers(x);

	}
	public static void printNumbers(int number) {
		for (int i = 1; i <= number; i++)
			System.out.println(i);
	}
}
