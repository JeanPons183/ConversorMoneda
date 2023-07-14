import java.util.Arrays;

import javax.swing.JOptionPane;

public class Conversion {   

    private int seleccion;

    public static int MenuPrincipal()
        {

            // Menu principal
            // ---------------------------------------------------------------------------------
            String[] seleccion = { "Moneda", "Temperatura", "Distancia" };

            // INFORMATION_MESSAGE type static int?, pero me retorna el String :/

            String tipoSel = (String) JOptionPane.showInputDialog(null,
                                    "Seleccione una opción de conversión", "Menu",
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    null,seleccion, seleccion[0]);

            System.out.println(tipoSel);
            int ase = Arrays.asList(seleccion).indexOf(tipoSel);        // De esta forma obtenemos el valor de la seleccion
            System.out.println(ase);
            

            // ---------------------------------------------------------------------------------

            return ase;
        }

    
}
