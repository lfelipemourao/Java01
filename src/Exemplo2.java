import java.util.jar.Manifest;

import javax.swing.JOptionPane;

public class Exemplo2 {
   public static void main(String[] args) {
 //Ler o valor de um produto 
  double valor =  Double.parseDouble(JOptionPane.showInputDialog("qual o valor do produto?"));
  JOptionPane.showMessageDialog(null,"valor é : "+ valor);
       if (valor<0){
       JOptionPane.showMessageDialog(null, "negado!!"); }
       else if(valor<500){
        JOptionPane.showMessageDialog(null, "alto custo!");
    }
    else{
        JOptionPane.showMessageDialog(null, "baixo custo!");
    }
}
}