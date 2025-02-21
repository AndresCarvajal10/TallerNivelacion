import javax.swing.*;

public class Operaciones {
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplica;
    int division;
    public void leerNumeros(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
    }
    public void suma(){
        suma=num1+num2;
    }
    public void resta(){
        resta=num1-num2;
    }
    public void multiplica(){
        multiplica=num1*num2;
    }
    public void division(){
        division=num1/num2;
    }

    public void Resultado (){
        System.out.println("la suma de los 2 numeros es: "+suma);
        System.out.println("la resta de los 2 numeros es: "+resta);
        System.out.println("la multiplicacion de los 2 numeros es: "+multiplica);
        System.out.println("la division de los 2 numeros es: "+division);
    }
}
