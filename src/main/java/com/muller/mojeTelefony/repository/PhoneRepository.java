package com.muller.mojeTelefony.repository;

import com.muller.mojeTelefony.domain.PhoneNumber;
import com.muller.mojeTelefony.domain.PhoneUser;
import com.muller.mojeTelefony.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PhoneRepository {

    Logger log = LoggerFactory.getLogger(PhoneRepository.class);

    @PersistenceContext(unitName = "pUnit")
    private EntityManager entityManager;

    public void addUser(User user) {
        entityManager.persist(user);
        log.info("User: " + user.getName() + " " + user.getSurname() + " added.");
    }

    public List<User> getUsersTable() {
        return entityManager.createNamedQuery("user.getList").getResultList();
    }

    public List<PhoneNumber> getPhonesTable() {
        return entityManager.createNamedQuery("phone.getList").getResultList();
    }

}
