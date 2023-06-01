package afica.semicolon.regcrow.services;

import afica.semicolon.regcrow.Execptions.CustomerRegistrationFailedExecption;
import afica.semicolon.regcrow.dtos.CustomerRegistrationResponse;
import afica.semicolon.regcrow.dtos.Requests.CustomerRegistrationRequest;

public interface CustomerService {
    CustomerRegistrationResponse register (CustomerRegistrationRequest customerRegistrationRequest) throws CustomerRegistrationFailedExecption;
}
