package com.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DisplayController {

  @GetMapping("/00")
  public String helloWorld() {
    return "Hello World";
  }

  @GetMapping("/01")
  public String helloJava() {
    return "Hello Java";
  }

  @GetMapping("/02")
  public String helloMysql() {
    return "Hello MySQL";
  }
}
