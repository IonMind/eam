package com.optum.eam.eam.ExceptionHandler;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ErrorResponse {
    private String timestamp = String.valueOf(System.currentTimeMillis());
    @NonNull
    private String message;
}
