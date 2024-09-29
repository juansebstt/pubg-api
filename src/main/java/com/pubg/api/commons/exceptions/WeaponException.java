package com.pubg.api.commons.exceptions;

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

    public int getHttpStatus(String message) {

        return Integer.parseInt(getMessage());
    }
}
