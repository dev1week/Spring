package com.mysite.sbb.question;

import com.mysite.sbb.answer.Answer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    //기본키로 지정하기
    //1씩 증가하여 저장하도록 지정함
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //칼럼의 길이 제한
    @Column(length=200)
    private String subject;

    // 내용의 글자수처럼 양을 제한할 수 없는 경우
    @Column(columnDefinition = "text")
    private String content;
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
