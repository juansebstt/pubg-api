package com.pubg.api.commons.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private Integer codeStatus; // HTTP status code
    private String message; // Error message
}