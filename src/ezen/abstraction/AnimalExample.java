package ezen.abstraction;

public class AnimalExample {

	public static void main(String[] args) {
		Animal animal = new Cat();
		// 클래스 자동형변환 -> 다형성
		animal = new Bird();
		animal.cry();
		// animal.fly();
		// 새롭게 추가된 메소드를 호출하기 위해 강제형변환
		Bird bird = (Bird)animal;
		bird.fly();
		
		animal = new Cat();
		animal.cry();
		animal = new ShibaDog();
		animal.cry();
	}
}