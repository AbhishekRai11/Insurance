package com.example.InsuranceManagement.Controller;

import com.example.InsuranceManagement.Model.Client;
import com.example.InsuranceManagement.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getClient(){
        return clientService.getClient();
    }

    @GetMapping("/clients")
    public Client getClientById(@RequestParam("id") Integer id){
        return clientService.getClientById(id);
    }

    @PostMapping("/clients-create")
    public String createClient(@RequestBody Client client){
        return clientService.createClient(client);
    }

    @PutMapping("/clients-update/{id}")
    public String updateClient(@PathVariable("id") Integer id){
        return clientService.updateClient(id);
    }

    @DeleteMapping("/clients-delete/{id}")
    public String deleteClient(@PathVariable("id") Integer id){
        return clientService.daleteClient(id);
    }
}
