// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dart.annonces.repository;

import com.dart.annonces.domain.Annonces;
import com.dart.annonces.repository.AnnoncesRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

privileged aspect AnnoncesRepository_Roo_Jpa_Repository {
    
    declare parents: AnnoncesRepository extends JpaRepository<Annonces, Long>;
    
    declare parents: AnnoncesRepository extends JpaSpecificationExecutor<Annonces>;
    
    declare @type: AnnoncesRepository: @Repository;
    
}
