package com.course.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.course.dto.CourseDTO;
import com.course.entity.Course;
import com.course.repo.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo repo;
	
	public List<CourseDTO> getAllCourse() {
		
		List<Course> courses =  repo.findAll();
		List<CourseDTO> coursesDTO = new ArrayList<>();
		
		for(Course c : courses) {
			coursesDTO.add(CourseDTO.createDTO(c));
		}
		return coursesDTO;
	}
	
	public CourseDTO addCourse(CourseDTO courseDTO) {
		
		Course c = courseDTO.createEntity();
		repo.save(c);
		return courseDTO;
	}
	
	public String deleteCourse(Integer id) {
		
		Course course = repo.findById(id).get();
		repo.deleteById(id);
		
		return "Course "+ course.getTitle() + " removed.";
	}
	
	public CourseDTO getCourse(Integer id) {
		
		Course course = repo.findById(id).get();
		return CourseDTO.createDTO(course);
	}
}
