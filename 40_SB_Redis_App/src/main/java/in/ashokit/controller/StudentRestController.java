package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepository;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepository srepo;
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		srepo.save(student);
		return "Student saved";
	}
	
	@GetMapping("/student")
	public Iterable<Student> getAllStudent(){
		return srepo.findAll();
	}
}
