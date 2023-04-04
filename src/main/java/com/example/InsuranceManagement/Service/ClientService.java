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

    public List<Client> getClient()throws Exception{

        return clientRepository.findAll();
    }

    public Client getClientById(Integer id)throws  Exception{
         Client client= clientRepository.findById(id).get();
         if(client==null){
             throw new Exception("Id not found");
         }
         return client;
    }

    public String createClient(Client client)throws Exception{
        clientRepository.save(client);
        return "Client created successfully";
    }

    public String updateClient(Integer id) throws Exception{
        Client client=clientRepository.findById(id).get();

        if(client==null){
            throw new Exception("Id not found");
        }

        return "Client updated successfully";
    }

    public String daleteClient(Integer id)throws Exception{
        clientRepository.deleteById(id);

        return "client deleted successfully";
    }
}
