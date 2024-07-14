package com.credmarg.credmarg.config;





import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.CrossOrigin;

//@Configuration
//@EnableWebSecurity
//@CrossOrigin(origins = "http://localhost:5173")
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .csrf(csrf -> csrf.disable())  // Disable CSRF for simplicity in this example
//            .authorizeHttpRequests(authz -> authz
//                .requestMatchers("/employee/**").authenticated()
//                .anyRequest().permitAll()
//            )
//            .httpBasic();  // Enable basic authentication
//        System.out.println("test : "+http);
//
//        return http.build();
//     
//        
////    	
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("$2a$12$alQHZAC1ME/c4zYsIoUBJe9v1rHpDChQO114jzIN0ghdrF42efIvO")
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(admin);
//        
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//    	
//        return new BCryptPasswordEncoder();
//    }
//}



