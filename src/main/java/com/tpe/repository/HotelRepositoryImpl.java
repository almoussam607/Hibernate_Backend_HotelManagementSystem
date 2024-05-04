package com.tpe.repository;

import com.tpe.config.HibernateUtils;
import com.tpe.model.Hotel;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HotelRepositoryImpl implements HotelRepository{

    // step 13 b : override the save method ..

    @Override
    public Hotel saveHotel(Hotel hotel) {
         try {
           Session session = HibernateUtils.getSessionFactory().openSession();
           Transaction transaction = session.beginTransaction();

           session.save(hotel);
           transaction.commit();
           //HibernateUtils.closeSession(session);
             session.close();
           return hotel;
         }catch (Exception exception){
             exception.printStackTrace();
         }
        return null;
    }


}
