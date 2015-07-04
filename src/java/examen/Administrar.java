/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author TANIA
 */
public class Administrar {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    private static Object HibernateUtilidades;
    
   public static void abrirSesion(){
        factory=HibernateUtilidades.getSessionFactory();
        session= factory.openSession();
        tranza=session.beginTransaction();
    
    }
   // public static void abrirTodo(){
   static{
        factory= HibernateUtilidades .getSessionFactory();
        session= factory.openSession();
        tranza=session.beginTransaction();
    }
    
    public static void cerrarTodo(){
        tranza.commit ();
        session.close();
        
    }
    public DAOAdministracion(){
        
    }
   //Creamos el insert 
    public void guardar(Administracion u)throws Exception{
        //Pner el codigo de guardado
        //Save Hibernate
        //Despues de terminar invocar el método cerrarTodo
       
        session.save(u);
        cerrarTodo();
        
    }
    //Creamos el update
    public void actualizar (Administracion u)throws Exception{
        u=new Administracion();
      
        session.update(u);
        cerrarTodo();
        
    }
    //Creamos el buscarTodos
    public List<Administracion>buscarTodos () throws Exception{
       
        return null;
    }
    
   //Creamos el buscar por ID
    public Administracion buscarPorId(Integer Id)throws Exception{
       
        
        return null;
    }
    //Creamos el autenticar
    public boolean autenticar (Administracion u)throws Exception{
     
        return false;
    }
}