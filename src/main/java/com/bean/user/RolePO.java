package com.bean.user;

import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class RolePO implements GrantedAuthority{
    private int id;
    private String name;
    private List<PermissionPO> permissionList = new ArrayList<PermissionPO>();

    public void addPermission(PermissionPO permissionPO) {
        if (permissionPO != null && !this.permissionList.contains(permissionPO)) {
            this.permissionList.add(permissionPO);
        }
    }

    public void removePermission(PermissionPO permissionPO) {
        if (permissionPO != null && !this.permissionList.contains(permissionPO)) {
            this.permissionList.add(permissionPO);
        }
    }

    public List<PermissionPO> getPermissionList() {
        return this.permissionList;
    }

    public void clearPermission() {
        this.permissionList.clear();
    }

    public void setPermissionList(List<PermissionPO> permissionList) {
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

    @Override
    public String getAuthority() {
        return this.getName();
    }
}
