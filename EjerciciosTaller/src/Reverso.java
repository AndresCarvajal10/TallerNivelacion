import javax.swing.*;

public class Reverso {

    private String text;
    public void reversed(){
        text = JOptionPane.showInputDialog("Escriba una palabra");
        StringBuilder textReversed = new StringBuilder(text);
        System.out.println("La palabra en reservo es: "+ textReversed.reverse());
    }
}
