/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author Administrator
 */
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape t = new Triangle(8, 12, 13);
        System.out.println("Perimeter dari Triangle: " + t.perimeter());

        Shape c = new Circle(14);
        System.out.println("Perimeter dari Circle: " + c.perimeter());

        Shape r = new Rectangle(6, 12);
        System.out.println("Perimeter dari Rectangle: " + r.perimeter());
}
    }
    

