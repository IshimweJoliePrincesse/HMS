package com.hms.hospital_management_system.payload;

import lombok.Data;

@Data
public class MedicalHistoryDTO {
    private Long patientId;
    private String allergies;
    private String previousIllness;
    private String currentMedications;
}
