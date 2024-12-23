package com.spring.basic.repository;

import org.springframework.stereotype.Repository;

@Repository // 빈 등록
public class TodoRepository {
    // 속성

    // 생성자

    // 기능
    // ::: 일정 생성
    public String createTodo(String data){
        // 데이터 베이스에 투두를 생성합니다.
        return "success data";
    }

    // ::: 일정 조회 데이터 접근 로직 메서드
    public String readTodo(String data){
        // 데이터 베이스에 투두를 생성합니다.
        return "일정 조회 확인";
    }

    // ::: 일정 수정 데이터 접근 로직 메서드


    // ::: 일정 삭제 데이터 접근 로직 메서드

}
