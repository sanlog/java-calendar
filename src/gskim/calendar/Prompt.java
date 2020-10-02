package gskim.calendar;

import java.util.Arrays;
import java.util.Scanner;

public class Prompt {	
	public void runPrompt(){
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int year = -1;
		int month = -1;
		String[] firstDay = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
		String weekday = "";
		
		while(true){
			System.out.println("연도를 입력하세요");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			
			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			
			System.out.println("첫 번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
			System.out.print("WEEKDAY> ");
			weekday = scanner.next();			
			
			if(month == -1){
				System.out.println("Bye~");
				break;
			}
			
			if(month > 12){
				continue;
			}
			
			int day = Arrays.asList(firstDay).indexOf(weekday);
			cal.printCalendar(year, month, day);
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
