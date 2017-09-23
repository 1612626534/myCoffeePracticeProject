package com.bean.user;

import org.springframework.security.core.GrantedAuthority;

public class PermissionPO implements GrantedAuthority {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof PermissionPO)) {
            return false;
        }

        PermissionPO that = (PermissionPO) o;

        return this.id.equals(that.id);
    }
}
