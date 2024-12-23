package com.spring.basic.service;

import com.spring.basic.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service // 빈 등록
public class TodoService {
    // 속성
    private final TodoRepository todoRepository;

    // 생성자
    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    // 기능
    // ::: 일정 생성 서비스
    public String createTodoService(String data){
        // 비즈니스 로직
        System.out.println(data);
        String result = todoRepository.createTodo(data);
        return result;
    }

    // ::: 일정 조회 서비스 메서드
    public String readTodoService(String data){
        System.out.println(data);
        String result = todoRepository.readTodo(data);
        return result;
    }
}
