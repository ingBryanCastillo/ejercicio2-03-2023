/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class nodoController implements ActionListener {
    //LEVANTAR FRMPRINCIPAL
    frmPrincipal VistaPrincipal;
    frmNodos VistaNodos;
    Lista nuevaLista;

    public nodoController(frmPrincipal VistaPrincipal, frmNodos VistaNodos, Lista nuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaNodos = VistaNodos;
        this.nuevaLista = nuevaLista;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnAgregarNodo.addActionListener(this);
        
        
        
        //LEVANTAR VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() ==this.VistaPrincipal.btnAgregarNodo);
    
        //ABRIR LA VISTA NODOS 
          //PONER A LA ESCUCHA LOS BOTONES DE LA VISTA NODOS
        this.VistaNodos.btnAplilar.addActionListener(this);
        this.VistaNodos.btnEncolar.addActionListener(this);
        this.VistaNodos.btnAplilar.addActionListener(this);
        //LEVANTAR EL FORMULARIO LISTA NODOS
        this.VistaNodos.setLocationRelativeTo(null);
        this.VistaNodos.setVisible(true);
        
        if(e.getSource() == this.VistaNodos);
    {
        this.nuevaLista.Apilar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
        this.VistaNodos.txtLista.setText(this.nuevaLista.Listar());
    }
    }
   
}
