package com.example.korea_sleepTech_springboot.dto.request;

// Dto 클래스명 지정
// 엔티티명 + CRUD(동작) + Request/Response + Dto

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostCreateRequestDto {

    private String title;
    private String content;
    private String author;
}
