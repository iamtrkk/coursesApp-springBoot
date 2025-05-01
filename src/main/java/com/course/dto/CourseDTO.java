package com.course.dto;

import com.course.entity.Course;

public class CourseDTO {
	
	private int id;
	private String title;
	private String description;
	
	public CourseDTO() {}
	
	public CourseDTO(int id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CourseDto [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	public static CourseDTO createDTO(Course courseEnt) {
		
		CourseDTO dto = new CourseDTO();
		
		dto.setId(courseEnt.getId());
		dto.setTitle(courseEnt.getTitle());
		dto.setDescription(courseEnt.getDescription());
		
		return dto;
	}
	
	public Course createEntity() {
		
		Course ent = new Course();
		
		ent.setId(this.id);
		ent.setTitle(this.title);
		ent.setDescription(this.description);
		
		return ent;
	}

}
