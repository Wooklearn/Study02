package org.example.jpapractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;






import java.util.List;

@Service
public class Menu2Service {

    @Autowired
    private Menu2Repository repository;

    @Transactional
    public List<Menu2> searchMenu(Menu2 menu) {

        return repository.searchMenu(menu);
    }

    public Menu2 categoryMenu() {

        return repository.categoryMenu();
    }


}
