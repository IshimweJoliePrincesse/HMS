package com.hms.hospital_management_system.service;

import com.hms.hospital_management_system.entity.Appointment;
import com.hms.hospital_management_system.payload.AppointmentDTO;
import com.hms.hospital_management_system.payload.AppointmentResponse;

public interface AppointmentService {
    Appointment createAppointment(AppointmentDTO appointmentDTO);
    AppointmentResponse getAllAppointments(int pageNo, int pageSize, String sortBy, String sortDir);
    Appointment getAppointmentById(Long id);
    boolean deleteAppointment(Long id);
}
