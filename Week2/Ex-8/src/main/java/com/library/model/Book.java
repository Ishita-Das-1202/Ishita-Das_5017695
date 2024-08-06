package com.library.model;

public class Book {
	private Long id;
	private String title;
	private String author;
	public void setTitle(String title) {
		this.title = title;		
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setId(long  id) {
		 this.id = id;
		
	}

	public Long getId() {
		return id;
		
	//	return null;
	}

}
