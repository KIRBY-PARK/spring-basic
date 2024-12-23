package com.spring.basic.controller;

import com.spring.basic.dto.MemberCreateRequestDto;
import com.spring.basic.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // 모두 빈으로 등록해줌
@RequestMapping("/members")
public class MemberController {
    // 속성
    private final MemberService memberService;

    // 생성자
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 기능
    @PostMapping
    public void createMemberAPI(@RequestBody MemberCreateRequestDto memberCreateRequestDto) {
        String email = memberCreateRequestDto.getEmail();
        String name = memberCreateRequestDto.getName();
        log.info("email: {}", email);
        log.info("name: {}", name);
//        memberService.methodA(name);
    }

}
