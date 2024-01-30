package service;

import dto.ProductDTO;
import entity.Product;
import lombok.AllArgsConstructor;
import mapper.ProductMapper;
import repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
        public ProductDTO getProductById(Long id) {
        return null;
    }

    @Override
    public void createProduct(ProductDTO productDTO) {

    }

    @Override
    public void updateProduct(Long id, ProductDTO productDTO) {

    }

    @Override
    public void deleteProduct(Long id) {

    }
}
