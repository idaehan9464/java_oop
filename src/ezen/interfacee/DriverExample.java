package ezen.interfacee;

public class DriverExample {

	public static void main(String[] args) {
		Car car = new K3("루니", "K3", false, 0);
		Driver driver = new Driver(car);
		driver.drive();
		
		car = new Avante("누나", "아반테", false, 0);
		driver.setCar(car);
		driver.drive();
	}

}
