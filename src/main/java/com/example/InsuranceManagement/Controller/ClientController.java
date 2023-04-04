package com.example.InsuranceManagement.Controller;

import com.example.InsuranceManagement.Model.Client;
import com.example.InsuranceManagement.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/allClients")
    public ResponseEntity<List<Client>> getClient()throws Exception{

        List<Client> lst = clientService.getClient();
        return new ResponseEntity<>(lst,HttpStatus.OK);

    }

    @GetMapping("/clients")
    public ResponseEntity<Client> getClientById(@RequestParam("id") Integer id)throws Exception{
        Client client= clientService.getClientById(id);
        return new ResponseEntity<>(client,HttpStatus.OK);

    }

    @PostMapping("/clients-create")
    public ResponseEntity<String> createClient(@RequestBody Client client)throws Exception{
        String str= clientService.createClient(client);
        return new ResponseEntity<>(str,HttpStatus.OK);

    }

    @PutMapping("/clients-update/{id}")
    public ResponseEntity<String> updateClient(@PathVariable("id") Integer id)throws Exception{
        String str= clientService.updateClient(id);
        return new ResponseEntity<>(str,HttpStatus.OK);

    }

    @DeleteMapping("/clients-delete/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable("id") Integer id)throws Exception{
        String str= clientService.daleteClient(id);
        return new ResponseEntity<>(str,HttpStatus.OK);
    }
}
