package com.nc.autumn2020.solutions.practice.lesson7;

import java.util.ArrayList;

public class User {
    private int id;
    private String username;
    private String password;
    private Role[] role;

    public User(int id, String username, String password, Role[] role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role[] getRole() {
        return role;
    }

    public void setRole(Role[] role) {
        this.role = role;
    }

    public String roleToString(){
        StringBuilder roleString = new StringBuilder();
        roleString.append("Роли:{ ");
        for (Role role:role){
            roleString.append("name: " + role.getName() + ", ");
            roleString.append("authority: " + role.getAuthority() + "; ");
        }
        roleString.append("}");
        return roleString.toString();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + this.roleToString()+
                '}';
    }
}
