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
public class NewSportsmen extends Sportsmen 
implements Warmup,NewInterface{
    int growt;
    public NewSportsmen(String name, int age, int weight,int growt) {
        super(name, age, weight);
        this.growt=growt;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    
    
    public void jump(int t){
        for (int i=0;i<t;i++){
            System.out.print("jump ");
        }
    }
    @Override
    public String warm(int r){
        String result="Я разминаюсь "+r+"часов";
        return result;    
    }
    public String salary(int l){
        String result1="Я зарабатываю "+l+"тысяч рублей";
        return result1;    
    }

    @Override
    public void pullups() {
        System.out.println("я умею отжиматься");
        
    }

    @Override
    public void press() {
        System.out.println("я умею делать пресс");
    }

    @Override
    public int pushups() {
        return 5;
    }

    @Override
    public void on() {
        System.out.println("Работаем");
    }
        
   
    

    
}
