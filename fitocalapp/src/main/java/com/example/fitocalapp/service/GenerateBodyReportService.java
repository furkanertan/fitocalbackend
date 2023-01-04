package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.GeneralBodyReportAssembler;
import com.example.fitocalapp.domain.BodyFatPercentage;
import com.example.fitocalapp.domain.DailyCalorie;
import com.example.fitocalapp.domain.GeneralBodyReport;
import com.example.fitocalapp.domain.IdealWeight;
import com.example.fitocalapp.dto.request.RequestGeneralBodyReportDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GenerateBodyReportService {

    private BodyFatPercentageService bodyFatPercentageService;
    private DailyCalorieService dailyCalorieService;
    private IdealWeightService idealWeightService;
    private GeneralBodyReportAssembler generalBodyReportAssembler;

    public GeneralBodyReport generateBodyReport(RequestGeneralBodyReportDto requestGeneralBodyReportDto) {
        BodyFatPercentage bodyFatPercentage = bodyFatPercentageService.calculateBodyFatPercentageByDeurenbergFormula(generalBodyReportAssembler.convertToBodyFatPercentageDto(requestGeneralBodyReportDto));
        DailyCalorie dailyCalorie = dailyCalorieService.calculateDailyCalorie(generalBodyReportAssembler.convertToDailyCalorieDto(requestGeneralBodyReportDto));
        IdealWeight idealWeight = idealWeightService.calculateIdealWeightByRobinson(generalBodyReportAssembler.convertToIdealWeightDto(requestGeneralBodyReportDto));

        return generalBodyReportAssembler.convertToGeneralBodyReport(bodyFatPercentage, dailyCalorie, idealWeight, requestGeneralBodyReportDto);
    }

}
