
package javaapplication3;

import java.util.Scanner;
public class JavaApplication3 {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        
        System.out.println("Digite um numero inteiro: ");
        int num = leia.nextInt();
        
        if(num < 0){
            System.out.println(num + " numero negativo ");
        }else{
            System.out.println(num + " numero nao negativo ");
        }
            
        
    }
    
}
