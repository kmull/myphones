package com.muller.mojeTelefony.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name = "phones.getList", query = "FROM PhoneNumber")
public class PhoneNumber {

    public PhoneNumber() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    private String name;
    private String phone;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private PhoneUser phoneUser = new PhoneUser();

    public PhoneUser getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(PhoneUser phoneUser) {
        this.phoneUser = phoneUser;
    }

    //    public PhoneUser getPhoneUser() {
//        return phoneUser;
//    }
//
//    public void setPhoneUser(PhoneUser phoneUser) {
//        this.phoneUser = phoneUser;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
