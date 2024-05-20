package com.firstproject.graphql.contoller;

import com.firstproject.graphql.model.Customer;
import com.firstproject.graphql.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @QueryMapping
    public Flux<Customer> customers(){
        return this.customerService.allCustomers();
    }

    @QueryMapping
    public Mono<Customer> customerById(@Argument Integer id){
        return this.customerService.customerById(id);
    }

    @QueryMapping
    public Flux<Customer> customerByName(@Argument String name){
        return this.customerService.nameContains(name);
    }
}
