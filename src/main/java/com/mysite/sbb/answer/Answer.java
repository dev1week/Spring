package com.mysite.sbb.answer;

import com.mysite.sbb.question.Question;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity

public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //답변은 하나의 질문에 여러개가 달릴 수 있음
    @ManyToOne
    private Question question;

    @Column(columnDefinition = "text")
    private String content;

    private LocalDateTime createDate;


}
