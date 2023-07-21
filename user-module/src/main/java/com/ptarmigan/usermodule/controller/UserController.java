package com.ptarmigan.usermodule.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;

import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController {


//    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
//    public Flux<Object> list(ServerWebExchange exchange) {
//        return Flux.just(createMap(exchange));
//    }
//
//    private Object createMap(ServerWebExchange exchange) {
//        Map<String, String> map = new HashMap<>();
//        map.put("sdee", "feefef");
//        map.put("devedsv", "evwesfw");
//        map.put("port", exchange.getRequest().getURI().getPort()+"");
//        return map;
//    }
}
