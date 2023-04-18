/**
 * 2023.03.28
 * 이종국
 * 조건문 연습
 */

package ch04;
import java.util.Scanner;


public class simpleTest {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input score:");
		int grade=stdin.nextInt();
		
		if (grade>=90)
		{
			System.out.println("pass");
			System.out.println("congraturation");
			System.out.print("thank uou");
			}
		else
			System.out.print("non pass");
	}
		
}
