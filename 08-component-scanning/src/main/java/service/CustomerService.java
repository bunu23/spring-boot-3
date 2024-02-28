package service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
   public String addCustomer(){
       return "Customer successfully added!";
   }

}
