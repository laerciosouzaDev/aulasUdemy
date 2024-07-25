
package exe05;
import java.util.Locale;
import java.util.Scanner;

public class Exe05 {

  
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de minutos: ");
        int minutos = leia.nextInt();
        
        double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100)* 2.0;
        }
        
        System.out.printf("valor da sua conta = R$: %.2f%n ", conta);
        
    }
    
}
