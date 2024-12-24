package com.spring.basic.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public String cookieAPI(HttpServletRequest request) {
        log.info("::: AuthController.cookieAPI()"); // 로그를 찍어놓으면 에러 확인하기 편함

        // 서비스로직 1
        // 서비스로직 2 ... 등이 들어감

        // 1. Request 객체에서 cookie 목록 가져오기
        Cookie[] cookies = request.getCookies();

        // 2. 쿠키(UserId) 키값으로 Value 찾는 함수 호출
        String foundUserid = this.findCookie("userId", cookies);
        
        // 3. 찾아온 쿠키의 값
        if(foundUserid != null) {
            log.info("found userId: {}", foundUserid);
        } else{
            log.info("userId not found");
        }
        return "success";
    }

    @GetMapping("/cookie-login")
    public ResponseEntity<String> cookieLoginAPI(){
        log.info("::: AuthController.cookieLoginAPI()");
        
        // 1. 로그인 로직
        String cookieKey = "userId";
        String userId = "1";

        // 2. 응답 생성
        String headerValue = cookieKey + "=" + userId;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Set-Cookie", headerValue);
        return new ResponseEntity<>("로그인 성공!", headers, HttpStatus.OK);
    }

    private String findCookie(String key, Cookie[] cookies){
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(key.equals(cookie.getName())){
                    return cookie.getValue();
                }
            }
        } return null;
    }
}
