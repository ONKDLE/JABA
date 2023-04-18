/**
 * 2023-04-04
 * 이종국
 * 입력받은 숫자만큼 홀수를 반복하면서 직감삼각형 출격
 * #문제분석
 * ~변수:num,i,j
 * #알고리즘
 * 1.줄수 입력(num)
 * 2.중첩반복
 * 	while(i<=num) // 줄 반복
 * 		{
 * 		while(j<=i) // 별 찍기 반복
 * 		 별 찍기
 * 		}
 */

package ch05;
import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
	Scanner stdin=new Scanner(System.in);
	System.out.print("imput number : ");
	int num=stdin.nextInt();
	int i=1;
	while(i<=num) // 줄반복
	{
		int j=1;
		while(j<=i) //별 찍기 반복
		{
			System.out.print("*");
			j=j+1;
		}
		i=i+1;
	}
	}

}
