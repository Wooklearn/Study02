package org.example.jpapractice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Menu2Repository {

    @PersistenceContext
    public EntityManager manager;


    public List<Menu2> searchMenu(Menu2 menu) {

        String categoryMenu = "SELECT menuCode,menuName,menuPrice,categoryCode,orderableStatus " +
                "FROM tbl_menu " +
                "WHERE categoryCode = :categoryCode";


        return manager.createQuery(categoryMenu, Menu2.class)
                .setParameter("categoryCode", menu.getCategoryCode()).getResultList();
    }
}
