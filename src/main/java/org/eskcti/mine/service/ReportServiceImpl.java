package org.eskcti.mine.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.eskcti.mine.client.ReportRestClient;
import org.eskcti.mine.dto.OpportunityDTO;
import org.eskcti.mine.utils.CSVHelper;

import java.io.ByteArrayInputStream;
import java.util.List;

@ApplicationScoped
public class ReportServiceImpl implements ReportService{
    @Inject
    @RestClient
    ReportRestClient reportRestClient;

    @Override
    public List<OpportunityDTO> getOpportunityData() {
        return reportRestClient.requestOpportunitiesData();
    }

    @Override
    public ByteArrayInputStream generateCSVOpportunityReport() {
        List<OpportunityDTO> opportunities = reportRestClient.requestOpportunitiesData();

        return CSVHelper.OpportunitiesToCSV(opportunities);
    }
}
