package com.example.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TbBoardApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TbBoardApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicaton) {
        return applicaton.sources(TbBoardApplication.class);
    }

}
