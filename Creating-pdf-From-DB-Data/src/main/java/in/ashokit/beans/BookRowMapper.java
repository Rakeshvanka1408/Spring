package in.ashokit.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper <BookDto> {

	@Override
	public BookDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BookDto data = new BookDto();
		data.setBid(rs.getInt(1));
		data.setBName(rs.getString(2));
		data.setBPrice(rs.getDouble(3));
		return data;
	}
	
	
}
