package org.example.restapi.menu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private MenuRepository repository;

    public List<MenuDTO> menulist(int menuCode) {

        return repository.menuList(menuCode);

    }
}
