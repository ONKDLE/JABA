package ch08;

public class CarTest1 {

	public static void main(String[] args) {
		Car1 car1=new Car1();
		System.out.println("Car1.company:"+car1.company);
		System.out.println();
		
		Car1 car2=new Car1("자가용");
		System.out.println("Car2.company:"+car2.company);
		System.out.println();
		
		Car1 car3=new Car1("자가용","빨강");
		System.out.println("car3.company:"+car3.company);
		System.out.println("Car3.mode1:"+car3.mode1);
		System.out.println("car3.color:"+car3.color);
		System.out.println();
		
		Car1 car4=new Car1("택시","검정",200);
		System.out.println("car4.company:"+car4.company);
		System.out.println("Car4.mode1:"+car4.mode1);
		System.out.println("car4.color:"+car4.color);
		System.out.println("car4.maxSpeed:"+car4.maxSpeed);
		System.out.println();
	}
}
