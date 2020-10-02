package gskim.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		
		int first = Integer.parseInt(s1);
		int second = Integer.parseInt(s2);
		
		System.out.println("두 수의 합은 " + (first+second) + "입니다.");
		scanner.close();
	}

}
