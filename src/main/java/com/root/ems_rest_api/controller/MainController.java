package com.root.ems_rest_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String redirectToSwagger() {
    return "redirect:/swagger-ui.html";
  }
}
