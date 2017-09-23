package com.enumeration;

public enum RoleEnum {

    ROLE_ADMIN(1, "ROLE_ADMIN"),
    ROLE_STANDARD(2, "ROLE_STANDARD");

    private int code;
    private String name;

    RoleEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
