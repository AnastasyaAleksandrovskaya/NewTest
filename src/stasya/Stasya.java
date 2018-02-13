/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stasya;

/**
 *
 * @author asus
 */
public class Stasya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Sportsmen Saha=new Sportsmen("Saha",18,60);
      Saha.run(7);
      System.out.println( Saha.warm(3));
      NewSportsmen Petya=new NewSportsmen("Petya",19,67,23);
      Petya.jump(3);
      System.out.println(Petya.warm(3));
      Petya.run(4);
      System.out.println(Petya.pushups());
      NewSportsmen2 Lilo=new NewSportsmen2("Lilo",20,68,"Lol");
      Lilo.press();
      
    }
    
}
