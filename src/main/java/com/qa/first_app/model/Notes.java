package com.qa.first_app.model;
import javax.persistence.*;

@Entity
public class Notes {
	
	public Notes(Long id,String name,String description) {
		this.id=id;
		this.name=name;
		this.description=description;
	}
	public Notes() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
