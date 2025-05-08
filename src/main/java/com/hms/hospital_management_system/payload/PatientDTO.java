package com.hms.hospital_management_system.payload;

import lombok.Data;

import java.util.List;

@Data
public class PatientDTO {
    private String name;
    private Long id;
    private String dateOfBirth;
    private String gender;
    private MedicalHistoryDTO medicalHistory;
    private List<AppointmentDTO> appointments;
    private BillingDTO billing;
}
