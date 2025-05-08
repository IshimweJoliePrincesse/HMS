package com.hms.hospital_management_system.repository;

import com.hms.hospital_management_system.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatientId(Long patientId);
}
