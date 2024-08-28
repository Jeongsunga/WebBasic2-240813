package com.jsa.springbasic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsa.springbasic.dto.PostSample1RequestDto;
import com.jsa.springbasic.service.SampleService;

import jakarta.validation.Valid;    // 유효성 검사
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {
    
    private final SampleService sampleService;    // 외부 주입


    @PostMapping("")
    public ResponseEntity<String> postSample1(
        @RequestBody @Valid PostSample1RequestDto requestBody
    ){
        ResponseEntity<String> response = sampleService.postSample1(requestBody);
        return response;
    }
}
