package com.ownway.book.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링부트의 자동 설정, 스프링 Bean읽기와 생성을 모두 자동으로 설정. 특히 이 어노테이션이 있는 위치부터 설정을 읽기 때문에 이 클래스는 항상 최상단 프로젝트에 위치
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}