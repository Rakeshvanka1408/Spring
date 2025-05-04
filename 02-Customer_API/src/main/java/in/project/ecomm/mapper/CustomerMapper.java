package in.project.ecomm.mapper;

import org.modelmapper.ModelMapper;

import in.project.ecomm.dto.CustomerDto;
import in.project.ecomm.entity.Customer;

public class CustomerMapper {

	

	public static final ModelMapper modelMapper =new ModelMapper();
	
	public static CustomerDto convertToDTO(Customer entity) {
		
		return modelMapper.map(entity,CustomerDto.class);
	}
	public static Customer convetToEntity(CustomerDto customerDto) {
		return modelMapper.map(customerDto, Customer.class);
	}
}
