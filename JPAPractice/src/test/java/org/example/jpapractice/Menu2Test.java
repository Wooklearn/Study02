package org.example.jpapractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Menu2Test {

    @Autowired
    private Menu2Service service;

    @DisplayName("카테고리 코드를 이용한 메뉴 조회")
    @Test
    void categorySearch() {

        int categoyCode = 4;

        Menu2 menu = new Menu2();
        menu.setCategoryCode(categoyCode);

        service.searchMenu(menu);

        System.out.println("menu = " + menu);
    }


}
