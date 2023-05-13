package uz.najottalim.najottalim;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Student getStudent(){
        Student student = new Student();
        student.setName("Jamol");
        return student;
    }

    @Bean("get")
    public Student getStudent2(){
        Student student = new Student();
        student.setName("Kamol");
        return student;
    }
}
