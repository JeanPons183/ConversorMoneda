import java.util.Arrays;

import javax.swing.JOptionPane;

public class Temperatura 
    {
        double resultado=0;

        public Temperatura()
            {
                // Entrada de Valor
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad de temperatura que desea convertir:");    

                double valor = Double.valueOf(inputValue);
                // Opciones de Monedas
                // ---------------------------------------------------------------------------------
                String a = "Convertir de Grados Celsius a Fahrenheit";
                String b = "Convertir de Grados Celsius a Kelvin";

                String c = "Convertir de Grados Fahrenheit a Celsius";
                String d = "Convertir de Grados Kelvin a Celsius";

                String e = "Convertir de Grados Kelvin a Fahrenheit";
                String f = "Convertir de Grados Fahrenheit a Kelvin";

                Object[] conversion = {a,b,c,d,e,f};
                Object conversionSel = JOptionPane.showInputDialog(null,
                            "Elije opción de conversión", "Conversión",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            conversion, conversion[0]);
                // ---------------------------------------------------------------------------------
                int Sel = Arrays.asList(conversion).indexOf(conversionSel);

                switch (Sel) 
                    {
                        case 0:
                            //C - F
                            resultado = (valor-32)/1.8;
                            JOptionPane.showMessageDialog(null, "Temperatura de  " + resultado + " °F", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                    
                        case 1:
                            // C - K
                            resultado = valor + 273.15;
                            JOptionPane.showMessageDialog(null, "Temperatura de  " + resultado + " °K", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;

                        case 2:
                            // F - C
                            resultado = valor*1.8+32;
                            JOptionPane.showMessageDialog(null, "Temperatura de  " + resultado + " °C", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;

                        case 3:
                            // K - C
                            JOptionPane.showMessageDialog(null, "Temperatura de  " + resultado + " °C", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            resultado = valor - 273.15;
                            break;

                        case 4: 
                            // K - F
                            resultado = 1.8*(valor-273.15) + 32;
                            JOptionPane.showMessageDialog(null, "Temperatura de  " + resultado + " °F", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;

                        case 5:
                            // F - K
                            resultado = (valor - 32)/1.8+273.15;
                            JOptionPane.showMessageDialog(null, "Temperatura de  " + resultado + " °K", 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
                            break;
                    }
            }
    }