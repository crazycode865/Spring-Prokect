package com.cameraapp.model;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApiErrors {
    LocalDateTime timeStamp;
    HttpStatus status;
    int statusCode;
    String error;
    List<String>message;
}