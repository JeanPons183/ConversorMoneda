/*
 *  Programa que convierte la moneda de México (Peso Mexicano) a diferentes monedas del munod 
 *    - Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país a Euros
      - Convertir de la moneda de tu país a Libras Esterlinas
      - Convertir de la moneda de tu país a Yen Japonés
      - Convertir de la moneda de tu país a Won sul-coreano

     Del mismo modo debera de hacerse a la inversa
      - Convertir de Dólar a la moneda de tu país
      - Convertir de Euros a la moneda de tu país
      - Convertir de Libras Esterlinas a la moneda de tu país
      - Convertir de Yen Japonés a la moneda de tu país
      - Convertir de Won sul-coreano a la moneda de tu país

     Extras:
        Como desafío extra te animamos a que dejes fluir tu creatividad, si puedo convertir divisas,
        ¿tal vez pueda añadir a mi programa otros tipos de conversiones como temperatura por ejemplo?
 */

import javax.swing.JFrame;

public class modelo extends JFrame
    {
        public static void main(String[] args) 
            {
                boolean continuar = true;

                while(continuar)
                    {
                        // Menu principal
                        // ---------------------------------------------------------------------------------
                        Conversion a = new Conversion();
                        continuar= a.continuar();
                        // ---------------------------------------------------------------------------------                        
                    }
            }
    }
