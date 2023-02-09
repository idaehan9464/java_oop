package oop;

import ezen.shape.Lectangle;
import ezen.shape.Shape;

/**
 * @author 이대한
 * @Date   2023. 1. 5.
 */
public class PolymorphismExample2 {

	public static void main(String[] args) {
		Account account1 = new Account("1111", "이대한", 1111, 10000);
		Account account2 = new Account("1111", "이대한", 1111, 10000);
		System.out.println(account1.equals(account2));
		
		String name = "바보";
		System.out.println(account1.equals(name));
		
	}
}