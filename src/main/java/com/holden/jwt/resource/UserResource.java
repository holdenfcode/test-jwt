package com.holden.jwt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author holden on 09-Sep-2022
 */
@Path("/user")
public class UserResource {

  @GET
  @Path("/info")
  public Response getUserInfo() {
    return Response.ok("Ok").build();
  }
}
