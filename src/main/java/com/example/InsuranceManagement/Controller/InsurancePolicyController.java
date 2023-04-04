package com.example.InsuranceManagement.Controller;

import com.example.InsuranceManagement.Model.Client;
import com.example.InsuranceManagement.Model.InsurancePolicy;
import com.example.InsuranceManagement.Service.ClientService;
import com.example.InsuranceManagement.Service.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InsurancePolicyController {

    @Autowired
    InsurancePolicyService insurancePolicyService;

    @GetMapping("/policies")
    public ResponseEntity<List<InsurancePolicy>> getInsurancePolicy()throws Exception{
        List<InsurancePolicy> lst= insurancePolicyService.getInsurancePolicy();
        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    @GetMapping("/policies")
    public ResponseEntity<InsurancePolicy> getInsuranceById(@RequestParam("id") Integer id)throws  Exception{
        InsurancePolicy insurancePolicy= insurancePolicyService.getInsurancePolicyById(id);
        return new ResponseEntity<>(insurancePolicy,HttpStatus.OK);
    }

    @PostMapping("/policies-create")
    public ResponseEntity<String> createInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy)throws Exception{
        String str= insurancePolicyService.createInsurancePolicy(insurancePolicy);
        return new ResponseEntity<>(str,HttpStatus.OK);
    }

    @PutMapping("/policies-update/{id}")
    public ResponseEntity<String> updateInsurancePolicy(@PathVariable("id") Integer id)throws Exception{
        String str= insurancePolicyService.updateInsurancePolicy(id);
        return new ResponseEntity<>(str,HttpStatus.OK);
    }

    @DeleteMapping("policies-delete/{id}")
    public ResponseEntity<String> deleteInsurancePolicy(@PathVariable("id") Integer id)throws Exception{
        String str= insurancePolicyService.daleteInsurancePolicy(id);
        return new ResponseEntity<>(str,HttpStatus.OK);
    }
}
