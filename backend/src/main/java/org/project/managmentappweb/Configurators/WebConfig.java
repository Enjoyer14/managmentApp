package org.project.managmentappweb.Configurators;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Данное прокси через CORS. Включить если слезаем с NGINX

// @Configuration
// public class WebConfig implements WebMvcConfigurer {

//     @Override
//     public void addCorsMappings(CorsRegistry registry) {
//         registry.addMapping("/**")
//                 .allowedOrigins("http://localhost:8081") // Адрес вашего фронтенда
//                 .allowedMethods("GET", "POST", "PUT", "DELETE")
//                 .allowedHeaders("*")
//                 .allowCredentials(true);
//     }
// }