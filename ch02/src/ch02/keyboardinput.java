package ch02;
/**
 * 2023.03.14
 * 세 개의 값을 입력 받아 첫 번째 같은 문장러, 두 번째 같은 정수 값
 * 세 번째 같은 실수로 출력 하는 프로그램
 * @author JG Lee
 */
import java.util.Scanner;
public class keyboardinput {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("이름과 나이, 몸무게를 공간(space)으로 구분하여 입력");
		String name = stdIn.next();//이름은 문자열로 입력
		int i = stdIn.nextInt();//나이는 정수로 입력
		double d = stdIn.nextDouble();//몸무게는 실수로 입력
		System.out.println(name + "씨의 나이는 " +i+"세이고");
		System.out.println("몸무게는 " + d + "kg 입니다");
	}

}