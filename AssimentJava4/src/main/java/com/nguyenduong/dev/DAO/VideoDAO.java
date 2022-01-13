package com.nguyenduong.dev.DAO;

import com.nguyenduong.dev.Enity.*;

import java.util.List;

public class VideoDAO extends EntityDAO<Video,Integer>{
    /**
     * save entity
     *
     * @param entity
     */
    @Override
    public void SaveEntity(Video entity) {

    }

    /**
     * upadte entity
     *
     * @param entity
     */
    @Override
    public void UpdateEntity(Video entity) {

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
    public List<Video> selectAll() {
        return null;
    }

    /**
     * Select all entity by id
     *
     * @param key
     */
    @Override
    public List<Video> selectAllbyid(Integer key) {
        return null;
    }

    /**
     * Select one entity by id
     *
     * @param key
     */
    @Override
    public Video selectById(Integer key) {
        return null;
    }

    /**
     * Select sql
     *
     * @param sql
     * @param args
     */
    @Override
    protected List<Video> selectBySql(String sql, Object... args) {
        return null;
    }
}
