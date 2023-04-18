/**
 * 열거타입 Week 이용하려면 날짜 정보 필요
 * 컴퓨터의 날짜, 요일, 시간을 얻기 위해 Calender 클래스 필요
 * Calender,getInstance() Calender 객체 얻기
 * 
 * today는 스텍 영역에 생성, week객체는 립 영역에 생성,
 * week,SUNDAY는 메소드 영역에 생성
 * today에 저장 되는 값은 Week,SUNDAY 열거 상수가 참조하는 객체 번지
 * Week,Sunday와 today 변수는 서로 같은 Week 객체 참조
 */

package ch06;
import java.util.Calender;

import chap06test.EnumWeek.Week;
public class EunmWeek2 {

	public static void main(String[] args) {
		Week today=null; // 열거타입 변수 생성
		
		Calender cal=Calender.getInstance();//Calender 객체 얻기
		int week=cal.get(Calender.DAY_OF_WEEK);//일(1)~토(7)까지 숫자 리턴
		
		Switch(week) {
		case 1;
			today=Week.SUNDAY;//열거 상수 대입
		}
	}

}
