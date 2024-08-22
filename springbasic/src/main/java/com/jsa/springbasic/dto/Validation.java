package com.jsa.springbasic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// client request body 데이터의 유효성 검사
// - sprint-boot-starter-validation 라이브러리 제공
// - 스프링 프레임워크에서 제공하는 유효성 검사 인터페이스 라이브러리
// - 클라이언트가 서버 측에 데이터를 전송할 때 유효성을 검사하고 정확한 데이터만 받을 수 있도록 도움을 줌
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Validation {

    private String notNull;
    
}
