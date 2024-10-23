/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author B045_02
 */
public class Giocatore implements Runnable {
    private int numeropassaggi;
     public int id;
    
    public Giocatore(int id){
        numeropassaggi=0;
        this.id=id;
    }
  
    public void run(){
        
      while(true){
          System.out.println("id: " + id + " Numero passaggi:"+ numeropassaggi);
          numeropassaggi++;
          Thread.currentThread().yield();
      }
  }
}