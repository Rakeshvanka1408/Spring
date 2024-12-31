package in.ashokit.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.binding.Customer;

public class App {
	public static void main(String [] args) throws Exception{
		App a = new App();
		a.convertJavaToJson();
		a.converJsonToJava();
	}
	public void converJsonToJava( )throws Exception{
		File f = new File("customer.json");
		//de-serialization
		
		ObjectMapper mapper = new ObjectMapper();
		Customer value = mapper.readValue(f,Customer.class);
		System.out.println(value.toString());
	}
	
	public void convertJavaToJson()  throws Exception{
		File f = new File("customer.json");
		Customer cobj = new Customer();
		cobj.setCid(101);
		cobj.setName("Rakesh");
		cobj.setPhno(9700l);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(f, cobj);
		
		System.out.println("Operation completed...");
	}
}
