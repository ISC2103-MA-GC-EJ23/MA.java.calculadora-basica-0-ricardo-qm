/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculadora;

public class App {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("CALCULADORA ARITMETICA");
        System.out.println("======================");

        System.out.println("5+3="+c.sumar(5, 3));
        System.out.println("2*3="+c.multiplicar(2, 3));
    }
}
