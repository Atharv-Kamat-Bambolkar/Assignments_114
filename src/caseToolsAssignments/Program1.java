package caseToolsAssignments;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int c = add(a, b);
		int f = add1(d, e);
		System.out.println("c = " + c);
		System.out.println("f = " + f);
	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add1(int d, int e) {
		return d + e;
	}
	
}
