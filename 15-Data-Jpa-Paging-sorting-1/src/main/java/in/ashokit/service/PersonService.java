package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Person;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	public PersonRepo personRepo;

	PersonService(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}

	public void getPersonQBE(String gender, String name) {
		Person p = new Person();
		if(gender!=null) {
			p.setGender(gender);
		}
		if (name!=null) {
			p.setName(name);
		}
		Example<Person> of = Example.of(p);
		List<Person> all = personRepo.findAll(of);
		all.forEach(System.out::println);
	}
	public void getPersonsPagination() {
		int pageSize = 3;
		int pageNo = 2;
		 PageRequest of = PageRequest.of(pageNo - 1, pageSize);
		 Page<Person> all = personRepo.findAll(of);
		 List<Person> content = all.getContent();
		 content.forEach(System.out::println);
	}

	public void personSort() {

		Sort sort = Sort.by("country").descending();
		List<Person> all = personRepo.findAll(sort);
		all.forEach(System.out::println);
	}

	public void savePersons() {
		Person p = new Person();
		p = new Person(1, "Chris", 38, "male", "USA");
		Person p1 = new Person(2, "Ryan Gosling", 48, "male", "Japan");
		Person p2 = new Person(3, "Angiline ", 48, "Fe-male", "Australia");
		Person p3 = new Person(4, "Chris", 48, "male", "Australia");
		Person p4 = new Person(5, "Tessa Thompson", 48, "fe-male", "Canada");
		Person p5 = new Person(6, "Chris", 30, "male", "Australia");
		Person p6 = new Person(7, "Amber head", 48, "fe-male", "USA");
		Person p7 = new Person(8, "Chris", 19, "male", "Australia");
		Person p8 = new Person(9, "Rock", 48, "male", "Australia");
		Person p9 = new Person(10, "Danush", 28, "male", "India");
		Person p10 = new Person(11, "Cilian Murphy", 58, "male", "UK");
		List<Person> asList = Arrays.asList(p, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

		personRepo.saveAll(asList);
	}
}
