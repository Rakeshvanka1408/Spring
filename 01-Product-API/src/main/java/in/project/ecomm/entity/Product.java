package in.project.ecomm.entity;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "product")
@Setter
@Getter
public class Product {

	
	private Long id;
	
	private String name;
	
	private String description;
	
	private String title;
	
	private BigDecimal unitPrice;
	
	private String imageUrl;
	
	private boolean active;
	
	private int unitsInStock;
	
	private Date dateCreated;
	
	private Date lastUpdate;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable =false)
	private ProductCategory category;
	
	
	
	
	
	
	
	
}
