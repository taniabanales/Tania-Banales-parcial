/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author TANIA
 */
public class Prueba {
    private static Object HibernateUtilidades;
    public static void main(String[] args) {
        System.out.print("Probaremos todas las operaciones SQL");
    //Primer paso para creal El Session Factory
        SessionFactory factory=HibernateUtilidades.getSessionFactory();
        
        //obtenemos la apertura actual
        Session sesion=factory.openSession();
        
        //creamos la transaccion
    Transaction tranza=sesion.beginTransaction();
   
    }
}
    
    

