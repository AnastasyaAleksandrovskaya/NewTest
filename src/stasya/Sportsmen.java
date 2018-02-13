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
public class Sportsmen {
    public String name;
    public int age;
    public int weight;
    public Sportsmen(int weight, int age){
        this.age=age;
        this.weight=weight;
    }
    public Sportsmen(String name,int age,int weight){
        this(age,weight);
        this.name=name;
    }
    
    public void run(int x){
        System.out.println("Я пробегаю "+x+" киллометров");
    }
    public String warm(int r){
        String result="Я разминаюсь "+r+"часов";
        return result;    
    }
        
    }

