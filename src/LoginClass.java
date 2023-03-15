
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilan
 */
public class LoginClass {
      public boolean login(HesapClass hesap) {
      
      Scanner scanner = new Scanner(System.in);
      String kullanici_adi;
      String parola;
      
      System.out.print("Kullanici Adi:");
      kullanici_adi = scanner.nextLine();
      
      System.out.print("Parola:");
      parola = scanner.nextLine();
    
      if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
          return true;
      } else {
          return false;
      }
  } 
}
