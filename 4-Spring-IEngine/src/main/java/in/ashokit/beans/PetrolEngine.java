package in.ashokit.beans;

public class PetrolEngine implements IEngine {
	public PetrolEngine() {
		System.out.println("petrolengine:: constructor");
	}
	public int start() {
		System.out.println("petrol engine");
		return 1;
	}
}
