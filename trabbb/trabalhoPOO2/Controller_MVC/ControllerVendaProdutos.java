package Controller_MVC;

import View_MVC.TelaVendasProdutos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerVendaProdutos {
    
    
    private TelaVendasProdutos view;
    
     public ControllerVendaProdutos(TelaVendasProdutos view) {
        this.view = view;
        
        view.getjButton3().addActionListener(new VerificaDadosListener());
        view.getjButton2().addActionListener(new ConfirmaEntradaListener());
        
}
     
     class VerificaDadosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String CPFDono;

            CPFDono = view.getjTextPane3().getText();

            JOptionPane.showMessageDialog(null,"Verificado :" + CPFDono);
        }
    }
     
     class ConfirmaEntradaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String CPFDono;

            CPFDono = view.getjTextPane3().getText();

            JOptionPane.showMessageDialog(null,"Verificado :" + CPFDono);
            
            
            
        }
    }
     
     
     
}
