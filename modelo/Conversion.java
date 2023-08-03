import java.util.Arrays;

import javax.swing.JOptionPane;

public class Conversion 
    {   
        public Conversion()
            {

                // Menu principal
                // ---------------------------------------------------------------------------------
                String[] seleccion = { "Moneda", "Temperatura", "Distancia" };

                // INFORMATION_MESSAGE type static int?, pero me retorna el String :/

                String tipoSel = (String) JOptionPane.showInputDialog(null,
                                        "Seleccione una opción de conversión", "Menu",
                                        JOptionPane.INFORMATION_MESSAGE, 
                                        null,seleccion, seleccion[0]);

                int ase = Arrays.asList(seleccion).indexOf(tipoSel);        // De esta forma obtenemos el valor de la seleccion
                
                switch(ase)
                    {
                        case 0:
                            new Moneda();

                        case 1:
                        new Temperatura();

                        case 2:
                            new Distancia();
                    }
            }
            
            public boolean continuar()
                {
                    int a = JOptionPane.showConfirmDialog(null,
                    "Desea continuar", "", JOptionPane.YES_NO_OPTION);
                    
                    if (a!=0)
                        {
                            JOptionPane.showMessageDialog(null, "Saliendo del programa", "Salida", JOptionPane.INFORMATION_MESSAGE); 
                            return false;
                        }
                    else
                        return true;
                }
    }
