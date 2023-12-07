package com.std.test.article;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  ArticleRepository extends JpaRepository <Article, Integer> {
    Article findBySubject(String subject);
    Article findBySubjectAndContent(String subject, String content);
    List<Article> findBySubjectLike(String subject);
    List<Article> findAll(Specification<Article> spec);
}
