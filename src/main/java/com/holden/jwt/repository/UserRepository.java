package com.holden.jwt.repository;

import com.holden.jwt.entity.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author holden on 09-Sep-2022
 */
@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

  public User findByEmail(String email) {
    return find("email", email).firstResult();
  }
}
