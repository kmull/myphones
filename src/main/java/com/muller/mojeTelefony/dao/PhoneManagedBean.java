package com.muller.mojeTelefony.dao;

import com.muller.mojeTelefony.domain.PhoneUser;
import com.muller.mojeTelefony.repository.UsersRepository;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

@ManagedBean(name = "phoneBean")
public class PhoneManagedBean {

    @Inject
    private UsersRepository usersRepository;
    private PhoneUser phoneUser = new PhoneUser();

    public void addUser(PhoneUser user) {
        usersRepository.addUser(user);
    }

    public PhoneUser getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(PhoneUser phoneUser) {
        this.phoneUser = phoneUser;
    }
}
