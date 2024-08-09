package com.rs.e_comerance_dm.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "role")
public class role {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "role")
    private Set<user_role> roleUsers;
    public role() {
    }

    public role(Long id, String name, Set<user_role> roleUsers) {
        this.id = id;
        this.name = name;
        this.roleUsers = roleUsers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<user_role> getRoleUsers() {
        return roleUsers;
    }

    public void setRoleUsers(Set<user_role> roleUsers) {
        this.roleUsers = roleUsers;
    }
}
