package com.nguyenduong.dev.DAO;

import com.nguyenduong.dev.Enity.*;

import java.util.List;

public class ImageVideoDAO extends EntityDAO<ImageVideo,Integer>{
    /**
     * save entity
     *
     * @param entity
     */
    @Override
    public void SaveEntity(ImageVideo entity) {

    }

    /**
     * upadte entity
     *
     * @param entity
     */
    @Override
    public void UpdateEntity(ImageVideo entity) {

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
    public List<ImageVideo> selectAll() {
        return null;
    }

    /**
     * Select all entity by id
     *
     * @param key
     */
    @Override
    public List<ImageVideo> selectAllbyid(Integer key) {
        return null;
    }

    /**
     * Select one entity by id
     *
     * @param key
     */
    @Override
    public ImageVideo selectById(Integer key) {
        return null;
    }

    /**
     * Select sql
     *
     * @param sql
     * @param args
     */
    @Override
    protected List<ImageVideo> selectBySql(String sql, Object... args) {
        return null;
    }
}
