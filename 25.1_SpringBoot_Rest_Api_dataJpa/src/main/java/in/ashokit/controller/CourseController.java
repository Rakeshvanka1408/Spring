package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Course;
import in.ashokit.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course course){
		String upsert = courseService.upsert(course);
		return new ResponseEntity<>(upsert,HttpStatus.CREATED);
	}
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid) {
	Course byId = courseService.getById(cid);
		return new ResponseEntity<>(byId,HttpStatus.OK);
	}
	@PutMapping(value="/course")
	public ResponseEntity<String> updateCourse(@RequestBody Course course){
		String upsert = courseService.upsert(course);
		return  new ResponseEntity<>(upsert,HttpStatus.OK);
	}
	@DeleteMapping("course/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid){
		
		String deleteById = courseService.deleteById(cid);
		return new ResponseEntity<>(deleteById,HttpStatus.OK);
	}
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<>(allCourses,HttpStatus.OK);
	}
	
}













