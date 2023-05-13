package uz.najottalim.najottalim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class University {
    @Autowired
    public Student student;

    public static void main(String[] args) {
        Student student = new Student();
        University university = new University();
    }
}
