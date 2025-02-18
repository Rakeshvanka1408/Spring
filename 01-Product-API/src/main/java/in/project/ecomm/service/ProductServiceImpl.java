package in.project.ecomm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.project.ecomm.dto.ProductCategoryDto;
import in.project.ecomm.dto.ProductDto;
import in.project.ecomm.mapper.ProductCategoryMapper;
import in.project.ecomm.mapper.ProductMapper;
import in.project.ecomm.repo.ProductCategoryRepo;
import in.project.ecomm.repo.ProductRepo;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private ProductCategoryRepo categoryRepo;
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategoryDto> findAllCategories() {
		
	/*	List<ProductCategory> categories = productCategoryRepo.findAll();
		
		List<ProductCategoryDto> dtoList= new ArrayList<>();
		
		for(ProductCategory category: categories) {
			ProductCategoryDto dto = ProductCategoryMapper.convertToDTO(category);
		}
		
		return dtoList;
		*/
		
		return categoryRepo.findAll()
				.stream()
				.map(ProductCategoryMapper::convertToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public List<ProductDto> findProductsByCategoryId(Long categoryId) {
		
		return productRepo.findAll()
				.stream()
				.map(ProductMapper::convertToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public ProductDto findByProductId(Long productId) {
		
		/*
		 * Optional<Product> byId = productRepo.findById(productId);
		 * 
		 * if(byId.isPresent()) { Product product =byId.get(); return
		 * ProductMapper.convertToDTO(product); } return null;
		 */
		return productRepo.findById(productId)
				.map(ProductMapper::convertToDTO)
				.orElse(null);
	}

	@Override
	public List<ProductDto> findByProductName(String productName) {
		
		return productRepo.findByNameContaining(productName)
				.stream()
				.map(ProductMapper::convertToDTO)
				.collect(Collectors.toList());
	}

}
