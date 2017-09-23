package com.bean.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
*   This class is used to extends the user basic info.
* */
public class UserPO implements UserDetails {

    private String id;
    private String name;
    private String password;
    private String email;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isEnabled;
    private RolePO role = new RolePO();
    private Date modifiedDate;

    @Override
    public String getUsername() {
        return this.email;
    }

    public boolean isAccountNonExpired() {
        return this.isAccountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return this.isAccountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return this.isCredentialsNonExpired;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public RolePO getRole() {
        return role;
    }

    public void setRole(RolePO role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return this.email + ", " + this.password;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        grantedAuthorities.add(this.getRole());
        return grantedAuthorities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        isAccountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        isAccountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        isCredentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserPO)) return false;

        UserPO userPO = (UserPO) o;

        return id.equals(userPO.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
