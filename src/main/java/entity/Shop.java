package entity;

import lombok.Data;

@Data
public class Shop {
    private Long id;
    private String name;
    private String address;
    private String price;
    private Product product;

}
