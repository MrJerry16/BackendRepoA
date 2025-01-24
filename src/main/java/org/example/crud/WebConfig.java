package org.example.crud;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:4200")  // Frontend URL, adjust based on deployment environment
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Methods that the client can call
                .allowedHeaders("*")  // Allowing all headers for development
                .allowCredentials(true)  // Allows credentials like cookies and HTTP authentication
                .maxAge(3600);  // Caching CORS configuration for 1 hour
    }
}
