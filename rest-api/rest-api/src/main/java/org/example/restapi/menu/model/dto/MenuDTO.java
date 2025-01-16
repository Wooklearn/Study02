package org.example.restapi.menu.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MenuDTO {

    private int menuCode;
    private String menuName;
    private int menuPrice;
    private CategoryDTO categoryCode;
    private String orderableStatus;

}
