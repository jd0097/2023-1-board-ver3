package com.green.boardver3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableTransactionManagement
@SpringBootApplication
public class Boardver3Application {

    public static void main(String[] args) {
        SpringApplication.run(Boardver3Application.class, args);
    }

    @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedHeaders("*") // 어떤 헤더들을 허용할 것인지
						.allowedMethods("*") // 어떤 메서드를 허용할 것인지 (GET, POST…)
						.allowedOrigins("https://web-study-hub-rt92alkkyddso.sel4.cloudtype.app");
			}
		};
	}

}
