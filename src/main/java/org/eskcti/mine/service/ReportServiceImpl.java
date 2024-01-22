package org.eskcti.mine.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.eskcti.mine.dto.OpportunityDTO;

import java.io.ByteArrayInputStream;
import java.util.List;

@ApplicationScoped
public class ReportServiceImpl implements ReportService{
    @Override
    public List<OpportunityDTO> getOpportunityData() {
        return null;
    }

    @Override
    public ByteArrayInputStream generateCSVOpportunityReport() {
        return null;
    }
}
