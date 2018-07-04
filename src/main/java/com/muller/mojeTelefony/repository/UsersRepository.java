package com.muller.mojeTelefony.repository;

import com.muller.mojeTelefony.domain.PhoneUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UsersRepository {

    Logger log = LoggerFactory.getLogger(UsersRepository.class);

    @PersistenceContext(unitName = "pUnit")
    private EntityManager entityManager;

    public void addUser(PhoneUser user) {
        entityManager.persist(user);
        log.info("User: " + user.getName() + " " + user.getSurname() + " added.");
    }

    public List<PhoneUser> getUsersTable() {
        return entityManager.createNamedQuery("phoneUser.getList").getResultList();
    }

}
