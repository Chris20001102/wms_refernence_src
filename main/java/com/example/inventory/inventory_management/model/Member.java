package com.example.inventory.inventory_management.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.ValueGenerationType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "members")
public class Member {

    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // private Long mid;
    // private String email;
    // private String password;
    // private String firstName;
    // private String lastName;
    // private Date createTime;
    // private Date updateTime;

    @Id
    @Column(name = "mid", unique = true, nullable = false, length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mid;
    @NonNull
    @Column(name = "email", unique = true, nullable = false, length = 50)
    private String email;
    @NonNull
    @Column(name = "password", nullable = false, length = 50)
    private String password;
    @NonNull
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    @NonNull
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;

    public Member(String email, String password, String firstName, String lastName) {
        // this.mid = UUID.randomUUID().toString().replaceAll("-", "");
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Member() {

    }

}
