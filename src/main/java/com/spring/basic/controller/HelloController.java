package com.spring.basic.controller;


import com.spring.basic.service.HelloService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 어노테이션
@RestController
/*
* 요청이 이 어노테이션으로 들어와서 실행되는 것
* */
@RequestMapping("/hello")
public class HelloController { // 클래스 마킹
    // 속성
    private final ApplicationContext applicationContext;
    private final HelloService helloService; // 컨트롤러에서 사용할 것이라 추가

    // 생성자 (의존성 주입)
    public HelloController(ApplicationContext applicationContext, HelloService helloService) {
        this.applicationContext = applicationContext;
        this.helloService = helloService;
    }

    // 기능
    /*
    * 서버의 역할 (사이클)
    * 1. 요청을 받는다
    * 2. 요청을 처리한다
    * 3. 응답을 반환한다
    * */
    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: 초기화 작업 실행");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("@PreDestroy: 소멸 작업 실행");
    }

    @GetMapping()
    public String sayHelloController(){
        // System.out.println("프로그램 실행 되었나요?"); // 요청 처리 (포스트맨에서 실행하면 반환된 응답값을 확인할 수 있음)

        // 스프링 컨테이너에 등록된 빈 목록을 확인하기
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String beanName : beanDefinitionNames) {
//            System.out.println(beanName);
//        }

        helloService.method();

        return "Hello"; // 응답 반환
    }
}
