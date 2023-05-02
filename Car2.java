package ch08;

public class Car2 {
	//필드
		String company="쉐보레";
		String mode1;
		String color;
		int maxSpeed;
		
		//생성2ㅏ1
		public Car2() {
			
		}
		
		//생성자2
		public Car2(String mode1) {
			this(mode1,"은색",250); //생성자4호출
		}
		//생성자3
		public Car2(String mode1, String color) {
			this(mode1,color,250);
		}
		
		//생성자4
		public Car2(String mode1, String color,int maxSpeed) {
			
			this.mode1=mode1;
			this.color=color;
			this.maxSpeed=maxSpeed;
		}
}
