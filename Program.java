package application;

import entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle x;
    x = new Rectangle();
    
    
    
    System.out.println("Enter rectangle width and height: ");
    x.Widht = sc.nextDouble();
    x.Height = sc.nextDouble();
    System.out.printf("Area = %.2f%n",x.Area());
    System.out.printf("Perimetro = %.2f%n",x.Perimeter());
    System.out.printf("Diagonal = %.2f%n",x.Diagonal());


    sc.close();
  }
}
