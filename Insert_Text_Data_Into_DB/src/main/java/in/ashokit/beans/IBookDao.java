package in.ashokit.beans;

import java.util.List;

public interface IBookDao {
	
	public void saveBook(int bid,String bName, double bPrice);
	public List<BookDto> getBooks();
}