package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.BodyFatPercentage;
import com.example.fitocalapp.domain.DailyCalorie;
import com.example.fitocalapp.domain.GeneralBodyReport;
import com.example.fitocalapp.domain.IdealWeight;
import com.example.fitocalapp.dto.request.RequestBodyFatPercentageDto;
import com.example.fitocalapp.dto.request.RequestDailyCalorieDto;
import com.example.fitocalapp.dto.request.RequestGeneralBodyReportDto;
import com.example.fitocalapp.dto.request.RequestIdealWeightDto;

public class GeneralBodyReportAssembler {

    public RequestBodyFatPercentageDto convertToBodyFatPercentageDto(RequestGeneralBodyReportDto requestGeneralBodyReportDto) {
        RequestBodyFatPercentageDto requestBodyFatPercentageDto = new RequestBodyFatPercentageDto();

        requestBodyFatPercentageDto.setAge(requestGeneralBodyReportDto.getAge());
        requestBodyFatPercentageDto.setGender(requestGeneralBodyReportDto.getGender());
        requestBodyFatPercentageDto.setHeight(requestGeneralBodyReportDto.getHeight());
        requestBodyFatPercentageDto.setWeight(requestGeneralBodyReportDto.getWeight());

        return requestBodyFatPercentageDto;
    }

    public RequestDailyCalorieDto convertToDailyCalorieDto(RequestGeneralBodyReportDto requestGeneralBodyReportDto) {
        RequestDailyCalorieDto requestDailyCalorieDto = new RequestDailyCalorieDto();

        requestDailyCalorieDto.setAge(requestGeneralBodyReportDto.getAge());
        requestDailyCalorieDto.setGender(requestGeneralBodyReportDto.getGender());
        requestDailyCalorieDto.setHeight(requestGeneralBodyReportDto.getHeight());
        requestDailyCalorieDto.setWeight(requestGeneralBodyReportDto.getWeight());
        requestDailyCalorieDto.setActivity(requestGeneralBodyReportDto.getActivity());
        requestDailyCalorieDto.setFormula("Mifflin");

        return requestDailyCalorieDto;
    }

    public RequestIdealWeightDto convertToIdealWeightDto(RequestGeneralBodyReportDto requestGeneralBodyReportDto) {
        RequestIdealWeightDto requestIdealWeightDto = new RequestIdealWeightDto();

        requestIdealWeightDto.setAge(requestGeneralBodyReportDto.getAge());
        requestIdealWeightDto.setHeight(requestGeneralBodyReportDto.getHeight());
        requestIdealWeightDto.setGender(requestGeneralBodyReportDto.getGender());

        return requestIdealWeightDto;
    }

    public GeneralBodyReport convertToGeneralBodyReport(BodyFatPercentage bodyFatPercentage, DailyCalorie dailyCalorie, IdealWeight idealWeight) {
        GeneralBodyReport generalBodyReport = new GeneralBodyReport();

        // TODO: ASSEMBLE GENERAL BODY REPORT

        return generalBodyReport;
    }
}
