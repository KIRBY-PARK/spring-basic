package com.spring.basic.controller;

import com.spring.basic.service.TodoService;
import org.springframework.web.bind.annotation.*;

/* 컨트롤러에서 해야하는 일
 * 1. 일정 생성
 * 2. 일정 조회*/
@RestController // 빈으로 등록
@RequestMapping("/todo")// 포스트맨에서 서버 뒤에 올 URL 등록
public class TodoController {
    // 속성
    private final TodoService todoService;

    // 생성자 (service를 위한 의존성 주입)
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    // 기능
    // ::: 일정 생성 API
    @PostMapping // ("/todo")와 연결하는 것
    public String createTodoAPI(){
        System.out.println("투두 생성 API");
        String data = "데이터";
        String result = todoService.createTodoService(data);
        return result;
    }

    // ::: 일정 조회 API
    @GetMapping
    public String ReadTodoAPI(){
        System.out.println("투두 조회 API");
        String data = "데이터";
        String result = todoService.readTodoService(data);
        return result;
    }

    // ::: 일정 수정 API


    // ::: 일정 삭제 API

}
