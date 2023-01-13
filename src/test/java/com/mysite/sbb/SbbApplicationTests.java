package com.mysite.sbb;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa(){
		for(int idx=1; idx<=300; idx++){
			String subject = String.format("[%3d]번째 테스트 게시글입니다.", idx);
			String content = "테스트용 게시글입니다.";
			this.questionService.createQuestion(subject,content);
		}
	}
}
