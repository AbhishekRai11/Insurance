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

    public List<Claim> getClaim()throws Exception{
        return claimRepository.findAll();
    }

    public Claim getClaimById(Integer id) throws Exception{

        Claim claim= claimRepository.findById(id).get();
        if(claim==null){
            throw new Exception("Id not Found");
        }
        return claim;
    }

    public String createClaim(Claim claim)throws Exception{
        claimRepository.save(claim);
        return "Claim created successfully";
    }

    public String updateClaim(Integer id) throws Exception{
        Claim claim=claimRepository.findById(id).get();
        if(claim==null){
            throw new Exception("Id not Found");
        }
        return "Claim updated successfully";
    }

    public String daleteClaim(Integer id) throws Exception{
        claimRepository.deleteById(id);



        return "claim deleted successfully";
    }
}
