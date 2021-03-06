package com.practice.restfulwebservices.restfulwebservices.DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.restfulwebservices.restfulwebservices.Model.Post;
import com.practice.restfulwebservices.restfulwebservices.Model.User;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private int userCount = 3;

	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user : users) {
			if(id == user.getId())
				return user;
			}
		
		return null;
		}
	
	public User deleteById(int id) {
		
		Iterator<User> iterator = users.iterator();
		
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		
		return null;
	}
	

//	public List<Post> findAllPost(int id) {
//		
//		for(User user : users) {
//			if(id == user.getId())
//				return user.getAllPosts();
//		}
//		
//		return null;
//	}
//	
//	public User savePost(int id, Post post) {
//		
//		for(User user : users) {
//			if(id == user.getId()) {
//				user.getAllPosts().add(post);
//				return user;
//			}
//				
//		}
//		
//		return null;
//		
//	}
//	
//	public Post findOne(int userId, int postId) {
//		
//		for(User user: users) {
//			
//			if(userId == user.getId()) {
//				
//				for(Post post : user.getAllPosts()) {
//					
//					if(post.getId() == postId)
//						return post;
//				}
//			}
//		}
//		
//		return null;
//	}

}