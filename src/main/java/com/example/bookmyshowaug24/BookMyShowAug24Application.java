package com.example.bookmyshowaug24;

import com.example.bookmyshowaug24.controllers.UserController;
import com.example.bookmyshowaug24.dtos.SignInResponseDto;
import com.example.bookmyshowaug24.dtos.SignUpRequestDto;
import com.example.bookmyshowaug24.dtos.SignUpResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowAug24Application {
    public static void main(String[] args) {
        SpringApplication.run(BookMyShowAug24Application.class, args);
    }
}

