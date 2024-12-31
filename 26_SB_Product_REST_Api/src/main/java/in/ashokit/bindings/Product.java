package in.ashokit.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Product {
 public Product(int i, String string, double d) {
	 pid =i;
	 name=string;
	 price =d;
	}
private Integer pid;
 private String name;
 private Double price;
}
