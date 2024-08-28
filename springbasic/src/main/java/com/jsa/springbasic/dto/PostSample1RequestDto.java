package com.jsa.springbasic.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// Post http://localhost:4000/sample
// 성공(201)
// 실패(500)
// Post -> Request Body : PostSample1RequestDto
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostSample1RequestDto {

    @NotBlank
    @Length(max=10)
    private String sampleId;

    @NotNull
    private Integer sampleColumn;
}
