package com.bean.user;

import org.springframework.security.core.GrantedAuthority;

public class Permission implements GrantedAuthority {
    private int id;
    private String name;

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
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Permission)) {
            return false;
        }

        Permission that = (Permission) o;

        return this.id == that.id;
    }
}
