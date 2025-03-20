package com.affortMedi.drive.numberAPI.SocialMedia;

public class Comments {
	private int id;
	private int postId;
	private String content;
	
	public Comments(int id, int postId, String content) {
		super();
		this.id = id;
		this.postId = postId;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
