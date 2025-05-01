package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.course.dto.CourseDTO;
import com.course.service.CourseService;

@RestController
@CrossOrigin
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@GetMapping
	public List<CourseDTO> getAllCourse() {
		
		System.out.println("Request hit");
		return service.getAllCourse();
		
	}
	
	@PostMapping
	public CourseDTO addCourse(@RequestBody CourseDTO courseDTO) {
		
		return service.addCourse(courseDTO);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCourse(@PathVariable Integer id) {
		
		return service.deleteCourse(id);
	}
	
	@GetMapping("/{id}")
	public CourseDTO getCourse(@PathVariable Integer id) {
		
		return service.getCourse(id);
	}

}
