package uz.najottalim.najottalim;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {
    @Bean
    public Student getStudent(){
        Student student = new Student();
        student.setName("Jamol");
        return student;
    }
}
