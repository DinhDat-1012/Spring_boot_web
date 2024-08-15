package com.rs.e_comerance_dm.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name =  "categoryName")
    private String categoryName;
    @Column(name = "categoryStatus")
    private Boolean categoryStatus;

    public Category() {
        // TODO Auto-generated constructor stub
    }

    public Category(Integer Id, String categoryName, Boolean categoryStatus) {
        super();
        this.Id = Id;
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
    }

    public Integer getCategoryId() {
        return Id;
    }

    public void setCategoryId(Integer categoryId) {
        this.Id = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }


}
