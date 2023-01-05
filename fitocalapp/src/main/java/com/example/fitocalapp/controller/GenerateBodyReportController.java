package com.example.fitocalapp.controller;

import com.example.fitocalapp.domain.GeneralBodyReport;
import com.example.fitocalapp.dto.request.RequestGeneralBodyReportDto;
import com.example.fitocalapp.service.GenerateBodyReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@Slf4j
@RequestMapping("/generateBodyReport")
public class GenerateBodyReportController {

    private final GenerateBodyReportService generateBodyReportService;

    public GenerateBodyReportController(GenerateBodyReportService generateBodyReportService) {
        this.generateBodyReportService = generateBodyReportService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/generateReport")
    public ResponseEntity<GeneralBodyReport[]> generateReport(@RequestBody RequestGeneralBodyReportDto requestGeneralBodyReportDto) {
        log.info("Generating body report!");
        GeneralBodyReport[] generalBodyReports = new GeneralBodyReport[1];
        generalBodyReports[0] = generateBodyReportService.generateBodyReport(requestGeneralBodyReportDto);
        return ResponseEntity.ok(generalBodyReports);
    }
}
