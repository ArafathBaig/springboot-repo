package com.practice.restfulwebservices.restfulwebservices.Model;

import java.util.Date;
import java.util.List;

public class User {
	
	private Integer Id;
	private String name;
	private Date birthDate;
	private List<Post> allPosts;
	
	
	public User(Integer id, String name, Date birthDate, List<Post> posts) {
		super();	
		Id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.allPosts = posts;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public List<Post> getAllPosts() {
		return allPosts;
	}
	public void setAllPosts(List<Post> allPosts) {
		this.allPosts = allPosts;
	}
	
	
	

}
