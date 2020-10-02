package gskim.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {		
		System.out.println("반복 횟수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int repeat = scanner.nextInt();
		
		int[] month = new int[repeat];
		for(int i=0; i<repeat; i++){
			System.out.println((i+1)+"번째 달을 입력하세요 : ");
			month[i] = scanner.nextInt();
		}
		
		int[] monthDay = new int[3];
		monthDay[0] = 31;
		monthDay[1] = 30;
		monthDay[2] = 28;
		
		for(int j=0; j<repeat; j++){
			switch(month[j]){
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				System.out.println(month[j]+"월은 "+ monthDay[0] +"일까지 있습니다.");
				break;
			case 4 : case 6 : case 9 : case 11 : 
				System.out.println(month[j]+"월은 "+ monthDay[1] +"일까지 있습니다.");
				break;
			case 2 :
				System.out.println(month[j]+"월은 "+ monthDay[2] +"일까지 있습니다.");
				break;
			default :
				System.out.println("1월부터 12월 사이의 숫자를 입력하세요.");
				break;
			}		
		}
		scanner.close();
	}
}
