package in.ashokit.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.entity.QuoteEntity;
import in.ashokit.repo.QuotesRepo;

@Service
public class QuoteService {

	@Autowired
	private QuotesRepo quotesRepo;
	
	private RestTemplate restTemplate;
	 public void fetchAndSaveQuotes() {
	        String apiUrl = "https://dummyjson.com/quotes";
	        Map<String, Object> response = restTemplate.getForObject(apiUrl, Map.class);

	        List<Map<String, Object>> quotes = (List<Map<String, Object>>) response.get("quotes");

	        quotes.forEach(quoteData -> {
	            QuoteEntity quoteEntity = new QuoteEntity();
	            quoteEntity.setQuote((String) quoteData.get("quote"));
	            quoteEntity.setAuthor((String) quoteData.get("author"));
	            quotesRepo.save(quoteEntity);
	        });
	    }

	    public List<QuoteEntity> getAllQuotes() {
	        return quotesRepo.findAll();
	    }
	}
}

