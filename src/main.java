
import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmNodos VistaNodos = new frmNodos(VistaPrincipal,true);
        Lista NuevaLista = new Lista();
        
        //LEVANTAR EL CONTROLADOR
        nodoController NuevoControlador = new nodoController(VistaPrincipal,VistaNodos,NuevaLista);
    }
    
}
