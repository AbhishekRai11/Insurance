package com.example.InsuranceManagement.Service;

import com.example.InsuranceManagement.Model.Claim;
import com.example.InsuranceManagement.Model.InsurancePolicy;
import com.example.InsuranceManagement.Repository.ClaimRepository;
import com.example.InsuranceManagement.Repository.InsurancePolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsurancePolicyService {

    @Autowired
    InsurancePolicyRepository insurancePolicyRepository;

    public List<InsurancePolicy> getInsurancePolicy(){
        return insurancePolicyRepository.findAll();
    }

    public InsurancePolicy getInsurancePolicyById(Integer id){
        return insurancePolicyRepository.findById(id).get();
    }

    public String createInsurancePolicy(InsurancePolicy insurancePolicy){
        insurancePolicyRepository.save(insurancePolicy);
        return "InsurancePolicy created successfully";
    }

    public String updateInsurancePolicy(Integer id){
        InsurancePolicy insurancePolicy=insurancePolicyRepository.findById(id).get();

        return "Insurance Policy updated successfully";
    }

    public String daleteInsurancePolicy(Integer id){
        insurancePolicyRepository.deleteById(id);

        return "Insurance Policy deleted successfully";
    }
}
