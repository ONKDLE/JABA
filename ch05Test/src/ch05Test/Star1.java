package ch05Test;
import java.util.Scanner;
public class Star1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("imput number : ");
		int num=stdin.nextInt();
		int i=1;
		while(i<=num) // 줄반복
		{
			int j=1;
			while(j<=1) // 별찍기 반복
			{
				System.out.print("*");
				j=j+1;
			}
			System.out.println();//줄바꿈
			i=i+1;
		}

	}

}
