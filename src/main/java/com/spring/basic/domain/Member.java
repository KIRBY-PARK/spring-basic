package com.spring.basic.domain;

public class Member {
    // 속성
    private String name; // 이름
    private String email; // 이메일
    private String age; // 나이
    

    // 생성자


    // 기능
    // cmd + n -> getter 클릭 -> 자동생성

    // Getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
