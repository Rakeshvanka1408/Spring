package in.ashokit.beans;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.ashokit.map.BookRowMapper;

public class BookDaoImpl implements IBookDao {
	private JdbcTemplate jdbcTemplate;
	public BookDaoImpl(JdbcTemplate jdbeTemplate) {
		this.jdbcTemplate = jdbeTemplate;
	}
	BookDaoImpl(){
		System.out.println("default constructor");
	}
	@Override
	public void saveBook(int bid,String bName, double bPrice) {
		
		String sql = "insert into BOOKS VALUES(?,?,?)";
		jdbcTemplate.update(sql,ps ->{
			ps.setInt(1,bid);
			ps.setString(2, bName);
			ps.setDouble(3, bPrice);
		});
		
		
	}
	@Override
	public List<BookDto> getBooks(){
		String sql = "SELECT * FROM BOOKS;";
		List<BookDto> books = jdbcTemplate.query(sql, new BookRowMapper());
		return books;
	}
	

}
