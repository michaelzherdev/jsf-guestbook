package com.mzherdev.guestbook.config;


import com.mzherdev.guestbook.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mzherdev on 26.09.16.
 */
@Configuration
@ComponentScan("com.mzherdev.guestbook")
public class SpringConfig {
    @Bean
    public PostService postService(){
        return new PostService();
    }
}
