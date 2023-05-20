import javax.swing.JOptionPane;

public class Exemplo3 {
   public static void main(String[] args) {

String opc = JOptionPane.showInputDialog("informe um curso:\n 1-java \n 2-javascript");
opc = opc.toLowerCase();

        if(opc.equals("1")|| opc.equals("java")){
            JOptionPane.showMessageDialog(null, "Curso de beckend");
        }

        else if(opc.equals("2")|| opc.equals("javascript")){
            JOptionPane.showMessageDialog(null, "Curso de frontend");
        }
else {JOptionPane.showMessageDialog(null, "Curso negado");

}

   } 
}
