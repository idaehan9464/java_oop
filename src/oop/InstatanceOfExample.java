package oop;

public class InstatanceOfExample {

	public static void main(String[] args) {
		Bird bird = new Bird();
		
		System.out.println(bird instanceof Bird);
		System.out.println(bird instanceof Animal);
		System.out.println(bird instanceof Object);
//		System.out.println(bird instanceof String);
	}
}