package com.snehansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor = context.getBean(Doctor.class);
        Nurse nurse = context.getBean(Nurse.class);
        doctor.assist();
        nurse.assist();
        Staff staff = context.getBean(Nurse.class);
        staff.assist();
        System.out.println(doctor.getQualification());
        System.out.println(nurse.getQualification());
    }
}