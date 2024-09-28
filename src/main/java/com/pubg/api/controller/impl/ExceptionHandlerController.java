package com.pubg.api.controller.impl;

import com.pubg.api.commons.dto.ErrorResponse;
import com.pubg.api.commons.exceptions.WeaponException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j // Lombok annotation for logging
public class ExceptionHandlerController {
    @ExceptionHandler(value = {WeaponException.class}) // Handles GameException
    ResponseEntity<ErrorResponse> handleError(WeaponException weaponException){
        log.error("New Exception", weaponException); // Log the exception details
        var errorResponse = ErrorResponse.builder()
                .codeStatus(Integer.valueOf(weaponException.getHttpStatus())) // Set HTTP status code in the response
                .message(weaponException.getMessage()) // Set the error message in the response
                .build();

        return ResponseEntity.status(weaponException.getHttpStatus()).body(errorResponse); // Return the error response
    }
}
