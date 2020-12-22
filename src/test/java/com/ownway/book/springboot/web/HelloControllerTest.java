package com.ownway.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class) // 테스트 진행시 JUnit에 내장된 실행자 외에 다른 실행자를 실행(SpringRunner) 즉 스프링부트 테스트와 JUnit 사이에 연결자 역할
@WebMvcTest(controllers = HelloController.class) // WEB(SpringMVC)에 집중할 수 있는 어노테이션 @Controller, @ControllerAdvice등을 사용 가능하지만 @Service능, @Component, @Repository등 사용 불가
public class HelloControllerTest {

    @Autowired // 스프링이 관리하는 빈을 주입
    private MockMvc mvc; // 웹 API를 테스트 할 때 사용, 스프링 MVC 테스트의 시작점, 이 클래스를 통해 HTTP GET, POST등에 대한 API 테스트가 가능

    @Test
    public void hello_return() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // MockMvc를 통해 /hello주소로 GET요청
                .andExpect(status().isOk()) // mvc.perform의 결과를 검증하며 HTTP Header의 Status를 검증 200,404,500 등의 상태를 검증 OK는 즉 200인지 아닌지를 검증
                .andExpect(content().string(hello)); // hello가 리턴되어온 값이 맞는지 검증
    }

    @Test
    public void helloDto_return() throws Exception{
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}
