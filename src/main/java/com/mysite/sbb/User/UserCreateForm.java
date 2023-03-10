package com.mysite.sbb.User;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserCreateForm {
    @Size(min=3, max=25)
    @NotEmpty(message="id는 필수항목 입니다. ")
    private String username;
    @NotEmpty(message="비밀번호를 확인해주세요")
    private String password1;
    @NotEmpty(message="비밀번호를 확인해주세요")
    private String password2;
    @NotEmpty(message="이메일은 필수항목입니다.")
    @Email()
    private String email;
}
