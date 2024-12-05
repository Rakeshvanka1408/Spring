package in.ashokit.map;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.ashokit.beans.BookDto;

public class BookRowMapper implements RowMapper<BookDto> {

	@Override
	public BookDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookDto book = new BookDto();
		book.setBid(rs.getInt(1));
		book.setBName(rs.getString(2));
		book.setBPrice(rs.getDouble(3));
		return book;
	}
	
	
}
