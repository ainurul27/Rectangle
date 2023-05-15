/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Luas persegi panjang: " + area);
        System.out.println("Keliling persegi panjang: " + perimeter);
    }
}

   
