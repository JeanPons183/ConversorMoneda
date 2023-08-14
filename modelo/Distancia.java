import java.util.Arrays;

import javax.swing.JOptionPane;

public class Distancia 
    {
        private double km2milla = 1.609;
        private double m2yarda = 0.9114;
        private double cm2pulgada = 2.54;
        private double cm2pie = 30.48;
        double resultado = 0;

        public Distancia()
            {
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad de distancia que desea convertir:");    

                Double valor;
                try 
                    {
                        valor = Double.valueOf(inputValue);
                    } 
                catch (java.lang.NumberFormatException e) 
                    {
                        JOptionPane.showMessageDialog(null, "Solo debes de ingresar digitos", "Excepcion catch", JOptionPane.ERROR_MESSAGE); 
                        inputValue = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir:");
                    }
                valor = Double.valueOf(inputValue);
                // Opciones de Monedas
                // ---------------------------------------------------------------------------------
                String a = "Convertir de Kilometros a Millas";
                String b = "Convertir de Metros a Yardas";
                String c = "Convertir de Centimetros a Pulgadas";
                String d = "Convertir de Centimetros a Pies";

                String e = "Convertir de Millas a Kilometros";
                String f = "Convertir de Yardas a Metros";
                String g = "Convertir de Pulgadas a Centimetros";
                String h = "Convertir de Pies a Centimetros";
                
                Object[] conversion = {a,b,c,d,e,f,g,h};
                Object conversionSel = JOptionPane.showInputDialog(null,
                            "Elije opción de conversión", "Conversión",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            conversion, conversion[0]);
                int Sel = Arrays.asList(conversion).indexOf(conversionSel);

                switch(Sel)
                    {
                        case 0:
                            // Resultado Kilometros a Millas
                            resultado = valor*km2milla;
                            JOptionPane.showMessageDialog(null, "La conversion es de " + String.format("%.2f", resultado) + " Millas", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                        case 1:
                            // Resultado Euros Pesos
                            resultado = valor*m2yarda;
                            JOptionPane.showMessageDialog(null, "La conversion es de " + String.format("%.2f", resultado) + " Yardas", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                        case 2:
                            // Resultado libras Pesos
                            resultado = valor*cm2pulgada;
                            JOptionPane.showMessageDialog(null, "La conversion es de " + String.format("%.2f", resultado) + " Pulgadas",  
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                        case 3:
                            // Yen Pesos
                            resultado = valor*cm2pie;
                            JOptionPane.showMessageDialog(null, "La conversion es de " + String.format("%.2f", resultado) + " Pies", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                        case 4:
                            // Resultado Kilometros a Millas
                            resultado = valor/km2milla;
                            JOptionPane.showMessageDialog(null, "La conversion es de " + String.format("%.2f", resultado) + " Kilometros", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                        case 5:
                            // Resultado Euros Pesos
                            resultado = valor/m2yarda;
                            JOptionPane.showMessageDialog(null, "La conversion es de " + String.format("%.2f", resultado) + " Metros", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                        case 6:
                            // Resultado libras Pesos
                            resultado = valor/cm2pulgada;
                            JOptionPane.showMessageDialog(null, "La conversion es de " + String.format("%.2f", resultado) + " Centimetros",  
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                        case 7:
                            // Yen Pesos
                            resultado = valor/cm2pie;
                            JOptionPane.showMessageDialog(null, "La conversion es de " + String.format("%.2f", resultado) + " Centimetros",  
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                    }                
            }

    }