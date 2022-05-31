package com.example.jenkinsbuild;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok("Halo, Selamat Pagi" + name);
    }

}
