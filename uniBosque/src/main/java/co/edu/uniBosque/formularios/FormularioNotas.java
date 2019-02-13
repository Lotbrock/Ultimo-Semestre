package co.edu.uniBosque.formularios;

import co.edu.uniBosque.Interface;
import co.edu.uniBosque.entities.Estudiante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class FormularioNotas extends JFrame implements ActionListener {
    JLabel label1;
    private JButton boton2;
    private FormularioInicio form1 = new FormularioInicio();
  // private Estudiante estudiante = Interface.getEstudiante();
    private String s1;
    //private String identificacion = estudiante.getIdentificacion();

    public FormularioNotas() throws HeadlessException {
        setLayout(null);
        setBounds(20,20,666,666);
        setLocationRelativeTo(null);


        label1 = new JLabel("Universidad del Bosque");
        label1.setBounds(260,10,200,30);
        label1.setSize(500,10);
        add(label1);


        boton2 = new JButton("Volver a inicio");
        boton2.setBounds(10,600,130,20);
        add(boton2);
        boton2.addActionListener(this);

      /*  if(estudiante.getIdentificacion()==null){s1 = estudiante.getIdentificacion();}else {
            s1= ""  ;
        }
*/

        label1 = new JLabel(s1);
        label1.setBounds(260,50,200,30);
        label1.setSize(500,10);
        add(label1);

    }

    public void actionPerformed(ActionEvent e) {

    if (e.getSource() == boton2){
        form1.setLocationRelativeTo(null);
        form1.setVisible(true);
        this.setVisible(false);
    }
    }
}
