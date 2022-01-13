package com.nguyenduong.dev.DAO;

import java.util.List;

public abstract class EntityDAO<E,K> {
    /**
     * save entity
     * @param entity
     */
    abstract public void SaveEntity(E entity);
    /**
     * upadte entity
     * @param entity
     */
    abstract public void UpdateEntity(E entity);
    /**
     * delete entity
     * @param entity
     */
    abstract public void DeleteEntity(K key);
    /**
     * Select all entity
     * @param entity
     */
    abstract public List<E> selectAll();
    /**
     * Select all entity by id
     * @param entity
     */
    abstract public List<E> selectAllbyid(K key);
    /**
     * Select one entity by id
     * @param entity
     */
    abstract public E selectById(K key);
    /**
     * Select sql
     * @param entity
     */
    abstract protected List<E> selectBySql(String sql, Object...args);
}
