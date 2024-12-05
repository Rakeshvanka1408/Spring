package in.ashokit.beans;

import java.util.List;

public class BookService {

	
	private IBookDao iBookDao;
	public BookService(IBookDao iBookDao) {
		this.iBookDao = iBookDao;
	}
		
	public void createPdf() {
		
	}
	public void getBooks() {
		List<BookDto> books = iBookDao.getBooks();
		books.forEach(n->{
			System.out.println(n);
		});
	}
}
