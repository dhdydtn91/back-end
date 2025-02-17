package com.cherrypick.backend.domain.user;

import java.util.Optional;

public interface UserReader {

  Optional<User> findByProviderId(String providerId);

}
