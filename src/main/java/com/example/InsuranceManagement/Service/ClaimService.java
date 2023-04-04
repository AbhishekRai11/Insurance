package com.example.InsuranceManagement.Service;

import com.example.InsuranceManagement.Model.Claim;
import com.example.InsuranceManagement.Model.Client;
import com.example.InsuranceManagement.Repository.ClaimRepository;
import com.example.InsuranceManagement.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClaimService {

    @Autowired
    ClaimRepository claimRepository;

    public List<Claim> getClaim(){
        return claimRepository.findAll();
    }

    public Claim getClaimById(Integer id){
        return claimRepository.findById(id).get();
    }

    public String createClaim(Claim claim){
        claimRepository.save(claim);
        return "Claim created successfully";
    }

    public String updateClaim(Integer id){
        Claim claim=claimRepository.findById(id).get();

        return "Claim updated successfully";
    }

    public String daleteClaim(Integer id){
        claimRepository.deleteById(id);

        return "claim deleted successfully";
    }
}
