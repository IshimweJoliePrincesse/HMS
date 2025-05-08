package com.hms.hospital_management_system.repository;

import com.hms.hospital_management_system.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Long> {
}
