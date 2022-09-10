package com.holden.jwt.filter;

import com.holden.jwt.entity.User;
import com.holden.jwt.repository.UserRepository;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.jboss.resteasy.reactive.server.ServerRequestFilter;

import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

/**
 * @author holden on 07-Sep-2022
 */
public class SecurityFilter implements ContainerRequestFilter {
  @Inject
  JsonWebToken jwt;

  @Inject
  UserRepository userRepository;

  private boolean hasJwt() {
    return jwt.getClaimNames() != null;
  }

  @ServerRequestFilter(preMatching = true)
  public void filter(ContainerRequestContext requestContext) {
    String email = "holden.fcode@gmail.com";
    System.out.println(email);
    User user = userRepository.findByEmail(email);
    System.out.println(email);
  }
}
