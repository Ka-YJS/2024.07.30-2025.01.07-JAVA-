package ex06_calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02_Calendar {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();

		System.out.println("월을 입력하세요");
		int month = sc.nextInt();

		// 인자로 전달된 값을 특정 값으로 설정함
		cal.set(year, month - 1, 1);

		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		// 달의 마지막 날짜를 구함
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		
		// 지정한 달의 시작하는 요일을 구함
		int week = cal.get(Calendar.DAY_OF_WEEK);

		// 달력 시작 날의 주말 처리
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		//날짜를 찍어주는 코드
		for (int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%d\t", i);

			// 토요일에 날짜를 표시하고 줄 바꿈 하는 코드
			if (week % 7 == 0) {
				System.out.println();
			}week++;
		}
		

	}
}


	/*추가설명
	1. 특정문자열을 치환해주는 메서드_replace : 특정문자를 치환해주는 메서드
	-형식 : replace(기존문자열, 바꿀문자열)
 	-ex.System.out.println("Mal","Gae");
  
  	2. 특정문자를 포함하고있는지 판별_contains
   	-형식 : contains(String str)
    	-ex.System.out.println(str.contains("a"));
     
       	3. 문자열의 길이가 0인 경우 true를 반환_isEmpty
   	-형식 : isEmpty()
    	-ex.System.out.println(str.isEmpty);
	*/
