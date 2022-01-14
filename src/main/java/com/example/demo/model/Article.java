package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Article {
	
	private String title;
	private String link;
	private int votes;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	public Article() {
		super();
		
	}
	
	public Article(String title, String link, int votes, Long id) {
		super();
		this.title = title;
		this.link = link;
		this.votes = votes;
		this.id = id;
	}
	public Article(String title, String link, int votes) {
		super();
		this.title = title;
		this.link = link;
		this.votes = votes;

	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}



	@Override
	public String toString() {
		return "Article [title=" + title + ", link=" + link + ", votes=" + votes + ", id=" + id + "]";
	}
	
	
	

}
