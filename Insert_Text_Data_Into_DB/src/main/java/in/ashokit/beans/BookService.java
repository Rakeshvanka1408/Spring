package in.ashokit.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class BookService  {
	private BookDaoImpl bookDaoImpl;
	private ExcelGeneration excelGeneration;
	public BookService(BookDaoImpl bookDaoImpl,ExcelGeneration excelGeneration) {
		this.bookDaoImpl = bookDaoImpl;
		this.excelGeneration =  excelGeneration;
	}
	public void getBooks() throws Exception{
		List<BookDto> books = bookDaoImpl.getBooks();
		excelGeneration.excelGenerator(books);
		books.forEach(n->{
			System.out.println(n);
		});
	}
	public void StoreBook() throws Exception{
		File f = new File("Book.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		while(line != null) {
			
			String[] data = line.split(",");
			int bid = Integer.parseInt(data[0]);
			String bName = data[1];
			double bPrice = Double.parseDouble(data[2]);
			
			bookDaoImpl.saveBook(bid, bName, bPrice);
			line =br.readLine();
		}
		br.close();
		System.out.println("Records inserted into DataBase sucessfully ");
	}

	
	}

	
	
	

