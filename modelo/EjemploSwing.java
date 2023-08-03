// import java.awt.GridBagLayout;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import javax.swing.JTextArea;

public class EjemploSwing 
    {
        public static void main(String[] args)
            {
                // // componente JFrame
                // JFrame miJFrame = new JFrame("Ejemplo - Java Swing");
                // miJFrame.setSize(500,300);

                // // componente JPanel`

                // JPanel miJPanel = new JPanel();

                // miJPanel.setSize(300, 300);

                // // usamos este diseño para centrar los componentes de JPanel`

                // miJPanel.setLayout(new GridBagLayout());

                // // componente JTextField`

                // JLabel miJLabel = new JLabel();

                // miJLabel.setText("Dime tu opinión acerca de Java Swing:  ");

                // // componente JTextArea

                // JTextArea miJTextArea = new JTextArea(5,20);

                // // conecta los componentes JLabel y JTextField en JPanel`

                // miJPanel.add(miJLabel);

                // miJPanel.add(miJTextArea);

                // // conectar Jpanel a JFrame`

                // miJFrame.add(miJPanel);

                // // hacer visible JFrame

                // miJFrame.setVisible(true);
                // //Hoola
                
                // Esto es para cuando queramos decir algun mensaje, y el icono se mueve por estos tipos
                // ERROR_MESSAGE
                // INFORMATION_MESSAGE
                // WARNING_MESSAGE
                // QUESTION_MESSAGE
                // PLAIN_MESSAGE

                // JOptionPane.showMessageDialog(null, "Esto es el mensaje que sale", "Probanding", JOptionPane.INFORMATION_MESSAGE); 

                // JOptionPane.showInternalMessageDialog(frame, "information",
                                                // "information", JOptionPane.INFORMATION_MESSAGE);

                // // Para preguntarle si desea continuar
                // Object[] options = { "OK", "CANCEL" };
                // JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
                // JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                // null, options, options[0]);
                // System.out.println();
                // int a = JOptionPane.showConfirmDialog(null,
                // "Desea continuar", "", JOptionPane.YES_NO_OPTION);
                // System.out.println(a);
                
                // // Esto es entrada de texto
                // String inputValue = JOptionPane.showInputDialog("Please input a value");    
                
                // // Es un menu desplegable con los posibles valores
                // Object[] possibleValues = { "First", "Second", "Third" };
                // Object selectedValue = JOptionPane.showInputDialog(null,
                //             "Choose one", "Input",
                //             JOptionPane.INFORMATION_MESSAGE, null,
                //             possibleValues, possibleValues[0]);
            }
    }
