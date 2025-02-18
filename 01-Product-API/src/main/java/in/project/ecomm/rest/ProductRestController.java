package in.project.ecomm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.project.ecomm.dto.ProductCategoryDto;
import in.project.ecomm.dto.ProductDto;
import in.project.ecomm.response.ApiResponse;
import in.project.ecomm.service.ProductService;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService productService;

	@GetMapping("/categories")
	public ResponseEntity<ApiResponse<List<ProductCategoryDto>>> productCategories() {

		List<ProductCategoryDto> allCategories = productService.findAllCategories();

		ApiResponse<List<ProductCategoryDto>> response = new ApiResponse<>();

		if (!allCategories.isEmpty()) {

			response.setStatus(200);
			response.setMessage("Fetched categories successfully");
			response.setData(allCategories);// payload
			return new ResponseEntity<>(response, HttpStatus.OK);

		} else {

			response.setStatus(500);
			response.setMessage("Failed to fetch categories");
			response.setData(allCategories);// noPayload
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@GetMapping("/products/{categoryId}")
	public ResponseEntity<ApiResponse<List<ProductDto>>> products(@PathVariable Long categoryId) {
		
		ApiResponse<List<ProductDto>> response = new ApiResponse<>();


		List<ProductDto> products = productService.findProductsByCategoryId(categoryId);

		if(!products.isEmpty()) {
			
			response.setStatus(200);
			response.setMessage("Fetched products successfully");
			response.setData(null);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}else {
			response.setStatus(500);
			response.setMessage("Failed to fetch the products");
			response.setData(null);
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
		@GetMapping("/productsByName/{name}")
		public ResponseEntity<ApiResponse<List<ProductDto>>> products(@PathVariable String name) {
			
			ApiResponse<List<ProductDto>> response = new ApiResponse<>();


			List<ProductDto> products = productService.findByProductName(name);

			if(!products.isEmpty()) {
				
				response.setStatus(200);
				response.setMessage("Fetched products successfully");
				response.setData(null);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}else {
				response.setStatus(500);
				response.setMessage("Failed to fetch the products");
				response.setData(null);
				return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		
	}
		@GetMapping("/product/{id}")
		public ResponseEntity<ApiResponse<List<ProductDto>>> product(@PathVariable Long productId) {
			
			ApiResponse<List<ProductDto>> response = new ApiResponse<>();


			ProductDto products = productService.findByProductId(productId);

			if(products!=null) {
				
				response.setStatus(200);
				response.setMessage("Fetched products successfully");
				response.setData(null);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}else {
				response.setStatus(500);
				response.setMessage("Failed to fetch the products");
				response.setData(null);
				return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		
	}
	

	
	

	
	

}
