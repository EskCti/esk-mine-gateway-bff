package org.eskcti.mine.client;

import io.quarkus.oidc.token.propagation.reactive.AccessTokenRequestReactiveFilter;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eskcti.mine.dto.OpportunityDTO;

import java.util.List;

@Path("/api/opportunity")
@RegisterRestClient
@RegisterProvider(AccessTokenRequestReactiveFilter.class)
@ApplicationScoped
public interface ReportRestClient {
    @GET
    @Path("/data")
    List<OpportunityDTO> requestOpportunitiesData();
}
