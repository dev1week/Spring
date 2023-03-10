package com.mysite.sbb.question;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message="제목은 필수 항목입니다.")
    @Size(max=200)
    private String subject;
    @NotEmpty(message="내용을 입력해주세요.")
    private String content;
}
