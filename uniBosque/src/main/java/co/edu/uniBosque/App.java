package co.edu.uniBosque;

import co.edu.uniBosque.formularios.ContentPane;
import co.edu.uniBosque.formularios.Formulario;

import java.awt.*;

import static java.awt.Color.green;
import static java.awt.Color.orange;

public class App {
    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        ContentPane glass = new ContentPane();
        formulario1.setBackground(green);
        formulario1.setBounds(10, 10, 500, 700);
        formulario1.setEnabled(true);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setGlassPane(glass);
    }
}
