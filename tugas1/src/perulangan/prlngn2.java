/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perulangan;

import java.util.Scanner;
public class prlngn2 {
    public static void main(String[] args) {
        Scanner jumlah=new Scanner(System.in);
        System.out.println("================================");
        System.out.println("||    Perulangan Kalimat      ||");
        System.out.println("================================");
        
        int a;
        System.out.print("Masukkan Jumlah Perulangan (1-20): ");
        a=jumlah.nextInt();
        while(a <= 20){
        System.out.println("Haiiii Teman");
        a++;
        }
        
    }
}
