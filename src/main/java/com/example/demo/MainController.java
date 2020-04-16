package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  private static final String template = "You have called method , %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/conversions/ktoc")
  @ResponseBody
  public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="ktoc") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }


@GetMapping("/conversions/ctok")
  @ResponseBody
  public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="ctok") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

@GetMapping("/conversions/mtok")
  @ResponseBody
  public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="mtok") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

@GetMapping("/conversions/ktom")
  @ResponseBody
  public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="ktom") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

}
