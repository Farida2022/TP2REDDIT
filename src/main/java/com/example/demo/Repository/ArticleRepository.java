package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
