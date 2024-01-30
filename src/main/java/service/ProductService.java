package service;

import dto.ProductDTO;

import java.util.List;

/**
 * Сервис для работы с сущностью Product
 */
public interface ProductService {
    List<ProductDTO> getAllProduct();

    ProductDTO getProductById(Long id);

    void createProduct(ProductDTO productDTO);

    void updateProduct(Long id, ProductDTO productDTO);

    void deleteProduct(Long id);
}
