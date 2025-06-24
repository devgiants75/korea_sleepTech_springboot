package com.example.korea_sleepTech_springboot.mapper;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

class GetUserDetailRespDto {
    private String name;
    private String phone;
    private String roleName;


    private BigDecimal totalAmount;
    private int totalCouponCount;
    private int availableCouponCount;
    private List<CourseResponseDto> courses;
}

class CourseResponseDto {
    private Long id;
    private String name;
    private Long trainerId;
    private String title;
    private String description;
    private LocalDateTime classDate;
    private LocalTime classStartTime;
    private LocalTime classEndTime;
    private Category category;
    private String classroom;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

public interface McbMapper {
    GetUserDetailRespDto getUserDetail(@Param("userId") Long userId);
}
