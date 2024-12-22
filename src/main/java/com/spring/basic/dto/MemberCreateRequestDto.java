package com.spring.basic.dto;

public class MemberCreateRequestDto {
    private String email;
    private String name;

    public String getEmail(){
        return this.email;
    }

    public String getName() {
        return this.name;
    }
}
