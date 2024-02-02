package org.example.school;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

    private Map<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getMatriculationNumber(), student);
    }

    public Student findStudentByMatriculationNumber(String matriculationNumber) {
        return students.get(matriculationNumber);
    }

    public void removeStudent(String matriculationNumber) {
        students.remove(matriculationNumber);
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
