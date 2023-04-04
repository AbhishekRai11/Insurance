package com.example.InsuranceManagement.Repository;

import com.example.InsuranceManagement.Model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim,Integer> {
}
