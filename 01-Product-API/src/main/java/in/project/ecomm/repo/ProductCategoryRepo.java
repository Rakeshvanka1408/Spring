package in.project.ecomm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.project.ecomm.entity.ProductCategory;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory,Long> {

}
