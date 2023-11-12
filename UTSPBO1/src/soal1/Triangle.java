/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author Administrator
 */
class Triangle extends Shape {
    private double sisiA;
    private double sisiB;
    private double sisiC;
    
 public Triangle ( double sisiA, double sisiB, double sisiC){
     this.sisiA = sisiA;
     this.sisiB = sisiB;
     this.sisiC = sisiC;
 }
 double perimeter (){
     return sisiA + sisiB + sisiC;
 }
    
    
}
