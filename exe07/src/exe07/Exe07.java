/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe07;

import java.util.Scanner;

public class Exe07 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite de 1 a 7 para dias da semana: ");
        int x = leia.nextInt();
        String dia;
        if(x == 1){
            dia = "domingo";
        }else if(x == 2){
            dia = "segunda-feira";
        }else if(x == 3){
            dia = "terca-feira";
        }else if(x == 4){
            dia = "quarta-feira";
        }else if(x == 5){
            dia = "quinta-feira";
        }else if(x == 6){
            dia = "sexta-feira";
        }else if(x == 7){
            dia = "sabado";
        }else{
            dia = "valor invalido";
        }
        System.out.println("o dia da semana e: " + dia);
    }
    
}
