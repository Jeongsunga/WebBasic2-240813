package com.jsa.springbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request-data")
// http://localhost:4000/request-data/~~
public class RequestDataController {

    // @RequestParam()
    // - GET, DELETE처럼 Request Body가 존재하지 않고 URL로 데이터를 전송하는 메서드에서 Query String 방식으로 데이터를 가져오기 위해 사용하는 어노테이션

    // GET http://localhost:4000/request-data/request-param
    @GetMapping("/request-param")
     // GET http://localhost:4000/request-data/request-param?name=홍길동&age=30
    public String requestParam(
        @RequestParam(name = "name") String name,
        // @RequestParam() String name, 위의 코드와 동일(매개변수와 같은 변수명일 경우 가능)
        @RequestParam(name = "age", required = false) Integer age  // 필수가 아닌 값은 null 넣는데 int형(기본형) 불가
    ){
        return "이름 : " + name + " 나이 : " + age;
    }
}
