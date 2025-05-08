package com.hms.hospital_management_system.service;

import com.hms.hospital_management_system.entity.Patient;
import com.hms.hospital_management_system.payload.PatientDTO;

import java.util.List;

public interface PatientService {
    Patient createPatient(PatientDTO patientDTO);
    List<Patient> getAllPatients();
}
