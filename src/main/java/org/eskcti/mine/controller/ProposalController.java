package org.eskcti.mine.controller;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eskcti.mine.dto.ProposalDetailDTO;
import org.eskcti.mine.service.ProposalService;

@Path("/api/trade")
public class ProposalController {
    @Inject
    ProposalService proposalService;

    @GET
    @Path("/{id}")
    @RolesAllowed({"user", "manager"})
    public Response findDetailsProposal(@PathParam("id") long id) {
        try {
            return Response.ok(
                    proposalService.findFullProposal(id),
                    MediaType.APPLICATION_JSON
            ).build();
        } catch (ServerErrorException errorException) {
            return Response.serverError().build();
        }
    }

    @POST
    @RolesAllowed("proposal-customer")
    public Response createProposal(ProposalDetailDTO proposalDetails) {
        int proposalRequestStatus = proposalService.createNewProposal(proposalDetails).getStatus();

        if (proposalRequestStatus > 199 || proposalRequestStatus < 205) {
            return Response.ok().build();
        } else {
            return Response.status(proposalRequestStatus).build();
        }
    }

    @DELETE
    @Path("/{id}")
    @RolesAllowed("manager")
    public Response removeProposal(@PathParam("id") long id) {
        int proposalRequestStatus = proposalService.removeProposal(id).getStatus();

        if (proposalRequestStatus > 199 || proposalRequestStatus < 205) {
            return Response.ok().build();
        } else {
            return Response.status(proposalRequestStatus).build();
        }
    }
}
