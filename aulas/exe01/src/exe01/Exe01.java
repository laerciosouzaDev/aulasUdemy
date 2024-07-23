
package exe01;

import java.util.Scanner;
public class Exe01 {


    public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
         
         System.out.println("Digite um numero e vou dizer se e par ou impar: ");
         
         int num = leia.nextInt();
         
         if(num % 2 == 0){
             System.out.println("Numero par ");
         }else{
             System.out.println("Numero impar");
         }
    }
    
}
