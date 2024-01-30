package repository;

import entity.Product;

import java.util.List;

/**
 * Интерфейс репозитория продуктов
 */
public interface ProductRepository {
    /**
     * Поиск всех продуктов
     *
     * @return список всех продуктов
     */
    List<Product> findAll();

    /**
     * Поиск продукта по его id
     *
     * @param id продукта
     * @return сущность Product
     */
    Product findById(Long id);

    /**
     * Сохраняет сущность продукта в базу данных
     *
     * @param product
     */
    void save(Product product);

    /**
     * Обновляет продукт в базе данных
     *
     * @param product
     */
    void update(Product product);

    /**
     * Удаляет продукт из базы данных по его id
     *
     * @param id продукта
     */
    void delete(Long id);
}
