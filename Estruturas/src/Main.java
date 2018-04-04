
import java.util.Scanner;
import unit.ed1.lista.vetor.ListaVetor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 11645
 */
public class Main {
    public static void main(String[] args) {
     int[] array = {2, 3, 5, 6, 9, 7, 8, 8, 9};
        CountConcurrence co = new CountConcurrence();
        System.out.println(co.count(5, array, 0));
    }
}
