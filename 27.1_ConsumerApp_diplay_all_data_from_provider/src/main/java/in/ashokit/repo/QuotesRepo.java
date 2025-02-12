package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.QuoteEntity;

public interface QuotesRepo extends JpaRepository<QuoteEntity,Integer>{
	QuoteEntity findTopByOrderByIdDesc();
}