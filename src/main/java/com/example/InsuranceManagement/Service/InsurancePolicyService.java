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

    public List<InsurancePolicy> getInsurancePolicy()throws Exception{
        return insurancePolicyRepository.findAll();
    }

    public InsurancePolicy getInsurancePolicyById(Integer id)throws Exception{
        InsurancePolicy insurancePolicy= insurancePolicyRepository.findById(id).get();
        if(insurancePolicy==null){
            throw new Exception("Id not Found");
        }
        return  insurancePolicy;

    }

    public String createInsurancePolicy(InsurancePolicy insurancePolicy)throws Exception{
        insurancePolicyRepository.save(insurancePolicy);
        return "InsurancePolicy created successfully";
    }

    public String updateInsurancePolicy(Integer id) throws Exception{
        InsurancePolicy insurancePolicy=insurancePolicyRepository.findById(id).get();

        if(insurancePolicy==null){
            throw new Exception("Id not Found");
        }

        return "Insurance Policy updated successfully";
    }

    public String daleteInsurancePolicy(Integer id)throws Exception{
        insurancePolicyRepository.deleteById(id);

        return "Insurance Policy deleted successfully";
    }
}
