/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hendra;

/**
 *
 * @author User
 */
public class Honda extends Motor{
  public void tampilkan(){
  String bahanbakar ="premium";
  
  String harga ="15000000";
               
       Motor a=new Motor();
       a.inputData("revo","hitam");
      a.tampilkanData();
        
        
         System.out.println("bahanbakar:"+bahanbakar);
         
         System.out.println("harga"+harga);
    }          
}
