package com.hms.hospital_management_system.service;

import com.hms.hospital_management_system.entity.Billing;

public interface BillingService {
    Billing getBillingById(Long id);
    boolean deleteBillingById(Long id);
}
