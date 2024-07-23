
package exe03;
import java.util.Scanner;

public class Exe03 {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("digite a hora inicial do jogo: ");
        int horaInicio = leia.nextInt();
        
        System.out.println("Digite a hora final do jogo: ");
        int horaFinal = leia.nextInt();
        
        int duracao;
        
        if(horaInicio < horaFinal ){
            duracao = horaFinal - horaInicio;
        }else{
            duracao = 24 - horaInicio + horaFinal;  
            
            System.out.println("O jogo durou: " +duracao + "Hora(S): ");
        }
    }
    
}
