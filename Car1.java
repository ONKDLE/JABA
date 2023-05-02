package ch08;

public class Car1 {
	//필드
	String company="쉐보레";
	String mode1; //nu11
	String color; //nu11
	String maxSpeed; //0
	
	//생성자1
	public Car1() {
		
	}
	
	//생성자2
	public Car1(String mode1) {
		this.mode1=mode1;
	}
	
	//생성자3
	public Car1(String mode1, String color, int maxSpeed) {
		this.mode1=mode1;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
