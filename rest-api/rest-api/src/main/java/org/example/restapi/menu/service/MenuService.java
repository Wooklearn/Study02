package org.example.restapi.menu.service;

import lombok.RequiredArgsConstructor;
import org.example.restapi.menu.controller.Menu;
import org.example.restapi.menu.model.dao.MenuRepository;
import org.example.restapi.menu.model.dto.MenuDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository repository;
    private final ModelMapper modelMapper;

    // 메뉴 전체조회
    public List<Menu> allList() {

        return repository.findAll();
    }

    public List<MenuDTO> categoryMenu(int categoryCode) {

        List<Menu> categoryMenuList = repository.findByCategoryCode(categoryCode);
        System.out.println("categoryMenuList = " + categoryMenuList);

        return categoryMenuList.stream()
                .map(menu -> modelMapper.map(menu, MenuDTO.class))
                .collect(Collectors.toList());

    }
}
