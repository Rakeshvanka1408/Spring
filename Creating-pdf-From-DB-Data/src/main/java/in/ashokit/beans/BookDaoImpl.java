package in.ashokit.beans;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements IBookDao{

	private JdbcTemplate jdbcTemplate;
	BookDaoImpl(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public List<BookDto> getBooks(){
		String sql = "SELECT * FROM BOOKS;";
		List<BookDto> books = jdbcTemplate.query(sql, new BookRowMapper());
		return books;
	}
}
