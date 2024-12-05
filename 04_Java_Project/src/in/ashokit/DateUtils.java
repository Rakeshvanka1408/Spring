package in.ashokit;

public class DateUtils {
	public static DateUtils instance = null;
	//step:1 make constructor as private
	private DateUtils() {
		System.out.println("DateUtils: Constructor");
	}
	//step2: Create static method to give same obj
	public static  DateUtils getInstance() {
		if(instance ==null) {
			instance = new DateUtils();
		}
		return instance;
	}
	public void convertDateToStr() {
		
	}
	
}
