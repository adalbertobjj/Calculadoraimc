
package calculadoraimc;

import javax.swing.JOptionPane;

/**
 *
 * @author Adalberto
 */
public class Calculadoraimc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        float peso, altura, imc;
        String resp;
        String nome = null;
        
        resp = JOptionPane.showInputDialog("Digite seu nome: ");
        nome = /*String.parseString*/(resp);
        
        resp = JOptionPane.showInputDialog("Digite seu peso aqui: ");
        peso = Float.parseFloat(resp);
        
        resp = JOptionPane.showInputDialog("Digite sua altura aqui: ");
        altura = Float.parseFloat(resp);
        imc = (peso)/(altura*altura);
        
        if (imc < 18.5 ){
            JOptionPane.showMessageDialog(null,"Abaixo do Peso: " + imc);
        } else if (imc >= 18.5 && imc <=24.9) {
          JOptionPane.showMessageDialog(null, "Peso Normal: " + imc);
        }  else if (imc >= 25.0 && imc <=29.9) {
           JOptionPane.showMessageDialog(null, "Sobrepeso: " + imc); 
        } else if (imc >= 30.0 && imc <=34.9) {
           JOptionPane.showMessageDialog(null, "Obesidade grau I: " + imc);  
        } else if (imc >= 35.0 && imc <=39.9) {
           JOptionPane.showMessageDialog(null, "Obesidade grau II: " + imc); 
        } else if (imc <=40.9){
            JOptionPane.showMessageDialog(null, "Obesidade grau III: " + imc );
        } 
        JOptionPane.showMessageDialog(null, "Obrigado: " + nome);
    }
}    