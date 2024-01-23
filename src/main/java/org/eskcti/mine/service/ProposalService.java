package org.eskcti.mine.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.eskcti.mine.dto.ProposalDetailDTO;

@ApplicationScoped
public interface ProposalService {
    ProposalDetailDTO findFullProposal(long id);

    Response createNewProposal(ProposalDetailDTO proposalDetailDTO);

    Response removeProposal(long id);
}
