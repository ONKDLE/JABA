package ch08;

public class CarTest {

	public static void main(String[] args) {
		//객체생성
		Car myCar=new Car();
		
		//필드값 읽기
		System.out.println("제작회사:"+ myCar.company);
		System.out.println("모델명:" +  myCar.mode1);
		System.out.println("현재속도:"+ myCar.speed);
		
		//필드값 변경_
		myCar.speed=60;
		System.out.println("수정된속도:"+ myCar.speed);
				
	}

}
