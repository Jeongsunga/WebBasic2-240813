package com.jsa.springbasic.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// Controller 레이어
// - 클라이언트와 서버 간의 접점
// - 클라이언트의 요청을 받고 해당 요청에 대한 응답을 처리함
// - 각 요청에 해당하는 URL 메서드를 작성하는 영역

// @Controller : 해당 클래스가 컨트롤러 레이어임을 명시, 응답 데이터가 HTML 형식
// @ResponseBody : 응답의 데이터 타입을 HTML이 아닌 JSON으로 지정하는 어노테이션
// @RestController : @Controller + @ResponseBody , JSON 형식의 데이터를 반환하는 컨트롤러임을 명시
@RestController

// @RequestMapping : HTTP 요청에 클래스와 메서드를 URL으로 매칭하기 위한 어노테이션
// @RequestMapping(value = "/main", method = RequestMethod.GET)   ->   HTTP GET localhost:4000/main/**
@RequestMapping("/basic")
public class BasicController {

    @RequestMapping(value = "/first", method = RequestMethod.GET)   //  GET http://localhost:4000/basic/first
    public String firstMethod(){
        return "첫 번째 REST API 요청 응답입니다.";
    }

    // HTTP GET method : 클라이언트가 서버로부터 데이터를 받기 위한 메서드 (Request Body X)
}
