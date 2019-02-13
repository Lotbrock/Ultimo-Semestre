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
    private JTextField caja1;
    private JTextField caja2;
    private JTextField caja3;
    private JTextField caja4;
    private JTextField caja5;
    private JTextField caja6;
    private JTextField caja7;
    private JTextField caja8;
    private JTextField caja9;
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



        label1 = new JLabel("Nombre");
        label1.setBounds(10,60,200,20);
        add(label1);
        caja6 = new JTextField();
        caja6.setBounds(150,58,80,20);
        add(caja6);

        label1 = new JLabel("Apellido:");
        label1.setBounds(10,100,200,20);
        add(label1);
        caja7 = new JTextField();
        caja7.setBounds(150,98,80,20);
        add(caja7);

        label1 = new JLabel("Documento");
        label1.setBounds(10,140,200,20);
        add(label1);
        caja8 = new JTextField();
        caja8.setBounds(150,138,80,20);
        add(caja8);

        label1 = new JLabel("Carrera");
        label1.setBounds(10,180,200,20);
        add(label1);
        /*caja9 = new JTextField();
        caja9.setBounds(150,178,80,20);
        add(caja9);*/


        /*---------------------------------MATERIAS-------------*/
        label1 = new JLabel("Cálculo lineal 1:");
        label1.setBounds(330,60,200,20);
        add(label1);
        caja1 = new JTextField();
        caja1.setBounds(500,58,80,20);
        add(caja1);


        label1 = new JLabel("Fisica 1:");
        label1.setBounds(330,100,200,20);
        add(label1);
        caja2 = new JTextField();
        caja2.setBounds(500,98,80,20);
        add(caja2);


        label1 = new JLabel("Mecanica 1:");
        label1.setBounds(330,140,200,20);
        add(label1);
        caja3 = new JTextField();
        caja3.setBounds(500,138,80,20);
        add(caja3);


        label1 = new JLabel("Algoritmia 1:");
        label1.setBounds(330,180,200,20);
        add(label1);
        caja4 = new JTextField();
        caja4.setBounds(500,178,80,20);
        add(caja4);


        label1 = new JLabel("Ingles 1:");
        label1.setBounds(330,220,200,20);
        add(label1);
        caja5 = new JTextField();
        caja5.setBounds(500,218,80,20);
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
            form1.setLocationRelativeTo(null);
            form1.setVisible(true);
            this.setVisible(false);
        }

        if (e.getSource() == boton1) {
            FormularioInicio form2 = new FormularioInicio();

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

                cad1 = caja6.getText();
                est1.setNombre(cad1);


                cad1 = caja7.getText();
                est1.setApellido(cad1);


                cad1 = caja8.getText();
                est1.setIdentificacion(cad1);


                est1.setPromedio();

                Conexion.guardarEstudiante(est1);//Guarda el estudiante

                form2.setVisible(true);
                this.setVisible(false);
/*
                String cadena1 = est1.sacarPromedio().toString();

                JOptionPane.showMessageDialog(null, cadena1 + "\\" + est1.escribirPromedio(cadena1));*/

                // setTitle(est1.escribirPromedio(cadena1));

            }

    }
}
