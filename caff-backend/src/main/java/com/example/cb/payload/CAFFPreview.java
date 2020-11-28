package com.example.cb.payload;

import java.util.List;

//Response for getting a CAFF preview
public class CAFFPreview {
	private long id;
	private String name;
	private String uri;
	private List<Comment> comments;
	
	public CAFFPreview(long id, String name, String uri, List<Comment> comments) {
		this.id = id;
		this.name = name;
		this.uri = uri;
		this.comments = comments;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
