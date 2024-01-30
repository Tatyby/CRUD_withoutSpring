package repository;

import entity.Shop;

import java.util.List;

/**
 * Интерфейс репозитория магазинов
 */
public interface ShopRepository {
    /**
     * Поиск всех магазинов
     *
     * @return список всех магазинов
     */
    List<Shop> findAll();

    /**
     * Поиск магазина по его id
     *
     * @param id магазина
     * @return сущность Shop
     */
    Shop findById(Long id);

    /**
     * Сохраняет сущность магазинf в базу данных
     *
     * @param shop
     */
    void save(Shop shop);

    /**
     * Обновляет магазин в базе данных
     *
     * @param shop
     */
    void update(Shop shop);

    /**
     * Удаляет магазин из базы данных по его id
     *
     * @param id магазина
     */
    void delete(Long id);
}
