package com.example.InsuranceManagement.Controller;

import com.example.InsuranceManagement.Model.Client;
import com.example.InsuranceManagement.Model.InsurancePolicy;
import com.example.InsuranceManagement.Service.ClientService;
import com.example.InsuranceManagement.Service.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InsurancePolicyController {

    @Autowired
    InsurancePolicyService insurancePolicyService;

    @GetMapping("/policies")
    public List<InsurancePolicy> getInsurancePolicy(){
        return insurancePolicyService.getInsurancePolicy();
    }

    @GetMapping("/policies")
    public InsurancePolicy getInsuranceById(@RequestParam("id") Integer id){
        return insurancePolicyService.getInsurancePolicyById(id);
    }

    @PostMapping("/policies-create")
    public String createInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy){
        return insurancePolicyService.createInsurancePolicy(insurancePolicy);
    }

    @PutMapping("/policies-update/{id}")
    public String updateInsurancePolicy(@PathVariable("id") Integer id){
        return insurancePolicyService.updateInsurancePolicy(id);
    }

    @DeleteMapping("policies-delete/{id}")
    public String deleteInsurancePolicy(@PathVariable("id") Integer id){
        return insurancePolicyService.daleteInsurancePolicy(id);
    }
}
