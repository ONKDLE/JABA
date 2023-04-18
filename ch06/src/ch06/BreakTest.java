/**
 * 2023-04-11
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면
 * 1000을 넘은 수와 평균을 출력
 */
package ch06;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		int sum=0;//입력
		int cnt=0;//입력 횟수
		
		while (true)
		{
			Scanner stdin=new Scanner(System.in);
			System.out.print("input number : ");
			int num=stdin.nextInt();
			
			cnt++; //입력 횟수 증가
			sum=sum+num; //입력 받은 값의 합계
			
			if (sum>=1000) //합계가 1000이상인지
				break; //반복 종
		}
		System.out.print("sum is "+sum ); //합계 출력
		System.out.print("avg is "+sum/cnt ); //평균 출력
	}

}
