package co.edu.uniBosque;

import co.edu.uniBosque.formularios.FormularioInicio;

public class Interface {
    private static String documento;
    public static void main(String[] args) {
        FormularioInicio interfaece = new FormularioInicio();
        //interfaece.setBounds(20,20,666,666);
        interfaece.setVisible(true);

    }

    public static String getDocumento() {
        return documento;
    }

    public static void setDocumento(String documento) {
        Interface.documento = documento;
    }
}
