package com.ohgiraffers.crudtest.menu.controller;

import com.ohgiraffers.crudtest.model.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.awt.*;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/menu/*")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("list")
    public String menuList(Model model) {
        List<MenuDTO> menuList = menuService.menuList();

        model.addAttribute("menuList", menuList);

        for (MenuDTO menuDTO : menuList) {
            System.out.println("menuDTO = " + menuDTO);
        }

        return "menu/list";
    }

    @GetMapping("select")
    public void selectMenu1() {
    }

    @PostMapping("select")
    public String selectMenu(int code, Model model) {

        MenuDTO menuCode = menuService.getselectMenu(code);

        model.addAttribute("menu", menuCode);


        return "/menu/selectMenu";
    }

    @GetMapping("delete")
    public String delete() {

        return "/menu/delete";
    }

    @PostMapping
    public String deleteMenu(@RequestParam int code) {

        menuService.deleteMenu(code);

        return "/menu/delete";
    }

    @GetMapping("menuDetail")
    public String menuDetail(@RequestParam String code, Model model) {

        MenuDTO menu = menuService.menuDetail(code);

        model.addAttribute("menuDetail", menu);


        return "/menu/detailMenu";
    }

    @GetMapping("update")
    public String menuUpdate() {
        menuService.menuUpdate();

        return "menu/update";
    }
}
