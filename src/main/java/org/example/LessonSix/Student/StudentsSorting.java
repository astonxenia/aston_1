package org.example.LessonSix.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentsSorting {
    private Set<Student> students;

    public StudentsSorting () {
       this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteLowScoringStudents() {
        students.removeIf(s -> s.getAverageGrade() < 3);
    }

    public void toNextCourse() {
        for(Student s : students) {
            if(s.getAverageGrade() >= 3) s.nextCourse();
        }
    }

    public void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты " + course + " курса: ");
        for(Student s : students) {
            if(s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
