import java.security.MessageDigest;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Olá, mudo!!!");
       String nome = JOptionPane.showInputDialog("qual seu nome ?");                                 
        JOptionPane.showMessageDialog(null,"seu nome é:  "+nome);
       int idade = Integer.parseInt(JOptionPane.showInputDialog("qual sua idade?"));
       JOptionPane.showMessageDialog(null,"sua idade é: "+ idade);
       if (idade<18){
       JOptionPane.showMessageDialog(null, "negado!!"); }
       else{
        JOptionPane.showMessageDialog(null, "autorizado!");
    }
        
        
    }
}
