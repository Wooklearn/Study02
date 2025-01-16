package org.example.restapi.menu.controller;

import lombok.RequiredArgsConstructor;
import org.example.restapi.menu.model.dto.MenuDTO;
import org.example.restapi.menu.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/menu")
public class MenuController {

    private final MenuService service;

    // 메뉴 전체 조회
    @GetMapping("/allList")
    public List<Menu> allList() {

        List<Menu> menuList = service.allList();

        System.out.println("메뉴 전체 조회" + menuList);

        return menuList;
    }

    // 카테고리코드로 메뉴 찾기
    @GetMapping("/menu")
    public String categoryMenuList() {
        return "menu/menu";
    }

    @GetMapping("/category")
    public String categoryMenu(@RequestParam("categoryCode") int categoryCode, Model model) {

        System.out.println("categoryCode = " + categoryCode);

        List<MenuDTO> menuList = service.categoryMenu(categoryCode);

        System.out.println("menuList = " + menuList);

        model.addAttribute("categoryCode", menuList);

        return "menu/menu";
    }
}
