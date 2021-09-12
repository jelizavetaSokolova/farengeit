/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farengeit;

import java.util.Scanner;

/**
 *
 * @author 37253
 */
public class Farengeit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ПЕРЕВОД ТЕМПЕРАТУРЫ ИЗ ЦЕЛЬСИЯ В ФАРЕНГЕЙТ");
        System.out.print("Ввидите значение температуры по Цельсию: ");
        int TC = scanner.nextInt();
        int TF = (TC * 9/5) + 32;
        System.out.println("Температура по Фаренгейту: " +TF  );
    }
    
}
