package com.fuzzystudio.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
class MainController {
  @GetMapping("/")
  public String index(String id) {
    return "";
  }

  @GetMapping("/user/{id}")
  public String user(@PathVariable("id") String id) {
    return id;
  }

  @PostMapping("/user")
  public String create() {
    return "";
  }
}