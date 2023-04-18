/**
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더하여 출력하는
 * 프로그램 작성
 * #문제분석
 * 변수=num1,num2,sum
 * #알고리즘
 * 1.두 정수 입력(num1,num2)
 * 2.선택문(if(num1<num2))
 * 3.복합논리 (반복문 안에 선택문 포함)
 * 	while(num1<=num2){
 * 		if(num1%2==1){
 * 		sum=sum+num1
 * 		}
 * 		num1+num1+1
 * 
 */
package ch05;

import java.util.Scanner;

public class Textex3 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("두 개의 숫자 입력 : ");
		int first=stdin.nextInt();
		int second=stdin.nextInt();
		int temp, total=0;
 		int result=0;
		if(first>second) {
			temp=second;
			second=first;
			first=temp;
		}
		for(int i= first; i<=second; i ++) {
			if(i%2!=0)	{
			result+=i;
			}else {
				continue;
			}
		}
		System.out.println(result);
	}

}