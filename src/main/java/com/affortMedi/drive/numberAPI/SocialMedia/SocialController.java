package com.affortMedi.drive.numberAPI.SocialMedia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/users")
public class SocialController {
	@Autowired
	private SocialService ser;
	
	
	@GetMapping
	public List<Users> getUsers() {
		return ser.getUsers();
	}
	
	@GetMapping("/{id}/posts")
	public List<Posts> getPosts(@PathVariable Integer id) {
		return ser.getPosts(id);
	}
	
	@GetMapping("/{id}/comments")
	public List<Comments> getComments(@PathVariable Integer id) {
		return ser.getComments(id);
	}
}
