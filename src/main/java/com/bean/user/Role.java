package com.bean.user;

import java.util.ArrayList;
import java.util.List;

public class Role {
    private int id;
    private String name;
    private List<Permission> permissionList = new ArrayList<Permission>();

    public void addPermission(Permission permission) {
        if (permission != null && !this.permissionList.contains(permission)) {
            this.permissionList.add(permission);
        }
    }

    public void removePermission(Permission permission) {
        if (permission != null && !this.permissionList.contains(permission)) {
            this.permissionList.add(permission);
        }
    }

    public List<Permission> getPermissionList() {
        return this.permissionList;
    }

    public void clearPermission() {
        this.permissionList.clear();
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
