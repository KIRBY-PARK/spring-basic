package com.spring.basic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/auth")

public class AuthController {
    // 속성

    // 생성자

    // 기능
    @GetMapping("/cookie")
    public String cookieAPI(){
        log.info("::: AuthController.cookieAPI"); // 로그를 찍어놓으면 에러 확인하기 편함
        // 서비스로직 1
        // 서비스로직 2 ... 등
        return "success";
    }
}
