package ezen.abstraction;

public class ShibaDog extends Dog {

	public ShibaDog() {}
	
	public ShibaDog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public void eat() {
		System.out.println("먹이를 쿰척쿰척 먹습니다..");

	}
}