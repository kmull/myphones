package com.muller.mojeTelefony.repository;

import com.muller.mojeTelefony.domain.Phone;
import com.muller.mojeTelefony.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PhoneRepository {

    Logger log = LoggerFactory.getLogger(PhoneRepository.class);

    @PersistenceContext(unitName = "pUnit")
    private EntityManager entityManager;

    public void addUser(User user) {
//        if(user == null){
//            log.info("user is null");
//            return;
//        }
        entityManager.persist(user);
        log.info("User: " + user.getName() + " " + user.getSurname() + " added.");
    }

    public List<User> getUsersTable() {
        return entityManager.createNamedQuery("user.getList").getResultList();
    }

    public List<Phone> getPhonesTable() {
        return entityManager.createNamedQuery("phone.getList").getResultList();
    }

}
