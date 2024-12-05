package in.ashokit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
public class Book {
	private int bookId;
	private String bookName;
	private double bookPrice;
	private String bookAuthor;
}
