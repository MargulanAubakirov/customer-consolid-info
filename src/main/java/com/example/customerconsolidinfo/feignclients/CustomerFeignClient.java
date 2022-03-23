package com.example.customerconsolidinfo.feignclients;

import com.example.customerconsolidinfo.response.CustomerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${customer.service.url}", value = "customer.feign.client", path = "/api/customer")
public interface CustomerFeignClient {
    @GetMapping("/getCustomerById/{id}")
    public CustomerResponse getCustomerByIdViaFeignClient(@PathVariable Long id);

}
