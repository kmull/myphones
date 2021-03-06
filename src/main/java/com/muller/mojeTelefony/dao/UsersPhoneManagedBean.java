package com.muller.mojeTelefony.dao;

import com.muller.mojeTelefony.domain.Phone;
import com.muller.mojeTelefony.domain.User;
import com.muller.mojeTelefony.repository.PhoneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManagedBean(name = "UsersPhoneManagedBean")
@SessionScoped
public class UsersPhoneManagedBean {

    Logger log = LoggerFactory.getLogger(UsersPhoneManagedBean.class);

    @Inject
    PhoneRepository phoneRepository;

    private User user = new User();
    private Phone phone = new Phone();
    private boolean clickedMessage;
    @ManagedProperty(name = "onClick", value = "#{onClick}")
    private String onClick;

    private List<String> userList = new ArrayList<>();
    private Map<String, String> userMap = new HashMap<>();
    public String object;

//    public String asd(){
//
//    }

    public boolean clickedMessageMethod() {
        clickedMessage = true;
        return clickedMessage;
    }

    public void addUser(User user) {
        phoneRepository.addUser(user);
        user = new User();
    }

    public List<User> getUsers() {
        log.info(String.valueOf(userList.size()));
        userList.removeAll(userList);
        userList.add("    --- Select ---   ");

        for (User tmpUser : phoneRepository.getUsersTable()) {
            userList.add(tmpUser.getName() + "-" + tmpUser.getSurname());
        }
        return phoneRepository.getUsersTable();
    }

    public List<Phone> getPhones() {
        return phoneRepository.getPhonesTable();
    }

    /********************************************************************/

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public boolean isClickedMessage() {
        return clickedMessage;
    }

    public void setClickedMessage(boolean clickedMessage) {
        this.clickedMessage = clickedMessage;
    }

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }
}
