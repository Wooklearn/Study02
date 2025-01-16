package org.example.restapi.menu.model.dao;

import org.example.restapi.menu.controller.Menu;
import org.example.restapi.menu.model.dto.MenuDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

    @Query("SELECT m FROM Menu m WHERE m.categoryCode.categoryCode = :categoryCode")
    List<Menu> findByCategoryCode(@Param("categoryCode") int categoryCode);

}
