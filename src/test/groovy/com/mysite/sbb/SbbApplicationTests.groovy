package com.mysite.sbb

import com.mysite.sbb.answer.Answer
import com.mysite.sbb.answer.AnswerRepository
import com.mysite.sbb.question.Question
import com.mysite.sbb.question.QuestionRepository
import org.springframework.transaction.annotation.Transactional

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest

import static org.junit.jupiter.api.Assertions.assertTrue

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Transactional
    @Test
    void testJpa() {

        // 답변 데이터를 통해 질문 데이터 찾기
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();
        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());



    }
}
