package com.example.api.rbac;

public interface RbacService {
    /**
     * 是否有权限
     *
     * @param who       谁
     * @param resource  资源
     * @param operation 操作
     * @return Boolean 是否有权操作资源
     */
    Boolean hasPermission(String who, String resource, String operation);
}
