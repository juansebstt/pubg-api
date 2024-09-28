package com.pubg.api.commons.exceptions;

import com.fasterxml.jackson.annotation.JacksonInject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeaponException extends RuntimeException {
    public WeaponException(String message) {
        super(message);
    }

    public JacksonInject getHttpStatus() {
        return null;
    }
}
