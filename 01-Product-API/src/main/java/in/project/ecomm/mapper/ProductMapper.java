package in.project.ecomm.mapper;

import org.modelmapper.ModelMapper;

import in.project.ecomm.dto.ProductDto;
import in.project.ecomm.entity.Product;

public class ProductMapper {

	public static final ModelMapper modelMapper =new ModelMapper();
	
	public static ProductDto convertToDTO(Product entity) {
		
		return modelMapper.map(entity,ProductDto.class);
	}
	public static Product convetToEntity(ProductDto productDto) {
		return modelMapper.map(productDto, Product.class);
	}
}
