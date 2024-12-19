package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int age;
	private String name;
	private String emailid;
	private long pho;
	
}
