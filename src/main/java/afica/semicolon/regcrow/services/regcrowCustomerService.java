package afica.semicolon.regcrow.services;

import afica.semicolon.regcrow.Execptions.CustomerRegistrationFailedExecption;
import afica.semicolon.regcrow.dtos.CustomerRegistrationResponse;
import afica.semicolon.regcrow.dtos.Requests.CustomerRegistrationRequest;
import afica.semicolon.regcrow.models.BioData;
import afica.semicolon.regcrow.models.Customer;
import afica.semicolon.regcrow.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class regcrowCustomerService implements CustomerService {

    private final CustomerRepository customerRepository;

//    @Autowired
//    public regcrowCustomerService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }


    @Override
    public CustomerRegistrationResponse register(CustomerRegistrationRequest customerRegistrationRequest) throws CustomerRegistrationFailedExecption {
        String CustomerEmail = customerRegistrationRequest.getEmail();
        String customerPassword = customerRegistrationRequest.getPassword();


        BioData bioData = BioData.builder()
                .email(CustomerEmail)
                .password(customerPassword)
                .build();
        Customer customer = new Customer();
        customer.setBiodata(bioData);

        Customer savedCustomer =customerRepository.save(customer);

        if (savedCustomer==null)
            throw new CustomerRegistrationFailedExecption(
                    String.format(USER_REGISTRATION_FAILED, customerEmail));
                    CustomerRegistrationResponse customerRegistrationResponse = new CustomerRegistrationResponse();
//                    customerRegistrationResponse

        return null;
    }
}
