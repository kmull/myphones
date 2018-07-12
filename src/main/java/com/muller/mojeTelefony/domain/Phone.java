package com.muller.mojeTelefony.domain;

import javax.persistence.*;

@Entity(name = "Phone")
@NamedQueries({
        @NamedQuery(name = "phone.getList", query = "FROM Phone")//,
//        @NamedQuery(name = "phone.getConnection",
//        query = "SELECT OBJECT(ph) FROM userData ph " +
//                "WHERE ph.phones"),
})
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;
    private String number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(User user_phone) {
        this.user_phone = user_phone;
    }
}
