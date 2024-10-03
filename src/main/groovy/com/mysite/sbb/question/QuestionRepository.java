package com.mysite.sbb.question;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
// Question 엔티티의 기본키가 Integer임을 지정한다.
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content); // subject와 content를 함께 조회해본다.
    List<Question> findBySubjectLike(String subject);
    Page<Question> findAll(Pageable pageable);
}
