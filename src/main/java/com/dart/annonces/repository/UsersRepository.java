package com.dart.annonces.repository;
import com.dart.annonces.domain.Users;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Users.class)
public interface UsersRepository {
}
