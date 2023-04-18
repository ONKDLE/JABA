/**
 * 2023.03.28
 * 이종국
 * 입력받은 단의 구구단 출력하기
 */
package ch05;
import java.util.Scanner;
public class GugudanTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input dan:");
		int dan=stdin.nextInt();
		int i;
		
		for(i=1;i<=10;i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}

}
