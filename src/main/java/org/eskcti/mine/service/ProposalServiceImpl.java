package org.eskcti.mine.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.eskcti.mine.client.ProposalRestClient;
import org.eskcti.mine.dto.ProposalDetailDTO;

@ApplicationScoped
public class ProposalServiceImpl implements ProposalService{
    @Inject
    @RestClient
    ProposalRestClient proposalRestClient;

    @Override
    public ProposalDetailDTO findFullProposal(long proposalId) {
        return proposalRestClient.getProposalDetailsById(proposalId);
    }

    @Override
    public Response createNewProposal(ProposalDetailDTO proposalDetailDTO) {
        return proposalRestClient.createProposal(proposalDetailDTO);
    }

    @Override
    public Response removeProposal(long id) {
        return proposalRestClient.removeProposal(id);
    }
}
