package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Course;
import in.ashokit.repo.CourseRepo;

@Service
public class CourseServiceImpl implements  CourseService{

	@Autowired
	private CourseRepo courseRepo;
	@Override
	public String upsert(Course course) {
			courseRepo.save(course);
		return "sucess";
	}

	@Override
	public List<Course> getAllCourses() {
		List<Course> all = courseRepo.findAll();
		return all;
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById = courseRepo.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		else {
			return null;

		}
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Deleted sucessfully";
		}
		else {
			return "no record found";

		}
	}

	
}
