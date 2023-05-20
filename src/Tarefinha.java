import javax.swing.JOptionPane;

public class Tarefinha {
    public static void main(String[] args) {
        int salário = Integer.parseInt(JOptionPane.showInputDialog("qual seu salário?"));
       JOptionPane.showMessageDialog(null,"sua salário é: "+ salário);
       if (salário>1320){
       JOptionPane.showMessageDialog(null, "Acima do minimo!!"); }

     else if(salário<1320 && salário > 0){
        JOptionPane.showMessageDialog(null, "Abaixo do minimo");
}
else if(salário<0 ){

    JOptionPane.showMessageDialog(null, "trabalho escravo");
}
}
}