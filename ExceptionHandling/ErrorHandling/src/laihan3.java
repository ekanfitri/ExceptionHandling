/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pramudya Saputra
 */
public class laihan3 {
    public static void main(String[] args) {
         byte[] b = new byte[5];
         System.out.println("Input Bilangan Bulat : ");
         try {
             System.in.read(b);
          }
          catch (java.io.IOException e){
              System.err.println(e);
          }
         String c = new String(b).trim();
          int N = Integer.valueOf(c);
          System.out.println("Hasil : " +(N+2)); 
         }
}
