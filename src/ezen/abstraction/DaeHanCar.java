package ezen.abstraction;

public abstract class DaeHanCar extends Car{
	
	public void Car() {}
	
	public void Car(String name, String model, boolean run, int speed) {
		this.name = name;
		this.model = model;
		this.run = run;
		this.speed = speed;
	}
	
	@Override
	public void turnOn() {
		System.out.println("시동을 걸어요");
	}
	
	@Override
	public void turnOff() {
		System.out.println("시동을 꺼요");
	}
	
	@Override
	public void run() {
		System.out.println("신나게 달려요");
	}
	
	@Override
	public void speedUp(int speed) {
		System.out.println("속도를 올려요");
	}
	
	@Override
	public void speedDown(int speed) {
		System.out.println("속도를 줄여요");
	}
	
	@Override
	public void stop() {
		System.out.println("멈춰요");	
	}
}