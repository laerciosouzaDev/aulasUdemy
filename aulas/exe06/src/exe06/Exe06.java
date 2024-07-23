
package exe06;
import java.util.Scanner;

public class Exe06 {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite de 1 a 7 para dias da semana: ");
        int x = leia.nextInt();
        String dia;
        switch(x){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda-feira";
                break;
            case 3:
                dia = "terca-feira";
                break;
            case 4:
                dia = "quarta-feira";
                break;
            case 5:
                dia = "quinta-feira";
                break;
            case 6:
                dia = "sexta-feira";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("dia da semana e: " + dia);
    }
    
}
