package com.dart.annonces.repository;
import com.dart.annonces.domain.Annonces;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Annonces.class)
public interface AnnoncesRepository {
}
