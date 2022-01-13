package com.nguyenduong.dev.DAO;

import com.nguyenduong.dev.Enity.*;
import com.nguyenduong.dev.Utils.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.*;

public class UserDAO extends EntityDAO<Users,Integer>{
    private String selectall ="SELECT o FROM Users o";
    /**
     * save entity
     *
     * @param entity
     */
    @Override
    public void SaveEntity(Users entity) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            // save the student object
            session.save(entity);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        };
    }

    /**
     * upadte entity
     *
     * @param entity
     */
    @Override
    public void UpdateEntity(Users entity) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(entity);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * delete entity
     *
     * @param key
     */
    @Override
    public void DeleteEntity(Integer key) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // Delete a user object
            if (key != null) {
                Users users = session.find(Users.class,key);
                session.delete(users);
                System.out.println("user is deleted");
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Select all entity
     */
    @Transactional
    @Override
    public List<Users> selectAll() {
        Transaction transaction = null;
        List <Users> listOfUser = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            listOfUser = session.createQuery("from Users").getResultList();
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                e.printStackTrace();
            }
        }
        return listOfUser;
    }

    /**
     * Select all entity by id
     *
     * @param key
     */
    @Override
    public List<Users> selectAllbyid(Integer key) {
        return null;
    }

    /**
     * Select one entity by id
     *
     * @param key
     */
    @Override
    public Users selectById(Integer key) {

        Transaction transaction = null;
        Users user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = session.get(Users.class, key);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return user;
    }

    /**
     * Select sql
     *
     * @param sql
     * @param args
     */
    @Override
    protected List<Users> selectBySql(String sql, Object... args) {
        return null;
    }
}
