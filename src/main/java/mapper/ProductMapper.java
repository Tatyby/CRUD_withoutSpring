package mapper;

import dto.ProductDTO;
import entity.Product;

public interface ProductMapper {
    /**
     * конвертация из сущности в дто
     *
     * @param product сущность Product
     * @return ProductDTO
     */
    static ProductDTO toDTO(Product product) {
        return null;
    }

    Product toEntity(ProductDTO productDTO);
}
