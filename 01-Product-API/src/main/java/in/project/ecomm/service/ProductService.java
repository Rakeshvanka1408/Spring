package in.project.ecomm.service;

import java.util.List;

import in.project.ecomm.dto.ProductCategoryDto;
import in.project.ecomm.dto.ProductDto;

public interface ProductService {

	public List<ProductCategoryDto> findAllCategories();
	
	public List<ProductDto> findProductsByCategoryId (Long categoryId);
	
	public ProductDto findByProductId (Long productId);
	
	public List<ProductDto> findByProductName(String productName);
	
	
}
