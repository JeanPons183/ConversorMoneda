// *    - Convertir de la moneda de tu país a Dólar
//       - Convertir de la moneda de tu país a Euros
//       - Convertir de la moneda de tu país a Libras Esterlinas
//       - Convertir de la moneda de tu país a Yen Japonés
//       - Convertir de la moneda de tu país a Won sul-coreano

//      Del mismo modo debera de hacerse a la inversa
//       - Convertir de Dólar a la moneda de tu país
//       - Convertir de Euros a la moneda de tu país
//       - Convertir de Libras Esterlinas a la moneda de tu país
//       - Convertir de Yen Japonés a la moneda de tu país
//       - Convertir de Won sul-coreano a la moneda de tu país

import javax.swing.JOptionPane;

public class Moneda 
    {
        private double mx2dll = 0.059;
        private double mx2eur = 0.054;
        private double mx2lib = 0.046;
        private double mx2yen = 8.340;
        private double mx2won = 75.47;

        public Moneda()
            {
                // Entrada de Valor
                String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir:");    

                // Opciones de Monedas
                // ---------------------------------------------------------------------------------
                String a = "Convertir de Peso Mexicano a Dólar";
                String b = "Convertir de Peso Mexicano a Euros";
                String c = "Convertir de Peso Mexicano a Libras Esterlinas";
                String d = "Convertir de Peso Mexicano a Yen Japonés";
                String e = "Convertir de Peso Mexicano a Won sul-coreano";

                String f = "Convertir de Dólar a Peso Mexicano";
                String g = "Convertir de Euros a Peso Mexicano";
                String h = "Convertir de Libras Esterlinas a Peso Mexicano";
                String i = "Convertir de Yen Japonés a Peso Mexicano";
                String j = "Convertir de Won sul-coreano a Peso Mexicano";

                Object[] conversion = {a,b,c,d,e,f,g,h,i,j};
                Object conversionSel = JOptionPane.showInputDialog(null,
                            "Elije opción de conversión", "Conversión",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            conversion, conversion[0]);
                // ---------------------------------------------------------------------------------

                // Valor de la conversión
                JOptionPane.showMessageDialog(null, "Tienes " + 3 + " " + conversionSel, 
                                            "Conversión", JOptionPane.INFORMATION_MESSAGE); 
            }
        
        
    }
