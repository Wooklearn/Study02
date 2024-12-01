package com.ohgiraffers.crudtest.model.dao;

import com.ohgiraffers.crudtest.menu.controller.MenuDTO;

import java.awt.*;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    List<MenuDTO> menuList();


    MenuDTO selectMenu(int code);


    void deleteMenu(int code);

    MenuDTO menuDetail(String code);

    void menuUpdate();
}
