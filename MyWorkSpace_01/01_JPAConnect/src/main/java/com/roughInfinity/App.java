package com.roughInfinity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ModelClass.MenuCard;

public class App 
{
    public static void main( String[] args )
    {
        MenuCard card = new MenuCard(101, "French Fries", 40.23);
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager manager =  factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(card);
        manager.getTransaction().commit();
        
        MenuCard result =  manager.find(MenuCard.class, card.getMenuId()); 
        System.out.println(result.getMenuId() + " , "+result.getMenuName()+ " , "+result.getMenuPrice());
        
        manager.getTransaction().begin();
        result.setMenuName("Mc Spicy Chicken Burger");
        result.setMenuPrice(130.2);
        manager.merge(result);
        manager.getTransaction().commit();
        
        MenuCard result2 =  manager.find(MenuCard.class, card.getMenuId()); 
        System.out.println(result2.getMenuId() + " , "+result2.getMenuName()+ " , "+result2.getMenuPrice());
        
        manager.getTransaction().begin();
        manager.remove(result2);
        manager.getTransaction().commit();
        

        System.out.println("record is removed");
    }
}
