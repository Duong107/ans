package com.nguyenduong.dev.DAO;

import com.nguyenduong.dev.Enity.*;

import java.util.List;

public class HastagDAO extends EntityDAO<Hastag,Integer>{
    /**
     * save entity
     *
     * @param entity
     */
    @Override
    public void SaveEntity(Hastag entity) {

    }

    /**
     * upadte entity
     *
     * @param entity
     */
    @Override
    public void UpdateEntity(Hastag entity) {

    }

    /**
     * delete entity
     *
     * @param key
     */
    @Override
    public void DeleteEntity(Integer key) {

    }

    /**
     * Select all entity
     */
    @Override
    public List<Hastag> selectAll() {
        return null;
    }

    /**
     * Select all entity by id
     *
     * @param key
     */
    @Override
    public List<Hastag> selectAllbyid(Integer key) {
        return null;
    }

    /**
     * Select one entity by id
     *
     * @param key
     */
    @Override
    public Hastag selectById(Integer key) {
        return null;
    }

    /**
     * Select sql
     *
     * @param sql
     * @param args
     */
    @Override
    protected List<Hastag> selectBySql(String sql, Object... args) {
        return null;
    }
}
