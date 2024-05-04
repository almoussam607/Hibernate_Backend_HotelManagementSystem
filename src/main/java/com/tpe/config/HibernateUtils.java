package com.tpe.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//step 7: HibernateUtils
public class HibernateUtils {

    private static  final SessionFactory sessionFactory;

    static {

        try {
            Configuration  configuration = new Configuration().configure("hibernate.cfg.xml");
//                    .addAnnotatedClass(Hotel.class).addAnnotatedClass(Room.class);

             //  <mapping class="com.tpe.model.Hotel"></mapping>
             //  <mapping class="com.tpe.model.Room"></mapping>
            sessionFactory =configuration.buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("Initialize SessionFactory Create Failed ..  "+ ex);
            throw  new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static  void shutDown(){
        getSessionFactory().close();
    }

    public static void  closeSession(Session session){
        if (session != null && session.isOpen());
        session.close();
    }



}
