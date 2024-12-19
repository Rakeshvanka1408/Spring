package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repo.ContactRepo;

@Service
public class ContactService {
	@Autowired
	public ContactRepo contactRepo;

	ContactService(ContactRepo contactRepo) {
		this.contactRepo = contactRepo;
	}
	
	public void saveContact() {
		Contact c= new Contact();
		c.setAge(20);
		c.setEmailid("raesh@gmail.com");
		c.setName("Rajesh");
		c.setPho(9704l);
		System.out.println("Before  saving c:"+c);
		Contact save = contactRepo.save(c);
		System.out.println("After saving c:"+save);
		
	}
}
