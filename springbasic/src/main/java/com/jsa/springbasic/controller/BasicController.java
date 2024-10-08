package com.jsa.springbasic.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


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
    @GetMapping("")
    public String getMethod() {   //  GET http://localhost:4000/basic
        return "GET Method";
    }
    
    // HTTP POST method : 클라이언트가 서버에 리소스를 작성하기 위한 메서드 (Request Body O)
    @PostMapping("")
    public String postMethod() {   //  POST http://localhost:4000/basic
        return "POST Method";
    }

    // HTTP PUT method : 클라이언트가 서바에 리소스를 전체 수정하기 위한 메서드 (Request Body O)
    @PutMapping("")
    public String putMethod() {   //  PUT http://localhost:4000/basic
        return "PUT Method";
    }

    // HTTP PATCH method : 클라이언트가 서버에 리소스를 일부 수정하기 위한 메서드 (Request Body O)
    @PatchMapping("")
    public String patchMethod() {   //  PATCH http://localhost:4000/basic
        return "PATCH Method";
    }

    // HTTP DELETE method : 클라이언트가 서버에 리소스를 삭제하기 위한 메서드 (Request Body O)
    @DeleteMapping("")
    public String deleteMethod() {   //  DELETE http://localhost:4000/basic
        return "DELETE Method";
    }

    // Method + URL Pattern이 중복되면 서버 실행 중 에러 발생
    // @GetMapping("/first")
    // public String getFirst(){
    //     return "get first";
    // }
}
