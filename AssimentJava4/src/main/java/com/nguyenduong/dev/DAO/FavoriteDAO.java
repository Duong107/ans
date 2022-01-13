package com.nguyenduong.dev.DAO;

import com.nguyenduong.dev.Enity.*;

import java.util.List;

public class FavoriteDAO extends EntityDAO<Favorite,Integer>{
    /**
     * save entity
     *
     * @param entity
     */
    @Override
    public void SaveEntity(Favorite entity) {

    }

    /**
     * upadte entity
     *
     * @param entity
     */
    @Override
    public void UpdateEntity(Favorite entity) {

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
    public List<Favorite> selectAll() {
        return null;
    }

    /**
     * Select all entity by id
     *
     * @param key
     */
    @Override
    public List<Favorite> selectAllbyid(Integer key) {
        return null;
    }

    /**
     * Select one entity by id
     *
     * @param key
     */
    @Override
    public Favorite selectById(Integer key) {
        return null;
    }

    /**
     * Select sql
     *
     * @param sql
     * @param args
     */
    @Override
    protected List<Favorite> selectBySql(String sql, Object... args) {
        return null;
    }
}
