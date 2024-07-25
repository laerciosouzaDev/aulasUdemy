
package exe04;
import java.util.Scanner;

public class Exe04 {

   
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("menu: ");
        System.out.println("codigo 1 cachorro quente R$ 4,00. ");
        System.out.println("codigo 2 X salada R$ 4,50. ");
        System.out.println("codigo 3 X bacon R$ 5,00. ");
        System.out.println("codigo 4 torrada simples R$ 2,00. ");
        System.out.println("codigo 5 Refri R$ 1,50: ");
        System.out.println("Digite o codigo para pedido: ");
        
        int codigo = leia.nextInt();
        System.out.println("quantidade: ");
        int quantidade = leia.nextInt();
        
        double total;
        if(codigo == 1){
            total = quantidade * 4.0;
        }else if(codigo == 2){
            total = quantidade * 4.5;
        }else if(codigo == 3){
            total = quantidade * 5.0;
        }else if(codigo == 4){
            total = quantidade * 2.0;
        }else{
            total = quantidade * 1.5;
        }
        System.out.println("total R$ :" + total);
    }
    
}
