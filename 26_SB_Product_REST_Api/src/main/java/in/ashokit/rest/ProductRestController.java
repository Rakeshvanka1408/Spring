package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.Product;

@RestController
public class ProductRestController {

	//here we don't need to write the logic to convert the object to json
	//springboot will internally take care of converting to json.
	@PostMapping(value="/product"
			,consumes ={"application/xml","application/json"}
			,produces ={"application/xml","application/json"})
	public ResponseEntity<String> postProducts(@RequestBody Product p) {
		
		System.out.println(p);
		String msg = "Insertion sucessful";
			
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	@PutMapping(value="/product",
			consumes="application/json",
			produces="text/plain")
	public ResponseEntity<String >updateProduct(@RequestBody Product p){
		
		System.out.println(p);
		String s= "updated sucessfully";
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
	@DeleteMapping(value="/product/{pid}",
			produces="text/plain")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer pid){
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
	@GetMapping(value="/product/{pid}"
			,produces ={"application/json","application/xml"})
	public ResponseEntity<Product> getProduct(@PathVariable Integer pid) {
		
		Product p = new Product(pid ,"Rakesh" ,12000.2);
		
		return new ResponseEntity<Product>(p,HttpStatus.OK);
	}
	@GetMapping(value="/products",
			consumes={"application/xml","application/json"},

			produces={"application/xml","application/json"})
public ResponseEntity<List<Product>> getProducts() {
		
		Product p = new Product(1 ,"Rakesh" ,12000.2);
		Product p1 = new Product(12 ,"Rakesh" ,12000.2);
		Product p2= new Product(13 ,"Rakesh" ,12000.2);
		Product p3= new Product(10 ,"Rakesh" ,12000.2);
		List<Product> pList = Arrays.asList(p,p1,p2,p3);
		return new ResponseEntity<List<Product>>(pList,HttpStatus.OK);
	}
}
