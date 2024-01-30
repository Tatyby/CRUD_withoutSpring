package entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Product {
    private Long id;
    private String name;
    private String category;
    private List<Shop> shops;
}
