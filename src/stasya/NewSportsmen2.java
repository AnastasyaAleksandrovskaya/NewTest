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
public class NewSportsmen2 extends Sportsmen
implements Warmup{
    String surname;
    public NewSportsmen2(String name, int age, int weight,String surname) {
        super(name, age, weight);
        this.surname=surname;
    }
    @Override
    public void run(int x){
        System.out.println("Я иду "+x+" киллометров");
    }
    public void nationality(){
        System.out.println("Я русский");
    }
    public void sport(String s){
        System.out.println("Я занимаюсь: "+s);
    }

    @Override
    public void pullups() {
        System.out.println("hi");
    }

    @Override
    public void press() {
    System.out.println("HII");
    }

    @Override
    public int pushups() {
        return 20;
    }
    
}
