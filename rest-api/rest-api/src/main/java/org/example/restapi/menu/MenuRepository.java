package org.example.restapi.menu;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static java.awt.SystemColor.menu;

//public class MenuRepository {
//
//    @PersistenceContext
//    public EntityManager manager;
//
//    public List<MenuDTO> menuList(int menuCode) {
//
//
//        String categoryMenu = "SELECT menuCode,menuName,menuPrice,categoryCode,orderableStatus " +
//                "FROM tbl_menu " +
//                "WHERE categoryCode = :categoryCode";
//
//        return manager.createQuery(categoryMenu, Menu2.class)
//                .setParameter("categoryCode", menu.getCategoryCode()).getResultList();
//
//    }
//}
