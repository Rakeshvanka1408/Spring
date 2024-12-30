package in.ashokit.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@EntityScan
@Data
@Table(name ="user_tbl")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	private String name;
	private String email;
	private long phno;
}