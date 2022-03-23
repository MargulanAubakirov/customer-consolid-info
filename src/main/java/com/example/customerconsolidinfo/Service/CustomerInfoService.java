package com.example.customerconsolidinfo.Service;

import com.example.customerconsolidinfo.models.Customer;
import com.example.customerconsolidinfo.request.CreateAddressRequest;
import com.example.customerconsolidinfo.request.CreateCustomerRequest;
import com.example.customerconsolidinfo.response.AddressResponse;
import com.example.customerconsolidinfo.response.CustomerResponse;

import java.util.List;

public interface CustomerInfoService {
    List<CustomerResponse> getAllCustomers();

    String addCustomer(CreateCustomerRequest createCustomerRequest);

    String getCustomerById(Long id);

    String getAllAdresses();

    String addAddress(CreateAddressRequest createAddressRequest);

    String getAddressById(Long id);

    CustomerResponse getCustomerByIdViaWebClient(Long id);
}
