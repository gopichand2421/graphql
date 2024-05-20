package com.firstproject.graphql.contoller;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class BankController {

    @QueryMapping("sayHello")
    public Mono<String> helloWorld(){
        return Mono.just("hello world");
    }

    @QueryMapping
    public Mono<String> sayHelloTo(@Argument String name){
        return Mono.fromSupplier(() -> "Hello " + name);
    }

}
