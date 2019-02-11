package co.edu.uniBosque.formularios;

import co.edu.uniBosque.conexiones.Conexion;
import co.edu.uniBosque.entities.Estudiante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Formulario extends JFrame implements ActionListener {
    Estudiante est1 =new Estudiante();
    private JLabel label1;
    private JLabel label2;
    private JTextField caja1;
    private JLabel label3;
    private JTextField caja2;
    private JLabel label4;
    private JTextField caja3;
    private JLabel label5;
    private JTextField caja4;
    private JLabel label6;
    private JTextField caja5;
    private JButton boton1;
    private JButton boton2;
    public Formulario() throws HeadlessException {
        setLayout(null);
        setBounds(20,20,666,666);
        this.setLocationRelativeTo(null);
        label1 = new JLabel("Universidad del Bosque");
        label1.setBounds(260,10,200,30);
        label1.setSize(500,10);
        add(label1);

        label2 = new JLabel("Cálculo lineal 1:");
        label2.setBounds(10,60,200,20);
        add(label2);
        caja1 = new JTextField();
        caja1.setBounds(150,58,80,20);
        add(caja1);


        label3 = new JLabel("Fisica 1:");
        label3.setBounds(10,100,200,20);
        add(label3);
        caja2 = new JTextField();
        caja2.setBounds(150,98,80,20);
        add(caja2);


        label4 = new JLabel("Mecanica 1:");
        label4.setBounds(10,130,200,20);
        add(label4);
        caja3 = new JTextField();
        caja3.setBounds(150,128,80,20);
        add(caja3);


        label5 = new JLabel("Algoritmia 1:");
        label5.setBounds(10,170,200,20);
        add(label5);
        caja4 = new JTextField();
        caja4.setBounds(150,168,80,20);
        add(caja4);


        label6 = new JLabel("Ingles 1:");
        label6.setBounds(10,210,200,20);
        add(label6);
        caja5 = new JTextField();
        caja5.setBounds(150,208,80,20);
        add(caja5);


        boton1 = new JButton("Aceptar");
        boton1.setBounds(560,600,80,20);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Volver a inicio");
        boton2.setBounds(10,600,130,20);
        add(boton2);
        boton2.addActionListener(this);


    }
    /*private float sumarNotas(){
        float suma =
        return suma;
    }*/

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton2){

            FormularioInicio form1 = new FormularioInicio();
            form1.setVisible(true);
            this.setVisible(false);
        }

        if (e.getSource() == boton1) {

            //Se abre conexion para hacer uso de la base de datos
            Conexion.abrirConexion();
                String cad1 = caja1.getText();
                est1.setMateria1(Float.parseFloat(cad1));

                cad1 = caja2.getText();
                est1.setMateria2(Float.parseFloat(cad1));

                cad1 = caja3.getText();
                est1.setMateria3(Float.parseFloat(cad1));

                cad1 = caja4.getText();
                est1.setMateria4(Float.parseFloat(cad1));

                cad1 = caja5.getText();
                est1.setMateria5(Float.parseFloat(cad1));

                est1.setPromedio();

                Conexion.guardarEstudiante(est1);//Guarda el estudiante
                Conexion.cerrarConexion();
/*
                String cadena1 = est1.sacarPromedio().toString();

                JOptionPane.showMessageDialog(null, cadena1 + "\\" + est1.escribirPromedio(cadena1));*/

                // setTitle(est1.escribirPromedio(cadena1));

            }

    }
}
