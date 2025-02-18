package in.project.ecomm.mapper;

import org.modelmapper.ModelMapper;

import in.project.ecomm.dto.ProductCategoryDto;
import in.project.ecomm.entity.ProductCategory;

public class ProductCategoryMapper {

	public static final ModelMapper modelMapper =new ModelMapper();
	
	public static ProductCategoryDto convertToDTO(ProductCategory entity) {
		
		return modelMapper.map(entity,ProductCategoryDto.class);
	}
	public static ProductCategory convetToEntity(ProductCategoryDto productDto) {
		return modelMapper.map(productDto, ProductCategory.class);
	}
}
