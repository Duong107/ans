package com.nguyenduong.dev.DAO;

import com.nguyenduong.dev.Enity.*;

import java.util.List;

public class UserSubcribleDAO extends EntityDAO<UserSubcrible,Integer>{
    /**
     * save entity
     *
     * @param entity
     */
    @Override
    public void SaveEntity(UserSubcrible entity) {

    }

    /**
     * upadte entity
     *
     * @param entity
     */
    @Override
    public void UpdateEntity(UserSubcrible entity) {

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
    public List<UserSubcrible> selectAll() {
        return null;
    }

    /**
     * Select all entity by id
     *
     * @param key
     */
    @Override
    public List<UserSubcrible> selectAllbyid(Integer key) {
        return null;
    }

    /**
     * Select one entity by id
     *
     * @param key
     */
    @Override
    public UserSubcrible selectById(Integer key) {
        return null;
    }

    /**
     * Select sql
     *
     * @param sql
     * @param args
     */
    @Override
    protected List<UserSubcrible> selectBySql(String sql, Object... args) {
        return null;
    }
}
