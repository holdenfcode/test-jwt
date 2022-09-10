package com.holden.jwt.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

/**
 * @author holden on 10-Sep-2022
 */
@Entity
@Table(name = "users")
public class User extends PanacheEntityBase {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "email")
  private String email;

  @Column(name = "full_name")
  private String fullName;

  @Column(name = "is_allow_login")
  private boolean isAllowLogin;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public boolean isAllowLogin() {
    return isAllowLogin;
  }

  public void setAllowLogin(boolean allowLogin) {
    isAllowLogin = allowLogin;
  }
}
