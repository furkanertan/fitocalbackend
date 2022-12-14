package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.BodyFatPercentage;
import com.example.fitocalapp.domain.DailyCalorie;
import com.example.fitocalapp.domain.GeneralBodyReport;
import com.example.fitocalapp.domain.IdealWeight;
import com.example.fitocalapp.dto.request.RequestBodyFatPercentageDto;
import com.example.fitocalapp.dto.request.RequestDailyCalorieDto;
import com.example.fitocalapp.dto.request.RequestGeneralBodyReportDto;
import com.example.fitocalapp.dto.request.RequestIdealWeightDto;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
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

    public GeneralBodyReport convertToGeneralBodyReport(BodyFatPercentage bodyFatPercentage, DailyCalorie dailyCalorie, IdealWeight idealWeight, RequestGeneralBodyReportDto requestGeneralBodyReportDto) {
        GeneralBodyReport generalBodyReport = new GeneralBodyReport();

        generalBodyReport.setAge(requestGeneralBodyReportDto.getAge());
        generalBodyReport.setGender(requestGeneralBodyReportDto.getGender());
        generalBodyReport.setHeight(requestGeneralBodyReportDto.getHeight());
        generalBodyReport.setWeight(requestGeneralBodyReportDto.getWeight());
        generalBodyReport.setIdealWeight(Double.parseDouble(new DecimalFormat("##.#").format(idealWeight.getIdealWeight())));
        generalBodyReport.setBmi(Double.parseDouble(new DecimalFormat("##.#").format(bodyFatPercentage.getBmi())));
        generalBodyReport.setBodyType(bodyFatPercentage.getType().getBodyFatPercentageType());
        generalBodyReport.setBodyFatPercentageRate(Double.parseDouble(new DecimalFormat("##.#").format(bodyFatPercentage.getBodyFatPercentageRate())));
        generalBodyReport.setBodyFatMass(Double.parseDouble(new DecimalFormat("##.#").format(bodyFatPercentage.getBodyFatMass())));
        generalBodyReport.setLeanBodyMass(Double.parseDouble(new DecimalFormat("##.#").format(bodyFatPercentage.getLeanBodyMass())));
        generalBodyReport.setCalorieToStaySame(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorie.getMaintainWeight())));
        generalBodyReport.setCalorieToLoseWeight(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorie.getWeightLoss())));
        generalBodyReport.setCalorieToGainWeight(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorie.getWeightGain())));

        return generalBodyReport;
    }
}
