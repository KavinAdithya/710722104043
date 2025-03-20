package com.affortMedi.drive.numberAPI.SocialMedia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SocialService {
	private  List<Users> users = new ArrayList<>();
	
	private List<Posts> posts = new ArrayList<>();
	private List<Comments> comments = new ArrayList<>();
	
	
	{
		Posts p1 = new Posts(1, 1, "First Post");
		Comments c1 = new Comments(1, 1, "First Comments");
		Users u1 = new Users(1, "Afford Medii");
		
		users.add(u1);
		posts.add(p1);
		comments.add(c1);
	}
	
	public List<Posts> getPosts(int id) {
		List<Posts> posts = new ArrayList<>();
		for (Posts p : posts) {
			if (p.getId() == id)
				posts.add(p);
		}
		
		return posts;
	}
	
	public List<Comments> getComments(int id) {
		List<Comments> comment = new ArrayList<>();
		for (Comments p : comments) {
			if (p.getId() == id)
				comment.add(p);
		}
		
		return comment;
	}
	
	public List<Users> getUsers() {
		return users;
	}
	
	
}
