/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ControladorModificar implements ActionListener{
    private JTextField txtnombre;
    private JTextField txtapellido;

    @Override
    public void actionPerformed(ActionEvent e) {
       txtnombre.transferFocus();
       txtapellido.transferFocus();
       txtnombre.transferFocus();
    }
    
    
}
