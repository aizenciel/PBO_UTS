/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author Administrator
 */
class Circle extends Shape {
    private double jari;

    public Circle(double jari) {
        this.jari = jari ;
    }

    double perimeter() {
        return 2 * Math.PI * jari;
    }
}


