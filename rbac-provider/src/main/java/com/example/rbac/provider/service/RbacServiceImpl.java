package com.example.rbac.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.rbac.RbacService;
import lombok.extern.slf4j.Slf4j;

@Service(
    version = "${rbac.service.version}",
    application = "${dubbo.application.id}",
    protocol = "${dubbo.protocol.id}",
    registry = "${dubbo.registry.id}",
    onconnect = "onConnect",
    ondisconnect = "onDisconnect"
)
@Slf4j
public class RbacServiceImpl implements RbacService {

    @Override
    public Boolean hasPermission(String who, String resource, String operation) {
        log.debug("Check permission for {} if can do {} on resource {}", who, operation, resource);
        return true;
    }

    public void onConnect() {
        log.info("Client connected.");
    }

    public void onDisconnect() {
        log.info("Client disconnected.");
    }
}
