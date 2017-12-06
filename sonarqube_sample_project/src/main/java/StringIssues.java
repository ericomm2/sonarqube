import javax.swing.*;

public class StringIssues {

    String empty;
    public String nonEmpty;

    public static void repeatLiterals(){
        JOptionPane.showMessageDialog(null,"Esse texto esta repetido");
        JOptionPane.showMessageDialog(null,"Esse texto esta repetido");
        JOptionPane.showMessageDialog(null,"Esse texto esta repetido");
        JOptionPane.showMessageDialog(null,"Esse texto esta repetido");
    }

    public StringIssues(){
        empty = new String();
        nonEmpty = new String("Hello World");
    }

    public void worngFormat(){
        this.empty = String.format("The value of my integer is %d", "Hello World");
        //"Hello World" não é um inteiro
        this.nonEmpty = String.format("Not enough arguments %d and %d", 1);
        //O segundo argumento está faltante
    }



    public String toString(){
        return null;
    }
}
