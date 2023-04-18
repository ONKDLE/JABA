package ch03;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("얼마? : ");
		int cnt = sc.nextInt();
		
		System.out.println("500원 :" + (cnt/500) + "개/n100원 : " + (cnt%500/100) + "개/n50원 : " + (cnt%500%100/50)+ "개/n10원 : " + (cnt%500%100%50/10) + "개");
	}

}