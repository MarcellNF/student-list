package org.example.school;

public class Main {
    public static void main(String[] args) {

        Course java = new Course();
        java.setName("Java");
        java.setCoach("Bla");
        java.setRoom("154b");

        Student daniel = new Student();
        daniel.setFirstName("Daniel");
        daniel.setLastName("Schwarz");
        daniel.setMatriculationNumber("1237615238");
        daniel.addCourse(java);

        Student max = new Student();
        max.setFirstName("Max");
        max.setLastName("Mustermann");
        max.setMatriculationNumber("3458736845");

        School neuefische = new School();
        neuefische.addStudent(daniel);
        neuefische.addStudent(max);

        System.out.println(neuefische);
        System.out.println(neuefische.findStudentByMatriculationNumber("3636363"));
        neuefische.removeStudent(daniel.getMatriculationNumber());
        System.out.println(neuefische);

        System.out.println(neuefische.getCoursesOfStudent(daniel));
    }
}