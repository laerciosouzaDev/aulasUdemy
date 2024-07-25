
package exe02;

import java.util.Scanner;

public class Exe02 {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int a = leia.nextInt();
        System.out.println("numero: " +a);
        int b = leia.nextInt();
        System.out.println("numero: " +b);
        
       //(A % B == 0 || B % A == 0)
        //"Se o resto da divisão de A por B for igual a zero, ou o resto da divisão de B por A for igual a zero"
        
        if(a % b == 0 || b % a == 0 ){
            System.out.println("sao multiplos");
        }else{
            System.out.println("nao sao multiplos");
        }
        
        
    }
    
}
