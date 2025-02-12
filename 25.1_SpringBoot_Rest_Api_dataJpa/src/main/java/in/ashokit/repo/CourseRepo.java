package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.binding.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer> {

			
}
