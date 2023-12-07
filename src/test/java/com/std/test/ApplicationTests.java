package com.std.test;

import com.std.test.article.Article;
import com.std.test.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private ArticleRepository questionRepository;

	@Test
	void testJpa() {
		Article article = new Article();
		article.setSubject("sbb가 무엇인가요?");
		article.setContent("sbb에 대해서 알고 싶습니다.");
		article.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(article);  // 첫번째 질문 저장

		Article article1 = new Article();
		article1.setSubject("스프링부트 모델 질문입니다.");
		article1.setContent("id는 자동으로 생성되나요?");
		article1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(article1);  // 두번째 질문 저장
	}
}