//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            PersonalAragon persona1 = new Alumno("Luis", "Ramírez", "320189289", "Ingeniería en Computación");
            PersonalAragon persona2 = new Personal("Ana", "Sánchez", "90302220", "Administrativa");
            PersonalAragon persona3 = new ExAlumno("Carlos", "Pérez", "310293923", 2020);

            System.out.println(persona1);
            System.out.println(persona1.obtenerRol());

            System.out.println();

            System.out.println(persona2);
            System.out.println(persona2.obtenerRol());

            System.out.println();

            System.out.println(persona3);
            System.out.println(persona3.obtenerRol());
        }
}
