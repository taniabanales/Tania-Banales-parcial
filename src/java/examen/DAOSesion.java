/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.websocket.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author TANIA
 */
public class DAOSesion {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    private static Object HibernateUtilidades;
    
    public static void abrirSesion(){
        
        factory = HibernateUtilidades.getSessionFactory();
        session = (Session) factory.openSession();
        tranza = session.beginTransaction();
    
    }
    


}
