package com.pubg.api.commons.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GlobalExceptionHandler extends RuntimeException {

  private HttpStatus httpStatus;

  public GlobalExceptionHandler(HttpStatus httpStatus, String message) {

    super(message);
    this.httpStatus = httpStatus;

  }
}
