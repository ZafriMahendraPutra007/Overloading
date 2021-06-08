/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author zafri
 */
public class Overloading {

 public void segitiga1(){
  int alas=10, tinggi=14;
  System.out.println("Luas Segitiga 1 = "+(alas*tinggi)/2);
 }
 
 public void segitiga2(int X, int Y){
  System.out.println("Luas segitiga 2 = "+(X*Y)/2);
 }
 public static void main(String [] args){
  Overloading Segitiga3;
  Segitiga3 = new Overloading();
 Segitiga3.segitiga1();
 Segitiga3.segitiga2(30,6);
    }}
    
