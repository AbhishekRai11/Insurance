package com.example.InsuranceManagement.Repository;

import com.example.InsuranceManagement.Model.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy,Integer> {
}
