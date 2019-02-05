package co.edu.uniBosque.estudiante;

import java.util.Scanner;

public class App {

        public static void main(String[] args) {

         /*   Float arrayNotas[] = new Float[5];
        for (int i = 0; i <=4; i++){

        System.out.println("Digite la nota de la materia "+(i+1));
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        Float m2 = Float.parseFloat(m);
        arrayNotas[i] = m2;
       }
        System.out.println(arrayNotas);
        */

        Estudiante juan = new Estudiante();
        System.out.println(juan.toString());
        System.out.println("Digite la nota de la materia 1");
        Scanner sc = new Scanner(System.in);
        juan.setMateria1(Float.parseFloat(sc.next()));
            System.out.println("Digite la nota de la materia 2");
            Scanner sc1 = new Scanner(System.in);
            juan.setMateria2(Float.parseFloat(sc1.next()));
            System.out.println("Digite la nota de la materia 3");
            Scanner sc2 = new Scanner(System.in);
            juan.setMateria3(Float.parseFloat(sc2.next()));
            System.out.println("Digite la nota de la materia 4");
            Scanner sc3 = new Scanner(System.in);
            juan.setMateria4(Float.parseFloat(sc3.next()));
            System.out.println("Digite la nota de la materia 5");
            Scanner sc4 = new Scanner(System.in);
            juan.setMateria5(Float.parseFloat(sc4.next()));
            System.out.println("El promedio del estudiante es:");
            System.out.println(juan.sacarPromedio());
            String promedio = Float.toString(juan.getPromedio());
            juan.escribirPromedio(promedio);

    }
}
