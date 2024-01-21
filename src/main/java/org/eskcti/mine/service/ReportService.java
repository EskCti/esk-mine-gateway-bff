package org.eskcti.mine.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.eskcti.mine.dto.OpportunityDTO;

import java.io.ByteArrayInputStream;
import java.util.List;

@ApplicationScoped
public interface ReportService {
    List<OpportunityDTO> getOpportunityData();

    ByteArrayInputStream generateCSVOpportunityReport();
}
