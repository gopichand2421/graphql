package com.firstproject.graphql.service;

import com.firstproject.graphql.model.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    private final Flux<Customer> flux = Flux.just(
            Customer.create(1,"sam",20, "atlanta"),
            Customer.create(1,"gopi",25, "india"),
            Customer.create(1,"kalyan",30, "south africa")


    );

    public Flux<Customer> allCustomers(){
        return flux;
    }

    public Mono<Customer> customerById(Integer id){
        return flux.filter(obj ->  obj.getId().equals(id)).next();
    }

    public Flux<Customer> nameContains(String name){
        return flux.filter(obj -> obj.getName().contains(name));
    }

}
