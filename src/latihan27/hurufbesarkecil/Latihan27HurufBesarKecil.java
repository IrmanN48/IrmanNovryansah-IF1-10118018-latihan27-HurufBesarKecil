/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk mengubah huruf besar atau kecil dari 
 *                     suatu kalimat.
 */
public class Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //deklarasi variabel
        String kalimat;
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        //input
        System.out.printf("Masukkan Kalimat : ");
        kalimat = scanner.nextLine();
        
        //proses mengubah huruf besar atau kecil
        String kalimat1 = kalimat.toUpperCase();
        String kalimat2 = kalimat.toLowerCase();
        
        //output
        System.out.println("========Hasil Formatting======");
        System.out.println("Huruf Besar : "+kalimat1);
        System.out.println("Huruf Kecil : "+kalimat2);     
}

}