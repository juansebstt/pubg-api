package com.pubg.api.commons.dto;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ErrorResponse {

    private Integer codeStatus; // HTTP status code
    private String message; // Error message

}