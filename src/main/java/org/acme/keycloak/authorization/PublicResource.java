package org.acme.keycloak.authorization;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/public")
public class PublicResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String serve() {
        return "public";
    }
}
