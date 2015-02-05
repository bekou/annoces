package com.dart.annonces.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Users {

    /**
     */
    private String name;

    /**
     */
    private String prenom;

    /**
     */
    @Column(unique = true)
    private String pseudo;

    /**
     */
    @Column(unique = true)
    private String email;

    /**
     */
    private String password;
}
