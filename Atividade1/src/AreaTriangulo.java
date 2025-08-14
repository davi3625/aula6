import br.com.triangulo.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();



        System.out.println("Entre com as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();



        double areaX = x.area();
        double areaY = y.area();



        System.out.printf("Área do triângulo X: %.3f%n", areaX);
        System.out.printf("Área do triângulo Y: %.3f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Área maior é o triângulo: X");
        } else {
            System.out.println("Área maior é o triângulo: Y");
        }
    }
}
