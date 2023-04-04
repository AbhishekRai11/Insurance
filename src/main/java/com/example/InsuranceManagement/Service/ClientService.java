package com.example.InsuranceManagement.Service;

import com.example.InsuranceManagement.Model.Client;
import com.example.InsuranceManagement.Model.InsurancePolicy;
import com.example.InsuranceManagement.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getClient(){
         return clientRepository.findAll();
    }

    public Client getClientById(Integer id){
         return clientRepository.findById(id).get();
    }

    public String createClient(Client client){
        clientRepository.save(client);
        return "Client created successfully";
    }

    public String updateClient(Integer id){
        Client client=clientRepository.findById(id).get();

        return "Client updated successfully";
    }

    public String daleteClient(Integer id){
        clientRepository.deleteById(id);

        return "client deleted successfully";
    }
}
