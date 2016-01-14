package org.terra.planet.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.terra.planet.status.PropertiesFileReader;

/**
 * Application status service
 */
@Stateless
@Path("/status")
public class StatusEndpoint {

    @GET
    @Produces("application/json")
    public String status() {
        return PropertiesFileReader.getGitSha1();
    }

    @GET
    @Produces("application/json")
    @Path("/version")
    public String version() {
        return PropertiesFileReader.getGitSha1();
    }
}