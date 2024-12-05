package in.ashokit.beans;

public class DieselEngine implements IEngine{
		public DieselEngine() {
			System.out.println("Diesel:: constructor");
		}
	public int start() {
		System.out.println("diesel engine...");
		return 1;
	}
}
