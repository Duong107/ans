package com.nguyenduong.dev.Utils;
import com.nguyenduong.dev.Enity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
                settings.put(Environment.URL, "jdbc:sqlserver://localhost;database=ASMJAVA4");
                settings.put(Environment.USER, "sa1");
                settings.put(Environment.PASS, "123");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.SQLServer2008Dialect");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO, "none"); //TODO
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Users.class);
                configuration.addAnnotatedClass(Video.class);
                configuration.addAnnotatedClass(Hastag.class);
                configuration.addAnnotatedClass(HastagVideo.class);
                configuration.addAnnotatedClass(Favorite.class);
                configuration.addAnnotatedClass(Comment.class);
                configuration.addAnnotatedClass(UserSubcrible.class);
                configuration.addAnnotatedClass(ImageVideo.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                System.out.println("Hibernate Java Config serviceRegistry created");
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                return sessionFactory;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}

