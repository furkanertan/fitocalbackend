package com.example.fitocalapp.controller;

import com.example.fitocalapp.domain.GeneralBodyReport;
import com.example.fitocalapp.dto.request.RequestGeneralBodyReportDto;
import com.example.fitocalapp.service.GenerateBodyReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/generateBodyReport")
public class GenerateBodyReportController {

    private final GenerateBodyReportService generateBodyReportService;

    public GenerateBodyReportController(GenerateBodyReportService generateBodyReportService) {
        this.generateBodyReportService = generateBodyReportService;
    }
    @PostMapping("/generateReport")
    public ResponseEntity<GeneralBodyReport> generateReport(@RequestBody RequestGeneralBodyReportDto requestGeneralBodyReportDto) {
        return ResponseEntity.ok(generateBodyReportService.generateBodyReport(requestGeneralBodyReportDto));
    }
}
