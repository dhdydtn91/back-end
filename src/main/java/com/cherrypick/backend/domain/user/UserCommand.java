package com.cherrypick.backend.domain.user;

import static com.cherrypick.backend.domain.user.User.Career;
import static com.cherrypick.backend.domain.user.User.KnownPath;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class UserCommand {

  @Getter
  @AllArgsConstructor
  public static class UserLoginRequest {

    private String providerId;
    private String password;
  }

  @Getter
  @AllArgsConstructor
  public static class ReissueRequest {

    private String accessToken;
    private String refreshToken;
  }

  @Getter
  @AllArgsConstructor
  public static class SignUpRequest {

    private String providerId;
    private String job;
    private Career career;
    private KnownPath knownPath;
  }
}
