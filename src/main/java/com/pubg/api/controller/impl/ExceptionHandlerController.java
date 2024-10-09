package com.pubg.api.controller.impl;

import com.pubg.api.commons.dto.ErrorResponse;
import com.pubg.api.commons.exceptions.GlobalExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j // Lombok annotation for logging
public class ExceptionHandlerController {

    @ExceptionHandler(value = {GlobalExceptionHandler.class}) // Handles GameException
    ResponseEntity<ErrorResponse> handleError(GlobalExceptionHandler globalExceptionHandler) {

        log.error("New Exception", globalExceptionHandler); // Log the exception details
        var errorResponse = ErrorResponse.builder()
                .codeStatus(globalExceptionHandler.getHttpStatus().value()) // Set HTTP status code in the response
                .message(globalExceptionHandler.getMessage()) // Set the error message in the response
                .build();

        return ResponseEntity.status(globalExceptionHandler.getHttpStatus()).body(errorResponse); // Return the error response

    }
}
