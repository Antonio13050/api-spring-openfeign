package com.api.feign.apispringopenfeign.clients;

import com.api.feign.apispringopenfeign.model.transport.PeopleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "star-wars-client", url = "https://swapi.py4e.com/api", path = "/people")
public interface StarWarsClient {

    @GetMapping("/{id}")
    public ResponseEntity<PeopleDTO> getPeople(@PathVariable("id") Integer id);
}