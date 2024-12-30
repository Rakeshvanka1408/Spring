package in.ashokit.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonPassportService {
	
	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
	public void saveData() {
		Person person = new Person();
		person.setGender("male");
		person.setPersonName("Harry");
		Person save = personRepo.save(person);
		Passport passport = new Passport();
		
		passport.setPassportNum("df943LH4");
		passport.setExipiredAt(LocalDate.now());
		passport.setIssuedAt(LocalDate.now().plusYears(7));
		
		passport.setPerson(save);
		passportRepo.save(passport);
	}
	public void getDetails() {
		Optional<Person> byId = personRepo.findById(1);
		if (byId.isPresent()) {
			System.out.println(byId.get());
		}
	}
}
