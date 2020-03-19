package Odd_Numbers;

import java.util.Scanner;

public class Tyoe_Odd_Numbers {

	public static void main(String[] args) {
		System.out.println("Enter Start Number: ");
		Scanner sc = new Scanner(System.in);
		int startNum = sc.nextInt();
		System.out.println("Enter end Number: ");
		int endNum = sc.nextInt();

		printOdd(startNum,endNum);

		
		sc.close();

	}
	
	private static void printOdd(int startNum, int endNum) {
		if (startNum % 2 == 0) 
			startNum++;
		 

			for (; startNum <= endNum; startNum += 2) {
				System.out.print(startNum + " ");

			}
	}
	
}
