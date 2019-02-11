package co.edu.uniBosque.formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioInicio extends JFrame implements ActionListener {
    private JLabel label1;
    private JButton boton1;
    private Formulario form1 = new Formulario();
    public FormularioInicio() throws HeadlessException {
        this.setLocationRelativeTo(null);
        setBounds(20,20,666,666);
        setLayout(null);
        label1 = new JLabel("Universidad del Bosque");
        label1.setBounds(260,10,200,30);
        label1.setSize(500,10);
        add(label1);

        boton1 = new JButton("Ir a notas");
        boton1.setBounds(500,600,120,20);
        add(boton1);
        boton1.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1){
            form1.setVisible(true);
            this.setVisible(false);
        }
    }
}
