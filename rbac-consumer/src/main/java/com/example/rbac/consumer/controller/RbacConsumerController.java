package com.example.rbac.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.rbac.RbacService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RbacConsumerController {

    @Reference(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        url = "${service.rbac.url}"
    )
    private RbacService rbacService;

    @RequestMapping("/has_permission")
    public Mono<Boolean> sayHello() {
        Boolean hasPermission = rbacService.hasPermission("10000", "/users", "VIEW");
        return Mono.just(hasPermission);
    }

}