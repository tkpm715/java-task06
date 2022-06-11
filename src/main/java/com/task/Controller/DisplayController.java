package com.task.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DisplayController {

  @GetMapping("/00")
  public String a(){
    return "Hello World";
  }

}
