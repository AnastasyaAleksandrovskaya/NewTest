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
public class NewClass {
    public static void main(String [] args){
        int n=0;
        String [] s=new String [] {"abc","sfdn","jsd","dfg"};
        char[] ch;
        for(String x:s){
            ch=x.toCharArray();
            n = 0;
            for(int i=0;i<ch.length - 1;i++){
                if (ch[i]<=ch[i+1]){
                    n+=1;
                    if(n==ch.length-1){
                        System.out.println(x);
                    }
                }
            }
        
        }
                
    }
}
