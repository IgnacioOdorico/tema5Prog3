public class Main {
    public static void main(String[] args) {
        // Curso 1
        Curso curso1 = new Curso("Estructuras de Datos", "Prof. Carlos Ruiz");
        curso1.agregarEstudiante(new Estudiante("Juan", 20, "Ingeniería en Sistemas"));
        curso1.agregarEstudiante(new Estudiante("María", 22, "Diseño Gráfico"));
        curso1.agregarEstudiante(new Estudiante("Pedro", 21, "Medicina"));

        // Curso 2
        Curso curso2 = new Curso("Programación Avanzada", "Dra. Laura Gómez");
        curso2.agregarEstudiante(new Estudiante("Lucía", 23, "Ingeniería en Software"));
        curso2.agregarEstudiante(new Estudiante("Santiago", 19, "Bioinformática"));

        // Mostrar en consola
        System.out.println(curso1);
        System.out.println("----------------------------");
        System.out.println(curso2);
    }
}
