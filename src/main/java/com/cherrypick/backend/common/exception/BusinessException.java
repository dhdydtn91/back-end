package com.cherrypick.backend.common.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BusinessException extends RuntimeException {

  private ErrorCode errorCode;

  public BusinessException(ErrorCode errorCode) {
    super(errorCode.getMessage());
    this.errorCode = errorCode;
  }

  public BusinessException(String message,
      ErrorCode errorCode) {
    super(message);
    this.errorCode = errorCode;
  }
}
