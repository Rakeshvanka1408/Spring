package in.ashokit.beans;

public class Motor {
		
	public Motor() {
		System.out.println("MOtor:Constructor");
	}
	// init() method
	public void start() {
		System.out.println("Motor started..");
	}
	public void doWork() {
		System.out.println("Motor is running...");
	}
	//destroy() method
	public void stop() {
		System.out.println("Motor Stopped");
	}
}
