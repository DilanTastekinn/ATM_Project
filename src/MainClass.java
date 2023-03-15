/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dilan
 */
public class MainClass {

   public static void main(String[] args){
  ATMClass atm = new ATMClass();
  HesapClass hesap = new HesapClass("Dilan Nur", "12345", 2000);
  atm.calis(hesap);
      System.out.println("Programdan Çıkılıyor...");
  }
    
}
