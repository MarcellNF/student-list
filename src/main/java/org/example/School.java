package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentByMatriculationNumber(String matriculationNumber) {
        for (Student student : students) {
            if (student.getMatriculationNumber().equals(matriculationNumber)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Course> getCoursesOfStudent(Student student) {
        return student.getCourses();
    }


    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
