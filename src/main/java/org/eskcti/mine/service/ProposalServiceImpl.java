package org.eskcti.mine.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.eskcti.mine.client.ProposalRestClient;
import org.eskcti.mine.dto.ProposalDetailDTO;

@ApplicationScoped
public class ProposalServiceImpl implements ProposalService{
    @Inject
    @RestClient
    ProposalRestClient proposalRestClient;

    @Override
    public ProposalDetailDTO findFullProposal(long id) {
        return null;
    }

    @Override
    public void createNewProposal(ProposalDetailDTO proposalDetailDTO) {

    }

    @Override
    public void removeProposal(long id) {

    }
}
