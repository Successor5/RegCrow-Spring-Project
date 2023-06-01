package afica.semicolon.regcrow;

import afica.semicolon.regcrow.dtos.CustomerRegistrationResponse;
import afica.semicolon.regcrow.dtos.Requests.CustomerRegistrationRequest;
import afica.semicolon.regcrow.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RegcrowCustomerServiceTest {

    @Autowired
    private CustomerService customerService;

        @Test
        public void  testThatCustomerCanRegister() {
            //Given
            CustomerRegistrationRequest customerRegistrationRequest =  new CustomerRegistrationRequest() ;
            customerRegistrationRequest.setEmail("tinubu");
            customerRegistrationRequest.setPassword("tinubu");
            //when
            CustomerRegistrationResponse registrationResponse = customerService.register(customerRegistrationRequest);
        }


}
