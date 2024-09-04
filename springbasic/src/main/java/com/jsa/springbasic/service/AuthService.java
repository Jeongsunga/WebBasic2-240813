package com.jsa.springbasic.service;

import com.jsa.springbasic.dto.PostUserRequestDto;
import com.jsa.springbasic.dto.SignInRequestDto;

public interface AuthService {
    String signUp(PostUserRequestDto dto);
    String signIn(SignInRequestDto dto);
}
