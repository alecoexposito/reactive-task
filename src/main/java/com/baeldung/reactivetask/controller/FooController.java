package com.baeldung.reactivetask.controller;

import com.baeldung.reactivetask.dto.FooDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class FooController {

    @GetMapping("/foo")
    public Flux<FooDTO> getFoo() {
        int count = 1;
        return Flux
                .interval(Duration.ofSeconds(1))
                .map(i -> new FooDTO(i, "Foo" + i));
    }
}
