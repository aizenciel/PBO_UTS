/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author Administrator
 */
class Rectangle extends Shape {
    private double p;
    private double l;

    public Rectangle(double p, double l) {
        this.p = p;
        this.l = p;
    }
    double perimeter() {
        return 2 * (p + l);
    }
}
