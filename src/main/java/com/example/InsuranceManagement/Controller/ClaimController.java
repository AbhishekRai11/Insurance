package com.example.InsuranceManagement.Controller;

import com.example.InsuranceManagement.Model.Claim;
import com.example.InsuranceManagement.Model.Client;
import com.example.InsuranceManagement.Service.ClaimService;
import com.example.InsuranceManagement.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ClaimController {

    @Autowired
    ClaimService claimService;

    @GetMapping("/claims")
    public ResponseEntity<List<Claim>> getClaim()throws Exception{

        List<Claim> lst= claimService.getClaim();
        return new ResponseEntity<>(lst,HttpStatus.OK);

    }

    @GetMapping("/claims")
    public ResponseEntity<Claim> getCaimById(@RequestParam("id") Integer id)throws Exception{
        Claim claim=claimService.getClaimById(id);
        return new ResponseEntity<>(claim,HttpStatus.OK);

    }

    @PostMapping("/claims-create")
    public ResponseEntity<String> createClaim(@RequestBody Claim claim)throws Exception{
        String str= claimService.createClaim(claim);
        return new ResponseEntity<>(str,HttpStatus.OK);

    }

    @PutMapping("/claims-update/{id}")
    public ResponseEntity<String> updateClaim(@PathVariable("id") Integer id)throws Exception{
        String str= claimService.updateClaim(id);
        return new ResponseEntity<>(str,HttpStatus.OK);

    }

    @DeleteMapping("/claims-delete/{id}")
    public ResponseEntity<String> deleteClaim(@PathVariable("id") Integer id)throws Exception{
        String str= claimService.daleteClaim(id);
        return new ResponseEntity<>(str, HttpStatus.OK);

    }




}
