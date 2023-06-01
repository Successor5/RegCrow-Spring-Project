package afica.semicolon.regcrow.dtos.Requests;

import afica.semicolon.regcrow.dtos.CustomerRegistrationResponse;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class CustomerRegistrationRequest {
    private String email;
    private  String  password;

}
