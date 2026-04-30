package com.hms.dto.patient;

import com.hms.entity.enums.Gender;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PatientProfileUpdateRequest {

    @Min(0)
    @Max(150)
    private Integer age;

    private Gender gender;

    @Size(max = 30)
    private String phone;

    @Size(max = 255)
    private String address;
}

