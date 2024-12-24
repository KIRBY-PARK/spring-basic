package com.spring.basic.controller;

import com.spring.basic.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller // MVC 패턴부터는 컨트롤러를 사용함
@RequestMapping("/membermvc")
@Slf4j
public class MvcController {
    // 임시 회원 저장소
    private final List<Member> memberList = new ArrayList<>();

    /*
    * 전체 회원 리스트 페이지 조회 API
    **/
    @GetMapping // MVC 부터는 UI를 먼저 생각해야 함
    public String getMemberListView(Model model) {
        // 요청

        // 비즈니스 로직 처리

        // 데이터베이스 저장,, 조회...
        log.info("목록 확인");
        model.addAttribute("membermvc", memberList);
        return "member/member-list";

    }

    /*
     * 회원 생성 페이지 조회 API
     **/
    @GetMapping("/new")
    public String createMemberView() {
        return "member/member-create";
    }

    /*
     * 회원 생성 API
     * @ModelAttribute : Getter와 Setter를 이용해 자동으로 들어오는 요청을 자바 객체로 맵핑 해줌
     **/
    @PostMapping
    public String createMemberAPI(@ModelAttribute Member member) {
        memberList.add(member);
        log.info("멤버 emaill : {}", member.getName());
        return "redirect:/membermvc";
    }
}

