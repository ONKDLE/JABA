/**
 * 2023-04-04
 * 이종국
 * 1~100까지의 숫자 중에서 사용자로부터 입력 받은 숫자의 배수의 합을 구하라.
 * (while.countinue)
 */


package ch05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("inpur number : ");
		int num=stdin.nextInt();
		int i=0, sum=0;
		
		while (i<=100)
		{
			i++;
			if (i%num!=0)
				continue;
			sum=sum+i; //num의 배수만 더하기
		}
		System.out.print("multples of 1~10 sum:" +sum);
	}

}
