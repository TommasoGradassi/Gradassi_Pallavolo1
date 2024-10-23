/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gradassi 1
 */
public class Gradassi_pallavolo{
   
    public static void main(String[] args){
        
    Giocatore g1=new Giocatore(1);//non è un thread
    Thread t1=new Thread(g1);//è un thread
    t1.setPriority(Thread.MAX_PRIORITY);
    System.out.println("idGiocatore:"+t1.getId()+",priorita'"+t1.getPriority()+"nome:"+t1.getName());
    t1.start();
    Giocatore g2=new Giocatore(2);
    new Thread(g2,"Tommaso").start();
}
}

