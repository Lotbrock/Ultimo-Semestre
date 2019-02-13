package co.edu.uniBosque.formularios;

import co.edu.uniBosque.Interface;
import co.edu.uniBosque.conexiones.Conexion;
import co.edu.uniBosque.entities.Estudiante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioInicio extends JFrame implements ActionListener {
    private JLabel label1;
    private JButton boton1;
    private JButton boton3;
    private JButton boton2;
    private Formulario form1 = new Formulario();
    public FormularioInicio() throws HeadlessException {
        this.setLocationRelativeTo(null);
        setBounds(20,20,666,666);
        setLayout(null);
        label1 = new JLabel("Universidad del Bosque");
        label1.setBounds(260,10,200,30);
        label1.setSize(500,10);
        add(label1);

        boton1 = new JButton("Registrar estudiate");
        boton1.setBounds(450,600,200,20);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Ver notas de etudiante");
        boton2.setBounds(10,600,200,20);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("Cerrar Aplicacion");
        boton3.setBounds(230,600,200,20);
        add(boton3);
        boton3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1){
            form1.setVisible(true);
            this.setVisible(false);
        }

        if (e.getSource() == boton2){
            FormularioNotas form2 = new FormularioNotas();
            String documento = JOptionPane.showInputDialog(
                    null,"Documento del estudiante",
            JOptionPane.QUESTION_MESSAGE); // el icono sera un iterrogante

            Interface.setDocumento(documento);


            Interface.setEstudiante(Conexion.buscarEstudiante(documento));
            System.out.println(Interface.estudiante.toString());
            form2.setVisible(true);
            this.setVisible(false);
        }

        if (e.getSource()== boton3){
            Conexion.cerrarConexion();
            System.exit(0);
        }
    }
}
