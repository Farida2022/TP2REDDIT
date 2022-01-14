package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.ArticleRepository;
import com.example.demo.model.Article;

@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("articles")

public class RestArticleController {
	@Autowired
	ArticleRepository articleRepository;
	
	
	public RestArticleController() {
		
	}

	@GetMapping
	public List<Article> getArticles(){
		return articleRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Article findArticlebyId(@PathVariable("id") Long id) {
		
		Article article = articleRepository.findById(id).get();
		return article;
	}
	
	@PostMapping
	Article postArticle(@RequestBody Article article) {
		articleRepository.save(article);
		return article;
	}
	@PutMapping(path ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	Article putArticle(@RequestBody Article article) {
		articleRepository.save(article);
		return article;
	}
	@DeleteMapping(path ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	void deleteArticle(@PathVariable Long id) {
		articleRepository.delete(findArticlebyId(id));
		
	}
	
	
	
	
	

}
