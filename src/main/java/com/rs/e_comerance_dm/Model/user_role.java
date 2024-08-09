package com.rs.e_comerance_dm.Model;

import jakarta.persistence.*;

import javax.management.relation.Role;

@Entity
@Table(name = "users_roles")
public class user_role {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "userId",referencedColumnName = "id")
    private user user;
    @ManyToOne
    @JoinColumn(name = "roleId",referencedColumnName = "id")
    private role role;

    public user_role(Long id, com.rs.e_comerance_dm.Model.user user, com.rs.e_comerance_dm.Model.role role) {
        this.id = id;
        this.user = user;
        this.role = role;
    }
    public user_role() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.rs.e_comerance_dm.Model.user getUser() {
        return user;
    }

    public void setUser(com.rs.e_comerance_dm.Model.user user) {
        this.user = user;
    }

    public com.rs.e_comerance_dm.Model.role getRole() {
        return role;
    }

    public void setRole(com.rs.e_comerance_dm.Model.role role) {
        this.role = role;
    }
}
