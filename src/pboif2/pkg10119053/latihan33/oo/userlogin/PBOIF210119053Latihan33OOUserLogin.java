/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan33.oo.userlogin;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menampilkan user login
 */

import java.util.Scanner;
import user.User;

public class PBOIF210119053Latihan33OOUserLogin {
    
    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Username : ");
        usName = input.next();
        System.out.print("Masukkan Password : ");
        passWord = input.next();
        
        User usLog = new User();
        
        usLog.pengecekanLogin(usName, passWord);
    }
    
}
