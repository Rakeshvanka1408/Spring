package in.ashokit.beans;

public class Car {
	private IEngine engine;
	public Car() {
		System.out.println("Car :: constructor");
	}
	public Car(IEngine engine) {
		this.engine = engine;
	}
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	public void drive() {
		int status = engine.start();
		if(status >=1) {
			System.out.println("engine started ");
		}
		else {
			System.out.println("engine problem");
		}
	}
}
