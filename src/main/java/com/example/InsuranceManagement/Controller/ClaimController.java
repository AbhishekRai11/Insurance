package com.example.InsuranceManagement.Controller;

import com.example.InsuranceManagement.Model.Claim;
import com.example.InsuranceManagement.Model.Client;
import com.example.InsuranceManagement.Service.ClaimService;
import com.example.InsuranceManagement.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ClaimController {

    @Autowired
    ClaimService claimService;

    @GetMapping("/claims")
    public List<Claim> getClaim(){
        return claimService.getClaim();
    }

    @GetMapping("/claims")
    public Claim getCaimById(@RequestParam("id") Integer id){
        return claimService.getClaimById(id);
    }

    @PostMapping("/claims-create")
    public String createClaim(@RequestBody Claim claim){
        return claimService.createClaim(claim);
    }

    @PutMapping("/claims-update/{id}")
    public String updateClaim(@PathVariable("id") Integer id){
        return claimService.updateClaim(id);
    }

    @DeleteMapping("/claims-delete/{id}")
    public String deleteClaim(@PathVariable("id") Integer id){
        return claimService.daleteClaim(id);
    }




}
